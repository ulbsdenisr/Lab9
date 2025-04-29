package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportToFile implements Exporter {
    private String
    @Override
    public void export(List<Persoana> persoane) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < persoane.size(); i++) {
                Persoana p = persoane.get(i);
                writer.write((i + 1) + ". " + p.getNume() + " " + p.getPrenume() + ", " + p.getVarsta() + " ani\n");
            }
        } catch (IOException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
