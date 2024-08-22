package exp;

public class UseArray {
	public static void main(String[] args) {
		
		int arr[] = new int[10];
		
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
		}
		
		System.out.print("배열에 저장된 1부터 10까지 숫자 출력: ");
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
	}

}
