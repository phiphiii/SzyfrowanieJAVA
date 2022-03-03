import java.lang.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        String test = "Ckratka Jest o wiele lepszym językiem niż Java";
        char [] chars = test.toCharArray();
        char[] alphabet = {'a','ą','b','c','ć','d','e','ę','f','g','h','i','j','k','l','ł','m','n','o','ó','p','q','r','s','t','u','v','w','x','y','z','ż','ż'};

        System.out.print("Alfabet: ");
        for(char a : alphabet){
            System.out.print(a);
        }
        char tym;
        //Robienie szyfru
        for(char a : alphabet){
            tym = (char) (random.nextInt(33) + 'a');
            alphabet[a] = tym;
        }
        System.out.println();
        //
        System.out.print("Alfabet po losowym szyfrowaniu: ");
        for(char a : alphabet){
            System.out.print(a);
        }
        System.out.println();
        for(char c : chars){
            if(Character.isLetter(c)){
                c += 5;
                System.out.print(c);
            }
            else{
                System.out.print(c);
            }

        }
        char randomizedCharacter = (char) (random.nextInt(32) + 'a');

        System.out.println("Generated Random Character: " + randomizedCharacter);
    }
}
