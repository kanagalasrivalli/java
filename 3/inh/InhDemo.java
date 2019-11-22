package com.hcl.inh;

public class InhDemo {
	
	
	public static void main(String[] args) {
		//Second obj = new Second();
		//obj.show();
		//obj.display();
		//Second s = (Second)new First();
		//s.show();
		//s.display();
		First f = (First)new Second();
		f.show();
	}

}
