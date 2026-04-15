import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){
 Scanner inputScores= new Scanner(System.in);
int score=1;
int sum=0;
 
for (score=0; score<=10; score++){System.out.print("type num " + score);

   int Userinput = inputScores.nextInt();
  sum += Userinput;
}

System.out.print("The sum is " + sum);
}

}
