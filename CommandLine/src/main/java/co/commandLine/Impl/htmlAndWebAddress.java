package co.commandLine.Impl;

import co.commandLine.commanderInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class htmlAndWebAddress implements commanderInterface {
    @Override
    public void executeFunction() {
        System.out.println("Please enter a valid website: ");

        Scanner userInputAddress = new Scanner(System.in);
        String webAddress = userInputAddress.nextLine();

        try {
            URL urlAddress = new URL(webAddress);

            HttpURLConnection con = (HttpURLConnection)
                    urlAddress.openConnection();

            con.setRequestMethod("GET");
            BufferedReader read= new BufferedReader(new InputStreamReader(con.getInputStream()));

            String a;
                while ((a=read.readLine()) !=null){
                    System.out.println(a);
                }
                read.close();
        }
        catch (MalformedURLException invalidURL) {
            System.out.println("The URL which was entered is invalid.");
        } catch (IOException e) {
            System.out.println("There was an error with checking the URL.");
        }
    }
    }

