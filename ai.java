public class ai {
    public static void main(String[] args) {
        for (int e = 0; e < 29; e++) {
            if (e == 0 || e == 4 || e == 10 || e == 16 || e == 22 || e == 28) {
                for (int f = 0; f < 65; f++) {
                    System.out.print("=");
                }
            } else if (e == 2) {
                for (int b = 0; b < 61; b++) {
                    if (b == 0 || b == 58) {
                        System.out.print("|");
                    } else if (b == 29) {
                        System.out.print("BERANDA");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else if (e == 1 || e == 3) {
                for (int b = 0; b < 65; b++) {
                    if (b == 0 || b == 64) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else if (e == 7) {
                for (int b = 0; b < 52; b++) {
                    if (b == 0 || b == 6 || b == 25 || b == 27 || b == 33 || b == 51) {
                        System.out.print("|");
                    } else if (b == 3) {
                        System.out.print("1");
                    } else if (b == 8) {
                        System.out.print("BIODATA");
                    } else if (b == 30) {
                        System.out.print("2");
                    } else if (b == 35) {
                        System.out.print("PRESENSI");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else if (e == 13) {
                for (int b = 0; b < 37; b++) {
                    if (b == 0 || b == 6 || b == 13 || b == 15 || b == 21 || b == 36) {
                        System.out.print("|");
                    } else if (b == 3) {
                        System.out.print("3");
                    } else if (b == 8) {
                        System.out.print("KARTU RENCANA STUDI");
                    } else if (b == 18) {
                        System.out.print("4");
                    } else if (b == 23) {
                        System.out.print("MATA KULIAH");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else if (e == 19) {
                for (int b = 0; b < 43; b++) {
                    if (b == 0 || b == 6 || b == 27 || b == 29 || b == 35 || b == 42) {
                        System.out.print("|");
                    } else if (b == 3) {
                        System.out.print("5");
                    } else if (b == 8) {
                        System.out.print("NILAI");
                    } else if (b == 32) {
                        System.out.print("6");
                    } else if (b == 37) {
                        System.out.print("UANG KULIAH TUNGGAL");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else if (e == 13) {
                for (int b = 0; b < 60; b++) {
                    if (b == 0 || b == 6 || b == 59) {
                        System.out.print("|");
                    } else if (b == 3) {
                        System.out.print("3");
                    } else if (b == 29) {
                        System.out.print("KELUAR");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else if (e == 25) {
                for (int b = 0; b < 60; b++) {
                    if (b == 0 || b == 6 || b == 59) {
                        System.out.print("|");
                    } else if (b == 3) {
                        System.out.print("3");
                    } else if (b == 29) {
                        System.out.print("KELUAR");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else if (e == 23 || e == 24 || e == 26 || e == 27) {
                for (int b = 0; b < 65; b++) {
                    if (b == 0 || b == 6 || b == 64) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int g = 0; g < 65; g++) {
                    if (g == 0 || g == 6 || g == 31 || g == 33 || g == 39 || g == 64) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
