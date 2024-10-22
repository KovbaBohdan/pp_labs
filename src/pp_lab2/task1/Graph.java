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

    public Point addPoint(String name, int value) {
        Point newPoint = new Point(name, value);
        this.points.add(newPoint);
        return newPoint;
    }

    public void addEdge(Point point1, Point point2) {
        if (!point1.havingEdge(point2)) {
            point1.addEdge(point2);
        }
        if (!this.isDirected && !point2.havingEdge(point1)) {
            point2.addEdge(point1);
        }
    }

    public ArrayList<Point> getPoints() {
        return this.points;
    }

    public boolean isDirected() {
        return this.isDirected;
    }

    public Point getPointByValue(String value) {
        for(int i = 0; i < points.size(); i++) {
            if (points.get(i).getName().equals(value)) {
                return points.get(i);
            }
        }
        return null;
    }

    public void printGraph() {
        for(int i = 0; i < points.size(); i++) {
            points.get(i).printPoint();
        }
    }

}
