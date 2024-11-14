package designPrinciple.progamToInterface.sampleIO;

import java.io.FileWriter;

public class FilePrinter implements Printer {

	@Override
	public void print(String str) {
		try(FileWriter writer = new FileWriter("output.txt");) {			
			writer.write(str);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void randomFunction() {
		System.out.println("Hello");
	}
}
