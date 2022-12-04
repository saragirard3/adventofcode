import java.io.*;

public class RockPaperSissors {
    public static void main (String args[]) throws IOException{

        String fileName = "D:\\AdventOfCode\\2022\\2\\input.txt";
        FileReader path = new FileReader(fileName);
        BufferedReader br = new BufferedReader(path);
        String next;
        int myGrandTotalScore = 0;

        while((next = br.readLine() )!= null){
            //XYZ as RPS
            // switch(next){
            //     case "A X": 
            //         myGrandTotalScore += 4;
            //         break;
            //     case "A Y": 
            //         myGrandTotalScore += 8;
            //         break;
            //     case "A Z": 
            //         myGrandTotalScore += 3;
            //         break;
            //     case "B X": 
            //         myGrandTotalScore += 1;
            //         break;
            //     case "B Y": 
            //         myGrandTotalScore += 5;
            //         break;
            //     case "B Z": 
            //         myGrandTotalScore += 9;
            //         break;
            //     case "C X": 
            //         myGrandTotalScore += 7;
            //         break;
            //     case "C Y": 
            //         myGrandTotalScore += 2;
            //         break;
            //     case "C Z": 
            //         myGrandTotalScore += 6;
            //         break;
            //     default:
            //         break;  
            // }  

             //XYZ as Lose, Draw, Win
             switch(next){
                case "A X": 
                    myGrandTotalScore += 3;
                    break;
                case "A Y": 
                    myGrandTotalScore += 4;
                    break;
                case "A Z": 
                    myGrandTotalScore += 8;
                    break;
                case "B X": 
                    myGrandTotalScore += 1;
                    break;
                case "B Y": 
                    myGrandTotalScore += 5;
                    break;
                case "B Z": 
                    myGrandTotalScore += 9;
                    break;
                case "C X": 
                    myGrandTotalScore += 2;
                    break;
                case "C Y": 
                    myGrandTotalScore += 6;
                    break;
                case "C Z": 
                    myGrandTotalScore += 7;
                    break;
                default:
                    break;  
            }  
        }
        br.close();

        System.out.println(myGrandTotalScore);
    }
}