import java.util.Scanner;

class Methods {

    private Scanner scanner = new Scanner(System.in);


    ////////////////////3333333333333333333//////////////////
    int[] inputArray() {
        String str = scanner.nextLine();
        String[] strArr = str.split(" ");
        int[] numArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) numArr[i] = Integer.parseInt(strArr[i]);
        return numArr;
    }
    //////////////////////////////111111111111///////////////////////
    void minArray(int[] array){
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            min = Math.min(min, value);
        }
        System.out.println(min);
    }

    void maxArray(int[] array){
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            max = Math.max(max, value);
        }
        System.out.println(max);
    }

    void repetition(int[] array){
        int repetition = 0 ;
        for (int value : array) {
            if (value == 5) {
                repetition++;
            }
        }
        System.out.println(repetition);
    }
    ///////////////////////22222222222/////////////////

    int  maxRepetition(int[] array){

        int repetition = 0 ;
        int repetitionFinal = 0;


        for (int value : array) {
            for (int i : array) {
                if (value == i) {
                    repetition++;
                }
            }
            if (repetition > repetitionFinal) {
                repetitionFinal = repetition;
            }
            repetition = 0;
        }
        return repetitionFinal;
    }
    int  minRepetition(int[] array){

        int repetition = 0 ;
        int repetitionFinal = Integer.MAX_VALUE ;


        for (int value : array) {
            for (int i : array) {
                if (value == i) {
                    repetition++;
                }
            }
            if (repetition < repetitionFinal) {
                repetitionFinal = repetition;
            }
            repetition = 0;
        }
        return repetitionFinal;
    }


}

