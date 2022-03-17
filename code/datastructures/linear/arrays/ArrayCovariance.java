package code.datastructures.linear.arrays;

public class ArrayCovariance {
    public static void main(String[] args) {
        Number number = 1;
        Integer integer = 1;
        number = integer;
        Integer[] in_ar = {1,2};
        Number[] nr = in_ar;
        nr[0] = 1;
       // nr[1] = 1f; float can't be assigned
    }
}
interface Root{
    int getValue();
}

class ArrayCovariance2 implements Root{
    private int value = 0;
    ArrayCovariance2(int num){
        this.value = num;
    }
    public static void main(String[] args) {
    
    }


    @Override
    public int getValue() {
       return this.value;
    }
}
 class ArrayCovariance3 implements Root{
    int value = 100;

    ArrayCovariance3(int num){
        this.value = num;
    }

    @Override
    public int getValue() {
        return this.value;
    }
}

class ArrayCovarianceMain{
    public static void main(String[] args) {
        Root[] arr = {new ArrayCovariance2(1), new ArrayCovariance3(2)};
        System.out.println(arr[0].getValue());
    }
    
}