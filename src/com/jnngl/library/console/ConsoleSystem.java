package com.jnngl.library.console;

import java.io.Console;
import java.io.InputStream;
import java.io.PrintStream;

public final class ConsoleSystem {
	
	public static final PrintStream out = System.out;
	public static final InputStream in = System.in;
	public static final PrintStream err = System.err;
	
	public static final Console console = System.console();
	
}
