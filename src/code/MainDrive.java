package code;

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
		
	}

}
