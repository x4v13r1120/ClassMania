package edu.example.csvHomework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// use the abstract CSVParser and create your own version for sports.csv
public class SportCSVParser extends CSVParser {

    private String sportCSVFILE = "";
    protected List<Sport> sports = new ArrayList<>();

    public SportCSVParser(String sportFile){
        super(";");
        sportCSVFILE = sportFile;
    }

    @Override
    public void loadCSV() throws FileNotFoundException {
        FileReader loader = new FileReader(sportCSVFILE);

        try (BufferedReader sSportLoader = new BufferedReader(loader)){
            String line;
            int headers = 0;

            while((line = sSportLoader.readLine()) != null){
                if(headers == 0 ) {
                    headers++;
                }
                else{
                    sports.add(new Sport(line.toLowerCase().split(getDelimiter())));
                }
            }

        } catch (IOException ex){
            System.out.println("Could not load file <"+ sportCSVFILE + ">\n" + ex);
        }
    }

    @Override
    public List loadAndReturnCSV() throws FileNotFoundException {
        loadCSV();
        return getSports();
    }

    @Override
    public List getSports() {
        return sports;
    }

    @Override
    public void printCSV() {
        if (sports.size() > 0 ){
            for (Sport sport:sports){
                System.out.print(sport.toString());
            }
        }
        else {
            System.out.println("No sports loaded");
        }

    }

    // Method not used for this implementation
    @Override
    protected String[] getHeaders() { return new String[0]; }
}

