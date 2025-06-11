package Basics;

public class CopyConstructorEx {

		int x;
		String s;
		CopyConstructorEx(int x,String s)
		{
			this.x=x;
			this.s=s;
		}
		//copy constructor
		
		public CopyConstructorEx(CopyConstructorEx obj) {
			this(obj.x,obj.s);
		}

		public static void main(String[] args)
		{
			CopyConstructorEx ce1=new CopyConstructorEx(1,"hello");
			CopyConstructorEx ce2=new CopyConstructorEx(ce1);
			System.out.println(ce2.x);
			System.out.println(ce2.s);


		}

	}

