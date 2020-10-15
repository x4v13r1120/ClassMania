package edu.example.cvsVideo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookCSV extends CommonCSV {

    private String bookCSVFILE = "";
    protected List<Book> books = new ArrayList<>();
    public BookCSV(String file){
        super();
        bookCSVFILE = file;
    }

    @Override
    public void readCSV() throws FileNotFoundException {
        FileReader reader = new FileReader(bookCSVFILE);

        try (BufferedReader bBookReader = new BufferedReader(reader)){
            String line;
            int headers = 0;

            while((line = bBookReader.readLine()) != null){
                if(headers == 0 ) {
                    headers++;
                }
                else{
                    books.add(new Book(line.toLowerCase().split(getDelimiter())));
                }
            }

        } catch (IOException ex){
            System.out.println("Could not load file <"+ bookCSVFILE + ">\n" + ex);
        }

    }

    @Override
    public void printCSV() {
        if (books.size() > 0 ){
            for (Book book:books){
                System.out.print(book.toString());
            }
        }
        else {
            System.out.println("No books loaded");
        }

    }

    @Override
    public void writeCSV() throws IOException {
        File outFile = new File("./data/newBooks.csv");
        if (!outFile.exists()){
            outFile.createNewFile();
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));

        for (Book book:books){
         writer.write(book.toString());
        }
        writer.close();
    }

    // Method not used for this implementation
    @Override
    protected String[] getHeaders() { return new String[0]; }
}
