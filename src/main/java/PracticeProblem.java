/**
 * Lesson: String Manipulation
 * Author: Mr. Kalisz
 * Date Created: Feb 26, 2026
 * Date Last Modified: Feb 26, 2026
 */


import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		String word;
		System.out.print("Input a sentence: ");
		word = input.nextLine();
		System.out.print(word.contains("on"));

		System.out.println();
		
	
	
	}




	public static void q2() {
		Scanner input = new Scanner(System.in);
		String m;
		System.out.print("Input the word mango: ");
		m = input.nextLine();
		String w = m.toLowerCase();
		boolean r = w.equals("mango");
		System.out.println(r);
		
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		String q;
		System.out.print("Input a word: ");
		q = input.nextLine();

		String w;
		System.out.print("Input a letter: ");
		w =input.nextLine();

		System.out.println( q.indexOf(w) + "\n" + q.lastIndexOf(w));
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		String n;
		System.out.print("Input a sentence: ");
		n = input.nextLine();
		System.out.println("Your sentence is " + n.length() + " characters long");
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		String gf;
		System.out.print("Input a sentence: ");
		gf = input.nextLine();
		
		String kf;
		System.out.print("Input a word to replace: ");
		kf = input.nextLine();

		String lk;
		System.out.print("What word would you like to replace it with: ");
		lk = input.nextLine();

		System.out.println(gf.replaceAll(kf,lk));

	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
		String yu;
		System.out.print("Input a sentence: ");
		yu = input.nextLine();

		String a = yu.toUpperCase();

		String q = yu.toLowerCase();

		System.out.println(a.trim());

		System.out.println(q.trim());

	}

	public static void q7() {
		Scanner input = new Scanner(System.in);
		String kl; 
		System.out.print("Input a word: ");
		kl = input.nextLine();

		System.out.println(kl.substring(0,4));
		
		System.out.println(kl.substring(kl.length()-4));



	}

	public static void q8() {
	}

}
