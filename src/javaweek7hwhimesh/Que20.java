package javaweek7hwhimesh;

public class Que20 {
    public static void main(String[] args) {
        arrayCheck();
    }

    public static void arrayCheck() {
        int[] array ={1,2,3,4,5,6,7,8,9,10};
        System.out.println(contains(array,4));
        System.out.println(contains(array,8));
        System.out.println(contains(array,11));
    }
    public static boolean contains(int[] array,int b) {
        for(int n : array){
            if(b==n){
                return true;
            }
        }
        return false;
    }
}
