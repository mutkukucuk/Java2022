package polymorphismDemo;

import java.lang.System.Logger;

public class ConsoleLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Logged to console: "+message);
	}
}
