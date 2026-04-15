import java.util.Scanner;
public class TaskFive{
public static void main(String[] args){
 Scanner inputScores= new Scanner(System.in);
int score=1;
int sum=0;
int average =0;
int evenNum=0;
 
for (score=0; score<=10; score++){System.out.print("type num" + score);

   int Userinput = inputScores.nextInt();
    if (score%2==0)
  evenNum += Userinput;
System.out.print("Score of even" + evenNum);
  
}

}

}
