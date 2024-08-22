package exp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddOrEven {
	public static void main(String [] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input;
		
		while(true) {
			System.out.print("숫자를 입력해주세요: ");
			input = Integer.parseInt(br.readLine());
			if(input == -1)break;
			
			if(input % 2 == 0) {
				System.out.println("입력하신 숫자 "+ input + " 는(은) 짝수입니다.");
			}else {
				System.out.println("입력하신 숫자 "+ input + " 는(은) 홀수입니다.");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
}
