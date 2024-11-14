package designPrinciple.progamToInterface.sampleIO;

public class ConsolePrinter implements Printer{
	@Override
	public void print(String str) {
		System.out.println(str);
	}
}
