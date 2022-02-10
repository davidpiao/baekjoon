import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int len = input.length();
        int result = 0;

        for(int i = 0; i < len; i++){
            char in = input.charAt(i);
            if(in == 'A' || in == 'B' || in == 'C'){
                result += 3;
            }
            else if(in == 'D' || in == 'E' || in == 'F'){
                result += 4;
            }
            else if(in == 'G' || in == 'H' || in == 'I'){
                result += 5;
            }
            else if(in == 'J' || in == 'K' || in == 'L'){
                result += 6;
            }
            else if(in == 'M' || in == 'N' || in == 'O'){
                result += 7;
            }
            else if(in == 'P' || in == 'Q' || in == 'R' || in == 'S'){
                result += 8;
            }
            else if(in == 'T' || in == 'U' || in == 'V'){
                result += 9;
            }
            else{
                result += 10;
            }
        }
        System.out.print(result);
    }
}