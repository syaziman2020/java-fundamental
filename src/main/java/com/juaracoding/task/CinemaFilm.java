package com.juaracoding.task;

import java.util.Scanner;

public class CinemaFilm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Masukkan username:");
            String username = scan.nextLine();
            System.out.println("Masukkan password:");
            String password = scan.nextLine();
            boolean login = login(username, password);
            Object[][] films = {};
            if (login) { //jika berhasil login
                System.out.println("=== Login ===");
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("Login Berhasil");
                while (true) {
                    tampilkanMenu();
                    System.out.println("Silakan pilih aksi...");
                    System.out.print("Pilih :");
                    int choose = scan.nextInt(); //pilih aksi sesuai dengan ketentuan
                    switch (choose) {
                        case 1:
                            tampilkanFilm(films);
                            break;
                        case 2:
                            films = inputFilm(scan, films);
                            break;
                        case 3:
                            cariFilm(films, scan);
                            break;
                        case 4:
                            return; //keluar dari eksekusi program
                    }
                    System.out.println();


                }
            } else {
                System.out.println("Username dan Password Salah, Silakan login dengan data yang valid");
            }
        }

    }

    static boolean login(String username, String password) {
        return username.equals("admin") && password.equals("12345");
    }

    static void tampilkanMenu() {
        System.out.println("=== Menu Utama ===");
        System.out.println("1. Tampilkan Daftar Film");
        System.out.println("2. Input Data Film");
        System.out.println("3. Cari Film");
        System.out.println("4. Keluar");
    }

    static Object[][] inputFilm(Scanner scan, Object[][] films) {
        System.out.print("Masukkan jumlah film: ");
        int totalInputFilm = scan.nextInt();
        films = new Object[totalInputFilm][4];
        for (int i = 0; i < films.length; i++) {
            System.out.println("Film ke-" + (i + 1));
                System.out.print("Judul: ");
                films[i][0] = scan.next(); //judul
                System.out.print("Genre: ");
                films[i][1] = scan.next(); //genre
                System.out.print("Durasi (Jam): ");
                films[i][2] = scan.nextDouble(); //durasi
                System.out.print("Rating (0 - 5: ");
                films[i][3] = scan.nextDouble();  //rating

        }
        System.out.println("Semua film sudah diinput");
        return films;
    }

    static void tampilkanFilm(Object[][] films) {
        if (films.length > 0) { //pengecekan film kosong atau tersedia (true: tersedia)
            System.out.println("Daftar Film");
            for (Object[] film : films) {
                System.out.println("Judul: "+film[0]); //index 0 untuk judul saja
            }
        } else {
            System.out.println("Film masih kosong");
        }
    }

    static void cariFilm(Object[][] films, Scanner scan) {
        System.out.print("Masukkan kata kunci: ");
        String titleFilm = scan.next();
        boolean status = false; //untuk informasi ditemukan atau tidaknya film
        for (Object[] film : films) {
            if (film[0].toString().toLowerCase().contains(titleFilm)) { //pencarian jika include beberapa karakter
                System.out.println("Film Ditemukan:");
                System.out.println("Judul: " + film[0]);
                status = true; //ubah status jadi ditemukan
                break;
            }
        }
        if (!status) { //cek film, false maka tidak ditemukan
            System.out.println("Film Tidak Ditemukan, Gunakan kata kunci yang relevan");
        }
    }

}
