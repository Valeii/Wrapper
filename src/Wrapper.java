import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Администратор on 25.10.2015.
 */
public class Wrapper {

    private Integer [] array;

    public Wrapper(int initialLenght) {
        this.array = new Integer[initialLenght];
    }

//    public static int[] startInitialization(int n){
//        System.out.println("You have asked the dimension = " + n);
//        System.out.println("Lets fill the massive using random numbers");
//        int [] array = new int[n];
//        Random random = new Random();
//        for (int i : array){
//            array[i] = random.nextInt(100) + 1;
//        }
//        System.out.println("our massive is = " + array);
//        return array;
//    }





    public void addElement(Integer value){

        int [] array_1 = new int [array.length + 1];
        System.arraycopy(array,0,array_1,0,array.length);
        array_1[array.length + 1] = value;
        System.out.println(Arrays.asList(array_1));
    }


    public void deleteElementFromTheEnd(){
        int [] array_2 = new int [array.length-1];
        System.arraycopy(array,0,array_2,0,array.length-1);

    }


    public void deleteElementFromTheBegining(){
        int [] array_3 = new int [array.length-1];
        System.arraycopy(array,1,array_3,0,array.length);

    }


//    public static int max(){
//        int max;
//        int [] array = new int[];
//        for(int i : array){
//            if(array[i+1]> array[i]){
//                array[i+1] = max;
//            }
//            System.out.println(max);
//            return max;
//        }
//    }
//
//
//    public static int min(){
//        int min;
//        int [] array = new int[];
//        for(int i : array){
//            if(array[i+1]< array[i]){
//                array[i+1] = min;
//            }
//            System.out.println(min);
//            return  min;
//        }
//    }



    public void deleteValue(int value){
        int [] mass = new int [array.length-1];
        for(int i : array){
            if (array[i].equals(value)){
                System.out.println(("Value has been found.Lets delete her!"));
                mass[i] = array[i+1];
            } else  if(array[i]!=value){
                mass[i] = array[i];
            }
            System.out.println(Arrays.asList(mass));
        }

    }
}
