import java.io.*;
import java.util.HashMap;

public class Calories {
    public static void main (String args[]) throws IOException{

        String fileName = "D:\\AdventOfCode\\2022\\1\\input.txt";
        FileReader path = new FileReader(fileName);
        BufferedReader br = new BufferedReader(path);
        String next;
        int elfCount = 1;
        int calCount = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        while((next = br.readLine() )!= null){
            if(next.isBlank() || next.isEmpty()){
                map.put(elfCount,calCount);
                calCount = 0;
                elfCount += 1;
            }else{
                
                int nextNumber = Integer.parseInt(next);
                calCount += nextNumber;
   
            }
        }
        br.close();

        // FOR THE LARGEST 3 NUMBERS
        int numberOne = 0;
        int numberTwo = 0;
        int numberThree = 0;

        for (Integer i : map.keySet()){
            int j = map.get(i);
            if (j > numberOne){
                numberThree = numberTwo;
                numberTwo = numberOne;
                numberOne = j;
            } else if(j > numberTwo){
                numberThree = numberTwo;
                numberTwo = j;
            } else if(j > numberThree){
                numberThree = j;
            }
            System.out.println(numberOne+numberThree+numberTwo);
        }


        // FOR THE LARGEST NUMBER
        // int largestNumber = 0;
        // int elfNumber = 0;
        // for (Integer i : map.keySet()) {
        //     if(map.get(i)>largestNumber){
        //         largestNumber = map.get(i);
        //         elfNumber = i;
        //         System.out.println("Largest Number now is:  "+largestNumber+"  from elf:  "+elfNumber);
        //     } else{
        //         System.out.println("Largest number is still:   "+largestNumber+"  from elf:  "+elfNumber);
        //     } 
        // }
    }
}