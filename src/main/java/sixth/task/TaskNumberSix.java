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
