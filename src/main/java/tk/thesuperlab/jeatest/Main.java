package tk.thesuperlab.jeatest;

import tk.thesuperlab.jea.JEA;
import tk.thesuperlab.jea.exceptions.IncorrectCredentialsException;

public class Main {
	public static void main(String[] args) throws IncorrectCredentialsException {
		JEA jea = new JEA("74556414", "o2pd5hE$CA*d");
		jea.klic();
	}
}