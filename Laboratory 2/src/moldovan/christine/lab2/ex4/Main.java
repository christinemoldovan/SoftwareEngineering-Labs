package moldovan.christine.lab2.ex4;

public class Main {
    public static void main(String args[]){
        int array[] = new int[]{1,87,2,45,3,24,66,44};
        int max = getMax(array);
        System.out.println("Maximum Value is: "+max);

    }

    public static int getMax(int[] Array){
        int maxValue = Array[0];
        for(int i=1;i < Array.length;i++){
            if(Array[i] > maxValue){
                maxValue = Array[i];
            }
        }
        return maxValue;
    }
}