package ru.grishin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        java.io.File f = new java.io.File("INPUT.TXT");
        if (!f.exists()) {
            System.out.println("Входящий файл не найден.");
        } else {
            Scanner in = new Scanner(new File("INPUT.TXT"));
            while (in.hasNextLine()) {
                list.add(in.nextLine());
            }
            int a0 = 0;
            int a1 = 0;
            int a2 = 0;
            int a3 = 0;
            int a4 = 0;
            int a5 = 0;
            int a6 = 0;
            int a7 = 0;
            int a8 = 0;
            int a9 = 0;
            String s0 = list.get(0);
            String s1 = list.get(1);
            int hh;
            int mm;
            int ss;
            String hhh;
            String mmm;
            String sss;
            char[] ch1 = s1.toCharArray();
            while (true) {
                for (int i = 0; i < ch1.length; i++) {
                    char[] ch0 = s0.toCharArray();
                    if (ch0[i] == '0') {
                        a0++;
                    }
                    if (ch0[i] == '1') {
                        a1++;
                    }
                    if (ch0[i] == '2') {
                        a2++;
                    }
                    if (ch0[i] == '3') {
                        a3++;
                    }
                    if (ch0[i] == '4') {
                        a4++;
                    }
                    if (ch0[i] == '5') {
                        a5++;
                    }
                    if (ch0[i] == '6') {
                        a6++;
                    }
                    if (ch0[i] == '7') {
                        a7++;
                    }
                    if (ch0[i] == '8') {
                        a8++;
                    }
                    if (ch0[i] == '9') {
                        a9++;
                    }
                }
                if (!s0.equals(s1)) {
                    String[] s = s0.split(":");
                    hh = Integer.valueOf(s[0]);
                    mm = Integer.valueOf(s[1]);
                    ss = Integer.valueOf(s[2]);
                    if (ss < 60) {
                        ss++;
                    }
                    if (ss == 60) {
                        ss = 00;
                        mm++;
                    }
                    if (mm == 60 & ss == 00) {
                        mm = 00;
                        hh++;
                    }
                    if (hh == 24 & mm == 00 & ss == 00) {
                        hh = 00;
                    }
                    sss = ss + "";
                    hhh = hh + "";
                    mmm = mm + "";
                    if (ss < 10){
                        sss = "0" + ss;
                    }
                    if (mm < 10){
                        mmm = "0" + mm;
                    }
                    if (hh < 10){
                        hhh = "0" + hh;
                    }
                    s0 = hhh + ":" + mmm + ":" + sss;
                }
                if(s0.equals(s1)){
                    break;
                }
            }
            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] == '0') {
                    a0++;
                }
                if (ch1[i] == '1') {
                    a1++;
                }
                if (ch1[i] == '2') {
                    a2++;
                }
                if (ch1[i] == '3') {
                    a3++;
                }
                if (ch1[i] == '4') {
                    a4++;
                }
                if (ch1[i] == '5') {
                    a5++;
                }
                if (ch1[i] == '6') {
                    a6++;
                }
                if (ch1[i] == '7') {
                    a7++;
                }
                if (ch1[i] == '8') {
                    a8++;
                }
                if (ch1[i] == '9') {
                    a9++;
                }
            }
            System.out.println(a0 + "\r\n" + a1 + "\r\n" + a2 + "\r\n" + a3 + "\r\n" + a4 + "\r\n" + a5 + "\r\n" + a6 + "\r\n" + a7 + "\r\n" + a8 + "\r\n" + a9);
            File fil = new File("OUTPUT.TXT");
            FileWriter wrt = new FileWriter(fil);
            wrt.write(a0 + "\r\n" + a1 + "\r\n" + a2 + "\r\n" + a3 + "\r\n" + a4 + "\r\n" + a5 + "\r\n" + a6 + "\r\n" + a7 + "\r\n" + a8 + "\r\n" + a9);
            wrt.flush();
        }
    }
}