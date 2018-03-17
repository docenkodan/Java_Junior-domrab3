package Ariphmetics;

public class Main {

	public static void main(String[] args) {
		first first = new first ();
		second second = new second ();
		third third = new third();
		forth forth = new forth();
		fifth fifth = new fifth();
		
		first.answer(2, 0.5);  //(n, x)
		first.answer2(2, 0.5);  //(n, x)
		System.out.println();
		
		second.answer(2);
		second.answer2(2);
		System.out.println();
		
		third.answer(2);
		third.answer2(2);
		System.out.println();
		
		forth.answer(2);
		forth.answer2(2);
		System.out.println();

		fifth.answer(0.5);
		fifth.answer2(0.5);
	}

}
