package edu.example.csvHomework;
import java.io.FileNotFoundException;
import java.util.List;

public abstract class CSVParser {
    private String delimiter;

    public CSVParser() {
        // Default parser
        delimiter = ",";
    }

    public CSVParser(String delimiter) {
        // Custom delimiter
        this.delimiter = delimiter;
    }

    /***
     * Getter for delimiter variable.
     * @return delimiter - single or multiple char delimiter
     */
    public String getDelimiter() {
        return delimiter;
    }

    // Abstract methods for reading, returning, & printing the CSV
    public abstract void loadCSV() throws FileNotFoundException;
    public abstract List loadAndReturnCSV() throws FileNotFoundException;
    public abstract List getSports();
    public abstract void printCSV();

    // Method not used for this implementation
    protected abstract String[] getHeaders();

    // We're not going to try and write this file (repl.it crashes a lot when you do that)
    //public abstract void writeCSV() throws IOException;
}