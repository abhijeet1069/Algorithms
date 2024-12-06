package com.satyam.algorithm.fundamentals.dataAbstraction.theory.stringUtilities;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

public class MultipleIO {
	public static void main(String[] args) {
		Out out = new Out("hello.txt");
		In in = new In("https://pagalnew.com/songs/pushpa-pushpa-pushpa-2-the-rule.html");
		while(in.hasNextLine())
			out.println(in.readLine());
		in.close();
		out.close();
	}
}
