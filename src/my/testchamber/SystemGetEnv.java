package my.testchamber;

import java.util.Properties;

import org.omg.CORBA.Environment;
import org.omg.CORBA.PUBLIC_MEMBER;

public class SystemGetEnv {

	public static void main(String[] args) {
		/* System.out.println(System.getenv()); 
		
		String strList = System.getenv().toString().replace("{", "").replace("}", "");
		List<String> list = Arrays.asList(strList.split(","));
		list.stream().forEach(System.out::println);*/
		
		/*String strList = System.getProperties().toString().replace("{", "").replace("}", "");
		List<String> list = Arrays.asList(strList.split(","));
		list.stream().forEach(System.out::println);*/
		props();
	}
	public static void env() {
		System.getenv().keySet().stream().sorted().forEach(k->{
			System.out.format("%30s = %s \n", k, System.getenv().get(k));
		});
	}
	public static void props() {
		Properties props = System.getProperties();
		props.keySet().stream().sorted().forEach(k->{
			System.out.format("%30s = %s \n", k,props.get(k));
		});
	}
		
			
}
