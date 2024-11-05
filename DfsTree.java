import java.util.LinkedList;
import java.util.Stack;

import java.util.Vector;
import java.util.Iterator;

// import javax.swing.text.View;
public class DfsTree {
    static class Graph{
        private int V;
        private LinkedList<Integer>[] adj;

        Graph(int v){
            this.V=v;
            adj=new LinkedList[v];
            for(int i=0;i<v;i++){
                adj[i]=new LinkedList();
            }
        }
        void addEdge(int v,int w){
            adj[v].add(w);
        }
        void DFS(int s){
            Vector<Boolean> visited=new Vector<Boolean>(V);
            for(int i=0;i<V;i++){
                visited.add(false);
            }
            Stack<Integer> stack=new Stack<>();
            stack.push(s);

            while(stack.empty()==false){
                s=stack.peek();
                stack.pop();
                if(visited.get(s)==false)
                {
                    System.out.println(s +" ");
                    visited.set(s,true);
                }
                
                Iterator<Integer> itr=adj[s].iterator();
                while(itr.hasNext()){
                    int v=itr.next();
                    if(visited.get(v)){
                        stack.push(v);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph g=new Graph(8);
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
        g.DFS(2);
    }
}

