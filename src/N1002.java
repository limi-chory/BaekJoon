import java.util.Scanner;

public class N1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCaseNumber = scanner.nextInt();

        for (int i = 0; i < testCaseNumber; i++) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            solution(x1, y1, r1, x2, y2, r2);
        }
    }

    static void solution(int x1, int y1, int r1, int x2, int y2, int r2) {
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        if (distance == 0) {
            if (r1 == r2) {
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        } else if (distance == r1 + r2 || distance == Math.abs(r1 - r2)) {
            System.out.println(1);
        } else if (distance < r1 + r2 && distance > Math.abs(r1 - r2)) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
