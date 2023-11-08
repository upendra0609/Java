import java.util.Scanner;

class Test {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        System.out.println("Enter Size of the array:\n");
        N = s.nextInt();

        int[] data = new int[N];
        for(int i=0; i<N; i++){
            System.out.println("Enter value of data["+i+"]: ");
            data[i] = s.nextInt();
        }
        int num =0;
        for(int i: data){
            num = num*10 +(i%10);
        }

        System.out.println(num%10==0?"Yes":"No");

    }
}
