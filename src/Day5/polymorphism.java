package Day5;

//import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class polymorphism {
	
		int addition(int a, int b){
			return a+b;
			}
			int sub(int a,int b ,int c) {
				return a-b-c;
				}
		
	
	public static void main(String[] args) {
		ploymorphism p = new ploymorphism();
		System.out.println(p.addition(5,6));
		System.out.println(p.sub(2,7,5));
	}

}
