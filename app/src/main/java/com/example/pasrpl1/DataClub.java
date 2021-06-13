package com.example.pasrpl1;

import java.util.ArrayList;

public class DataClub {
    private static String[] clubName = {
            "Arema FC",
            "Bali United FC",
            "PS Barito Putera",
            "Bhayangkara FC",
            "Borneo FC Samarinda",
            "Madura United FC",
            "PS Sleman",
            "PSIS Semarang",
            "Persela Lamongan",
            "Persiraja Kutaraja",
            "Persib Bandung",
            "Persita Tangerang",
            "Persija Jakarta",
            "Persipura Jayapura",
            "Persikabo 1973",
            "PSM Makassar",
            "Persebaya Surabaya",
            "Persik Kediri"
    };

    private static String[] clubDetail = {


            "Arema FC (dahulu bernama Arema Cronus) , atau biasa disebut dan dikenal sebagai Arema Malang, adalah sebuah klub sepak bola profesional yang berasal dari Malang, Jawa Timur, Indonesia. Arema didirikan pada tanggal 11 Agustus 1987.",
            "Bali United F.C. (sebelumnya bernama Persisam Putra Samarinda) merupakan sebuah klub sepak bola Indonesia, yang bermarkas Stadion Kapten I Wayan Dipta, Kabupaten Gianyar, Provinsi Bali, Indonesia.",
            "PS Barito Putera (singkatan dari: Persatuan Sepak Bola Barito Putera) adalah klub sepak bola Indonesia berbasis di Kota Banjarmasin, Kalimantan Selatan, yang bermain di Liga 1 sejak musim 2013.",
            "Bhayangkara Solo Football Club adalah sebuah tim sepak bola Indonesia yang dimiliki oleh Polri yang berbasis di Solo. Klub ini bermain di Liga 1. Klub ini juga memegang rekor sebagai klub dengan pergantian nama terbanyak di Indonesia.",
            "Borneo F.C. adalah klub sepak bola Indonesia yang berasal dari Samarinda, Kalimantan Timur, Indonesia. Pada awal berdirinya klub ini bermain di Divisi Utama Liga Indonesia 2014 setelah mengakuisisi klub Perseba Super Bangkalan pada tanggal 7 Maret 2014.",
            "Madura United FC merupakan klub sepak bola asal Indonesia yang berbasis di Pamekasan, Madura. Klub ini sebelumnya bernama Pelita Bandung Raya yang pada waktu itu berlaga di Liga Super Indonesia.",
            "Perserikatan Sepakbola Sleman (biasa disingkat: PSS) (bahasa Jawa: ꦥꦼꦂꦱꦼꦫꦶꦏꦠꦤ꧀​ꦱꦼꦥꦏꦿꦒ​ꦱ꧀ꦭꦺꦩꦤ꧀, translit. Perserikatan Sepakraga Sléman) merupakan sebuah klub sepak bola yang berbasis di Kabupaten Sleman, Daerah Istimewa Yogyakarta, Indonesia. ",
            "Persatuan Sepak Bola Indonesia Semarang atau PSIS Semarang (bahasa Jawa: ꦥꦼꦂꦱꦠꦸꦮꦤ꧀​ꦱꦼꦥꦏ꧀​ꦧꦺꦴꦭ​ꦆꦤ꧀ꦢꦺꦴꦤꦺꦱꦶꦪ​ꦱꦼꦩꦫꦁ, translit. Persatuan Sepak Bola Indonésia Semarang) adalah klub sepak bola yang bermarkas di kota Semarang.",
            "Persatuan Sepak Bola Lamongan (biasa disingkat: Persela) dan mempunyai julukan Laskar Joko Tingkir adalah sebuah klub sepak bola Indonesia yang bermarkas di Lamongan, Jawa Timur. Persela dikelola oleh PT. Persela Jaya.",
            "Persatuan Sepak bola Indonesia Kutaraja Banda Aceh (Jawoë: ڤرستون سيڤك بول إندونيسيا كوترج بند اچيه) atau sering disingkat Persiraja Banda Aceh adalah sebuah klub sepak bola Indonesia asal Kota Banda Aceh, ibu kota Aceh.",
            "Persib Bandung (Persatuan Sepak Bola Indonesia Bandung) (Aksara Sunda Baku: ᮕᮦᮁᮞᮤᮘ᮪ ᮘᮔ᮪ᮓᮥᮀ, Pérsib Bandung) adalah klub sepak bola Indonesia yang berdiri pada 14 Maret 1933, berbasis di Bandung, Jawa Barat. Persib saat ini bermain di Liga 1 Indonesia.",
            "Persatuan Sepak bola Indonesia Tangerang (disingkat Persita atau Persita Tangerang) adalah sebuah klub sepak bola Indonesia yang bermarkas di Tangerang. Tim berjuluk Pendekar Cisadane yang identik dengan kostum ungunya.",
            "Persija (singkatan dari Persatuan Sepak Bola Indonesia Jakarta) adalah klub sepak bola Indonesia yang berbasis di Jakarta. Persija saat ini berlaga di Liga 1. ",
            "Persatuan Sepak bola Indonesia Jayapura (disingkat Persipura Jayapura) adalah sebuah klub sepak bola Indonesia yang bermarkas di Jayapura, Papua. Prestasi tertingginya hingga kini adalah menjadi empat kali juara Liga Indonesia dari tahun 2005 hingga 2013[1].",
            "Persikabo 1973 (singkatan dari Persatuan Sepakbola Kabupaten Bogor 1973; sebelumnya bernama Tira Persikabo)[1] adalah klub sepak bola profesional yang berbasis di Kabupaten Bogor, Provinsi Jawa Barat, Indonesia yang berkompetisi di Liga 1. ",
            "Persatuan Sepak bola Makassar (disingkat PSM Makassar) adalah sebuah tim sepak bola Indonesia yang berbasis di Makassar, Sulawesi Selatan, Indonesia, yang dikenal pasukan Ramang atau Juku Eja.",
            "Persebaya Surabaya atau biasa disebut Persebaya saja adalah sebuah klub Sepak bola profesional di Indonesia yang berbasis di Surabaya yang berdiri pada 18 Juni 1927 dengan nama asalnya adalah Soerabajasche Indonesische Voetbal Bond (SIVB).",
            "Persatuan Sepak Bola Indonesia Kediri (disingkat Persik) merupakan klub sepak bola Indonesia yang berbasis di Kota Kediri, Jawa Timur. Tim ini mempunyai kandang di Stadion Brawijaya dan dijuluki Macan Putih.",


    };

    private static int[] clublogo = {
            R.drawable.arema,
            R.drawable.bali ,
            R.drawable.barito ,
            R.drawable.bhayangkara,
            R.drawable.borneo,
            R.drawable.madura,
            R.drawable.sleman,
            R.drawable.psis,
            R.drawable.persela,
            R.drawable.persiraja,
            R.drawable.persib ,
            R.drawable.persita,
            R.drawable.persija,
            R.drawable.persipura ,
            R.drawable.persikabo ,
            R.drawable.psm ,
            R.drawable.persebaya,
            R.drawable.persik,
    };

    static ArrayList<Club> getListdata() {
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position < clubName.length; position++) {
            Club club = new Club();
            club.setName(clubName[position]);
            club.setDetail(clubDetail[position]);
            club.setFoto(clublogo[position]);
            list.add(club);
        }
        return list;
    }

}
