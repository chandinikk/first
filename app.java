import java.io.*;
class Sum
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader re = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Enter two numbers");
		int num1=Integer.parseInt(re.readLine());
		int num2=Integer.parseInt(re.readLine());

		System.out.println("Sum: " + (num1 + num2));
	}

}