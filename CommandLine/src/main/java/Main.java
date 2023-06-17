import co.commandLine.Impl.*;

import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner userInputMain = new Scanner(System.in);

        commanderHandler run = new commanderHandler();

        while (true){

            System.out.println("Please select one of these options: ");
            System.out.println("1 - Print the file and folder directory.");
            System.out.println("2 - Print the HTML code of a website.");
            System.out.println("3 - Report if a given website is currently online or offline.");
            System.out.println("4 - Exit the command.");

            int userChoice= userInputMain.nextInt();
            userInputMain.nextLine();

            switch(userChoice){

                case 1:
                    run.executeFunction(new folderAndFileDirectory());
                    break;
                case 2:
                    run.executeFunction(new htmlAndWebAddress());
                    break;
                case 3:
                    run.executeFunction(new webStatus());
                    break;
                case 4:
                    run.executeFunction(new appExit());
                    break;
                default:
                    System.out.println("Choose a number between 1 and 4.");
                    break;
            }

        }

    }
}