import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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

        //2
        createElfGroups(dataByLines, priorities);

    }


    public static HashMap<Integer,String> createPriorities(HashMap<Integer,String> priorities){
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] lettersSplit = letters.split("");
        for (int i = 0; i<lettersSplit.length;i++){
            priorities.put(i+1, lettersSplit[i]);
        }

        return priorities;
    }

    /**
     * @param dataByLines
     * @param priorities
     */
    public static void createElfGroups(HashMap<Integer, String> dataByLines, HashMap<Integer,String> priorities){
        int total = 0;
        String currentFirst = "";
        ArrayList<String> secondLetter = new ArrayList<String>();
        String finalLetter = "";
        String sharedLetter = "";
        String[] splitString;
        for (Integer i : dataByLines.keySet()){
            int index = 0;
            
            String j = dataByLines.get(i);
            if (i%3==0){
                splitString = j.split("");
                for(int k = 0; k < splitString.length;k++){
                boolean test = currentFirst.contains(splitString[k]);
                if(test){
                    finalLetter = splitString[k];
                    sharedLetter(secondLetter,finalLetter,sharedLetter);
                    for (Integer set : priorities.keySet()){
                        String val = priorities.get(i);
                        test = sharedLetter.contains(val);
                        if (test){
                            total += set;
                        }
                    }
                    secondLetter.clear();
                    break;
                }
            }
            } else if (i%2==0){
                splitString = j.split("");
                for(int sec = 0; i < splitString.length;sec++){
                boolean test = currentFirst.contains(splitString[sec]);
                if(test){
                    secondLetter.add(splitString[sec]);
                    break;
                }
            }
            } else{
                currentFirst = j;
            }
        }

        System.out.println(total);
    }



    public static String sharedLetter(ArrayList<String> secondLetter, String finalLetter, String sharedLetter){
        System.out.println("secondLetter:  "+secondLetter);
        System.out.println("finalLetter:  "+finalLetter);
        System.out.println("sharedLetter:  "+sharedLetter);

        for(int i=0; i<secondLetter.size();i++){
            if(secondLetter.get(i)==finalLetter){
                sharedLetter = finalLetter;
                return sharedLetter;
            }
        }

        System.out.println("no common letter");
        return null;
    }


}