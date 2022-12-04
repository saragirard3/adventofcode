import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Compartments{
    public static void main(String[] args) throws IOException{

        String fileName = "2022/3/input.txt";
        FileReader path = new FileReader(fileName);
        BufferedReader br = new BufferedReader(path);
        String next;
        String ruckSackOne;
        String [] ruckSackTwo;
        String letter = "";
        int halfWayCount = 0;
        int totalCount = 0;
        int index = 0;
        HashMap<Integer, String> priorities = new HashMap<Integer, String>();
        HashMap<Integer, String> dataByLines = new HashMap<Integer, String>();
 
        createPriorities(priorities);

        

        while((next = br.readLine() )!= null){
            //PART TWO
            dataByLines.put(index,next);
            index++;


            //PART ONE
            // halfWayCount = next.length()/2;
            // ruckSackOne = next.substring(0,halfWayCount);
            // ruckSackTwo = (next.substring(halfWayCount, next.length())).split("");
            // for(int i = 0; i < ruckSackTwo.length;i++){
            //     boolean test = ruckSackOne.contains(ruckSackTwo[i]);
            //     if(test){
            //         letter = ruckSackTwo[i];
            //         break;
            //     }
            // }
            // for (Integer i : priorities.keySet()){
            //     String j = priorities.get(i);
            //     boolean test = letter.contains(j);
            //     if (test){
            //         totalCount += i;
            //     }
        
            // }

        }
        br.close();
        // System.out.println(totalCount);

        createElfGroups(dataByLines);
    }


    public static HashMap<Integer,String> createPriorities(HashMap<Integer,String> priorities){
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] lettersSplit = letters.split("");
        for (int i = 0; i<lettersSplit.length;i++){
            priorities.put(i+1, lettersSplit[i]);
        }

        return priorities;
    }

    public static void createElfGroups(HashMap<Integer, String> dataByLines){
        for (Integer i : dataByLines.keySet()){
            String j = dataByLines.get(i);
            if (i%3==0){
                
            } else if (i%2==0){

            } else{

            }
        }
    }
}