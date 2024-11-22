package Graph_Graph;

import java.util.ArrayList;

public class DFS {

    public static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new DFS.Edge(0,1,1));
        graph[0].add(new DFS.Edge(0,2,1));

        graph[1].add(new DFS.Edge(1,0,1));
        graph[1].add(new DFS.Edge(1,3,1));

        graph[2].add(new DFS.Edge(2,0,1));
        graph[2].add(new DFS.Edge(2,4,1));

        graph[3].add(new DFS.Edge(3,1,1));
        graph[3].add(new DFS.Edge(3,4,1));
        graph[3].add(new DFS.Edge(3,5,1));

        graph[4].add(new DFS.Edge(4,2,1));
        graph[4].add(new DFS.Edge(4,3,1));
        graph[4].add(new DFS.Edge(4,5,1));

        graph[5].add(new DFS.Edge(5,3,1));
        graph[5].add(new DFS.Edge(5,4,1));
        graph[5].add(new DFS.Edge(5,6,1));

        graph[6].add(new DFS.Edge(6,5,1));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr , boolean visited[]){
        //visited
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i=0; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]){
                dfs(graph, e.dest,visited);
            }
        }
    }

//O(V+H)
public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean visited[]){
        if (src == dest){
            return true;
        }
        visited[src] = true;
        for (int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            //e.dest = neighbour
            if (!visited[e.dest] && hasPath(graph, e.dest, dest, visited)) {
                return true;
            }
        }
        return false;
}


    public static void main(String[] args){
        /*

                   1----------3
                  /           | \
                 /            |  \
                 0            |    5-------6
                  \           |   /
                    \         |  /
                     2--------4/


         */

        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
//        dfs(graph,0,new boolean[v]);

        System.out.println(hasPath(graph,0,5,new boolean[v]));
    }
}
