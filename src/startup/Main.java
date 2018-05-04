package startup;

import controller.Controller;
import integration.ExternalSystemHandler;
import view.View;

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