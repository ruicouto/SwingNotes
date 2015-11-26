/*
 * NotesDAO
 * ruicouto in 26/nov/2015
 */
package notepad.data;

import notepad.business.Note;
import notepad.business.Notes;

/**
 * DAO for notes.
 * Not really persisting notes
 * @author ruicouto
 */
public class NotesDAO {
    
    /**
     * Load all notes
     * @return 
     */
    public static Notes listAllNotes() {
        Notes n = new Notes(); //TODO: load from database
        n.addNote("Nota 1", "Conteúdo 1");
        return n;
    }
    
    /**
     * Save a list of notes
     * @param n 
     */
    public static void saveNotes(Notes n) {
        //TODO: persist notes
    }
    
    /**
     * Get a note for the given id
     * @param title
     * @return 
     */
    public Notes getNoteByTitle(String title) {
        //TODO: load note : select * from notes where title = ...
        return null;
    } 
    
    /**
     * Update a note
     * @param n
     * @return (e.g.) true if updated, false otherwise
     */
    public boolean updateNote(Note n) {
        //TODO: update code
        return false;
    }
    
    //TODO: remaining methods
    
}
