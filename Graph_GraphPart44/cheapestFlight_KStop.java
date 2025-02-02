package Graph_GraphPart44;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class cheapestFlight_KStop {

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

    public static void createGraph(int flight[][] , ArrayList<Edge> graph[]){
        for (int i=0; i< graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for (int i=0; i< flight.length; i++){
            int src = flight[i][0];
            int dest = flight[i][1];
            int weight = flight[i][2];

            Edge e = new Edge(src,dest,weight);
            graph[src].add(e);
        }
    }

    public static class Info{
        int v;
        int cost;
        int stops;

        public Info(int s, int c, int w){
            this.v = s;
            this.cost = c;
            this.stops = w;
        }
    }

    public static int cheapestFlight(int n, int flight[][], int src, int dest, int k){
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flight, graph);

        int dist[] = new int[n];
        for (int i=0; i<n; i++){
            if (i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src,0,0));

        while (!q.isEmpty()){
            Info curr = q.remove();
            if (curr.stops > k){
                break;
            }

            for (int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int w = e.weight;

                if (dist[u] != Integer.MAX_VALUE && dist[u]+w < dist[v] && curr.stops <= k){
                    dist[v] = dist[u]+ w;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }
        //dist[dest]
        if (dist[dest] == Integer.MAX_VALUE){
            return -1;
        }
        else {
            return dist[dest];
        }
    }



    public static void main(String[] args){
        int n = 4;
        int flight[][] = {{0,1,100}, {1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0;
        int dest = 3;
        int k = 1;

        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flight, graph);

        System.out.println(cheapestFlight(n, flight, src, dest, k));

    }
}
