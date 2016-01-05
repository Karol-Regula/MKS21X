import java.util.Arrays;
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
	 int min = 0;
	 int minPosition = 0;
	 int tempValue = 0;
	 while(end < data.length - 1){
	     min = Integer.MAX_VALUE;
	     minPosition = 0;
	     tempValue = 0;
	     for (int x = end; x < data.length; x++){
		 if (data[x] < min){
		     min = data[x];
		     minPosition = x;
		 }
	     }
	     tempValue = data[end];
	     data[end] = data[minPosition];
	     data[minPosition] = tempValue;
	     end++;
	 }

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
	    ary[x] = 0 + (int)(Math.random() * 10000);
	}
    }
     public static void main(String[]args){
	 int[] data1 = new int[100000];
	 fillArray(data1);
	 int[] data2 = data1.clone();
	 int[] data3 = data1.clone();
	 insertionSort(data1);//about 16.2 seconds on average
	 //selectionSort(data2);//about 18.5 seconds on average
	 
	 /*
	 //testing if sorting works
	 Arrays.sort(data1);
	 insertionSort(data2);
	 selectionSort(data3);
	 System.out.println(data1.equals(data2));
	 System.out.println(data1.equals(data3));
	 //well, when I look at the arrays they are exactly the same but equals() disagrees. I disagree with equals().
	 System.out.println(printArray(data1));
	 System.out.println(printArray(data2));
	 System.out.println(printArray(data3));
	 */
	 
     }
}
