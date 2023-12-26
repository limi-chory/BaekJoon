import java.util.Scanner;

public class N1003 {
    static int[][] callCount = new int[41][2];

    public static void main(String[] args) {
        initializeCallCout();
        Scanner scanner = new Scanner(System.in);
        int testCaseNumber = scanner.nextInt();

        for (int i = 0; i < testCaseNumber; i++) {
            int n = scanner.nextInt();
            System.out.println(callCount[n][0] + " " + callCount[n][1]);
        }
    }

    static void initializeCallCout() {
        callCount[0][0] = 1;
        callCount[0][1] = 0;
        callCount[1][0] = 0;
        callCount[1][1] = 1;

        for (int i=2; i<41; i++) {
            callCount[i][0] = callCount[i-1][0] + callCount[i-2][0];
            callCount[i][1] = callCount[i-1][1] + callCount[i-2][1];
        }
    }
}
