package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		int[] questionNumArr = new int[3];
		int tries = 0;
		
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
		
		Scanner sc = new Scanner(System.in);
		int[] inputNumberArr = new int[3];
		
		while (true) {
			System.out.print("3자리 숫자 입력 : ");
			int num = sc.nextInt();
			
			tries++;
			
			inputNumberArr[0] = num / 100;
			inputNumberArr[1] = (num % 100) / 10;
			inputNumberArr[2] = num % 10;
			
			int strikeCount = 0;
			int ballCount = 0;
			
			for (int i = 0; i < inputNumberArr.length; i++) {
				
				for (int j = 0; j < questionNumArr.length; j++) {
					
					if (inputNumberArr[i] == questionNumArr[j]) {
						
						if (i == j) {
							strikeCount++;
						} else {
							ballCount++;
						}
						
					}
					
				}
				
			}
			
			System.out.println(strikeCount + "S " + ballCount + "B");
			
			if (strikeCount == 3) {
				System.out.println("정답입니다.");
				System.out.println(tries + "번 시도했습니다.");
				break;
			}
				
		}
		sc.close();
		
		
	}

}
