package day12;

import day11.ModifiersStack;

public final class Halloween extends ModifiersStack{
    void greet(){System.out.println("Happy Halloween day");}
    public static void main(String[] args) {
        Halloween hall = new Halloween();
        System.out.println(hall.printRandom());
        // System.out.println(stk.printRandom());
    }
}

abstract class Crypto{
    public final int encode(int data){
        return data>>2;
    }
}
