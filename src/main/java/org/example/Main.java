package org.example;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Persoana> list = ListaPersoane.getList();

        ListaPersoane.export(list, false);

        ListaPersoane.export(list, true);
    }
}

