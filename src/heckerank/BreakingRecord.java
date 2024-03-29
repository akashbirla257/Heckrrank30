
package heckerank;
import java.util.Scanner;
class Result {
	int maxBreakNum;
	int minBreakNum;

	Result(int maxBreakNum, int minBreakNum) {
		this.maxBreakNum = maxBreakNum;
		this.minBreakNum = minBreakNum;
	}
}
public class BreakingRecord {
	static Result solve(int[] s) {
		int max = s[0];
		int min = s[0];
		int maxBreakNum = 0;
		int minBreakNum = 0;

		for (int i = 1; i < s.length; i++) {
			if (s[i] > max) {
				max = s[i];
				maxBreakNum++;
			} else if (s[i] < min) {
				min = s[i];
				minBreakNum++;
			}
		}

		return new Result(maxBreakNum, minBreakNum);
	}


public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Enter the hoe many record ");
		int n = sc.nextInt();
		int[] s = new int[n];
                System.out.println("please enter the Records");
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt();
		}
		Result result = solve(s);
		System.out.println(result.maxBreakNum + " " + result.minBreakNum);

		sc.close();
	}
}