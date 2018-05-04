package startup;

import controller.Controller;
import view.View;

/**
 * Starts the entire application.
 */
public class Main {
    /**
     * @param args The program does not take any command line parameters. 
     */
    public static void main(String[] args) {
        Controller contr = new Controller();
        View view = new View(contr);
        view.sampleExecution();
    }
}