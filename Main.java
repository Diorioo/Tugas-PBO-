/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Sekolah.utama;

import Sekolah.data.Siswa;
import Sekolah.hitung.Balok;

public class Main {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("     DATA SISWA SEKOLAH");
        System.out.println("================================");

        Siswa siswa1 = new Siswa(
            "Dio Rio Bermano",
            "26971",
            "XI RPL B",
            "Rekayasa Perangkat Lunak"
        );

        siswa1.tampilkanData();

        System.out.println("================================");
        System.out.println("       HITUNG VOLUME BALOK");
        System.out.println("================================");

        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        double volume = Balok.hitungVolume(
            panjang, lebar, tinggi
        );

        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("Tinggi  : " + tinggi);
        System.out.println("Volume  : " + volume);

        System.out.println("================================");
        System.out.println("       PROGRAM SELESAI");
        System.out.println("================================");
    }
}
