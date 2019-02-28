package problem01;

import java.util.Random;
import java.util.Scanner;

import com.sun.xml.internal.bind.util.Which;


public class Main {
	
	// 게임 변수들
	public static int min = 1;
	public static int max = 100;
	public static int count = 0;
	public static int randomNumber = new Random().nextInt(max) + min;
	
	public static void main(String[] args) {
		
		// 키보드 입력을 받기 위해 Scanner 생성
		Scanner scanner = new Scanner(System.in);
		
		// 게임 시작
		while( true ) {
	
			System.out.print( "[" + min + "-" + max + "] 사이의 값 입력:" );
			int answer = scanner.nextInt();
			
			boolean result = checkAnswer( answer );
			if ( result ) {
				break;
			}
		
			System.out.println("");
		}
		
		// 키보드 닫기
		scanner.close();
		
		// 결과 출력
		System.out.println("\n맞췄습니다. 총 실행 횟수는 " + count + "번 입니다.");
	}
	
	
	
	
	
	public static boolean checkAnswer(int answer) {
		
		boolean checkResult = false;
		Scanner scanner = new Scanner(System.in);
			
		
			System.out.println(randomNumber);
			while(answer <= 100) {
				if(answer > randomNumber) {
					System.out.print( "[" + min + "-" + answer + "] 사이의 값 입력:" );
					answer = scanner.nextInt();
					count++;
					if(answer > randomNumber) {
						System.out.print( "[" + min + "-" + answer + "] 사이의 값 입력:" );
						answer = scanner.nextInt();
						count++;
					}else if(answer == randomNumber) {
						scanner.close();
						
					}

//					else if(answer < randomNumber) {
//						System.out.print( "[" + min + "-" + (answer+randomNumber) + "] 사이의 값 입력:" );
//						answer = scanner.nextInt();
//						count++;
//					}
				}else if(answer < randomNumber) {
					System.out.print( "[" + answer + "-" + (randomNumber+5) + "] 사이의 값 입력:" );
					answer = scanner.nextInt();
					count++;
					if(answer < randomNumber) {
						System.out.print( "[" + answer + "-" + (randomNumber+5) + "] 사이의 값 입력:" );
						answer = scanner.nextInt();
						count++;
					}else if(answer == randomNumber) {
						scanner.close();
						
					}
					
				}
				checkResult = true;
				break;
			}
//			while (scanner.hasNext()) {
//				String string = (String) scanner.next();
//				
//			}
			
//			if(answer < randomNumber) {
//				System.out.print( "[" + answer + "-" + randomNumber + "] 사이의 값 입력:" );
//				answer = scanner.nextInt();
//				count++;
//			}
//			break;
//			for(int i=0; i<answer; i++) {
////			System.out.println("sjkssj");
//			}

		return checkResult;
	}
}