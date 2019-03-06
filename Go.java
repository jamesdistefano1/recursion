package recursion;

public class Go {
	
	 public static void main(String[] args) {
		int total = 0;
		int current = 100;
		addUp(total, current);
	}
		
	 public static void addUp(int total, int current) {
		if (current == 0) {
			System.out.println(total); 
		}
		else {
			total = total + current;
			System.out.println(total);
			current--;
			addUp(total, current);
		}
	}

}
