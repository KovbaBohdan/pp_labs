package pp_lab2.task1;

public class Edge {
    private Point begin;
    private Point end;

    public Edge(Point start, Point end) {
        this.begin = start;
        this.end = end;
    }

    public Point getBegin() {
        return this.begin;
    }

    public Point getEnd() {
        return this.end;
    }
}
