/*
 * Notes
 * ruicouto in 25/nov/2015
 */
package notepad.business;

import java.util.ArrayList;
import java.util.Observable;
import notepad.data.NotesDAO;

/**
 * Facade for business layer
 * Contains all the notes
 * @author ruicouto
 */
public class Notes extends Observable {
    /**
     * The notes
     */
    private ArrayList<Note> notes;

    /**
     * Initialize data
     */
    public Notes() {
        this.notes = new ArrayList<>();
    }
    
    /**
     * Load the notes
     */
    public void loadNotes() {
        this.notes = NotesDAO.listAllNotes().getNotes();
    }

    /**
     * get all notes
     * @return 
     */
    public ArrayList<Note> getNotes() {
        return notes;
    }
    
    /**
     * Add a new note.
     * Implements the observer pattern
     * @param title
     * @param content 
     */
    public void addNote(String title, String content) {
        notes.add(new Note(title, content));
        setChanged();
        notifyObservers(title);
    }
}
