/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Sekolah.data;

public class Siswa {

    private String nama;
    private String nis;
    private String kelas;
    private String jurusan;

    public Siswa(String nama, String nis,
                 String kelas, String jurusan) {

        this.nama = nama;
        this.nis = nis;
        this.kelas = kelas;
        this.jurusan = jurusan;
    }

    public void tampilkanData() {

        System.out.println("Nama Siswa : " + nama);
        System.out.println("NIS        : " + nis);
        System.out.println("Kelas      : " + kelas);
        System.out.println("Jurusan    : " + jurusan);
    }
}

