package co.commandLine.Impl;

import co.commandLine.commanderInterface;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class webStatus implements commanderInterface {
    @Override
    public void executeFunction() {
        System.out.println("Check if multiple websites are online (use a comma to separate them):");

        Scanner userInputStatus = new Scanner(System.in);
        String statusWeb = userInputStatus.nextLine();

        String[] webList= statusWeb.split(",");

        for(String webName: webList){
            try{
                URL urlWebStatus = new URL(webName);
                HttpURLConnection conWebStatus = (HttpURLConnection) urlWebStatus.openConnection();
                conWebStatus.setRequestMethod("HEAD");
                int responseCode= conWebStatus.getResponseCode();
                    if(responseCode== HttpURLConnection.HTTP_OK){
                        System.out.println("This website is online: " + webName);
                    }
                    else{
                        System.out.println("This website is offline: " + webName);
                    }

            } catch (MalformedURLException invalidURL) {
                System.out.println("The website is currently unavailable.");
            } catch (IOException e) {
                System.out.println("The website is currently unavailable.");
            }
        }

    }
}
