package com.mycompany.strukturpemilihanifelseif;

public class StrukturPemilihanIfElseIf {

    public static void main(String[] args) {
        double nilai = 74;
        if (nilai >= 98) {
            System.out.println("A++");
        } else if (nilai >= 95) {
            System.out.println("A+");
        } else if (nilai >= 90) {
            System.out.println("A");
        } else if (nilai >= 88) {
            System.out.println("B+");
        } else if (nilai >=80) {
            System.out.println("B");
        } else if (nilai >= 75) {
            System.out.println("C");
        } else {
            System.out.println("Anda Di Bawah KKM. Silahkan Hubungi Guru Untuk Perbaikan Nilai");
        }
    }
}
