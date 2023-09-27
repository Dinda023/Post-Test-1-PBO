/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS Vivobook
 */
import java.util.ArrayList;

public class PostTest1 {
    public static void main(String[] args) {
        // ArrayList untuk menyimpan objek-objek Lukisan (Lukisan)
        ArrayList<Lukisan> lukisans = new ArrayList<>();

        // Objek Lukisan
        lukisans.add(new Lukisan("Starry Night", "Vincent van Gogh", 1889));
        lukisans.add(new Lukisan("Mona Lisa", "Leonardo da Vinci", 1503));
        lukisans.add(new Lukisan("he Persistence of Memory", "Salvador Dali", 1931));
        lukisans.add(new Lukisan("The Starry Night", "Pablo Picasso", 1889));
        lukisans.add(new Lukisan("Girl with a Pearl Earring", "Johannes Vermeer", 1665));

        // Menampilkan informasi
        for (Lukisan lukisan : lukisans) {
            System.out.println("Lukisan berjudul '" + lukisan.title + "' oleh " + lukisan.artist + " tahun " + lukisan.year + ".");
        }
    }
}
