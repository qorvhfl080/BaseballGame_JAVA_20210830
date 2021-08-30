package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		int[] questionNumArr = new int[3];
		
		for (int i = 0; i < questionNumArr.length; i++) {
			
			while (true) {
				
				int randomNum = (int) (Math.random() * 9 + 1);
				
				boolean isDuplOk = true;
				
				for (int num : questionNumArr) {
					if (randomNum == num) {
						isDuplOk = false;
					}
				}
				
				if (isDuplOk) {
					questionNumArr[i] = randomNum;
					
					break;
				}
				
			}
			
		}
		
		for (int num : questionNumArr) {
			System.out.print(num + " ");
		}
		
		Scanner sc = new Scanner(System.in);
		int[] inputNumberArr = new int[3];
		while (true) {
			System.out.print("3자리 숫자 입력 : ");
			int num = sc.nextInt();
			
			inputNumberArr[0] = num / 100;
			inputNumberArr[1] = (num % 100) / 10;
			inputNumberArr[2] = num % 10;
		}
		sc.close();
		
		
	}

}
