package com.if3b.emergencyapp;

import java.util.ArrayList;

public class dataUGD {
    public static String[][] data = new String[][]{
            //nama  ,alamat, no telp, urlLokasi, , foto.
            {"UGD RS Bhayangkara Palembang", "Jl. Jend Sudirman No.Km. 4, RW.5, Ario Kemining, Kec.Kemuning, Palembang, Sumatera Selatan", "0711410023","https://goo.gl/maps/VyQJVFt7L4LgzRtS6", "https://1.bp.blogspot.com/_QMSwnzcBtpbiQil9Ko5Bg5u2LWrsfqqJEYoK1JggMDPMKgfSC4ul1ik-GwI92edEXxMh22vVd4FTHs=s400"},

            {"IGD RSU Bunda Palembang", "Jl. Demang Lebar Daun Ilir Barat I, Palembang Sumatera Selatan", "119", "https://maps.app.goo.gl/rRFTBMbr8MRoEYdB8"," https://1.bp.blogspot.com/V9lpTCSgVX-6eBj1PV3pO6KMValY7LHP5z3AwQKmG-nqCf53MYjSdFEGzDAsifdA--wNyW4CwB0ID-A=s400"},

            {"IGD RSU Dr. Mohammad Hoesin", "Jalan Jendral Sudirman KM.3,5, Sekip Jaya, Kemuning, Sekip Jaya, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30114", "0711354088","https://maps.app.goo.gl/d18DWQ8Fp4Bn4N1s5","https://1.bp.blogspot.com/_QMSwnzcBtpbiQil9Ko5Bg5u2LWrsfqqJEYoK1JggMDPMKgfSC4ul1ik-GwI92edEXxMh22vVd4FTHs=s400"},

{"UGD RS RS SITI KHADIJAH Palembang", "Jl. Demang Lebar Daun No.12A, Demang Lebar Daun, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30151", "119","https://maps.app.goo.gl/1oKKU9sPfGGFhs6D8"," https://1.bp.blogspot.com/iYeyZ4eMaCKm8qUAfxvLU7RAP5kMFx34fxcIiNgkW2iHfWy3qwme0vgJPvx8_p5Vy2t0mf4wbL1jj9Q=s400"},

            {"IGD RS Siloam Sriwijaya", "Jl. POM IX No.122, Lorok Pakjo, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan", "07115229100","https://maps.app.goo.gl/B4zeaoD1oBKvugeLA"," https://1.bp.blogspot.com/V-3wggaA7FytxAtT_if-slqfSR9Q-gZX-dOj1sWqCDxTfEhke920GKuUJDh8NdrpP87Qe18nM2jzZDE=s400"},

            {"IGD Charitas Hospital Palembang", "Jl. Jend. Sudirman No.1054, Sungai Pangeran, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30114", "0711353375","https://maps.app.goo.gl/16JWsHcHjnDxcmAx5"," https://1.bp.blogspot.com/eCkqkyiO5Z4386JeO-eZHTKlJDDTlCbeRV8CR09FqGZ53GGKWFU6ydNaRKn5JIIxNPriqWu3DVrO87A=s400"},

            {"IGD RSIA Tiara Fatrin Palembang", "Jl. Rajawali No.495, 9 Ilir, Ilir Timur II, Palembang City, South Sumatra 30114","0711353438","https://maps.app.goo.gl/uZ5FQmZvTwkH6o7s7"," https://1.bp.blogspot.com/RXdJ-bZJ42WXgbLKit3i3Wh5hRnYWphWNSXS2M6xjFMMYmtbRAG4z51SRVUraMm13L3vW8FXi5Qm5i8=s400"},

            {"IGD RS Islam Ar-Rasyid Palembang", "Jl. HM Saleh No.2, Sukarami, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30961","07115610503","https://maps.app.goo.gl/mKBHQKdWHa4QNSCk9"," https://1.bp.blogspot.com/8TZdn63HTo5rphkKvUDOAzTJEa4frSC22ll8asyppCNWhbiP1t3526KXoYbKUcXaj30ItIRQsdwudu4=s400"},

            {"UGD RS Siti Fatimah Az-Zahra", "Jl. Kol. H. Burlian, Suka Bangun, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30151", "07115718883","https://maps.app.goo.gl/ACN8E61dTNUDka838"," https://1.bp.blogspot.com/HOa3sXTOMzy2Q21XiW5vmiD_H1mo6EJtAg10Js8-KknMAPxlaPuJi8VxA63g-6hBWljbEawoSjs8bqw=s400"},

            {"IGD RSU Hermina Palembang", "Jl. Jend. Basuki Rachmat No.897, Pahlawan, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30127", "0711410023","https://maps.app.goo.gl/p9YaXULQ3jT44ead9"," https://1.bp.blogspot.com/544MfdMOV0S9oORxAdzGkeEf57bTffEz4T2Aqkg4zfzX829kcdu4zgsWz8FNu9vz0g0WuaiDrWo7D4E=s400"},

            {"IGD RSIA Az-Zahra Palembang", "Jalan Brigadir jenderal Hasan Khasim Nomor 1-2 Kelurahan, Bukit Sangkal, Kec. Kalidoni, Kota Palembang, Sumatera Selatan 30114", "07113038799","https://maps.app.goo.gl/WmVyEXyFtFvqVZkr9"," https://1.bp.blogspot.com/DZwNKS0YdUYVTugtjheyz0Rbu7ESTFdPSgEHR4TkNdlqxCKvpntswGZbMebcRrxYkp-bRW-e6ifSZCw=s400"},
    };
   public static ArrayList<ModelUGD> ambilDataUGD(){
       ArrayList<ModelUGD> dataUGD = new ArrayList<>();
       for (String[] varData : data){
           ModelUGD modelugd = new ModelUGD();
           modelugd.setNama(varData[0]);
           modelugd.setAlamat(varData[1]);
           modelugd.setNoTelp(varData[2]);
           modelugd.setUrlLokasi(varData[3]);
           modelugd.setFoto(varData[4]);

           dataUGD.add(modelugd);
       }
       return dataUGD;
   }

}
