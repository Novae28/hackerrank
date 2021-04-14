import java.util.*;
class Prac14{
	public static void main(String[] args)
	{
		ArrayList<Object> arr_list=new ArrayList<Object>();
		arr_list.add(new Loan(32050));
		arr_list.add(new circle(4.5));
		arr_list.add(new Date());
		arr_list.add(new String("This is a string object"));

		for(int i=0;i<arr_list.size();i++)
		{
			System.out.println(arr_list.get(i).toString());
		}

	}
}
class Loan{
	private int amount;
	Loan(int amount)
	{
		this.amount=amount;
	}
	public String toString()
	{
		return "The outstanding loan amount is "+amount;
	}
}

class circle{
	private double radius;
	circle(double radius)
	{
		this.radius=radius;
	}

	public String toString()
	{
		return "The area of the circle is "+ Math.PI*Math.pow(radius,2);
	}
}