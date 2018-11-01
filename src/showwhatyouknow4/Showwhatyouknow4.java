/*
 *Jessica Qiao 30/10/2018
*/

package showwhatyouknow4;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author shqia0005
 */
public class Showwhatyouknow4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        ArrayList questions = new ArrayList();
        
        System.out.println("The questions:");
        
        questions.add("What is 20 percent off of 30 dollars?");
        questions.add("Write 0.0625 as a fraction?");
        questions.add("What is 75% as a fraction in simplest form?");
        questions.add("What is 55 percent as a fraction in simplest form?");
        questions.add("What are all the prime numbers between 20 and 30?");
        questions.add("What is 2x squared?");
        questions.add("What is 0.3 as a fraction?");
        questions.add("What is the greatest common factor of 24 and 48?");
        questions.add("What is the GCF of 27 and 36?");
        questions.add("What is the GCF of 24 and 36?");
        for(Object name1 : questions){
            System.out.println(name1);
        }
        ArrayList answers = new ArrayList();
        
        System.out.println("The answers:");
        
        answers.add("6");
        answers.add("1/16");
        answers.add("3/4");
        answers.add("11/20");
        answers.add("23,29");
        answers.add("(4x)^2");
        answers.add("3/10");
        answers.add("24");
        answers.add("9");
        answers.add("4,6");
        
        for(Object name2 : answers){
            System.out.println(name2);
    }

        

    }
    
}

       