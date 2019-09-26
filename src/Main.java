/*
*
*  @author Louis DiBernardo
*
 */

import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;


public class Main {
    private static int highScore = 0;
    private static int score = 0;

    private static void readHighScore(FileInputStream in) throws IOException{
        Scanner highScoreReader = new Scanner(in);
        highScore = highScoreReader.nextInt();
    }

    public static void main(String []args) throws IOException{
        Scanner sc = new Scanner(System.in);
        FileInputStream in = new FileInputStream("highScore.txt");
        readHighScore(in);

        new Window();







    }
}
