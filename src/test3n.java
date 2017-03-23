
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class test3n {
    static String Questions[] = {"what is the capita sate of abia","what is the capital state of adamawa","what is the capital state of akwa ibom","what is the capital state of bauchi","what is the capital state of bayelsa","what is the capital state of benue","what is the capital state of borno","what is the capital state of cross river","what is the capital state of delta","what is the capital state of ebonyi"};
    static String Answer[] = {"umuhia","yola","uyo","awka","bauchi","yenago","makurdi","maiduguri","calabar","asaba","abakaliki"};
    static Random myRandom = new Random ();
    static Scanner myInput = new Scanner(System.in);
    private static int Uchoice;
    private static int answer;
      

public static void main (String [] args) {
    Uchoice = myRandom.nextInt(10);
    if(Uchoice > 0)
    {
        System.out.println(Questions[Uchoice]);
         answer = myInput.nextInt(10);
        
    }
    if (answer.equals(answer[Uchoice]))
    {
        System.out.println("incorrect");
        {
           
           
        }
    }
}
{
    System.out.println("1mark");
}
}