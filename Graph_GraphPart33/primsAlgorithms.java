package Graph_graphPart33;

import Graph_Graph.DFS;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class primsAlgorithms {


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

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
    }

    static class pair implements Comparable<pair>{
        int v;
        int cost;

        public pair(int v, int c){
            this.v = v;
            this.cost = c;
        }
        @Override
        public int compareTo(pair p2){
            return this.cost - p2.cost;
        }
    }
    public static void prims(ArrayList<Edge> graph[]){
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();
        pq.add(new pair(0,0));
        int finalCost = 0;  //mst cost/total min weight

        while (!pq.isEmpty()){
            pair curr = pq.remove();
            if (!vis[curr.v]){
                vis[curr.v] = true;
                finalCost += curr.cost;

                for (int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    pq.add(new pair(e.dest, e.weight));
                }
            }
        }
        System.out.println("final(mmin) cost of mst = "+finalCost);
    }


    public static void main(String[] args){

        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        prims(graph);

    }
}
