package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


import java.util.ArrayList;

public class Main extends Application {
//    Initializing global variables (public)
    public static int SLScore;
    public static int SLWickets;
    public static int BanScore;
    public static int BanWickets;
    public static int temp;
    public static int PakScore;
    public static int PakWickets;
    public static int AusyScore;
    public static int AusyWickets;
    public static int SAscore;
    public static int SAwickets;
    public static int EngScore;
    public static int EngWickets;
    public static int NZscore;
    public static int NZwickets;
    public static int IndiaScore;
    public static int IndiaWickets;
    public static String GroupAWinner;
    public static String GroupBWinner;
    public static List<Integer> list = new LinkedList<Integer>();
    public static List<Integer> list2 = new LinkedList<Integer>();

    public static int MaxScoreGroupA;
    public static int MaxScoreGroupB;
//    Arraylists to store the players
    public static ArrayList<Player> groupAteam1 = new ArrayList<>(11);
    public static ArrayList<Player> groupAteam2 = new ArrayList<>();
    public static ArrayList<Player> groupAteam3 = new ArrayList<>();
    public static ArrayList<Player> groupAteam4 = new ArrayList<>();
    public static ArrayList<Player> groupBteam1 = new ArrayList<>();
    public static ArrayList<Player> groupBteam2 = new ArrayList<>();
    public static ArrayList<Player> groupBteam3 = new ArrayList<>();
    public static ArrayList<Player> groupBteam4 = new ArrayList<>();

//   Creating player objects
    public static Player DasunShanaka = new Player();
    public static Player AvishkaFernando = new Player();
    public static Player BhanukaRajapaksa = new Player();
    public static Player PathumNissanka = new Player();
    public static Player DineshChandimal = new Player();
    public static Player DhananjayaDeSilva = new Player();
    public static Player WaninduHasaranga = new Player();
    public static Player ChamikaKarunaratne = new Player();
    public static Player MaheeshTheekshana = new Player();
    public static Player BinuraFernando = new Player();
    public static Player LahiruKumara = new Player();




    //Adding players in group A Team 2
    public static  Player Mahmudullah = new Player();
    public static Player LitonDas = new Player();
    public static Player MohammadNaim = new Player();
    public static Player NurulHasan = new Player();
    public static Player MushfiqurRahim = new Player();
    public static Player MahediHasan = new Player();
    public static Player ShakibAlHasan = new Player();
    public static  Player AfifHossain = new Player();
    public static Player ShamimHossain = new Player();
    public static Player MohammadSaifuddin = new Player();
    public static Player SoumyaSarkar = new Player();

    //Adding Players in group A Team 3
    public static Player BabarAzam = new Player();
    public static Player AsifAli = new Player();
    public static Player ShoaibMalik = new Player();
    public static Player FakharZaman = new Player();
    public static Player HaiderAli = new Player();
    public static Player MohammadRizwan = new Player();
    public static Player SarfarazAhmed = new Player();
    public static Player ShadabKhan = new Player();
    public static Player MohammadHafeez = new Player();
    public static Player MohammadNawaz = new Player();
    public static Player KhushdilShah = new Player();


    //Adding Players in group A Team 4
    public static Player AaronFinch = new Player();
    public static Player StevenSmith = new Player();
    public static Player DavidWarner = new Player();
    public static Player JoshInglis = new Player();
    public static Player MatthewWade = new Player();
    public static Player AshtonAgar = new Player();
    public static Player MitchellMarsh = new Player();
    public static Player GlennMaxwell = new Player();
    public static Player MarcusStoinis = new Player();
    public static Player DanChristian = new Player();
    public static Player DanielSams = new Player();


    //Adding Players in group B Team 1
    public static Player TembaBavuma = new Player();
    public static Player ReezaHendricks = new Player();
    public static Player AidenMarkram = new Player();
    public static Player DavidMiller = new Player();
    public static Player RassieVanDerDussen = new Player();
    public static Player QuintonDeKock = new Player();
    public static Player HeinrichKlaasen = new Player();
    public static Player WiaanMulder = new Player();
    public static Player DwainePretorius = new Player();
    public static Player GeorgeLinde = new Player();
    public static Player AndilePhehlukwayo = new Player();


    //Adding Players in group B Team 2
    public static Player EoinMorgan = new Player();
    public static Player LiamLivingstone = new Player();
    public static Player DawidMalan = new Player();
    public static Player JasonRoy = new Player();
    public static Player LiamDawson = new Player();
    public static Player JamesVince = new Player();
    public static Player JonnyBairstow = new Player();
    public static Player SamBillings = new Player();
    public static Player JosButtler = new Player();
    public static Player MoeenAli = new Player();
    public static Player TomCurran = new Player();


    //Adding Players in group B Team 3
    public static Player KaneWilliamson = new Player();
    public static Player MarkChapman = new Player();
    public static Player MartinGuptill = new Player();
    public static Player DevonConway = new Player();
    public static Player GlennPhillips = new Player();
    public static Player TimSeifert = new Player();
    public static Player ToddAstle = new Player();
    public static Player DarylMitchell = new Player();
    public static Player JamesNeesham = new Player();
    public static Player MitchellSantner = new Player();
    public static Player TimSouthee = new Player();

    //Adding Players in group B Team 4
    public static Player ViratKohli = new Player();
    public static Player RohitSharma = new Player();
    public static Player KLRahul = new Player();
    public static Player SuryakumarYadav = new Player();
    public static Player ShreyasIyer = new Player();
    public static Player IshanKishan = new Player();
    public static Player RishabhPant = new Player();
    public static Player RavindraJadeja = new Player();
    public static Player AxarPatel = new Player();
    public static Player HardikPandya = new Player();
    public static Player ShardulThakur = new Player();




    public static void Init() {
//  Setting the data into the Player objects

        //Adding Players DETAILS in Group A Team 1
        DasunShanaka.setName("Dasun Shanaka");
        DasunShanaka.setAge(30);
        DasunShanaka.setCaptain(true);

        AvishkaFernando.setName("Avishka Fernando");
        AvishkaFernando.setAge(23);
        AvishkaFernando.setCaptain(false);

        BhanukaRajapaksa.setName("Bhanuka Rajapaksa");
        BhanukaRajapaksa.setAge(29);
        BhanukaRajapaksa.setCaptain(false);

        PathumNissanka.setName("Pathum Nissanka");
        PathumNissanka.setAge(23);
        PathumNissanka.setCaptain(false);

        DineshChandimal.setName("Dinesh Chandimal");
        DineshChandimal.setAge(31);
        DineshChandimal.setCaptain(false);

        DhananjayaDeSilva.setName("Dhananjaya De Silva");
        DhananjayaDeSilva.setAge(30);
        DhananjayaDeSilva.setCaptain(false);

        WaninduHasaranga.setName("Wanindu Hasaranga");
        WaninduHasaranga.setAge(24);
        WaninduHasaranga.setCaptain(false);

        ChamikaKarunaratne.setName("Chamika Karunaratne");
        ChamikaKarunaratne.setAge(25);
        ChamikaKarunaratne.setCaptain(false);

        MaheeshTheekshana.setName("Maheesh Theekshana");
        MaheeshTheekshana.setAge(21);
        MaheeshTheekshana.setCaptain(false);

        BinuraFernando.setName("Binura Fernando");
        BinuraFernando.setAge(26);
        BinuraFernando.setCaptain(false);

        LahiruKumara.setName("Lahiru Kumara");
        LahiruKumara.setAge(24);
        LahiruKumara.setCaptain(false);

        //adding the players to the arraylist
        groupAteam1.add(DasunShanaka);
        groupAteam1.add(AvishkaFernando);
        groupAteam1.add(BhanukaRajapaksa);
        groupAteam1.add(PathumNissanka);
        groupAteam1.add(DineshChandimal);
        groupAteam1.add(DhananjayaDeSilva);
        groupAteam1.add(WaninduHasaranga);
        groupAteam1.add(ChamikaKarunaratne);
        groupAteam1.add(MaheeshTheekshana);
        groupAteam1.add(BinuraFernando);
        groupAteam1.add(LahiruKumara);

        System.out.println("GROUP A TEAM 1");
        groupAteam1.forEach(System.out::println);

        //Adding Players in Group A Team 2
        Mahmudullah.setName("Mahmudullah");
        Mahmudullah.setAge(35);
        Mahmudullah.setCaptain(true);

        LitonDas.setName("Liton Das");
        LitonDas.setAge(27);
        LitonDas.setCaptain(false);

        MohammadNaim.setName("Mohammad Naim");
        MohammadNaim.setAge(22);
        MohammadNaim.setCaptain(false);

        NurulHasan.setName("Nurul Hasan");
        NurulHasan.setAge(27);
        NurulHasan.setCaptain(false);

        MushfiqurRahim.setName("Mushfiqur Rahim");
        MushfiqurRahim.setAge(24);
        MushfiqurRahim.setCaptain(false);

        MahediHasan.setName("Mahedi Hasan");
        MahediHasan.setAge(26);
        MahediHasan.setCaptain(false);

        ShakibAlHasan.setName("Shakib Al Hasan");
        ShakibAlHasan.setAge(34);
        ShakibAlHasan.setCaptain(false);

        AfifHossain.setName("Afif Hossain");
        AfifHossain.setAge(22);
        AfifHossain.setCaptain(false);

        ShamimHossain.setName("Shamim Hossain");
        ShamimHossain.setAge(21);
        ShamimHossain.setCaptain(false);

        MohammadSaifuddin.setName("Mohammad Saifuddin");
        MohammadSaifuddin.setAge(24);
        MohammadNaim.setCaptain(false);

        SoumyaSarkar.setName("Soumya Sarkar");
        SoumyaSarkar.setAge(28);
        SoumyaSarkar.setCaptain(false);

        //Adding players to groupA team2 arraylist
        groupAteam2.add(Mahmudullah);
        groupAteam2.add(LitonDas);
        groupAteam2.add(MohammadNaim);
        groupAteam2.add(NurulHasan);
        groupAteam2.add(MushfiqurRahim);
        groupAteam2.add(MahediHasan);
        groupAteam2.add(ShakibAlHasan);
        groupAteam2.add(AfifHossain);
        groupAteam2.add(ShamimHossain);
        groupAteam2.add(MohammadSaifuddin);
        groupAteam2.add(SoumyaSarkar);

        System.out.println("\n");
        System.out.println("GROUP A TEAM 2");
        groupAteam2.forEach(System.out::println);


        //Adding Player in Group A Team 3
        BabarAzam.setName("Babar Azam");
        BabarAzam.setAge(27);
        BabarAzam.setCaptain(true);

        AsifAli.setName("Asif Ali");
        AsifAli.setAge(30);
        AsifAli.setCaptain(false);

        ShoaibMalik.setName("Shoaib Malik");
        ShoaibMalik.setAge(39);
        ShoaibMalik.setCaptain(false);

        FakharZaman.setName("Fakhar Zaman");
        FakharZaman.setAge(31);
        FakharZaman.setCaptain(false);

        HaiderAli.setName("Haider Ali");
        HaiderAli.setAge(21);
        HaiderAli.setCaptain(false);

        MohammadRizwan.setName("Mohammad Rizwan");
        MohammadRizwan.setAge(29);
        MohammadRizwan.setCaptain(false);

        SarfarazAhmed.setName("Sarfaraz Ahmed");
        SarfarazAhmed.setAge(34);
        SarfarazAhmed.setCaptain(false);

        ShadabKhan.setName("Shadab Khan");
        ShadabKhan.setAge(23);
        ShadabKhan.setCaptain(false);

        MohammadHafeez.setName("Mohammad Hafeez");
        MohammadHafeez.setAge(41);
        MohammadHafeez.setCaptain(false);

        MohammadNawaz.setName("Mohammad Hafeez");
        MohammadNawaz.setAge(41);
        MohammadNawaz.setCaptain(false);

        KhushdilShah.setName("Khushdil Shah");
        KhushdilShah.setAge(26);
        KhushdilShah.setCaptain(false);

        groupAteam3.add(BabarAzam);
        groupAteam3.add(AsifAli);
        groupAteam3.add(ShoaibMalik);
        groupAteam3.add(FakharZaman);
        groupAteam3.add(HaiderAli);
        groupAteam3.add(MohammadRizwan);
        groupAteam3.add(SarfarazAhmed);
        groupAteam3.add(ShadabKhan);
        groupAteam3.add(MohammadHafeez);
        groupAteam3.add(MohammadNawaz);
        groupAteam3.add(KhushdilShah);

        System.out.println("\n");
        System.out.println("GROUP A TEAM 3");
        groupAteam3.forEach(System.out::println);

        //Adding Players in Group A Team 4
        AaronFinch.setName("Aaron Finch");
        AaronFinch.setAge(34);
        AaronFinch.setCaptain(true);

        StevenSmith.setName("Steven Smith");
        StevenSmith.setAge(32);
        StevenSmith.setCaptain(false);

        DavidWarner.setName("David Warner");
        DavidWarner.setAge(34);
        DavidWarner.setCaptain(false);

        JoshInglis.setName("Josh Inglis");
        JoshInglis.setAge(26);
        JoshInglis.setCaptain(false);

        MatthewWade.setName("Matthew Wade");
        MatthewWade.setAge(33);
        MatthewWade.setCaptain(false);

        AshtonAgar.setName("Ashton Agar");
        AshtonAgar.setAge(28);
        AshtonAgar.setCaptain(false);

        MitchellMarsh.setName("Mitchell Marsh");
        MitchellMarsh.setAge(29);
        MitchellMarsh.setCaptain(false);

        GlennMaxwell.setName("Glenn Maxwell");
        GlennMaxwell.setAge(33);
        GlennMaxwell.setCaptain(false);

        MarcusStoinis.setName("MarcusStoinis");
        MarcusStoinis.setAge(32);
        MarcusStoinis.setCaptain(false);

        DanChristian.setName("Dan Christian");
        DanChristian.setAge(38);
        DanChristian.setCaptain(false);

        DanielSams.setName("Daniel Sams");
        DanielSams.setAge(28);
        DanielSams.setCaptain(false);

        groupAteam4.add(AaronFinch);
        groupAteam4.add(StevenSmith);
        groupAteam4.add(DavidWarner);
        groupAteam4.add(JoshInglis);
        groupAteam4.add(MatthewWade);
        groupAteam4.add(AshtonAgar);
        groupAteam4.add(MitchellMarsh);
        groupAteam4.add(GlennMaxwell);
        groupAteam4.add(MarcusStoinis);
        groupAteam4.add(DanChristian);
        groupAteam4.add(DanielSams);

        System.out.println("\n");
        System.out.println("GROUP A TEAM 4");
        groupAteam4.forEach(System.out::println);


        //Adding Players DETAILS in group B Team 1
        TembaBavuma.setName("Temba Bavuma");
        TembaBavuma.setAge(31);
        TembaBavuma.setCaptain(true);

        ReezaHendricks.setName("Reeza Hendricks");
        ReezaHendricks.setAge(32);
        ReezaHendricks.setCaptain(false);

        AidenMarkram.setName("Aiden Markram");
        AidenMarkram.setAge(27);
        AidenMarkram.setCaptain(false);

        DavidMiller.setName("David Miller");
        DavidMiller.setAge(32);
        DavidMiller.setCaptain(false);

        RassieVanDerDussen.setName("Rassie Van Der Dussen");
        RassieVanDerDussen.setAge(32);
        RassieVanDerDussen.setCaptain(false);

        QuintonDeKock.setName("Quinton De Kock");
        QuintonDeKock.setAge(28);
        QuintonDeKock.setCaptain(false);

        HeinrichKlaasen.setName("Heinrich Klaasen");
        HeinrichKlaasen.setAge(30);
        HeinrichKlaasen.setCaptain(false);

        WiaanMulder.setName("Wiaan Mulder");
        WiaanMulder.setAge(23);
        WiaanMulder.setCaptain(false);

        DwainePretorius.setName("Dwaine Pretorius");
        DwainePretorius.setAge(32);
        DwainePretorius.setCaptain(false);

        GeorgeLinde.setName("George Linde");
        GeorgeLinde.setAge(29);
        GeorgeLinde.setCaptain(false);

        AndilePhehlukwayo.setName("Andile Phehlukwayo");
        AndilePhehlukwayo.setAge(25);
        AndilePhehlukwayo.setCaptain(false);

        groupBteam1.add(TembaBavuma);
        groupBteam1.add(ReezaHendricks);
        groupBteam1.add(AidenMarkram);
        groupBteam1.add(DavidMiller);
        groupBteam1.add(RassieVanDerDussen);
        groupBteam1.add(QuintonDeKock);
        groupBteam1.add(HeinrichKlaasen);
        groupBteam1.add(WiaanMulder);
        groupBteam1.add(DwainePretorius);
        groupBteam1.add(GeorgeLinde);
        groupBteam1.add(AndilePhehlukwayo);

        System.out.println("\n");
        System.out.println("GROUP B TEAM 1");
        groupBteam1.forEach(System.out::println);


        //Adding Players DETAILS in Group B Team 2

        EoinMorgan.setName("Eoin Morgan");
        EoinMorgan.setAge(35);
        EoinMorgan.setCaptain(true);

        LiamLivingstone.setName("Liam Livingstone");
        LiamLivingstone.setAge(28);
        LiamLivingstone.setCaptain(false);

        DawidMalan.setName("Dawid Malan");
        DawidMalan.setAge(34);
        DawidMalan.setCaptain(false);

        JasonRoy.setName("Jason Roy");
        JasonRoy.setAge(31);
        JasonRoy.setCaptain(false);

        LiamDawson.setName("Liam Dawson");
        LiamDawson.setAge(31);
        LiamDawson.setCaptain(false);

        JamesVince.setName("James Vince");
        JamesVince.setAge(30);
        JamesVince.setCaptain(false);

        JonnyBairstow.setName("Jonny Bairstow");
        JonnyBairstow.setAge(32);
        JonnyBairstow.setCaptain(false);

        SamBillings.setName("Sam Billings");
        SamBillings.setAge(30);
        SamBillings.setCaptain(false);

        JosButtler.setName("Jos Buttler");
        JosButtler.setAge(31);
        JosButtler.setCaptain(false);

        MoeenAli.setName("Moeen Ali");
        MoeenAli.setAge(34);
        MoeenAli.setCaptain(false);

        TomCurran.setName("Tom Curran");
        TomCurran.setAge(26);
        TomCurran.setCaptain(false);

        groupBteam2.add(EoinMorgan);
        groupBteam2.add(LiamLivingstone);
        groupBteam2.add(DawidMalan);
        groupBteam2.add(JasonRoy);
        groupBteam2.add(LiamDawson);
        groupBteam2.add(JamesVince);
        groupBteam2.add(JonnyBairstow);
        groupBteam2.add(SamBillings);
        groupBteam2.add(JosButtler);
        groupBteam2.add(MoeenAli);
        groupBteam2.add(TomCurran);

        System.out.println("\n");
        System.out.println("GROUP B TEAM 2");
        groupBteam2.forEach(System.out::println);

        //Adding Players in Group B Team 3
        KaneWilliamson.setName("Kane Williamson");
        KaneWilliamson.setAge(31);
        KaneWilliamson.setCaptain(true);

        MarkChapman.setName("Mark Chapman");
        MarkChapman.setAge(27);
        MarkChapman.setCaptain(false);

        MartinGuptill.setName("Martin Guptill");
        MartinGuptill.setAge(35);
        MartinGuptill.setCaptain(false);

        DevonConway.setName("Devon Conway");
        DevonConway.setAge(30);
        DevonConway.setCaptain(false);

        GlennPhillips.setName("Glenn Phillips");
        GlennPhillips.setAge(24);
        GlennPhillips.setCaptain(false);

        TimSeifert.setName("Tim Seifert");
        TimSeifert.setAge(26);
        TimSeifert.setCaptain(false);

        ToddAstle.setName("Todd Astle");
        ToddAstle.setAge(35);
        ToddAstle.setCaptain(false);

        DarylMitchell.setName("Daryl Mitchell");
        DarylMitchell.setAge(30);
        DarylMitchell.setCaptain(false);

        JamesNeesham.setName("James Neesham");
        JamesNeesham.setAge(31);
        JamesNeesham.setCaptain(false);

        MitchellSantner.setName("Mitchell Santner");
        MitchellSantner.setAge(29);
        MitchellSantner.setCaptain(false);

        TimSouthee.setName("Tim Southee");
        TimSouthee.setAge(32);
        TimSouthee.setCaptain(false);

        groupBteam3.add(KaneWilliamson);
        groupBteam3.add(MarkChapman);
        groupBteam3.add(MartinGuptill);
        groupBteam3.add(DevonConway);
        groupBteam3.add(GlennPhillips);
        groupBteam3.add(TimSeifert);
        groupBteam3.add(ToddAstle);
        groupBteam3.add(DarylMitchell);
        groupBteam3.add(JamesNeesham);
        groupBteam3.add(MitchellSantner);
        groupBteam3.add(TimSouthee);

        System.out.println("\n");
        System.out.println("GROUP B TEAM 3");
        groupBteam3.forEach(System.out::println);

        //Adding Players in Group B Team 4
        ViratKohli.setName("Virat Kohli");
        ViratKohli.setAge(32);
        ViratKohli.setCaptain(true);

        RohitSharma.setName("Rohit Sharma");
        RohitSharma.setAge(34);
        RohitSharma.setCaptain(false);

        KLRahul.setName("KLRahul");
        KLRahul.setAge(29);
        KLRahul.setCaptain(false);

        SuryakumarYadav.setName("Suryakumar Yadav");
        SuryakumarYadav.setAge(31);
        SuryakumarYadav.setCaptain(false);

        ShreyasIyer.setName("Shreyas Iyer");
        ShreyasIyer.setAge(26);
        ShreyasIyer.setCaptain(false);

        IshanKishan.setName("Ishan Kishan");
        IshanKishan.setAge(23);
        IshanKishan.setCaptain(false);

        RishabhPant.setName("Rishabh Pant");
        RishabhPant.setAge(24);
        RishabhPant.setCaptain(false);

        RavindraJadeja.setName("Ravindra Jadeja");
        RavindraJadeja.setAge(32);
        RavindraJadeja.setCaptain(false);

        AxarPatel.setName("Axar Patel");
        AxarPatel.setAge(27);
        AxarPatel.setCaptain(false);

        HardikPandya.setName("Hardik Pandya");
        HardikPandya.setAge(28);
        HardikPandya.setCaptain(false);

        ShardulThakur.setName("Shardul Thakur");
        ShardulThakur.setAge(29);
        ShardulThakur.setCaptain(false);


        groupBteam4.add(ViratKohli);
        groupBteam4.add(RohitSharma);
        groupBteam4.add(KLRahul);
        groupBteam4.add(SuryakumarYadav);
        groupBteam4.add(ShreyasIyer);
        groupBteam4.add(IshanKishan);
        groupBteam4.add(RishabhPant);
        groupBteam4.add(RavindraJadeja);
        groupBteam4.add(AxarPatel);
        groupBteam4.add(HardikPandya);
        groupBteam4.add(ShardulThakur);


        System.out.println("\n");
        System.out.println("GROUP B TEAM 4");
        groupBteam4.forEach(System.out::println);

    }
//    public static void ChangeNames() {
//        System.out.println("Do you want to edit players? ");
//        Scanner choiceinput = new Scanner(System.in);
//        String choice = choiceinput.next();
//
//        while(choice.equals("yes")) {
//
//            System.out.println("Which Team do you want to edit (A1,A2,A3,A4,B1,B2,B3 or B4)? ");
//            String choice2 = choiceinput.next();
//            switch (choice2){
//                case "A1":
//                    System.out.println("\nGROUP A TEAM 1");
//                    int counter1=0;
//                    for(Player s : groupAteam1){
//                        System.out.println(String.valueOf(counter1++)+": "+s);
//                    }
//                    System.out.println("Enter the number of the player you want to edit: ");
//                    String playerno = choiceinput.next();
//                    if (playerno.equals("0")){
//                        groupAteam1.remove(0);
//                        System.out.println("Enter A new name for Player " +  playerno + " (Captain)");
//                        String newPlayerName = choiceinput.next();
//                        System.out.println("Enter A Player age: ");
//                        String newPlayerAge = choiceinput.next();
//                        int playerage = Integer.parseInt(newPlayerAge);
//                        Player newplayer = new Player();
//                        newplayer.setName(newPlayerName);
//                        newplayer.setAge(playerage);
//                        newplayer.setCaptain(true);
//                        groupAteam1.add(newplayer);
//                        System.out.println("\nGROUP A TEAM 1");
//                        int counter2=0;
//                        for(Player s : groupAteam1){
//                            System.out.println(String.valueOf(counter2++)+": "+s);
//                        }
//                        System.out.println("Do you want to edit players further? ");
//                        String choice3 = choiceinput.next();
//                        choice = String.valueOf(choice3);
//                    }
//                    else {
//                        int playernoint = Integer.parseInt(playerno);
//                        groupAteam1.remove(playernoint);
//                        System.out.println("Enter A new name for Player " +  playerno);
//                        String newPlayerName = choiceinput.next();
//                        System.out.println("Enter A Player age: ");
//                        String newPlayerAge = choiceinput.next();
//                        int playerage = Integer.parseInt(newPlayerAge);
//                        Player newplayer = new Player();
//                        newplayer.setName(newPlayerName);
//                        newplayer.setAge(playerage);
//                        newplayer.setCaptain(false);
//                        groupAteam1.add(newplayer);
//                        System.out.println("\nGROUP A TEAM 1");
//                        int counter2=0;
//                        for(Player s : groupAteam1){
//                            System.out.println(String.valueOf(counter2++)+": "+s);
//                        }
//                        System.out.println("Do you want to edit players further? ");
//                        Scanner choice3 = new Scanner(System.in);
//                        choice = String.valueOf(choice3);
//                    }
//                case "A2":
//                    System.out.println("\nGROUP A TEAM 2");
//                    counter1 = 0;
//                    for(Player s : groupAteam2){
//                        System.out.println(String.valueOf(counter1++)+": "+s);
//                    }
//                    System.out.println("Enter the number of the player you want to edit: ");
//                    playerno = choiceinput.next();
//                    if (playerno.equals("0")){
//                        groupAteam2.remove(0);
//                        System.out.println("Enter A new name for Player " +  playerno + " (Captain)");
//                        String newPlayerName = choiceinput.next();
//                        System.out.println("Enter A Player age: ");
//                        String newPlayerAge = choiceinput.next();
//                        int playerage = Integer.parseInt(newPlayerAge);
//                        Player newplayer = new Player();
//                        newplayer.setName(newPlayerName);
//                        newplayer.setAge(playerage);
//                        newplayer.setCaptain(true);
//                        groupAteam2.add(newplayer);
//                        System.out.println("\nGROUP A TEAM 1");
//                        int counter2=0;
//                        for(Player s : groupAteam2){
//                            System.out.println(String.valueOf(counter2++)+": "+s);
//                        }
//                        System.out.println("Do you want to edit players further? ");
//                        String choice3 = choiceinput.next();
//                        choice = String.valueOf(choice3);
//                    }
//                    else {
//                        int playernoint = Integer.parseInt(playerno);
//                        groupAteam2.remove(playernoint);
//                        System.out.println("Enter A new name for Player " +  playerno);
//                        String newPlayerName = choiceinput.next();
//                        System.out.println("Enter A Player age: ");
//                        String newPlayerAge = choiceinput.next();
//                        int playerage = Integer.parseInt(newPlayerAge);
//                        Player newplayer = new Player();
//                        newplayer.setName(newPlayerName);
//                        newplayer.setAge(playerage);
//                        newplayer.setCaptain(false);
//                        groupAteam2.add(newplayer);
//                        System.out.println("\nGROUP A TEAM 2");
//                        int counter2=0;
//                        for(Player s : groupAteam2){
//                            System.out.println(String.valueOf(counter2++)+": "+s);
//                        }
//                        System.out.println("Do you want to edit players further? ");
//                        String choice3 = choiceinput.next();
//                        choice = String.valueOf(choice3);
//                    }
//            }
//        }
//    }











        public static void main(String[] args) {
        Init();
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxmlFiles/landing.fxml"));
        primaryStage.setTitle("T20 Match");
        primaryStage.setScene(new Scene(root, 650, 375));
        primaryStage.show();
    }
}
