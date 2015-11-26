/*
 * Note
 * ruicouto in 25/nov/2015
 */
package notepad.business;

/**
 * Simple class note
 * @author ruicouto
 */
public class Note {
    /**
     * Title of the note
     */
    private String title;
    
    /**
     * Content of the note
     */
    private String content;

    /**
     * Default constructor
     * @param title
     * @param content 
     */
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }
    
    /**
     * Getter for title
     * @return 
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for title
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for content
     * @return 
     */
    public String getContent() {
        return content;
    }

    /**
     * Setter for content
     * @param content 
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * ToString, used for representation on the swing list
     * @return 
     */
    @Override
    public String toString() {
        return title;
    }
    
    
}
