package co.commandLine.Impl;

import co.commandLine.commanderInterface;

public class appExit implements commanderInterface {
    @Override
    public void executeFunction() {
        System.out.println("Thanks for using the application!");
        System.exit(0);
    }
}
