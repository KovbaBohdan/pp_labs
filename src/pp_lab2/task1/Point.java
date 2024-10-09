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

    public void addEdge(Point endPoint) {
        this.edges.add(new Edge(this, endPoint));
    }

    public boolean havingEdge(Point endPoint) {
        for (int i = 0; i < edges.size(); i++) {
            if (edges.get(i).getEnd().equals(endPoint)) {
                return true;
            }
        }
        return false;
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

    public void printPoint() {
        if (this.edges.size() == 0) {
            System.out.println(this.name + ": There is no connecting points");
        }
        else {
            System.out.print(this.name + ": ");
            for (int i = 0; i < this.edges.size(); i++) {
                System.out.print(this.edges.get(i).getEnd().name + " ");
            }
            System.out.println();
        }
    }

    @Override
    public String toString(){
        return this.name;
    }
}
