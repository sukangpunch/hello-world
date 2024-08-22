package exp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SortArr {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int []arr = new int[5];
		System.out.print("5개의 정수를 입력해주세요 : ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<4; i++) {
			for(int j=i+1; j<5;j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.print("오름차순으로 정렬 후: ");
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
