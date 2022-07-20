import java.util.*;

//the class stores the edges of the graph
class Edge {
    int s, d, w;

    // creating a constructor of the class Edge
    Edge(int src, int dest, int weight) {
        this.s = src;
        this.d = dest;
        this.w = weight;
    }
}

// a class to store adjacency list nodes
class Node {
    int value, weight;

    // creating a constructor of the class Vertex
    Node(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    // overrides the toString() method
    @Override
    public String toString() {
        return this.value + " (" + this.weight + ")";
    }
}

// a class to represent a graph object
class Graph {
    // note that we have created an adjacency list (i.e. List of List)
    List<List<Node>> adjlist = new ArrayList<>();

    // creating a constructor of the class Graph that creates graph
    public Graph(List<Edge> edges) {
        // find the maximum numbered vertex
        int n = 0;
        // iterates over the edges of the graph
        for (Edge e : edges) {
            // determines the maximum numbered vertex
            n = Integer.max(n, Integer.max(e.s, e.d));
        }
        // reserve the space for the adjacency list
        for (int i = 0; i <= n; i++) {
            adjlist.add(i, new ArrayList<>());
        }
        // adds the edges to the undirected graph
        for (Edge e : edges) {
            // creating a new node (from source to destination) in the adjacency list
            adjlist.get(e.s).add(new Node(e.d, e.w));
            // uncomment the following statement for undirected graph
            // adj.get(e.dest).add(new Node(e.src, e.weight));
        }
    }

    // method that prints adjacency list of a graph
    public static void printGraph(Graph graph) {
        int src = 0;
        int n = graph.adjlist.size();
        System.out.printf("Adjacency List for the Graph is: ");
        while (src < n) {
            // for-each loop prints the neighboring vertices with current vertex
            for (Node edge : graph.adjlist.get(src)) {
                System.out.printf("%d -- > %s\t", src, edge);
            }
            System.out.println();
            // increments the source by 1
            src++;
        }
    }
}

// implementing driver code
public class WeightedGraph {
    public static void main(String args[]) {
        // creating a list of edges with their associated weight
        List<Edge> edges = Arrays.asList(new Edge(1, 2, 4),
                new Edge(2, 3, 1),
                new Edge(2, 4, 5),
                new Edge(3, 1, 2),
                new Edge(3, 5, 10),
                new Edge(4, 6, 6),
                new Edge(4, 3, 8),
                new Edge(5, 2, 10),
                new Edge(5, 4, 2),
                new Edge(6, 5, 3));
        // creates a graph with the edges declared above
        Graph graph = new Graph(edges);
        // prints the corresponding adjacency list for the graph
        Graph.printGraph(graph);
    }
}