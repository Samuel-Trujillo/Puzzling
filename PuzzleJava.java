import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
public class PuzzleJava{
    public ArrayList sumSep(int[] arr){
        ArrayList<Object> myArray = new ArrayList<Object>();
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        for(int j = 0; j<arr.length; j++){
            if(arr[j] > 10){
                myArray.add(arr[j]);
            }
        }
        return myArray;
    }
    public ArrayList nameShuff(String[] arr){
        ArrayList<Object> myArray = new ArrayList<Object>();
        List<String> list = Arrays.asList(arr);
        Collections.shuffle(list);
        System.out.println(list);
        for(int i = 0; i< arr.length; i++){
            if(arr[i].length() > 5){
                myArray.add(arr[i]);
            }
        }
        return myArray;
    }
    public ArrayList alpha(String alpha){
        ArrayList<char> myArray = new ArrayList<char>();
        List<char> list = Arrays.asList(arr);
        System.out.println(list);
        String vowel = "";
        Collections.shuffle(list);
        System.out.println(list);
        myArray.add(arr[0]);
        myArray.add(arr[arr.length-1]);
        if(arr[0] == 'a' || arr[0] == 'e'|| arr[0] == 'i' || arr[0] == 'o' || arr[0] == 'u' ){
            vowel = "es a vowel!!";
        }
        System.out.println(vowel);
        return myArray;
    }
    public ArrayList randoNum(int[] arr){
        ArrayList<Object> myArray = new ArrayList<Object>();
        for(int i = 0; i< 10; i++){
            myArray.add(new Random().nextInt(45) + 55);
        }
        return myArray;
    }
    public ArrayList randoNumSort(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i = 0; i< 10; i++){
            myArray.add(new Random().nextInt(45) + 55);
        }
        System.out.println(myArray);
        Collections.sort(myArray);
        System.out.println(myArray);
        return myArray;
    }
    public String randoString(String[] arr){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 5;
        for(int i =0; i< length; i++){
            int index = random.nextInt(letters.length());
            char randoLetter = letters.charAt(index);
            sb.append(randoLetter);
        }
        String randomString = sb.toString();
        return randomString;
    }
    public String randoStringArr(String[] arr){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int length = 5;
        for(int i =0; i< length; i++){
            int index = random.nextInt(letters.length());
            char randoLetter = letters.charAt(index);
            sb.append(randoLetter);
        }
        String randomString = sb.toString();
        return randomString;
    }

}