package ifelse문;

import java.util.Scanner;

public class Ex03마트계산대프로그램 {

	public static void main(String[] args) {
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 입력받기
		System.out.print("상품의 개수를 입력하세요 : ");
		int gift = sc.nextInt();
		
		int money = 0;
		// 3. 선물세트 구입시 지불할 금액 계산하기
		if (gift >= 11) {
			// 3-1. 11개 이상 구매시 전체금액에서 10% 할인(1세트 : 10000원)
			money = (int) (10000 * gift * 0.9);
		} else {
			// 3-2. 그렇지 않은 경우 정가로 구매
			money = 10000 * gift;
		}
		// 4. 가격 출력하기
		System.out.println("가격은" + money + "원입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
