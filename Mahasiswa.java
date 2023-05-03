package sdmodul4;

import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama, kelas, MakulPraktikum;
    int NIM;

    public Mahasiswa(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        MakulPraktikum = mat;
        NIM = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Mahasiswa> mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1", new Mahasiswa("Putri", "3H", "Strukturdata", 202000));
        mhs.put("2", new Mahasiswa("Agus", "3A", "Matematika", 2020012));
        mhs.put("3", new Mahasiswa("Arro", "3O", "Pemrograman", 202017));

        System.out.print("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " + data.kelas +
                    ", Mata Kuliah Praktikum : " + data.MakulPraktikum +
                    ",NIM :" + data.NIM);
        }
    }
}
