class Garbage{
	protected void finalize(){
		System.out.println("Object is Destroyed!!!");
	}

public static void main(String args[]){
	Garbage ga=new Garbage();
	ga=null;
	System.gc();
	
}
}