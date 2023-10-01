public class pemilihan {
    public void getPemilihan() {
        for (int i = 0; i < 17; i++) {
            for (int a = 0; a < 65; a++) {
                if (i == 0 || i == 4 || i == 10 || i == 16) {
                    System.out.print("=");
                } else if ((((i >= 1 && i <= 17) && i != 2 && i != 7 && i != 13)
                        && (a == 0 || a == 64))
                        || ((i == 2 && (a == 0 || a == 51))
                                || (i == 7 && (a == 0 || a == 6 || a == 23 || a == 25 || a == 31 || a == 52))
                                || (i == 13 && (a == 0 || a == 6 || a == 59)))
                        || (((i >= 4 && i <= 10) && i != 7 && i != 13)
                                && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))
                        || ((i >= 11 && i <= 16) && a == 6)) {
                    System.out.print("|");
                } else if (i == 2 && a == 25) {
                    System.out.print("SELAMAT DATANG");
                } else if (i == 7 && a == 3) {
                    System.out.print("1");
                } else if (i == 7 && a == 8) {
                    System.out.print("BUAT AKUN");
                } else if (i == 7 && a == 28) {
                    System.out.print("2");
                } else if (i == 7 && a == 33) {
                    System.out.print("LOGIN");
                } else if (i == 13 && a == 3) {
                    System.out.print("3");
                } else if (i == 13 && a == 29) {
                    System.out.print("KELUAR");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void getPemilihan1() {
        for (int i = 0; i < 17; i++) {
            for (int a = 0; a < 65; a++) {
                if (i == 0 || i == 4 || i == 10 || i == 16) {
                    System.out.print("=");
                } else if ((((i >= 1 && i <= 17) && i != 2 && i != 7 && i != 13)
                        && (a == 0 || a == 64))
                        || ((i == 2 && (a == 0 || a == 58))
                                || (i == 7 && (a == 0 || a == 6 || a == 16 || a == 18 || a == 24 || a == 37))
                                || (i == 13 && (a == 0 || a == 6 || a == 59)))
                        || (((i >= 4 && i <= 10) && i != 7 && i != 13)
                                && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))
                        || ((i >= 11 && i <= 16) && a == 6)) {
                    System.out.print("|");
                } else if (i == 2 && a == 29) {
                    System.out.print("BIODATA");
                } else if (i == 7 && a == 3) {
                    System.out.print("1");
                } else if (i == 7 && a == 8) {
                    System.out.print("MASUKKAN BIODATA");
                } else if (i == 7 && a == 21) {
                    System.out.print("2");
                } else if (i == 7 && a == 26) {
                    System.out.print("LIHAT BIODATA");
                } else if (i == 13 && a == 3) {
                    System.out.print("3");
                } else if (i == 13 && a == 29) {
                    System.out.print("KELUAR");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void getPemilihan2() {
        for (int i = 0; i < 17; i++) {
            for (int a = 0; a < 65; a++) {
                if (i == 0 || i == 4 || i == 10 || i == 16) {
                    System.out.print("=");
                } else if ((((i >= 1 && i <= 17) && i != 2 && i != 7 && i != 13)
                        && (a == 0 || a == 64))
                        || ((i == 2 && (a == 0 || a == 57))
                                || (i == 7 && (a == 0 || a == 6 || a == 15 || a == 17 || a == 23 || a == 35))
                                || (i == 13 && (a == 0 || a == 6 || a == 59)))
                        || (((i >= 4 && i <= 10) && i != 7 && i != 13)
                                && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))
                        || ((i >= 11 && i <= 16) && a == 6)) {
                    System.out.print("|");
                } else if (i == 2 && a == 28) {
                    System.out.print("PRESENSI");
                } else if (i == 7 && a == 3) {
                    System.out.print("1");
                } else if (i == 7 && a == 8) {
                    System.out.print("MASUKKAN PRESENSI");
                } else if (i == 7 && a == 20) {
                    System.out.print("2");
                } else if (i == 7 && a == 25) {
                    System.out.print("LIHAT PRESENSI");
                } else if (i == 13 && a == 3) {
                    System.out.print("3");
                } else if (i == 13 && a == 29) {
                    System.out.print("KELUAR");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void getPemilihan3() {
        for (int i = 0; i < 17; i++) {
            for (int a = 0; a < 65; a++) {
                if (i == 0 || i == 4 || i == 10 || i == 16) {
                    System.out.print("=");
                } else if ((((i >= 1 && i <= 17) && i != 2 && i != 7 && i != 8 && i != 13)
                        && (a == 0 || a == 64))
                        || ((i == 2 && (a == 0 || a == 46))
                                || (i == 7 && (a == 0 || a == 6 || a == 10 || a == 12 || a == 18 || a == 25))
                                || (i == 8 && (a == 0 || a == 6 || a == 27 || a == 29 || a == 35 || a == 56))
                                || (i == 13 && (a == 0 || a == 6 || a == 59)))
                        || (((i >= 4 && i <= 10) && i != 7 && i != 8 && i != 13)
                                && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))
                        || ((i >= 11 && i <= 16) && a == 6)) {
                    System.out.print("|");
                } else if (i == 2 && a == 23) {
                    System.out.print("KARTU RENCANA STUDI");
                } else if (i == 7 && a == 3) {
                    System.out.print("1");
                } else if (i == 7 && a == 8) {
                    System.out.print("MASUKKAN KARTU RENCANA");
                } else if (i == 8 && a == 8) {
                    System.out.print("STUDI");
                } else if (i == 7 && a == 15) {
                    System.out.print("2");
                } else if (i == 7 && a == 20) {
                    System.out.print("LIHAT KARTU RENCANA");
                } else if (i == 8 && a == 37) {
                    System.out.print("STUDI");
                } else if (i == 13 && a == 3) {
                    System.out.print("3");
                } else if (i == 13 && a == 29) {
                    System.out.print("KELUAR");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void getPemilihan4() {
        for (int i = 0; i < 17; i++) {
            for (int a = 0; a < 65; a++) {
                if (i == 0 || i == 4 || i == 10 || i == 16) {
                    System.out.print("=");
                } else if ((((i >= 1 && i <= 17) && i != 2 && i != 7 && i != 13)
                        && (a == 0 || a == 64))
                        || ((i == 2 && (a == 0 || a == 54))
                                || (i == 7 && (a == 0 || a == 6 || a == 12 || a == 14 || a == 20 || a == 29))
                                || (i == 13 && (a == 0 || a == 6 || a == 59)))
                        || (((i >= 4 && i <= 10) && i != 7 && i != 13)
                                && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))
                        || ((i >= 11 && i <= 16) && a == 6)) {
                    System.out.print("|");
                } else if (i == 2 && a == 28) {
                    System.out.print("MATA KULIAH");
                } else if (i == 7 && a == 3) {
                    System.out.print("1");
                } else if (i == 7 && a == 8) {
                    System.out.print("MASUKKAN MATA KULIAH");
                } else if (i == 7 && a == 17) {
                    System.out.print("2");
                } else if (i == 7 && a == 22) {
                    System.out.print("LIHAT MATA KULIAH");
                } else if (i == 13 && a == 3) {
                    System.out.print("3");
                } else if (i == 13 && a == 29) {
                    System.out.print("KELUAR");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void getPemilihan5() {
        for (int i = 0; i < 17; i++) {
            for (int a = 0; a < 65; a++) {
                if (i == 0 || i == 4 || i == 10 || i == 16) {
                    System.out.print("=");
                } else if ((((i >= 1 && i <= 17) && i != 2 && i != 7 && i != 13)
                        && (a == 0 || a == 64))
                        || ((i == 2 && (a == 0 || a == 60))
                                || (i == 7 && (a == 0 || a == 6 || a == 18 || a == 20 || a == 26 || a == 41))
                                || (i == 13 && (a == 0 || a == 6 || a == 59)))
                        || (((i >= 4 && i <= 10) && i != 7 && i != 13)
                                && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))
                        || ((i >= 11 && i <= 16) && a == 6)) {
                    System.out.print("|");
                } else if (i == 2 && a == 30) {
                    System.out.print("NILAI");
                } else if (i == 7 && a == 3) {
                    System.out.print("1");
                } else if (i == 7 && a == 8) {
                    System.out.print("MASUKKAN NILAI");
                } else if (i == 7 && a == 23) {
                    System.out.print("2");
                } else if (i == 7 && a == 28) {
                    System.out.print("LIHAT NILAI");
                } else if (i == 13 && a == 3) {
                    System.out.print("3");
                } else if (i == 13 && a == 29) {
                    System.out.print("KELUAR");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void getPemilihan6() {
        for (int i = 0; i < 17; i++) {
            for (int a = 0; a < 65; a++) {
                if (i == 0 || i == 4 || i == 10 || i == 16) {
                    System.out.print("=");
                } else if ((((i >= 1 && i <= 17) && i != 2 && i != 7 && i != 8 && i != 13)
                        && (a == 0 || a == 64))
                        || ((i == 2 && (a == 0 || a == 46))
                                || (i == 7 && (a == 0 || a == 6 || a == 12 || a == 14 || a == 20 || a == 29))
                                || (i == 8 && (a == 0 || a == 6 || a == 25 || a == 27 || a == 33 || a == 52))
                                || (i == 13 && (a == 0 || a == 6 || a == 59)))
                        || (((i >= 4 && i <= 10) && i != 7 && i != 8 && i != 13)
                                && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))
                        || ((i >= 11 && i <= 16) && a == 6)) {
                    System.out.print("|");
                } else if (i == 2 && a == 23) {
                    System.out.print("UANG KULIAH TUNGGAL");
                } else if (i == 7 && a == 3) {
                    System.out.print("1");
                } else if (i == 7 && a == 8) {
                    System.out.print("MASUKKAN UANG KULIAH");
                } else if (i == 8 && a == 8) {
                    System.out.print("TUNGGAL");
                } else if (i == 7 && a == 17) {
                    System.out.print("2");
                } else if (i == 7 && a == 22) {
                    System.out.print("LIHAT UANG KULIAH");
                } else if (i == 8 && a == 35) {
                    System.out.print("TUNGGAL");
                } else if (i == 13 && a == 3) {
                    System.out.print("3");
                } else if (i == 13 && a == 29) {
                    System.out.print("KELUAR");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public void getPemilihan7() {
        for (int i = 0; i < 17; i++) {
            for (int a = 0; a < 65; a++) {
                if (i == 0 || i == 4 || i == 10 || i == 16) {
                    System.out.print("=");
                } else if ((((i >= 1 && i <= 17) && i != 2 && i != 7 && i != 8 && i != 13)
                        && (a == 0 || a == 64))
                        || ((i == 2 && (a == 0 || a == 41))
                                || (i == 7 && (a == 0 || a == 6 || a == 12 || a == 14 || a == 20 || a == 25))
                                || (i == 8 && (a == 0 || a == 6 || a == 18 || a == 20 || a == 26 || a == 38))
                                || (i == 13 && (a == 0 || a == 6 || a == 59)))
                        || (((i >= 4 && i <= 10) && i != 7 && i != 8 && i != 13)
                                && (a == 6 || a == 31 || a == 33 || a == 39 || a == 64))
                        || ((i >= 11 && i <= 16) && a == 6)) {
                    System.out.print("|");
                } else if (i == 2 && a == 23) {
                    System.out.print("PRAKTIKUM KERJA LAPANGAN");
                } else if (i == 7 && a == 3) {
                    System.out.print("1");
                } else if (i == 7 && a == 8) {
                    System.out.print("BUAT SURAT PRAKTIKUM");
                } else if (i == 8 && a == 8) {
                    System.out.print("KERJA LAPANGAN");
                } else if (i == 7 && a == 17) {
                    System.out.print("2");
                } else if (i == 7 && a == 22) {
                    System.out.print("LIHAT SURAT PRAKTIKUM");
                } else if (i == 8 && a == 28) {
                    System.out.print("KERJA LAPANGAN");
                } else if (i == 13 && a == 3) {
                    System.out.print("3");
                } else if (i == 13 && a == 29) {
                    System.out.print("KELUAR");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}
