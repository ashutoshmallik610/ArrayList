package com.lambda.print;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		AddElements add = new AddElements();
		
		ArrayList<Elements> is = add.getElements();
		
		add.printElements(is);

	}

}
