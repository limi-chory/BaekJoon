import java.util.Scanner;

public class N1004 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            solution();
        }
    }

    static void solution() {
        int answer = 0;
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int numOfPlanet = scanner.nextInt();

        for (int i = 0; i < numOfPlanet; i++) {
            int cx = scanner.nextInt();
            int cy = scanner.nextInt();
            int cr = scanner.nextInt();

            boolean inside1 = Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(cr, 2);
            boolean inside2 = Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(cr, 2);

            if (inside1 != inside2) answer++;
        }

        System.out.println(answer);
    }
}
