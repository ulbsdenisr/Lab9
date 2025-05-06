package org.example;

import java.util.List;

public class ExportToConsole implements Exporter {
    @Override
    public void export(List<Persoana> persoane) {
        for (int i = 0; i < persoane.size(); i++) {
            Persoana p = persoane.get(i);
            System.out.println((i + 1) + ". " + p.getNume() + " " + p.getPrenume() + ", " + p.getVarsta() + " ani");
        }
    }
}