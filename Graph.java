import java.util.LinkedList;
import java.util.Iterator;

// import javax.swing.text.View;
public class Graph {
    static class graph{
        private int v;
        private LinkedList<Integer> adj[];

        graph(int v){
            adj=new LinkedList[v];
            for(int i=0;i<v;i++){
                adj[i]=new LinkedList();
            }
        }
        void addEdge(int v,int w){
            adj[v].add(w);
        }
        void BFS(int s){
            boolean visited[]=new boolean[v];
            LinkedList<Integer> queue=new LinkedList<Integer>();
            visited[s]=true;
            queue.add(s);
            while(queue.size()!=0){
                s=queue.remove();
                System.out.println(s+" ");
                Iterator<Integer> i=adj[s].listIterator();
                while(i.hasNext()){
                    int n=i.next();
                    if(visited[n]){
                        visited[n]=true;
                        queue.add(n);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        graph g=new graph(8);
        g.addEdge(1,2);
        g.addEdge(2,1);

        g.addEdge(2,3);
        g.addEdge(3,2);

        g.addEdge(1,3);
        g.addEdge(3,1);

        g.addEdge(1,4);
        g.addEdge(4,1);

        g.addEdge(3,5);
        g.addEdge(5,3);

        g.addEdge(4,3);
        g.addEdge(3,4);

        g.addEdge(4,5);
        g.addEdge(5,4);

        g.addEdge(5,6);
        g.addEdge(6,5);

        g.addEdge(5,7);
        g.addEdge(7,5);

        System.out.println("BFS: ");
        g.BFS(2);
    }
}
