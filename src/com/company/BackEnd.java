package com.company;
import java.util.Arrays;

public class BackEnd {
    public static int[] buttonNumberAnswer;
    public static int count = 3;
    public static boolean roundrunning;

    public BackEnd() {
        buttonNumberAnswer = new int[50];
    }

    public static void answerSetUp()
    {
        count++;
        for(int i =0;i< count; i++) {
            buttonNumberAnswer[count] = (int)Math.random()*4+1;
        }
        for(int i =count;i< buttonNumberAnswer.length - count; i++) {
            buttonNumberAnswer[count] = 0;
        }
    }

    public static void checkAnswer(int buttoninput)
    {
            if(buttoninput != buttonNumberAnswer[count])
            {
                System.out.println("You were WRONG! HA!");
                roundrunning = false;
            }

            else if(buttonNumberAnswer[count+1]==0)
            {
                System.out.println("Correct! Next round starting now.");
                answerSetUp();
            }

            else
            {
                System.out.println("Correct.");
            }
    }
}
