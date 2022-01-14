import java.util.Scanner;

public class Main{

    public String skipWords(String str){
        String a ="";
        String[] wordsArr = str.split(" ");
        for(int i = 0 ; i< wordsArr.length; i++){
            if(i%2 != 0)
                a= a+wordsArr[i] + " ";
            else
                a = a.replace(wordsArr[i]," ");
        }
        return a;
    }

    public String fCapital(String str){
        String f = str.substring(0, 1);
        String r = str.substring(1);
        f = f.toUpperCase();
        String c = f + r;
        return c;
    }

    public static void main(String[] args){
        String result = "";
        Main obj = new Main();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
        String w = obj.skipWords(str);
        result = obj.fCapital(w);
        System.out.println("The resulting string is: ");
        System.out.println(result);
    }
}