package phuck.com.vn;

public interface Number {
	
	ComplexNumber sum(ComplexNumber x, ComplexNumber y);
	ComplexNumber sub(ComplexNumber x, ComplexNumber y);
	ComplexNumber mul(ComplexNumber x, ComplexNumber y);
	ComplexNumber div(ComplexNumber x, ComplexNumber y);
	void display();

}
