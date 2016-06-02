package ua.org.oa.ivanovd.practice1;

/**
 * Created by Администратор on 23.05.2016.
 */
public class ArraySum {
    private int [] Array;

    public ArraySum (int [] Array) {
        this.Array = Array;
    }

    public static int Sum (int [] Array) {
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        return sum;
    }

    public int Sum(){
        int sum = 0;
        for (int i = 0; i < Array.length; i++)
            sum += Array[i];
        return sum;
    }


}
