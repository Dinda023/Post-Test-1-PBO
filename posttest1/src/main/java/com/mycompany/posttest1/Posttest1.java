/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

/**
 *
 * @author ASUS Vivobook
 */
import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args) {
        // Buat ArrayList untuk menyimpan objek-objek Lukisan (Lukisan)
        ArrayList<Lukisan> lukisans = new ArrayList<>();

        // Tambahkan objek-objek Lukisan (Lukisan) ke dalam ArrayList
        lukisans.add(new Lukisan("Starry Night", "Vincent van Gogh", 1889));
        lukisans.add(new Lukisan("Mona Lisa", "Leonardo da Vinci", 1503));
        lukisans.add(new Lukisan("The Persistence of Memory", "Salvador Dali", 1931));
        lukisans.add(new Lukisan("The Starry Night", "Pablo Picasso", 1889));
        lukisans.add(new Lukisan("Girl with a Pearl Earring", "Johannes Vermeer", 1665));

        // Lakukan perulangan untuk menampilkan informasi tentang Lukisan (Lukisan)
        for (Lukisan lukisan : lukisans) {
            System.out.println("Lukisan berjudul '" + lukisan.title + "' oleh " + lukisan.artist + " tahun " + lukisan.year + ".");
        }
    }
}
