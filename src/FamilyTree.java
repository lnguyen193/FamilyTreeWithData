import java.util.Scanner;

/*
The profile labels he chooses for each member of the family are:
Full Name, Age, Relation to Cedric.

Can you assist him with completing a functional application?
This is what he has so far:
 */
public class FamilyTree {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String memberName;
        String relation;
        System.out.println("Please enter the number of your relatives:");
        int numberOfRelatives = input.nextInt();
        input.nextLine();

        for ( int i = 0; i < numberOfRelatives; i++) {

            System.out.println("Full Name: ");
            memberName = input.nextLine();

            System.out.println("Relation to Cedric: ");
            relation = input.nextLine();

            System.out.println(memberName + " is Cedric's " + relation);
        }
    }
}
