package com.if3b.emergencyapp;

import java.util.ArrayList;

public class dataDamkar {
    public static String[][] data = new String[][]{
            //nama  ,alamat, no telp, urlLokasi, , foto.
            {"DAMKAR Jakarta Fire And Disaster Management Palembang", "Jl. Merdeka No.8, 19 Ilir, Kec. Bukit Kecil, Kota Palembang, Sumatera Selatan 30113", "0711312011","https://maps.app.goo.gl/eJAZbGsg2f3SdJpWA"," https://1.bp.blogspot.com/nehI4pvrs4lGotBOnmxMuNQSe0x1fW6kaP_r58NTo-orC06wm8R-RLWpwE-4w3jXCR8Ib8g57OwGlHI=s400"},

            {"DAMKAR Talang Keramat Kenten Palembang", "Jl. Talang Keramat, Kebun Bunga, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30961", "07115712333","https://maps.app.goo.gl/mN9XL7yo4uGwiHJu5","https://1.bp.blogspot.com/oph7YTQkEju12VjLgWWbv6Etjr9eWA7BDamVNnynQ7mvvZCkLxYyN-P_ZlotdWgTgbYXSEZAK8hzKEs=s400"},

            {"DAMKAR Sako Sematang Borang Palembang", "Kec. Sako, Kota Palembang, Sumatera Selatan 30961", "0711822532","https://maps.app.goo.gl/gJBehUjZr2qoGdjb6","https://1.bp.blogspot.com/zXwQjwfyWjajBEH3WEC-zgg5lZRcVmt5w8V3eKSYkjCOEvGXkoB8QpYk6_rBRc9P0Npfe9h"},

            {"DAMKAR Kemuning", "Jl. R. Sukamto Jl. Rawasari, 20 Ilir D II, Kec. Ilir Tim. II, Kota Palembang, Sumatera Selatan 30114", "07115556246","https://maps.app.goo.gl/XdL9qT9sPAidAJQh9","https://drive.google.com/file/d/1W14ivA0AQTWOQtCy87hcBoEU7b1h8pzP/view?usp=drivesdk"},

            {"DAMKAR Sebrang Ulu 2, 13 Ulu", "Jl. KH. Azhari, 13 Ulu, Kec. Seberang Ulu II, Kota Palembang, Sumatera Selatan 30263", "07115745387","https://maps.app.goo.gl/5qP8UxnQEfVDG8BA7","https://1.bp.blogspot.com/yzzbu4ifVqKDKl3npZYIY40EBylRJxoA0ZiDN9BL4pLLA7S42Ng0zhGvk8EHNIq8WcFdzRgDneT3oZ0=s400"},

            {"DAMKAR Alang-Alang Lebar", "Jl. Karya Baru, Kec. Alang-Alang Lebar, Kota Palembang, Sumatera Selatan 30961", "07117423500","https://maps.app.goo.gl/5qP8UxnQEfVDG8BA7","https://1.bp.blogspot.com/1FWn0N4ZP_9mZvBYs1C3zj7bVBGUBG-rAS8sWaAVzbSWTyM1ckQYPc5NrPMQbfRJCvSh-jHDLRhm0VA=s400"},




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
