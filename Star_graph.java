package assignment;

public class Star_graph {
	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			// 1, 3
			// 2, 2
			//3, 2
			//4, 4
			switch(answer[i]) {
			case 1: counter[0]++; break;
			case 2: counter[1]++; break;
			case 3: counter[2]++; break;
			case 4: counter[3]++; break;
			}
		}
		
		for(int i=0; i<counter.length; i++) {
			System.out.print(counter[i]);
			for(int count = 0; count<counter[i]; count++) {
				System.out.print("*");	
			}
			
			System.out.println();
		}
	}
}
