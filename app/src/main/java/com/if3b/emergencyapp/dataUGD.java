package com.if3b.emergencyapp;

import java.util.ArrayList;

public class dataUGD {
    public static String[][] data = new String[][]{
            //nama  ,alamat, no telp, urlLokasi, , foto.
            {"UGD RS Bhayangkara Palembang", "Jl. Jend Sudirman No.Km. 4, RW.5, Ario Kemining, Kec.Kemuning, Palembang, Sumatera Selatan", "0711410023","https://goo.gl/maps/VyQJVFt7L4LgzRtS6", "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgOitICdS0qV3q-zDEoTTnKkPYATyO_b1aZJwDqGW63tZRfOSEVXq-ArUq8KnKq0B8z7bSfaAYCT5dr4cPI8Mb5f0v0Wz4S_NBm3ETqwJ49_4YyTasu0KfuQ2pD-LfY4jvMQ2ft5iZkhadJQpu11TfrlPukIyBD9m8TGi3aCtjS8T5FYW8YpP3fTgg/s320/1.jpg"},

            {"IGD RSU Bunda Palembang", "Jl. Demang Lebar Daun Ilir Barat I, Palembang Sumatera Selatan", "119", "https://maps.app.goo.gl/rRFTBMbr8MRoEYdB8"," https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjqOyuS9HLnkEy7k0TXSvpdKNdj-luLzGvyDJZmlecU3ItJJjcd7ZWNa-Sb28KBasoUTOz75KO7SnUIZry-tg1ujCVTfp4oB7OVP-ANYSeqJvFoTmZEI2YgwOw_YDdVpPP4NYyi1rKlh-23-jQ779lYqc81QgZGoCw8OVR6_BPdd0m1s_zpPByjPk0/s320/2.jpg"},

            {"IGD RSU Dr. Mohammad Hoesin", "Jalan Jendral Sudirman KM.3,5, Sekip Jaya, Kemuning, Sekip Jaya, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30114", "0711354088","https://maps.app.goo.gl/d18DWQ8Fp4Bn4N1s5","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEikl7IDmnvp6qPgKp7b2ndSyqmUFcPdlizlnsIuFHfAWnk__mBWv5YDtUAaciiDZhkwNGKrOvAfe4AP6SOtC4gE5ADLS7ySAfswD8QW8l4sFQH6Awgyg8G54fnqbBxHqNDETkM0orhxXUEWsPUNhzsgF5vSZAvvIGqFpUNUL6sMbPU2taFS6R2O5VM/s320/3.jpg"},

            {"UGD RS RS SITI KHADIJAH Palembang", "Jl. Demang Lebar Daun No.12A, Demang Lebar Daun, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan 30151", "119","https://maps.app.goo.gl/1oKKU9sPfGGFhs6D8","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjExwtdtL5qAz_p8gM4uAoVvQjkkXjUOT1t3ZEYx9xh0oGgGJdikC8QgKfER9LmapVhxEMl0Z-dOrI3-J5idkKOgRMSjDz0Jj8coz6HlRQarmm6T5TR9sp3cRGqYRRUd3oA0dczoDnx2TDXqEjp5b7gq7vP-rSDCsMt9QZ0vPGTt35miWH5-280NMY/s320/4.jpg"},

            {"IGD RS Siloam Sriwijaya", "Jl. POM IX No.122, Lorok Pakjo, Kec. Ilir Bar. I, Kota Palembang, Sumatera Selatan", "07115229100","https://maps.app.goo.gl/B4zeaoD1oBKvugeLA","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjxBBHBYenubLRenFqOsG2PjzLJvtwdtXB0pvxVSvPKL1ld2I-pMFpB2Wykc21b5WJh_yX-V7BLvgHy7sLdBq3ibG2qAbZNZ9nspGgIecrzQopJh60BJmDm_6c05i1zaYKPhxW19T_jWT26TcEpzzdV4GZT7M9rn_KJCa_GzU1j16E4r2e1WycnQ2c/s320/5.jpg"},

            {"IGD Charitas Hospital Palembang", "Jl. Jend. Sudirman No.1054, Sungai Pangeran, Kec. Ilir Tim. I, Kota Palembang, Sumatera Selatan 30114", "0711353375","https://maps.app.goo.gl/16JWsHcHjnDxcmAx5","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh2zhb8UoSAbKhnZ1ZwQmVuKdH0yhJcF4S1TVrWR1d1hF-jt7wOJpn5ECmNk37Y9ti4ILXmgX0r1JksUyk_wMaNbBC3_T9tFUdOHfZDNMV5IELJOkSyXvYD31g4bDj6Yv2U7FVKnGm6cDs9PDCtvS1PMslJzfJH5OE9EVkIzwDu9VYGT98IHPmycR8/s320/6.jpg"},

            {"IGD RSIA Tiara Fatrin Palembang", "Jl. Rajawali No.495, 9 Ilir, Ilir Timur II, Palembang City, South Sumatra 30114","0711353438","https://maps.app.goo.gl/uZ5FQmZvTwkH6o7s7","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiilX_7diUWaMSKKgc6qgLE2KLZGvIcyqSBlLDh0apJSExYall3k0ZwhSHJhrjfTM_D-4azNBUvumYkLMjVQRwdTDkPO2010mccMuIwVFfRMxj9kTq4FtYXJ4f8p-gTvzXSU500dDrblB2ufu3NNLwVIH6o0jTnZtZAr1BI6h80xl0_BRIPVqMp-ng/s320/7.jpg"},

            {"IGD RS Islam Ar-Rasyid Palembang", "Jl. HM Saleh No.2, Sukarami, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30961","07115610503","https://maps.app.goo.gl/mKBHQKdWHa4QNSCk9","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiGawy9ZlooqLf2oOFgSR6WcvLWCFU-650KEuEybYZIpENzaOMsLjxlOlasLq4hCpDs5453iRO-rvP_2U1tAU_v1H0AQ9WN3smkjwp_Jk565-ihN4NNk30BemGbisOdG6IBGuMgPV0AUdz6P0xu58LmggNYSz-CEpyDmR9Qlq2kfgKYMl-38bKl4kA/s320/8.jpg"},

            {"UGD RS Siti Fatimah Az-Zahra", "Jl. Kol. H. Burlian, Suka Bangun, Kec. Sukarami, Kota Palembang, Sumatera Selatan 30151", "07115718883","https://maps.app.goo.gl/ACN8E61dTNUDka838","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh6bJMeiqT64aWuLRC-PvTIEiRG6S3u1U6SFFC-oQeeClwpmV6ZN3TRQmDDEkMm8aK6uTX6ixFIy4Wb5v31z12SjRegDeQAhoogNnobYUmcX0ApkotR7kT7jiQpWgKTS42NJEVFm-CeKVV5lr_32xiScsY39dMmHtneB3DXDeSLvUFY2VDoDFAZecc/s320/9.jpg"},

            {"IGD RSU Hermina Palembang", "Jl. Jend. Basuki Rachmat No.897, Pahlawan, Kec. Kemuning, Kota Palembang, Sumatera Selatan 30127", "0711410023","https://maps.app.goo.gl/p9YaXULQ3jT44ead9","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjkXxw6GgIraMR9WC4CvNcS1JiYK2A9OeOc12IapsPsvA4g5BbsJzuh228rZSJzej-lvjVdfS8dpWKba2HapvOmB8EfiBjflVeG8vyNS2buxIuYODE4islnrXplVdN9jeq1yZs8gRcplgvm_-q10QmjuAiJGvt7WD44VZLbnR7yc1tIGyNv19hZOms/s320/10.jpg"},

            {"IGD RSIA Az-Zahra Palembang", "Jalan Brigadir jenderal Hasan Khasim Nomor 1-2 Kelurahan, Bukit Sangkal, Kec. Kalidoni, Kota Palembang, Sumatera Selatan 30114", "07113038799","https://maps.app.goo.gl/WmVyEXyFtFvqVZkr9","https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg5n1hfbdgX59bGs1efknJNUg8gEFeHjqbDIWyAzNo17LiA-vSPJUBgTtSQxYnpcha2YbKSl3p97vPfr2JJv3IqJyq6KoaHZqvfEL3dXCCcfRrQIXOmWeeBy-aRQu98Cx2v2gh9Pl8P0UL9bSETmpKD99ssyQd0cLuHOSfMSy4dVnPQnPwfVLp56cg/s320/11.jpg"},
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
