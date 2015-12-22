public class BarCode implements Comparable{
    private String _zip;
    private int _checkDigit;
    private final static String[] reference = new String[10];
    
    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip){
	_zip = zip;
	_checkDigit = checkSum();
    }
    
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	
    }
    
    private int checkSum(){//checksum works
	int a = Integer.parseInt(_zip.substring(0,1));
	int b = Integer.parseInt(_zip.substring(1,2));
	int c = Integer.parseInt(_zip.substring(2,3));
	int d = Integer.parseInt(_zip.substring(3,4));
	int e = Integer.parseInt(_zip.substring(4,5));
	return (a + b + c + d + e)%10;
    }
    
    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	return "";
    }
    
    
    public boolean equals(Object other){
	return true;
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.
    
    
    public int compareTo(Object other){
	return 0;
    }
    // postcondition: compares the zip + checkdigit 
    
    public static void main(String[]args){
	BarCode b1 = new BarCode("12345");
	BarCode b2 = new BarCode("75420");
	System.out.println(b1.checkSum());
	System.out.println(b2.checkSum());
    }
    
}
