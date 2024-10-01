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
            graph1.addPoint(pointName);
        }

        for(int i = 0; i < numberOfPoints; i++){
            System.out.println("Enter the number of points for connecting to" + graph1.getPoints().get(i));
            int numberOfConnections = console.nextInt();
            console.nextLine();
            System.out.print("Enter the names of points for connecting to " + graph1.getPoints().get(i));
            for(int j = 0; j < numberOfConnections; j++){
                String s1 = console.nextLine();
                Point temp = graph1.getPointByValue(s1) ;
                graph1.addEdge(graph1.getPoints().get(i), temp);
            }
        }



//        Point cliftonStation = graph1.addPoint("Clifton");
//        Point capeMayStation = graph1.addPoint("Cape May");

        //graph1.addEdge(cliftonStation, capeMayStation);

        graph1.print();
    }
}
