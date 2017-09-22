public class Singleton {
	public static void main(String[] args){
		Thread t1=new Thread(new Runnable(){
			public void run(){
				Abc obj=Abc.getInstance();
			}
		});
		Thread t2=new Thread(new Runnable(){
			public void run(){
				Abc obj=Abc.getInstance();
			}
		});
		t1.start();
//		try{Thread.sleep(10);}catch(Exception e){}
		t2.start();
	}
}

class Abc{
	public static Abc obj=new Abc();
	private Abc(){
		System.out.println("Instance Created!");
	}
//	public static synchronized Abc getInstance(){
	public static Abc getInstance(){
		if(obj==null){
			synchronized(Abc.class){
				if(obj==null)
					obj=new Abc();
			}
		}
		return obj;
	}
}