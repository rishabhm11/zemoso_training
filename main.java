import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("Select Language Course: \n 1.English \n 2.Spanish \n 3.French \n");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        LanguageManager languageManager=new LanguageManager();
        if (option==1){
            languageManager.englishCourse();
        }else if(option==2){
            languageManager.spanishCourse();
        }else if(option==3){
            languageManager.frenchCourse();
        }else{
            System.out.println("Invalid Input");
        }
    }
}
