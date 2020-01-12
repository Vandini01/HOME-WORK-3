import java.util.Arrays;

public class MinMaxRepetitionInArray {
    public static void main(String[] args) {
        Methods method = new Methods();
        int[] array = method.inputArray(); //2
        method.minArray(array);     //3
        method.maxArray(array);     //4
        method.repetition(array);   //5
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); //6
        System.out.println(method.maxRepetition(array));  //7
        System.out.println(method.minRepetition(array));  //8
    }
}
