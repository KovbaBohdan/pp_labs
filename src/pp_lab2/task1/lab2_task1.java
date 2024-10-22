package pp_lab2.task1;

import java.util.Scanner;

public class lab2_task1 {
    public static void main(String[] args) {
        System.out.println("---Graphs---");
        System.out.println("Input some information about your graph:");
        System.out.println("Is your graph oriented (yes/no): ");
        Scanner console = new Scanner(System.in);
        String infoAboutOriented = console.nextLine();

        boolean isOriented = false;
        if(infoAboutOriented.equals("yes")) {
            isOriented = true;
        }

        System.out.println("How many points in your graph: ");
        int numberOfPoints = console.nextInt();
        console.nextLine();

        Graph graph1 = new Graph(isOriented, numberOfPoints);

        for(int i = 0; i < numberOfPoints; i++){
            System.out.print("Enter the name of point: ");
            String pointName = console.nextLine();
            System.out.println("Enter value of point: ");
            int pointValue = console.nextInt();
            console.nextLine();
            graph1.addPoint(pointName, pointValue);
        }

        for(int i = 0; i < numberOfPoints; i++){
            System.out.println("Enter the number of points for connecting to " + graph1.getPoints().get(i) + ": ");
            int numberOfConnections = console.nextInt();
            console.nextLine();
            for(int j = 0; j < numberOfConnections; j++){
                System.out.println("Enter the names of points for connecting to " + graph1.getPoints().get(i) + ": ");
                String s1 = console.nextLine();
                Point temp = graph1.getPointByValue(s1);
                graph1.addEdge(graph1.getPoints().get(i), temp);
            }
        }

        graph1.printGraph();
    }
}
