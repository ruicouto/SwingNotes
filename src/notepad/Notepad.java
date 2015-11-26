/*
 * Notepad
 * ruicouto in 25/nov/2015
 */
package notepad;

import notepad.business.Notes;
import notepad.data.NotesDAO;
import notepad.presentation.MainWindow;

/**
 * Main class
 * @author ruicouto
 */
public class Notepad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notes n = new Notes();
        n.loadNotes();
        
        //create and show main window
        MainWindow m = new MainWindow(n);
        m.setLocationRelativeTo(null); //center main window
        m.setVisible(true);
    }
    
}
