package com.mycompany.strukturpemilihanswitch;

public class StrukturPemilihanSwitch {

    public static void main(String[] args) {
        String hari = "Minggu";
        switch (hari) {
            case "Senin" -> System.out.println("Belajar Bahasa Inggris");
            case "Selasa" -> System.out.println("Belajar Pemrograman Gim");
            case "Rabu" -> System.out.println("Belajar Bahasa Mandarin");
            case "Kamis" -> System.out.println("Belajar Pemrograman Gim");
            case "Jum'at" -> System.out.println("Belajar Bahasa Mandarin");
            default -> System.out.println("Tidur");
        }
    }
}
