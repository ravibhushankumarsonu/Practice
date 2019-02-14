package graphs;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * created by ravibhushan.k on 29/01/19
 */
public class Graphs1 {
    int v;
    LinkedList<Integer>[] adjListArray;

    Graphs1(int v) {
        this.v = v;
        adjListArray = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        adjListArray[src].add(dest);
        //adjListArray[dest].push(src);
    }

    void print() {
        for(int i=0; i<v; i++) {
            System.out.println("Adjancency List of vertex : "+i);
            System.out.print("head ");
            for(Integer integer : adjListArray[i]) {
                System.out.printf("--> %d", integer);
            }
            System.out.printf("\n");
        }
    }

    void BFS(int s) {
        boolean[] visited = new boolean[v];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.printf("%d ", s);

            Iterator<Integer> iterator = adjListArray[s].listIterator();

            while (iterator.hasNext()) {
                int n = iterator.next();
                if(!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
