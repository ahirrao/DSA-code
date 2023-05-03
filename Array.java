import java.util.Scanner;
public class Array{
    public static void main(String[]  args){
      Scanner out = new Scanner(System.in);
      int[] rollno = new int[10];
      for(int i  = 0;  i<rollno.length; i++){
        rollno[i] = out.nextInt();
      }
      for(int num: rollno){
        System.out.println(num);
      }
      }

    }

