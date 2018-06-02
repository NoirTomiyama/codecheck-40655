package codecheck;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			if(args[i].equals("World")) System.out.println("Hello World!");
			if(args[i].equals("織田信長")) System.out.println("Hello 織田信長!");
			if(args[i].equals("codecheck")) System.out.println("Hello codecheck!");
		}
	}
}
