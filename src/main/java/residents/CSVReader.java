package residents;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;


public class CSVReader {
    public static void importFromCSV() {
        ArrayList<Resident> residents = new ArrayList<>();
        String csvFile = "C:\\Users\\Натан\\Desktop\\residents.csv";
        String line;
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                if (parseContactLine(line) != null) {
                    residents.add(parseContactLine(line));
                }
            }
            residents.sort(Comparator.comparing(Resident::getName));
            for (Resident resident : residents) {
                    System.out.println("Name: " + resident.getName());
                    System.out.println("Skill: " + resident.getSkill());
                    System.out.println("E-mail: " + resident.getEmail());
                    System.out.println("--------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Resident parseContactLine(String line) {
        String[] data = line.split(",");
        Resident resident = null;
        if (data.length == 3) {
            String[] dataName = data[0].split(" ");
            String[] dataSkill = data[1].split(" ");
            String[] dataEmail = data[2].split(" ");
            if (Integer.parseInt((dataSkill[0]))>0) {
                resident = new Resident(dataName[0], dataSkill[0], dataEmail[0]);
            }else {
                resident = null;
            }
        }
        return resident;
    }
}