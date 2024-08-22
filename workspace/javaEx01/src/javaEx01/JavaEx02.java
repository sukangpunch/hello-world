package javaEx01;

import java.util.Scanner;

public class JavaEx02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//반복문
//		// for : 고정된 횟수만큼.
//		// 향상된 for문 (for ~ each)
//		// for(초기식; 조건식; 증감식){}
//		// while 문 : 조건식이 참인동안 반복
//		// do-while문 : 코드 블록을 먼저 실행하고, 조건이 참이면 반복실행
//		
//		// 내일
//		/*
//		 * 반복문
//		 * 배열과 반복문
//		 * java.util.Arrays 클래스
//		 */
//		
//		// for 문 에제
//		// 사용자가 입력한 숫자에 대해 1부터 10까지 곱셈표 출력
//		System.out.print("곱셈표를 출력할 숫자를 입력: ");
//		int number = sc.nextInt();
//		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(number + " x " + i + " = " + (number*i));
//		}
//		
//		// for-each 문
//		// 사용자가 입력한 정수 배열의 모든 요소를 출력
//		System.out.println("배열의 요소 수를 입력:");
//		int n = sc.nextInt();
//		int [] array = new int[n];
//		
//		System.out.println(n + "개의 정수를 입력하세요: ");
//		for(int i=0; i<n; i++) {
//			array[i] = sc.nextInt();
//		}
//		
//		System.out.println("배열의 요소 : ");
//		for (int a : array) {
//			// 배열의 각 요소 출력
//			System.out.print(a + " ");
//		}
//		System.out.println("\n");
//		
//		// while 문 : 조건식에 만족하는 동안 반복
//		// 사용자가 입력한 숫자까지의 합을 계산해서 출력 (10: 1 ~ 10까지의 합)
//		System.out.print("합을 계산할 숫자를 입력: ");
//		int limit = sc.nextInt();
//		int sum = 0; // 합을 저장할 변수
//		int count = 1; // 반복을 제어할 변수
//		
//		while(count<= limit) {
//
//			sum += count; 
//			count++;
//	
//		}
//		System.out.println("1부터 " + limit + "까지의 합은 " + sum);
		
		
		// do-while 문 : 조건식을 나중에 비교. 한 번은 무조건 실행
		// 사용자가 맞출 떄 까지 숫자를 추측하는 게임
//		int secret = 7;
//		int guess;
//		
//		do {
//			System.out.print("숫자를 맞춰보세요: (1-10): ");
//			guess = sc.nextInt();
//			
//		}while(guess != secret);
//		
//		System.out.println("축하합니다! 정답입니다");
		
		
	}
	
	

}
