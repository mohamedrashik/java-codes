package code.datastructures.linear.arrays;


class ArrayInsertDelete{
    public static boolean isArrayFull(int[] items){
        if(items[items.length-1] != 0) 
            return true;
        return false;
    }

    public static boolean insert(int[] items, int position, int value) {

		if(!isArrayFull(items)){
			for(int index = items.length-1; index>=position; index--){
				items[index] = items[index-1];
			}

			items[position] = value;
			display(items);
		}
		return false;

	}

	public static void display(int[] items){
		System.out.print(" \n");

		for (int i=0; i<=items.length-1; i++){
			System.out.print(items[i]+" ");
		}
	}

	public static boolean delete(int[] items, int position) {
		for(int index = position; index < items.length-1; index++){
			items[index] = items[index + 1];
		}
		items[items.length-1] = 0;	
		display(items);

		return false;
	}
}

class ArrayMain{
    public static void main(String[] args) {
        int items[] = new int[6];
        items[0] = 10;
		items[1] = 20;
		items[2] = 30;
		items[3] = 40;
		items[4] = 50;
		// items[5] = 50;
        
		ArrayInsertDelete.insert(items, 4, 1);
		//ArrayInsertDelete.delete(items, 2);
    }
}
