import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir Kelime Yazın : ");
        String str= scanner.next();
        System.out.println(isPalind(str));
        }

    static boolean isPalind(String str){
        int i =0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}
