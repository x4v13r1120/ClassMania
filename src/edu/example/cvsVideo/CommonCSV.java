package edu.example.cvsVideo;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class CommonCSV {
   private String delimiter;

    protected CommonCSV() {
        this.delimiter = ",";
    }

    protected CommonCSV(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public abstract void readCSV() throws FileNotFoundException;
    public abstract void printCSV();
    public abstract void writeCSV() throws IOException;

    protected abstract String[] getHeaders();

}
