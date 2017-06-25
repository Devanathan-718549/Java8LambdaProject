package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Java8Demo {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		int result= 0;
		for(int i : values)
		{
			if(i % 5 == 0){
				System.out.println("i value is " + i);
				result =  i * 2;
				System.out.println(result);
				break;
			}
		}
		
		System.out.println("Final Result value is " + result);
		
		/*System.out.println(values.stream()
						         .filter(i -> i % 5 ==0)
						         .map(i -> i*2)
						         .findFirst()
						         .orElse(0)
							);*/
		
		System.out.println(values.stream()
		         .filter(Java8Demo::isDivisible)
		         .map(Java8Demo::mapDouble)
		         .findFirst()
		         .orElse(0)
			);
		
	}
	
	public static boolean isDivisible(int i)
	{
		System.out.println("in isDvs " + i);
		return i%5==0;
	}
	
	public static int mapDouble(int i)
	{
		System.out.println("in mapdouble " + i);
		return i*2;
	}

}
