package residents;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader{
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\Натан\\Desktop\\residents.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] split = line.split(cvsSplitBy);
                System.out.println("Name: " + split[0] + ", skill: " + split[1] + ",  e-mail:" + split[2]);



                String [] data = line.split(";");
                Resident resident = null;

                if (data.length == 3){
                    String[] dataName = data[0].split(" ");
                    String[] dataSkill = data[1].split(" ");
                    String[] dataEmail = data[2].split(" ");
                    resident = new Resident(dataName[1], dataSkill[2], dataEmail[2]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}