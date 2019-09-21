
import java.util.Scanner;

public class Udp {

	static int i;

	static long b1,b2,b3,b4;

	static int carry;

	static String b5;

   public static void main(String[] args)

   {

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter source IP address: ");

	b1 = scanner.nextLong();

	System.out.println("Enter source port number ");

	b2 = scanner.nextLong();

	System.out.println("Enter destination IP address: ");

	b3 = scanner.nextLong();

	System.out.println("Enter destination port address: ");

	b4 = scanner.nextLong();

	System.out.println(b1+" "+b3);

	

	System.out.println("Enter data string: ");

	b5 = scanner.next();

	int [] sum = new int[20];

	int [] sum1 =new int[20];

	while (b1 != 0 || b3 != 0) 

		{

			 sum[i++] = (int)((b1 % 10 + b3 % 10 + carry) % 2);

			carry = (int)((b1 % 10 + b3 % 10 + carry) / 2);

			b1 = b1 / 10;

			b3 = b3 / 10;



		if (carry != 0) 

		{

			sum[i++] = carry;

		}

		--i;

		System.out.print("Output: ");

		  while (i >= 0) 

		 {

			System.out.print(sum[i--]);

		 } 

		}

	System.out.println();

	System.out.print("Binary value of data string:");

	for(int i=0;i<b5.length();i++)

	{

	int val = Integer.valueOf(b5.charAt(i)); 

	String bin= Integer.toBinaryString(val);

	System.out.print(bin);

	}

	carry=0;

	while (sum[i] != 0 || bin != 0) 

	{

		 sum1[i++] = (int)((sum[i] % 10 + bin % 10 + carry) % 2);

		carry = (int)((sum[i] % 10 + bin % 10 + carry) / 2);

		sum1 = sum1 / 10;

		bin = bin / 10;



	if (carry != 0) 

	{

		sum1[i++] = carry;

	}

	--i;

	System.out.print("Output: ");

	  while (i >= 0) 
	 {

		System.out.print(sum[i--]);

	 } 

	}

	scanner.close();

   }

}
