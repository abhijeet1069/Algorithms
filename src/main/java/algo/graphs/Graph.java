package algo.graphs;

import java.util.*;

public class Graph<T> {
    private Map<T, List<T>> adjList;

    public Graph(){
        adjList = new HashMap<>();
    }

    public void addEdge(T u, T v){
        addVertex(u);
        addVertex(v);
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    private void addVertex(T v){
        adjList.putIfAbsent(v,new ArrayList<>());
    }

    public Set<T> getVertices(){
        return Collections.unmodifiableSet(adjList.keySet());
    }

    public List<T> getNeighbors(int v){
        return Collections.unmodifiableList(adjList.getOrDefault(v,List.of()));
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(T v : adjList.keySet())
            sb.append(v).append(" -> ").append(adjList.get(v));
        return sb.toString();
    }

}
