package team_taja;

import java.util.Random;
import java.util.Scanner;

public class teat01 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		String[] word = { "string", "next", "line","for","else","if","continue","break", "new", "int", "scanner", "java", "random", "float", "char" };

		//int wordIndex[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int check[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		int point = 0;
		String me = "";

		for (int i = 0; i < 100; i++) {
			// 누적 점수
			System.out.println("<누적 점수는 "+point+">");
							
			int temp = r.nextInt(word.length); // word의 인덱스 랜덤으로 뽑음

			check[temp] = check[temp] + 1;
			// temp에 저장된 word의 인덱스를 이용해 check의 값 1로 변경

			System.out.println(word[temp]); // 위 뽑힌 인덱스로 word값 출력

			me = in.nextLine(); // 내가 따라서 작성하고

			// 중복이 아닌 값으로 나왔을 경우 (1이하)
			if ((check[temp] < 2) && (word[temp].equals(me) == true)) {
				point = point + 10;
				System.out.println("---------득점+10");
			}else if((check[temp] < 2) && (word[temp].equals(me) == false)) {
				System.out.println("------실패 다시한번");
			}

			// 중복 값으로 나왔을 경우 (2이상)
			 else if ((check[temp] > 1) && (word[temp].equals(me) == false)) {
				point = point - 10;
				System.out.println("-------또 실패 -10");
			}else if((check[temp] > 1) && (word[temp].equals(me) == true)) {
				System.out.println("---성공했지만 점수없음");
			}
					
			// 탈출방법
			if (point >= 50) {
				System.out.println("탈출 성공");
				break;
			}						

		}

	}

}
