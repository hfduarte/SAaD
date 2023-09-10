package app;

import java.util.ArrayList;

public class D extends AAC implements IiC {

	private int id;
	private String name = null;
	private Size size;
	
	ArrayList<Integer> arr = new ArrayList<>();	
	
	public int method(int newParam) {
		return 0;
	}	
	
	/**
	 * @param id
	 * @param name
	 * @param size
	 */
	public D(int id, String name, Size size) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
	}

	@Override
	public int method1() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String method2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int abs() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean canContainLoad(int i) {
		if (size == Size.A && i < 150)
			return true;
		
		if (size == Size.B && i < 500)
			return true;
			
		if (size == Size.C && i < 1000)
			return true;
		
		return false;
	}

}
