import java.util.Scanner;
class GradeEvaluator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects for which the grade has to be evaluated: ");
        int numSub = sc.nextInt();
        int sum = 0;
        int subScores[] = new int[numSub];
        for (int i = 0; i < numSub; i++)
        {
            System.out.print("Enter marks secured in subject " + (i + 1) + ": ");
            subScores[i] = sc.nextInt();
            sum += subScores[i];
        }
        System.out.println("\n");
        double average = (double) sum / (numSub * 100) * 100;
        String grade = findGrade(average);
        System.out.println("Total Marks secured: " + sum+"/"+numSub*100);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Your Grade : " + grade);

        sc.close();
    }

    private static String findGrade(double percentage)
    {
        if (percentage >= 90 && percentage<=100)
        {
            return "A+";
        }
        else if (percentage >= 80)
        {
            return "A";
        }
        else if (percentage >= 70)
        {
            return "B";
        }
        else if (percentage >= 60)
        {
            return "C";
        }
        else if (percentage >= 50)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }
}
