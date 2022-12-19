package com.if3b.emergencyapp;

import java.util.ArrayList;

public class dataUGD {
    public static String[][] data = new String[][]{
            //nama  ,alamat, no telp, urlLokasi, , foto.
            {"UGD RS Bhayangkara Palembang", "Jl. Jend Sudirman No.Km. 4, RW.5, Ario Kemining, Kec.Kemuning, Palembang, Sumatera Selatan", "0711410023","https://drive.google.com/file/d/1VR9EXVsOhmRwZ_utGnCboL6zgzf0t-q6/view?usp=drivesdk"},

            {"IGD RSU Bunda Palembang", "Jl. Demang Lebar Daun Ilir Barat I, Palembang Sumatera Selatan", "119", "https://maps.app.goo.gl/rRFTBMbr8MRoEYdB8","https://drive.google.com/file/d/1VSF8VAjGyzyJTdi9nTHmThEQ6OVoIr8N/view?usp=drivesdk"},

            {"IGD RSU Dr. Mohammad Hoesin", "Jalan Jendral Sudirman KM.3,5, Sekip Jaya, Kemuning, Sekip Jaya, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30114", "0711354088","https://maps.app.goo.gl/d18DWQ8Fp4Bn4N1s5","https://drive.google.com/file/d/1VSQq13vDIzGdNTYfs-U6_3677ePKlvad/view?usp=drivesdk"},

            {"UGD RS RS SITI KHADIJAH Palembang", "Jl. Demang Lebar Daun No.12A, Demang Lebar Daun, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30151", "119","https://maps.app.goo.gl/1oKKU9sPfGGFhs6D8","https://drive.google.com/file/d/1Va7sw-dgDzbD6t83867T06WLwU-g6LcK/view?usp=drivesdk"},

            {"IGD RS Siloam Sriwijaya", "Jl. POM IX No.122, Lorok Pakjo, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan", "07115229100","https://maps.app.goo.gl/B4zeaoD1oBKvugeLA","https://drive.google.com/file/d/1VfrEvcMgkjrmtVujsRqV7ELrTut3BVtJ/view?usp=drivesdk"},

            {"IGD Charitas Hospital Palembang", "Jl. Jend. Sudirman No.1054, Sungai Pangeran, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30114", "0711353375","https://maps.app.goo.gl/16JWsHcHjnDxcmAx5","https://drive.google.com/file/d/1Vh0lx2f5KmI7XhqmjeWsyPh_pPfML12S/view?usp=drivesdk"},

            {"IGD RSIA Tiara Fatrin Palembang", "Jl. Rajawali No.495, 9 Ilir, Ilir Timur II, Palembang City, South Sumatra 30114","0711353438","https://maps.app.goo.gl/uZ5FQmZvTwkH6o7s7","https://drive.google.com/file/d/1ViyBHrMCMhaEPxYQQWkF8_eqcqEpr_dr/view?usp=drivesdk"},

            {"IGD RS Islam Ar-Rasyid Palembang", "Jl. HM Saleh No.2, Sukarami, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30961","07115610503","https://maps.app.goo.gl/mKBHQKdWHa4QNSCk9","https://drive.google.com/file/d/1VjPGjwLeCmOPe-agcc2AbHLEIWhOapgU/view?usp=drivesdk"},

            {"UGD RS Siti Fatimah Az-Zahra", "Jl. Kol. H. Burlian, Suka Bangun, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30151", "07115718883","https://maps.app.goo.gl/ACN8E61dTNUDka838","https://drive.google.com/file/d/1VvSN14ec3krsHaFcQATmK1ogCIQwXQsZ/view?usp=drivesdk"},

            {"IGD RSU Hermina Palembang", "Jl. Jend. Basuki Rachmat No.897, Pahlawan, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30127", "0711410023","https://maps.app.goo.gl/p9YaXULQ3jT44ead9","https://drive.google.com/file/d/1VvWHdxYFks9WVPv97qNTcZqZTf-7vRxq/view?usp=drivesdk"},

            {"IGD RSIA Az-Zahra Palembang", "Jalan Brigadir jenderal Hasan Khasim Nomor 1-2 Kelurahan, Bukit Sangkal, Kec. Kalidoni, Kota Palembang, Sumatera Selatan 30114", "07113038799","https://maps.app.goo.gl/WmVyEXyFtFvqVZkr9","https://drive.google.com/file/d/1VxLJAZjQrF8Gp3Vvlx05V34KQEYXBT-8/view?usp=drivesdk"},
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
