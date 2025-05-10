package Opps;
class A
{
	public void methodA()
	{
		System.out.println("Method A");
	}
}
class B extends A
{
	public void methodB()
	{
		System.out.println("Methd B");
	}
}

class C extends A
{
	public void methodC()
	{
		System.out.println("Methd C");
	}
}

class D extends A
{
	public void methodD()
	{
		System.out.println("Methd D");
	}
}


public class HeirarchicalInheritence {

	public static void main(String[] args) {
		D obj=new D();
		obj.methodA();
		C obj2=new C();
		obj2.methodA();
		B obj3=new B();
		obj3.methodA();
		// TODO Auto-generated method stub

	}

}
