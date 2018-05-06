package se.kth.hogk.sem3.startup;

import se.kth.hogk.sem3.controller.Controller;
import se.kth.hogk.sem3.integration.ExternalSystemHandler;
import se.kth.hogk.sem3.view.View;

/**
 * Starts the entire application.
 */
public class Main {
    /**
     * @param args The program does not take any command line parameters. 
     */
    public static void main(String[] args) {
        ExternalSystemHandler exHandler = new ExternalSystemHandler();
        Controller contr = new Controller(exHandler);
        View view = new View(contr);
        view.sampleExecution();
    }
}