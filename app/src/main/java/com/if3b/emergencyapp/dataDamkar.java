package com.if3b.emergencyapp;

import java.util.ArrayList;

public class dataDamkar {
    public static String[][] data = new String[][]{
            //nama  ,alamat, no telp, urlLokasi, , foto.
            {"DAMKAR Jakarta Fire And Disaster Management Palembang", "Jl. Merdeka No.8, 19 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30113", "0711312011","Jakarta Fire and Disaster Management Palembang","https://i.ytimg.com/vi/X7bDcPcsMeA/maxresdefault.jpg"},

            {"DAMKAR Talang Keramat Kenten Palembang", "Jl. Talang Keramat, Kebun Bunga, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30961", "07115712333","Pos Damkar Talang Keramat","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi-efFMZtqzOre6627rnEkmdJf_HkxcP_Mg1HRyrFd0mqjJzfA20AiJrKgA2qmrnuTqM0gcxmKEaaDAphNrpxnkd3ab47pnrhX85FZooiuWr1zE2Sj0br5N7rSriKm9oYAebcOnwWvcTHTIKswZ1HtOsMQthfBCh9UrcUySeRPoHX7LzuSRmzL_IdI/s320/2.jpg"},

            {"DAMKAR Sako Sematang Borang Palembang", "Kec. Sako, Kota Palembang, Sumatera Selatan 30961", "0711822532","DINAS PEMADAM KEBAKARAN POS SAKO SEMATANG BORANG","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgD9VDtMwHixJx7mx5if7b5vnKqlG84BHJXN-CjY-CH2RdN4L2sEoANfgnzDolZrRnVqtjERhQEoRlv9u7SApdgLmfpXM6H0AnYfybtJmr7TS-0zqA28ONzF1Gch-fDW76tcAtv2OugRpkDbrSs7mgozyQjgUnFx0TfcHoR_sq_mkKyem1RA_P-H9o/s320/3.jpg"},

            {"DAMKAR Kemuning", "Jl. R. Sukamto Jl. Rawasari, 20 Ilir D II, Kec. Ilir Tim. II, Kota Palembang, Sumatera Selatan 30114", "07115556246","DINAS PEMADAM KEBAKARAN dan PENANGGULANGAN BENCANA kota Palembang POS KEMUNING","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh4Bbvpm0ZqNNXZWWjuxqqJ_hJMy5D9Io57qVF6rZhRw21AaumCrRSfcCr5ZMcgWWttPH7IXyS5Ap53JB6v0cEZe_ZA4Z7K1YDnsxpXLkeChefSsBO-nRbHspdJvb7g7niUZ_-xEmvd0tfC9thaAmD_rZ4aOxEuuF2yeF4xuIcxwWTZeG-mQ347rfQ/s320/4.jpg"},

            {"DAMKAR Sebrang Ulu 2, 13 Ulu", "Jl. KH. Azhari, 13 Ulu, Kec. Seberang Ulu II, Kota Palembang, Sumatera Selatan 30263", "07115745387","damkar sebrang ulu 2","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhqjaCX9fo_OI_NQFvSf8HdF9rTi8eFfLfqBHh6ivAmfTW0Stm8VJ-vNO5zn-YQEQCRUyiopy31KXiAWTNMXyp77N-2_Jsu3hPNb0hXa3s1-g_K_N_VaOiXlxwecT3WxclWuk_1TckxuWFUIlCU0rALF9VJjdeanm7-hE2QS01iLZI1RS_ly6xNENg/s320/5.jpg"},

            {"DAMKAR Alang-Alang Lebar", "Jl. Karya Baru, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan 30961", "07117423500","Badan Penanggulangan Bencana Dan Pemadam Kebakaran Kota Palembang Cabang Alang-alang Lebar","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhKwozIRY79eocY6u2dVckiiws-C1ANCIFXT_JiKLOSPwNzDohdHik1BTrIpBHhZD67-bONHN9L5S39tw1xdFcxI59VBWe7bAWKBrWhPRamCHoDTy5Ev-a8kql4n2P_v9uoZNiU_JKnHpb29zPWpc-FwM9RAxxvmEgPJ9Q2I-TemO8JboXvkDnpYHg/s320/20221215_221936.jpg"},




    };

    public static ArrayList<ModelDamkar> ambilDataDamkar(){
        ArrayList<ModelDamkar> dataDamkar = new ArrayList<>();
        for (String[] varData : data){
            ModelDamkar modeldamkar = new ModelDamkar();
            modeldamkar.setNama(varData[0]);
            modeldamkar.setAlamat(varData[1]);
            modeldamkar.setNoTelp(varData[2]);
            modeldamkar.setUrlLokasi(varData[3]);
            modeldamkar.setFoto(varData[4]);

            dataDamkar.add(modeldamkar);
        }
        return dataDamkar;
    }

}
