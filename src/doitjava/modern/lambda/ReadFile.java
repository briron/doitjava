package doitjava.modern.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    private static final String FILE_NAME = "C:\\Users\\youop_84q7ud7\\doitjava\\README.MD";

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br =
                     new BufferedReader(new FileReader(FILE_NAME))){
            return p.process(br);
        }
    }

    public static void main(String[] args) {
        try{
            String oneLine = processFile((BufferedReader br) -> br.readLine());
            String twoLine = processFile((BufferedReader br) -> br.readLine() + br.readLine());
            System.out.println(oneLine);
            System.out.println(twoLine);
        } catch (IOException e) {}
    }


}
