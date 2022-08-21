package Div2A;

import java.util.*;
import java.util.stream.IntStream;

public class Cards {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String chars = input.next();
        LinkedList<Integer> output = new LinkedList<>();
        for(int i =0 ; i<n; i++){
            if(chars.charAt(i) == 'z'){
                output.addLast(0);
            }
            else if(chars.charAt(i) == 'n'){
                output.addFirst(1);
            }
        }
        IntStream.range(0, output.size()).forEach(i -> {
            System.out.print(output.get(i));
            System.out.print(" ");
        });
    }
}
