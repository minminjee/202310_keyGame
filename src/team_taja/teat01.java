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
			// ���� ����
			System.out.println("<���� ������ "+point+">");
							
			int temp = r.nextInt(word.length); // word�� �ε��� �������� ����

			check[temp] = check[temp] + 1;
			// temp�� ����� word�� �ε����� �̿��� check�� �� 1�� ����

			System.out.println(word[temp]); // �� ���� �ε����� word�� ���

			me = in.nextLine(); // ���� ���� �ۼ��ϰ�

			// �ߺ��� �ƴ� ������ ������ ��� (1����)
			if ((check[temp] < 2) && (word[temp].equals(me) == true)) {
				point = point + 10;
				System.out.println("---------����+10");
			}else if((check[temp] < 2) && (word[temp].equals(me) == false)) {
				System.out.println("------���� �ٽ��ѹ�");
			}

			// �ߺ� ������ ������ ��� (2�̻�)
			 else if ((check[temp] > 1) && (word[temp].equals(me) == false)) {
				point = point - 10;
				System.out.println("-------�� ���� -10");
			}else if((check[temp] > 1) && (word[temp].equals(me) == true)) {
				System.out.println("---���������� ��������");
			}
					
			// Ż����
			if (point >= 50) {
				System.out.println("Ż�� ����");
				break;
			}						

		}

	}

}
