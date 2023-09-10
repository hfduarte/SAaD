package app;

public class Main {

	public static void main(String[] args) {
		int id = 1;
		String name = "Container";
		Size size = Size.C;		
		
		D aD = new D(id, name, size);
		
		if (aD.canContainLoad(500))
			System.out.print("Using container!");
		else
			System.out.print("Container not available!");		
	}
}
