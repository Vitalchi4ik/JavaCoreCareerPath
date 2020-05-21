/**
 * Task 6 (hard)
 * From the beginning, the only developer in the company was its founder. Each next developer, who joins the company, had one interview with each developer who works in the company at the given moment.
 *
 * Given a current number of the developer in the company (provided as a parameter by user), calculate, how many interviews have been conducted inside a company.
 *
 * The solution should be provided using a recursion algorithm.
 * */
package sixth.task;

public class TaskNumberSix {
    static int countOfDevelopers = 0;
    static int countForCalculateDevelopers = 5;
    static void developer(){
        countOfDevelopers++;
        if(countOfDevelopers<countForCalculateDevelopers){
            developer();
        }
    }
    static void calculateInterview(){
        for (int i = 0; i < countForCalculateDevelopers; i++) {
            developer();
        }
    }

    public static void main(String[] args) {
        calculateInterview();
        System.out.println(countOfDevelopers + " interviews have been conducted inside a company");
    }
}
