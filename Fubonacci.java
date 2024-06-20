public class Fubonacci{
    public static void main(String[] args){
        int n = 10;
        int a = 0 , b = 1;
        System.out.println("Fubonacci series for First"+ n +"Numbers");
        for(int i=0; i<n; i++){
            System.out.println(a+" ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}