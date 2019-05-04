package phuctk.java.com;

import java.io.Serializable;

public class Calculator implements Serializable
{
	private int a,b;
	private String operator;
	public Calculator()
	{
		
	}
	public Calculator(int a, int b, String operator)
	{
		this.a = a;
		this.b = b;
		this.operator = operator;
	}
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", operator=" + operator + "]";
	}
	public int calculate(int a, int b, String operator)
	{
		int c = 0;
		switch(operator)
		{
			case "+":
				c = a+b;
				break;
			case "-":
				c = a-b;
				break;
			case "*":
				c = a*b;
				break;
			case "/":
				c = a/b;
				break;
			default:
				break;
		}
		return c;
	}
}
