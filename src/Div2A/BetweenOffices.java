package Div2A;

import java.util.Scanner;

public class BetweenOffices {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        String lastNDays = input.next();

        int SF = 0, FS = 0;
        for(int i=1 ; i< n ; i++){
            if(lastNDays.charAt(i) == 'F' && lastNDays.charAt(i-1) == 'S'){
                SF+=1;
            }
            else if(lastNDays.charAt(i) == 'S' && lastNDays.charAt(i-1) == 'F'){
                FS+=1;
            }
        }
        if(SF > FS)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
