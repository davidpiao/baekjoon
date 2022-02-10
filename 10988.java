import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int len = input.length();
        int result = 1;

        for (int i = 0; i < (len/2); i++) {
            if (input.charAt(i) != input.charAt(len - (i + 1))) {
                result = 0;
            }
        }
        System.out.print(result);
    }
}