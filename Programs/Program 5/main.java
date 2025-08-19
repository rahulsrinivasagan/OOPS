interface A{
	void meth1();
}

interface B{
	void meth2();
}

class Demo implements A,B{
	public void meth1(){
		System.out.println("Implemented Method 1 of interface A");
	}
	
	public void meth2(){
		System.out.println("Implemented Method 2 of interface B");
	}
}

class main{
	public static void main(String args[]){
		Demo obj = new Demo();
		obj.meth1();
		obj.meth2();
	}
}