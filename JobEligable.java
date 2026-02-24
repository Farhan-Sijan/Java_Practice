import java.util.Scanner;
public class JobEligable {
    public static void main(String[] args){
        Scanner imput=new Scanner(System.in);
        int job,eng;
        System.out.println("Have you completed your masters? y/n ");
        job =imput.next().charAt(0);

        System.out.println("Are you fluent in english? y/n ");
        eng=imput.next().charAt(0);

        if(job=='y' &&  eng=='y' ){
            System.out.println("Your are enable for job");
        }
        else {
            System.out.println("Your are not enable for job");
        }

    }
}
