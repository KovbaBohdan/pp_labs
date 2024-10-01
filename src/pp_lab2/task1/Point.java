package pp_lab2.task1;

import java.util.ArrayList;

public class Point {
    private String name;
    private int value;
    private ArrayList<Edge> edges;

    public Point(String name, int value) {
        this.name = name;
        this.value = value;
        this.edges = new ArrayList<Edge>();
    }

    public void addEdge(Point endVertex) {
        this.edges.add(new Edge(this, endVertex));
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Edge> getEdges(){
        return this.edges;
    }

    public int getValue(){
        return this.value;
    }

    public void print() {
        String message = "";

        if (this.edges.size() == 0) {
            System.out.println(this.name + " -->");
            return;
        }

        for(int i = 0; i < this.edges.size(); i++) {
            if (i == 0) {
                message += this.edges.get(i).getStart().name + " -->  ";
            }

            message += this.edges.get(i).getEnd().name;


            if (i != this.edges.size() - 1) {
                message += ", ";
            }
        }
        System.out.println(message);
    }

    public boolean hasEdgeTo(Point endVertex) {
        for (Edge edge : this.edges) {
            if (edge.getEnd().equals(endVertex)) {
                return true;  // Ребро вже існує
            }
        }
        return false;
    }

}
