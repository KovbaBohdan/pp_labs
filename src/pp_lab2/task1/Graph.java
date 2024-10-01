package pp_lab2.task1;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Point> points;
    private boolean isDirected;
    private int numberOfPoints;

    public Graph(boolean isDirected, int numberOfPoints) {
        this.points = new ArrayList<Point>();
        this.isDirected = isDirected;
        this.numberOfPoints = numberOfPoints;
    }

    public Point addPoint(String name) {
        Point newVertex = new Point(name, 0);
        this.points.add(newVertex);
        return newVertex;
    }

    public void addEdge(Point vertex1, Point vertex2) {
        if (!vertex1.hasEdgeTo(vertex2)) {
            vertex1.addEdge(vertex2);
        }
        if (!this.isDirected && !vertex2.hasEdgeTo(vertex1)) {
            vertex2.addEdge(vertex1);
        }
    }

    public ArrayList<Point> getPoints() {
        return this.points;
    }

    public boolean isDirected() {
        return this.isDirected;
    }

    public Point getPointByValue(String value) {
        for(Point v: this.points) {
            if (v.getName().equals(value)) {
                return v;
            }
        }

        return null;
    }

    public void print() {
        for(Point v: this.points) {
            v.print();
        }
    }

}
