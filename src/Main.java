import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Experiment exp = new Experiment();

        // SMALL GRAPH (10)
        System.out.println("=== SMALL GRAPH (10 vertices) ===");
        Graph small = createGraph(10);
        small.printGraph();
        exp.runTraversals(small, 0, true);

        // MEDIUM GRAPH (30)
        System.out.println("\n=== MEDIUM GRAPH (30 vertices) ===");
        Graph medium = createGraph(30);
        exp.runTraversals(medium, 0, false);

        // LARGE GRAPH (100)
        System.out.println("\n=== LARGE GRAPH (100 vertices) ===");
        Graph large = createGraph(100);
        exp.runTraversals(large, 0, false);
    }

    // создание графа со случайными рёбрами
    private static Graph createGraph(int size) {
        Graph g = new Graph();
        Random rand = new Random();

        // добавляем вершины
        for (int i = 0; i < size; i++) {
            g.addVertex(new Vertex(i));
        }

        // добавляем случайные рёбра
        for (int i = 0; i < size * 2; i++) {
            int from = rand.nextInt(size);
            int to = rand.nextInt(size);

            if (from != to) {
                g.addEdge(from, to);
            }
        }

        return g;
    }
}