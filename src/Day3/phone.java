package Day3;
class phones{
	String colour;
	boolean weigth;
	String Display;
	String ram;
	boolean Storage;
	String model ;
    String version;
    void colour()
    {
    	System.out.println("colourr of the samsung phone is sea green");
    }
    void weigth()
    {
    	System.out.println("3.2 grams");
    }
    void Display()
    {
    	System.out.println("5.6  inches");
    }
    void Storage()
    {
    	System.out.println("64 gb");
    	
    }
    void model()
    {
    	System.out.println("vivo y22");
    }
    void version()
    {
    	System.out.println("fun os 15 gen version");
    }
}   

class vivo extends phones{
	
}
public class phone {
	public static void main(String[] args) {
		vivo v = new vivo();
		v.colour="sea green";
		v.weigth=5;
	    v.Display=3.4;
		v.ram=5 gen;
	    v.Storage=6;
	    v.model ="vivo 2g";
	    v.version="14 version";
	    
	    
		
		
	}

	

}
