package 산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {
		
		// 예제문제 2
		
		// 변수 num 값을 입력받아 백의 자리 이하를 버리는 코드는 작성해라
		// 만일 변수 num의 값이 456 이라면 400이 되고, 111이라면 100이 된다.
				
		Scanner sc = new Scanner (System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println("결과 값 : " + num / 100 * 100);
		
		
		
		// 예제문제 2 해설 
		
		// 1. 입력받는 도구 출력하기
		// Scanner sc = new Scanner (System.in);
		// 2. 정수 입력 출력하기 (개행없이)
		// System.out.print("정수 입력 : ");
		// 3. 정수 입력받기
		// int num = sc.nextInt();
		// 4. 백의자리 이하를 버리기
		// int result = num - num % 100;
		// 5. 결과값 출력하기
		// System.out.println("결과 값 : " + result);
		
		

		
		
		
		
		
		
		
	}


}
