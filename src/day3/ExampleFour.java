package day3;

public class ExampleFour {
 public static void main(String[] args) {
    int mark1 = 87, mark2 = 97, mark3 = 63; 
        int numMarks = 3;

        //explicit cast on numMarks to convert to a double temporary
        double average = (double)(mark1 + mark2 + mark3) / numMarks;

        System.out.println(average);
 }
}
