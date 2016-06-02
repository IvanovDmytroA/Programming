package ua.org.oa.ivanovd.practice1;

/**
 * Created by Администратор on 25.05.2016.
 */
public class ArrayProd {

    public int Prod(int[] Array){
        int prod = 1;
        for (int i = 0; i < Array.length; i++)
            prod *= Array[i];
        return prod;
    }
}
