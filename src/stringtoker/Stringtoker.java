package Stringtoker;

import java.util.StringTokenizer;

public class Stringtoker {
	public static void main(String[] args) {

		String str = "este String es, dividido por StringTokenizer, ";
		StringTokenizer st = new StringTokenizer(str);

		System.out.println("---- dividido por espacio ------");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}

		System.out.println("---- Dividido por la coma ',' ------");
		StringTokenizer st2 = new StringTokenizer(str, ",");

		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}
	}
}