package co.commandLine.Impl;
import co.commandLine.commanderInterface;

import java.io.File;
import java.util.Scanner;
public class folderAndFileDirectory implements commanderInterface {
    @Override
    public void executeFunction() {
        System.out.println("Please enter a valid file and folder directory.");

        Scanner userInputDirectory= new Scanner(System.in);
        String directory = userInputDirectory.nextLine();

        File fileFolder= new File(directory);
        File filePath[]= fileFolder.listFiles();

        System.out.println("The files and folders in the directory are: " );

        try{
            for(File displayFile: filePath){
                if(displayFile.isFile()|| displayFile.isDirectory()) {
                    System.out.println(displayFile.getName() );
                    }
                else if(displayFile== null){
                    System.out.println("Error, this is an invalid file path.");
                    }
                }
            }
        catch (NullPointerException e){
                System.out.println("The directory does not exist.");
            }
    }
}
