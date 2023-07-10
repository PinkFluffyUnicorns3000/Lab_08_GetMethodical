import java.util.Scanner;
public class Reggie {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String SSN = SafeInput.getRegExString(in, "Enter your SSN number", "^\\d{3}-\\d{2}-\\d{4}$");
        String UCMember = SafeInput.getRegExString(in, "Enter your UC student number", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(in, "Open, Save, View, or Quit?: ", "^[OoSsVvQq]$");
        menuChoice = menuChoice.toUpperCase();
        switch (menuChoice) {
            case "O":
                menuChoice = "Open";
                break;
            case "S":
                menuChoice = "Save";
                break;
            case "Q":
                menuChoice = "Quit";
                break;
            case "V":
                menuChoice = "View";
                break;
        }
        System.out.println("\nYour SSN number is " + SSN);
        System.out.println("Your student ID for UC is " + UCMember);
        System.out.println("Your menu choice was " + menuChoice);
    }
}

