import java.util.Arrays;
public class Driver2{
    public static void main(String[]args){
        int size = 10000;
        String choice = "insertion";
        String order = "random"; // reversed sorted

        if(args.length >= 1){
            choice = args[0];
        }
	
        if(args.length >= 2){ //pick number of elements
            size = Integer.parseInt(args[1]);
        }
	
        if(args.length > 2){
            order = args[2];
        }
        int[]ary = new int[size];

	
        //default is random order
        Sorts.fillRandom(ary);
        if(order.equals("random")){
	    
        }
        if(order.equals("sorted")){
            Arrays.sort(ary);
        }
        if(order.equals("reversed")){
            Arrays.sort(ary);
	    Sorts.swap(ary);//changed
        }
	
        long start = System.currentTimeMillis();
	
        if(choice.equals("bubble")){
            Sorts.bubbleSort(ary);
        }
        if(choice.equals("insertion")){
            Sorts.insertionSort(ary);
        }
        if(choice.equals("selection")){
            Sorts.selectionSort(ary);
        }
        long end = System.currentTimeMillis();
	
        System.out.println("Time:"+ (end-start)/1000.0 + " seconds. Size = "+ary.length);
    }
}
