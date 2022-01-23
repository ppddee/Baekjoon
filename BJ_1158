import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        sb.append('<');

        while (queue.size() > 1) {
            for(int i = 0; i < K-1; i++) {
                int value = queue.poll();
                queue.offer(value);
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append('>');
        System.out.println(sb);
    }
}
