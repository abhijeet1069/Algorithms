package algo.graphs;

import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph(){
        adjList = new HashMap<>();
    }

    public void addEdge(int u, int v){
        addVertex(u);
        addVertex(v);
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    private void addVertex(int v){
        adjList.putIfAbsent(v,new ArrayList<>());
    }

    public Set<Integer> getVertices(){
        return Collections.unmodifiableSet(adjList.keySet());
    }

    public List<Integer> getNeighbors(int v){
        return Collections.unmodifiableList(adjList.getOrDefault(v,List.of()));
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int v : adjList.keySet())
            sb.append(v).append(" -> ").append(adjList.get(v));
        return sb.toString();
    }

}
