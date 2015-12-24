public class BarCode implements Comparable{
    private String _zip;
    private int _checkDigit;
    private final static String[] reference = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
    
    //precondtion: zip.length() = 5 and zip contains only digits.
    public BarCode(String zip){
	if (zip.length() == 5){
	    _zip = zip;   
	}else{
	  throw new UnsupportedOperationException("Invalid input");
	}
	_checkDigit = checkSum();
    }
    
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	_zip = x._zip;
	_checkDigit = x._checkDigit;//could also use checkSum();
    }
    
    private int checkSum(){//checksum works
	int a = Integer.parseInt(_zip.substring(0,1));
	int b = Integer.parseInt(_zip.substring(1,2));
	int c = Integer.parseInt(_zip.substring(2,3));
	int d = Integer.parseInt(_zip.substring(3,4));
	int e = Integer.parseInt(_zip.substring(4,5));
	int checkDigit = (a + b + c + d + e)%10;
	_checkDigit = checkDigit;
	return checkDigit;
    }
    
    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String out = "";
	out += _zip;
	out += _checkDigit+"  ";
	for (int i = 0; i < _zip.length(); i++){
	    for (int j = 0; j < reference.length; j++){
		if (j == Integer.parseInt(_zip.substring(i,i+1))){
		    out += reference[j];
		}
	    }	    
	}
	
	return out;
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
	BarCode b2 = new BarCode("01980");
	BarCode b3 = new BarCode("12345");
	//	BarCode b3 = new BarCode("754209");
	//System.out.println(b1.checkSum());
	//System.out.println(b2.checkSum());
	//System.out.println(reference[0]);
	System.out.println(b1.toString());
	System.out.println(b2.toString());
	System.out.println(b3.toString());
    }
    
}
