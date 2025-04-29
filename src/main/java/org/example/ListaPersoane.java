package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class ListaPersoane {
    public static void afiseazaListaPersoane(List<Persoana> persoane) {
        for (int i = 0; i < persoane.size(); i++) {
            System.out.println((i + 1) + ". " + persoane.get(i));
        }
    }

    public static void scriePersoaneFisier(List<Persoana> persoane, String numeFisier) {
        try (FileWriter writer = new FileWriter(numeFisier)) {
            for (int i = 0; i < persoane.size(); i++) {
                Persoana p = persoane.get(i);
                writer.write((i + 1) + ". " + p.getNume() + " " + p.getPrenume() + ", " + p.getVarsta() + " ani\n");
            }
        } catch (IOException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }

    public static List<Persoana> getList() {
        List<Persoana> persoane = new ArrayList<>();
        persoane.add(new Persoana("Popescu", "Ion", 35));
        persoane.add(new Persoana("Ionescu", "Maria", 28));
        persoane.add(new Persoana("Georgescu", "Andrei", 42));
        persoane.add(new Persoana("Dumitrescu", "Elena", 31));
        return persoane;
    }

    public static void export(List<Persoana> persoane, boolean inFisier) {
        if (inFisier) {
            scriePersoaneFisier(persoane, "persoane.txt");
        } else {
            afiseazaListaPersoane(persoane);
        }
    }
}