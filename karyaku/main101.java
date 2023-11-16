public class main101 {
    public static void main(String[] args) {
        String masMaSis[][] = { { "Wahyu", "1234455", "1C" }, { "Rizky", "1122334", "1C" },
                { "Cahyana", "1234466", "1C" },
                { "Dizky", "1177334", "1C" } };
        String nama[][] = new String[masMaSis.length][masMaSis[0].length];
        int o = 0;
        for (int j = 0; j < nama.length; j++) {
            for (int i = 0; i < nama[j].length; i++) {
                    nama[o][i] = masMaSis[j][i]; 
            }if (!masMaSis[j][0].equals("Dizky")) {
                    o++;
                }
        }
        // for (int j = 0; j < nama.length-1; j++) {
        //     for (int i = 0; i < nama[j].length; i++) {
        //         System.out.print(nama[j][i]);
        //     }
        //     System.out.println();
        // }
        // for (int j = 0; j < masterMahasiswa.length; j++) {
        //     for (int i = 0; i < biodata.length; i++) {
        //         kurangMahasiswa[o][i] = masterMahasiswa[j][i];
        //     }
        //     for (int i = 0; i < masterMatKul.length; i++) {
        //         for (int k = 0; k < score.length; k++) {
        //             kurangNilai[o][i][k] = masterNilai[j][i][k];
        //         }
        //     }
        //     if (!masterMahasiswa[j][0].equalsIgnoreCase(ambilString)) {
        //         o++;
        //         if (o >= kurangMahasiswa.length) {
        //             break;
        //         }
        //     }
        // }
    }
}
