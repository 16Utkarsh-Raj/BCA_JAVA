import java.util.*;

public class Kruskal {
    class Edge implements Comparable<Edge>{
        int src, dest, weight;

        public int compareTo(Edge CompareEdge){
            return this.weight-CompareEdge.weight;
        }
    }
    class subset{
        int parent, rank;
    }

    int vertices, edges;
    Edge edge[];

    Kruskal(int v, int e){
        vertices=v;
        edges=e;
        edge=new Edge[edges];

        for(int i=0; i<e; i++)
            edge[i]=new Edge();
    }

    int find(subset subsets[], int i){
        if(subsets[i].parent!=i)
            subsets[i].parent=find(subsets, subsets[i].parent);
        
        return subsets[i].parent;
    }

    void Union(subset subsets[], int x, int y){
        int xroot=find(subsets, x);
        int yroot=find(subsets, y);

        if(subsets[xroot].rank<subsets[yroot].rank)
            subsets[xroot].parent=yroot;
        else if(subsets[xroot].rank>subsets[yroot].rank)
            subsets[yroot].parent=xroot;
        else{
            subsets[yroot].parent=xroot;
            subsets[xroot].rank++;
        }
    }
    void KruskalAlgo(){
        Edge result[]=new Edge[vertices];
        int e=0,i;

        for(i=0; i<vertices; i++)
            result[i]=new Edge();

        Arrays.sort(edge);

        subset subsets[]=new subset[vertices];

        for(i=0; i<vertices; i++)
            subsets[i]=new subset();
        
        for(int v=0; v<vertices; ++v){
            subsets[v].parent=v;
            subsets[v].rank=0;
        }
        i=0;
        while(e<vertices-1){
            Edge next_edge=new Edge();
            next_edge =edge[i++];
            int x=find(subsets, next_edge.src);
            int y=find(subsets, next_edge.dest);

            if(x!=y){
                result[e++]=next_edge;
                Union((subsets), x, y);
            }
        }
        for(i=0; i<e; i++)
            System.out.println(result[i].src+" - "+result[i].dest+" : "+result[i].weight);
    }
    public static void main(String[] args) {
        int vertices=6;
        int edges=8;
        Kruskal K=new Kruskal(vertices, edges);

        K.edge[0].src=0;
        K.edge[0].dest=1;
        K.edge[0].weight=4;

        K.edge[1].src=0;
        K.edge[1].dest=2;
        K.edge[1].weight=4;

        K.edge[2].src=1;
        K.edge[2].dest=2;
        K.edge[2].weight=2;

        K.edge[3].src=2;
        K.edge[3].dest=3;
        K.edge[3].weight=3;

        K.edge[4].src=2;
        K.edge[4].dest=5;
        K.edge[4].weight=2;

        K.edge[5].src=2;
        K.edge[5].dest=4;
        K.edge[5].weight=4;

        K.edge[6].src=3;
        K.edge[6].dest=4;
        K.edge[6].weight=3;

        K.edge[7].src=5;
        K.edge[7].dest=4;
        K.edge[7].weight=3;

        K.KruskalAlgo();
    }
}
