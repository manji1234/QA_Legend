package utilities;

import com.github.javafaker.Faker;

public class RandomDataUtility
{
	public static Faker faker;
	 public static String get_FirstName()
	 {
		faker=new Faker();
		String first_name=faker.name().firstName();
		return first_name;
	 }
	 public static String get_LastName()
	 {
		 faker=new Faker();
		 String last_name=faker.name().lastName();
		 return last_name; 
	 }
}
