package pack2.strings;

import java.util.StringJoiner;

/**
 * 
 * a:b:c
 * 
 * m,n
 * 
 */
public class StringJoinerExmple1 {
	
	
	
	StringJoiner sj = new StringJoiner(":", "[", "]");
    sj.add("a").add("b").add("c");
    System.out.println(sj);
	

}
