 public class Sorts{
    public static void insertionSort(int[] data){
	int end = 0; //last number in array that is sorted
        while(end < data.length - 1){
	    int next = data[end + 1];
	    //System.out.println("next:"+next);
	    //System.out.println(printArray(data));
	    for (int x = end; x >= 0; x--){
		if (next < data[x]){
		    data[x + 1] = data[x];
		}
		if (next >= data[x]){
		    data[x + 1] = next;
		    break;
		}
		if (x == 0){
		    data[x] = next;
		}
	    }
	    end++;
	}
    }

     public static void selectionSort(int[] data){
	 int end = 0;
	 while(
     }

    public static String printArray(int[] ary){
	String out = "{";
	for(int x = 0; x < ary.length; x++){
	    out += ary[x]+", ";
	}
	return out.substring(0,out.length() - 1)+"}";
    }

    public static void fillArray(int[] ary){
	for(int x = 0; x < ary.length; x++){
	    ary[x] = 0 + (int)(Math.random() * 100000);
	}
    }
     public static void main(String[]args){
	 int[] data1 = new int[100000];
	 fillArray(data1);
	 insertionSort(data1);
     }
}
