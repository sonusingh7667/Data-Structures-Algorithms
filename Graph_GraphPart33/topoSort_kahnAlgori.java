package Graph_graphPart33;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class topoSort_kahnAlgori {

    public static class Edge{
        int src;
        int dest;

        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {   //true - cycle
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void calInDegree(ArrayList<Edge>[] graph, int inDegree[]){
        for (int i=0; i<graph.length; i++){
            int v = i;
            for (int j=0; j<graph[v].size(); j++){
                Edge e = graph[v].get(j);
                inDegree[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge>[] graph){
        int inDegree[] = new int[graph.length];
        calInDegree(graph, inDegree);
        Queue<Integer> q = new LinkedList<>();

        for (int i=0; i<inDegree.length; i++){
            if (inDegree[i] == 0){
                q.add(i);
            }
        }

        //BFS
        while (!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");

            for (int i=0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;
                if (inDegree[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }


    public static void main(String[] args){

        int v=6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        topSort(graph);
    }
}
