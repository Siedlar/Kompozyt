/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kompozyt;

import java.util.Scanner;

/**
 *
 * @author Siedlar
 */

public class Kompozyt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int wyb=0;
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
                    System.out.println("Wybierz zespół\n 1.Lechia Gdańsk \n2.Piast Gliwice\n3.Zagłębie Lubin\n4.Pogoń Szczecin \n5.Legia Warszawa \n6.Cracovia\n7.Jagiellonia Białystok\n8.Lech Poznań\n9.Wisła Kraków\n10.Wisła Płock\n11.Korona Kielce\n12.Śląsk Wrocław\n13.Miedź Legnica\n14.Zagłębie Sosnowiec\n15.Górnik Zabrze\n16.Arka Gdynia\n0.Exit");

do{


         a=in.nextInt();
         switch(a){
             case 1: 
                 JednostkaOrganizacyjna organizacja= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna lechia= new JednostkaOrganizacyjna("Lechia","Klub");
                 JednostkaPodstawowa leaf= new JednostkaPodstawowa("Kuciak","Bramkarz");
                 JednostkaPodstawowa leaf1= new JednostkaPodstawowa("Nalepa","Obrońca");
                 JednostkaPodstawowa leaf2= new JednostkaPodstawowa("Augustyn","Obrońca");
                 JednostkaPodstawowa leaf3= new JednostkaPodstawowa("Mladenovic","Obrońca");
                 JednostkaPodstawowa leaf4= new JednostkaPodstawowa("Nunes","Obrońca");
                 JednostkaPodstawowa leaf5= new JednostkaPodstawowa("Łukasik","Pomocnik");
                 JednostkaPodstawowa leaf6= new JednostkaPodstawowa("Makowski","Pomocnik");
                 JednostkaPodstawowa leaf7= new JednostkaPodstawowa("Kubicki","Pomocnik");
                 JednostkaPodstawowa leaf8= new JednostkaPodstawowa("Paixao","Napastnik");
                 JednostkaPodstawowa leaf9= new JednostkaPodstawowa("Sobiech","Napastnik");
                 JednostkaPodstawowa leaf10= new JednostkaPodstawowa("Haraslij","Napastnik");
                 JednostkaPodstawowa leaf11= new JednostkaPodstawowa("Piotr Stokowiec","Trener");
                 organizacja.dodaj(ekstraklasa);
                 ekstraklasa.dodaj(lechia);
                 lechia.dodaj(leaf);
                 lechia.dodaj(leaf1);
                 lechia.dodaj(leaf2);
                 lechia.dodaj(leaf3);
                 lechia.dodaj(leaf4);
                 lechia.dodaj(leaf5);
                 lechia.dodaj(leaf6);
                 lechia.dodaj(leaf7);
                 lechia.dodaj(leaf8);
                 lechia.dodaj(leaf9);
                 lechia.dodaj(leaf10);
                 lechia.dodaj(leaf11);
                 
                
                   wyb=0;
                 while(wyb!=3){
                      System.out.println("\nWybrany klub to Lechia Gdańsk\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja.wypiszInfo();
                      }
                      else if(wyb==2){
                      lechia.sprawdzUstawienie();
                      }
                    }
                      
               
                 
                 
                
                
                 break;
                case 5: 
                 JednostkaOrganizacyjna organizacja1= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa1= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna legia= new JednostkaOrganizacyjna("Legia Warszawa","Klub");
                 JednostkaPodstawowa leaf21= new JednostkaPodstawowa("Cierzniak","Bramkarz");
                 JednostkaPodstawowa leaf22= new JednostkaPodstawowa("Vesovic","Obrońca");
                 JednostkaPodstawowa leaf23= new JednostkaPodstawowa("Jedrzejczyk","Obrońca");
                 JednostkaPodstawowa leaf20= new JednostkaPodstawowa("Remy","Obrońca");
                 JednostkaPodstawowa leaf24= new JednostkaPodstawowa("Rocha","Obrońca");
                 JednostkaPodstawowa leaf25= new JednostkaPodstawowa("Martins","Pomocnik");
                 JednostkaPodstawowa leaf26= new JednostkaPodstawowa("Cafu","Pomocnik");
                 JednostkaPodstawowa leaf27= new JednostkaPodstawowa("Hamalainen","Pomocnik");
                 JednostkaPodstawowa leaf28= new JednostkaPodstawowa("Szymański","Pomocnik");
                 JednostkaPodstawowa leaf29= new JednostkaPodstawowa("Nagy","Pomocnik");
                 JednostkaPodstawowa leaf210= new JednostkaPodstawowa("Carlitos","Napastnik");
                 JednostkaPodstawowa leaf211= new JednostkaPodstawowa("Vukovic","Trener");
                 organizacja1.dodaj(ekstraklasa1);
                 ekstraklasa1.dodaj(legia);
                 legia.dodaj(leaf21);
                 legia.dodaj(leaf22);
                legia.dodaj(leaf23);
                 legia.dodaj(leaf20);
                 legia.dodaj(leaf24);
                 legia.dodaj(leaf25);
                 legia.dodaj(leaf26);
                 legia.dodaj(leaf27);
                 legia.dodaj(leaf28);
                 legia.dodaj(leaf29);
                 legia.dodaj(leaf210);
                 legia.dodaj(leaf211);
                  wyb=0;
                 while(wyb!=3){
                      System.out.println("\nWybrany klub to Legia Warszawa\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja1.wypiszInfo();
                      }
                      else if(wyb==2){
                      legia.sprawdzUstawienie();
                      }
                    }
                 break;
                case 2:
                    JednostkaOrganizacyjna organizacja2= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa2= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna piast= new JednostkaOrganizacyjna("Piast Gliwice","Klub");
                 JednostkaPodstawowa leaf31= new JednostkaPodstawowa("Plach","Bramkarz");
                 JednostkaPodstawowa leaf32= new JednostkaPodstawowa("Pietrowski","Obrońca");
                 JednostkaPodstawowa leaf33= new JednostkaPodstawowa("Czerwiński","Obrońca");
                 JednostkaPodstawowa leaf30= new JednostkaPodstawowa("Sedlar","Obrońca");
                 JednostkaPodstawowa leaf34= new JednostkaPodstawowa("Kirkeskov","Obrońca");
                 JednostkaPodstawowa leaf35= new JednostkaPodstawowa("Hateley","Pomocnik");
                 JednostkaPodstawowa leaf36= new JednostkaPodstawowa("Badia","Pomocnik");
                 JednostkaPodstawowa leaf37= new JednostkaPodstawowa("Felix","Pomocnik");
                 JednostkaPodstawowa leaf38= new JednostkaPodstawowa("Dziczek","Pomocnik");
                 JednostkaPodstawowa leaf39= new JednostkaPodstawowa("Konczkowski","Pomocnik");
                 JednostkaPodstawowa leaf310= new JednostkaPodstawowa("Parzyszek","Napastnik");
                 JednostkaPodstawowa leaf311= new JednostkaPodstawowa("Fornalik","Trener");
                 organizacja2.dodaj(ekstraklasa2);
                 ekstraklasa2.dodaj(piast);
                 piast.dodaj(leaf31);
                 piast.dodaj(leaf32);
                piast.dodaj(leaf33);
                 piast.dodaj(leaf30);
                 piast.dodaj(leaf34);
                 piast.dodaj(leaf35);
                 piast.dodaj(leaf36);
                 piast.dodaj(leaf37);
                 piast.dodaj(leaf38);
                 piast.dodaj(leaf39);
                 piast.dodaj(leaf310);
                 piast.dodaj(leaf311);
                 wyb=0;
                 while(wyb!=3){
                     System.out.println("\nWybrany klub to Piast Gliwice\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja2.wypiszInfo();
                      }
                      else if(wyb==2){
                      piast.sprawdzUstawienie();
                      }
                    }
                    break;
                    case 3:
                    JednostkaOrganizacyjna organizacja3= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa3= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna zaglebiel= new JednostkaOrganizacyjna("Zagłebie Lubin","Klub");
                 JednostkaPodstawowa leaf41= new JednostkaPodstawowa("Forenc","Bramkarz");
                 JednostkaPodstawowa leaf42= new JednostkaPodstawowa("Kopacz","Obrońca");
                 JednostkaPodstawowa leaf43= new JednostkaPodstawowa("Guldan","Obrońca");
                 JednostkaPodstawowa leaf40= new JednostkaPodstawowa("Oko","Obrońca");
                 JednostkaPodstawowa leaf44= new JednostkaPodstawowa("Balic","Obrońca");
                 JednostkaPodstawowa leaf45= new JednostkaPodstawowa("Slisz","Pomocnik");
                 JednostkaPodstawowa leaf46= new JednostkaPodstawowa("Poreba","Pomocnik");
                 JednostkaPodstawowa leaf47= new JednostkaPodstawowa("Pawłowski","Pomocnik");
                 JednostkaPodstawowa leaf48= new JednostkaPodstawowa("Starzynski","Pomocnik");
                 JednostkaPodstawowa leaf49= new JednostkaPodstawowa("Bohar","Pomocnik");
                 JednostkaPodstawowa leaf410= new JednostkaPodstawowa("Tuszynski","Napastnik");
                 JednostkaPodstawowa leaf411= new JednostkaPodstawowa("Van Dael","Trener");
                 organizacja3.dodaj(ekstraklasa3);
                 ekstraklasa3.dodaj(zaglebiel);
                 zaglebiel.dodaj(leaf41);
                 zaglebiel.dodaj(leaf42);
                zaglebiel.dodaj(leaf43);
                 zaglebiel.dodaj(leaf40);
                 zaglebiel.dodaj(leaf44);
                 zaglebiel.dodaj(leaf45);
                 zaglebiel.dodaj(leaf46);
                 zaglebiel.dodaj(leaf47);
                 zaglebiel.dodaj(leaf48);
                 zaglebiel.dodaj(leaf49);
                 zaglebiel.dodaj(leaf410);
                 zaglebiel.dodaj(leaf411);
                  wyb=0;
                 while(wyb!=3){
                      System.out.println("\nWybrany klub to Zagłebie Lubin\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja3.wypiszInfo();
                      }
                      else if(wyb==2){
                      zaglebiel.sprawdzUstawienie();
                      }
                    }
                    break;
                         case 4:
                    JednostkaOrganizacyjna organizacja4= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa4= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna pogon= new JednostkaOrganizacyjna("Pogoń Szczecin","Klub");
                 JednostkaPodstawowa leaf51= new JednostkaPodstawowa("Załuska","Bramkarz");
                 JednostkaPodstawowa leaf52= new JednostkaPodstawowa("Malec","Obrońca");
                 JednostkaPodstawowa leaf53= new JednostkaPodstawowa("Fojut","Obrońca");
                 JednostkaPodstawowa leaf50= new JednostkaPodstawowa("Stec","Obrońca");
                 JednostkaPodstawowa leaf54= new JednostkaPodstawowa("Nunes","Obrońca");
                 JednostkaPodstawowa leaf55= new JednostkaPodstawowa("Kozulj","Pomocnik");
                 JednostkaPodstawowa leaf56= new JednostkaPodstawowa("Podstawski","Pomocnik");
                 JednostkaPodstawowa leaf57= new JednostkaPodstawowa("Majewski","Pomocnik");
                 JednostkaPodstawowa leaf58= new JednostkaPodstawowa("Drygas","Pomocnik");
                 JednostkaPodstawowa leaf59= new JednostkaPodstawowa("Kowalczyk","Pomocnik");
                 JednostkaPodstawowa leaf510= new JednostkaPodstawowa("Buksa","Napastnik");
                 JednostkaPodstawowa leaf511= new JednostkaPodstawowa("Runjaic","Trener");
                 organizacja4.dodaj(ekstraklasa4);
                 ekstraklasa4.dodaj(pogon);
                 pogon.dodaj(leaf51);
                 pogon.dodaj(leaf52);
                pogon.dodaj(leaf53);
                 pogon.dodaj(leaf50);
                 pogon.dodaj(leaf54);
                 pogon.dodaj(leaf55);
                 pogon.dodaj(leaf56);
                 pogon.dodaj(leaf57);
                 pogon.dodaj(leaf58);
                 pogon.dodaj(leaf59);
                 pogon.dodaj(leaf510);
                 pogon.dodaj(leaf511);
                  wyb=0;
                 while(wyb!=3){
                      System.out.println("\nWybrany klub to Pogoń Szczecin\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja4.wypiszInfo();
                      }
                      else if(wyb==2){
                      pogon.sprawdzUstawienie();
                      }
                    }
                    break;
                    case 6:
                    JednostkaOrganizacyjna organizacja5= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa5= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna cracovia= new JednostkaOrganizacyjna("Cracovia","Klub");
                 JednostkaPodstawowa leaf61= new JednostkaPodstawowa("Peskovic","Bramkarz");
                 JednostkaPodstawowa leaf62= new JednostkaPodstawowa("Diego","Obrońca");
                 JednostkaPodstawowa leaf63= new JednostkaPodstawowa("Helik","Obrońca");
                 JednostkaPodstawowa leaf60= new JednostkaPodstawowa("Datkovic","Obrońca");
                 JednostkaPodstawowa leaf64= new JednostkaPodstawowa("Siplak","Obrońca");
                 JednostkaPodstawowa leaf65= new JednostkaPodstawowa("Hanca","Pomocnik");
                 JednostkaPodstawowa leaf66= new JednostkaPodstawowa("Dimun","Pomocnik");
                 JednostkaPodstawowa leaf67= new JednostkaPodstawowa("Gol","Pomocnik");
                 JednostkaPodstawowa leaf68= new JednostkaPodstawowa("Wdowiak","Pomocnik");
                 JednostkaPodstawowa leaf69= new JednostkaPodstawowa("Cabrera","Napastnik");
                 JednostkaPodstawowa leaf610= new JednostkaPodstawowa("Piszczek","Napastnik");
                 JednostkaPodstawowa leaf611= new JednostkaPodstawowa("Probierz","Trener");
                 organizacja5.dodaj(ekstraklasa5);
                 ekstraklasa5.dodaj(cracovia);
                 cracovia.dodaj(leaf61);
                 cracovia.dodaj(leaf62);
                cracovia.dodaj(leaf63);
                 cracovia.dodaj(leaf60);
                 cracovia.dodaj(leaf64);
                 cracovia.dodaj(leaf65);
                 cracovia.dodaj(leaf66);
                 cracovia.dodaj(leaf67);
                 cracovia.dodaj(leaf68);
                 cracovia.dodaj(leaf69);
                 cracovia.dodaj(leaf610);
                 cracovia.dodaj(leaf611);
                  wyb=0;
                 while(wyb!=3){
                      System.out.println("\nWybrany klub to Cracovia\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja5.wypiszInfo();
                      }
                      else if(wyb==2){
                      cracovia.sprawdzUstawienie();
                      }
                    }
                    break;
                    case 7:
                    JednostkaOrganizacyjna organizacja6= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa6= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna jaga= new JednostkaOrganizacyjna("Jagiellonia Białystok","Klub");
                 JednostkaPodstawowa leaf71= new JednostkaPodstawowa("Kelemen","Bramkarz");
                 JednostkaPodstawowa leaf72= new JednostkaPodstawowa("Runje","Obrońca");
                 JednostkaPodstawowa leaf73= new JednostkaPodstawowa("Kadlec","Obrońca");
                 JednostkaPodstawowa leaf70= new JednostkaPodstawowa("Arsenic","Obrońca");
                 JednostkaPodstawowa leaf74= new JednostkaPodstawowa("Bodvarsson","Obrońca");
                 JednostkaPodstawowa leaf75= new JednostkaPodstawowa("Romanczuk","Pomocnik");
                 JednostkaPodstawowa leaf76= new JednostkaPodstawowa("Poletanovic","Pomocnik");
                 JednostkaPodstawowa leaf77= new JednostkaPodstawowa("Guilherme","Pomocnik");
                 JednostkaPodstawowa leaf78= new JednostkaPodstawowa("Novikovas","Pomocnik");
                 JednostkaPodstawowa leaf79= new JednostkaPodstawowa("Wójcicki","Pomocnik");
                 JednostkaPodstawowa leaf710= new JednostkaPodstawowa("Imaz","Napastnik");
                 JednostkaPodstawowa leaf711= new JednostkaPodstawowa("Mamrot","Trener");
                 organizacja6.dodaj(ekstraklasa6);
                 ekstraklasa6.dodaj(jaga);
                 jaga.dodaj(leaf71);
                 jaga.dodaj(leaf72);
                jaga.dodaj(leaf73);
                 jaga.dodaj(leaf70);
                 jaga.dodaj(leaf74);
                 jaga.dodaj(leaf75);
                 jaga.dodaj(leaf76);
                 jaga.dodaj(leaf77);
                 jaga.dodaj(leaf78);
                 jaga.dodaj(leaf79);
                 jaga.dodaj(leaf710);
                 jaga.dodaj(leaf711);
               wyb=0;
                 while(wyb!=3){
                      System.out.println("\nWybrany klub to Jagiellonia Białystok\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja6.wypiszInfo();
                      }
                      else if(wyb==2){
                      jaga.sprawdzUstawienie();
                      }
                    }
                    break;
                    case 8:
                    JednostkaOrganizacyjna organizacja7= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa7= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna lech= new JednostkaOrganizacyjna("Lech Poznań","Klub");
                 JednostkaPodstawowa leaf81= new JednostkaPodstawowa("Putnocki","Bramkarz");
                 JednostkaPodstawowa leaf82= new JednostkaPodstawowa("Gumny","Obrońca");
                 JednostkaPodstawowa leaf83= new JednostkaPodstawowa("Kostevych","Obrońca");
                 JednostkaPodstawowa leaf80= new JednostkaPodstawowa("Jóźwiak","Obrońca");
                 JednostkaPodstawowa leaf84= new JednostkaPodstawowa("Rogne","Obrońca");
                 JednostkaPodstawowa leaf85= new JednostkaPodstawowa("Trałka","Pomocnik");
                 JednostkaPodstawowa leaf86= new JednostkaPodstawowa("Vujadinovic","Pomocnik");
                 JednostkaPodstawowa leaf87= new JednostkaPodstawowa("Tiba","Pomocnik");
                 JednostkaPodstawowa leaf88= new JednostkaPodstawowa("Jevtic","Napastnik");
                 JednostkaPodstawowa leaf89= new JednostkaPodstawowa("Klups","Napastnik");
                 JednostkaPodstawowa leaf810= new JednostkaPodstawowa("Gytkjaer","Napastnik");
                 JednostkaPodstawowa leaf811= new JednostkaPodstawowa("Żuraw","Trener");
                 organizacja7.dodaj(ekstraklasa7);
                 ekstraklasa7.dodaj(lech);
                 lech.dodaj(leaf81);
                 lech.dodaj(leaf82);
                lech.dodaj(leaf83);
                 lech.dodaj(leaf80);
                 lech.dodaj(leaf84);
                 lech.dodaj(leaf85);
                 lech.dodaj(leaf86);
                 lech.dodaj(leaf87);
                 lech.dodaj(leaf88);
                 lech.dodaj(leaf89);
                 lech.dodaj(leaf810);
                 lech.dodaj(leaf811);
                wyb=0;
                 while(wyb!=3){
                      System.out.println("\nWybrany klub to Lech Poznań\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja7.wypiszInfo();
                      }
                      else if(wyb==2){
                      lech.sprawdzUstawienie();
                      }
                    }
                    break;
                    case 9: 
                 JednostkaOrganizacyjna organizacja9= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa9= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna wislak= new JednostkaOrganizacyjna("Wisła Kraków","Klub");
                 JednostkaPodstawowa leaf991= new JednostkaPodstawowa("Lis","Bramkarz");
                 JednostkaPodstawowa leaf91= new JednostkaPodstawowa("Burliga","Obrońca");
                 JednostkaPodstawowa leaf92= new JednostkaPodstawowa("Wasilewski","Obrońca");
                 JednostkaPodstawowa leaf93= new JednostkaPodstawowa("Szot","Obrońca");
                 JednostkaPodstawowa leaf94= new JednostkaPodstawowa("Grabowski","Obrońca");
                 JednostkaPodstawowa leaf95= new JednostkaPodstawowa("Błaszczykowski","Pomocnik");
                 JednostkaPodstawowa leaf96= new JednostkaPodstawowa("Peszko","Pomocnik");
                 JednostkaPodstawowa leaf97= new JednostkaPodstawowa("Pietrzak","Pomocnik");
                 JednostkaPodstawowa leaf98= new JednostkaPodstawowa("Boguski","Pomocnik");
                 JednostkaPodstawowa leaf99= new JednostkaPodstawowa("Kolar","Napastnik");
                 JednostkaPodstawowa leaf910= new JednostkaPodstawowa("Haraslij","Napastnik");
                 JednostkaPodstawowa leaf911= new JednostkaPodstawowa("Stolarczyk","Trener");
                 organizacja9.dodaj(ekstraklasa9);
                 ekstraklasa9.dodaj(wislak);
                 wislak.dodaj(leaf991);
                 wislak.dodaj(leaf91);
                 wislak.dodaj(leaf92);
                 wislak.dodaj(leaf93);
                 wislak.dodaj(leaf94);
                 wislak.dodaj(leaf95);
                 wislak.dodaj(leaf96);
                 wislak.dodaj(leaf97);
                 wislak.dodaj(leaf98);
                 wislak.dodaj(leaf99);
                 wislak.dodaj(leaf910);
                 wislak.dodaj(leaf911);
                  wyb=0;
                 while(wyb!=3){
                     System.out.println("\nWybrany klub to Wisła Kraków\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja9.wypiszInfo();
                      }
                      else if(wyb==2){
                      wislak.sprawdzUstawienie();
                      }
                    }
                 break;
                case 10: 
                 JednostkaOrganizacyjna organizacja10= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa10= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna wislap= new JednostkaOrganizacyjna("Wisła Płock","Klub");
                 JednostkaPodstawowa leaf121= new JednostkaPodstawowa("Dähne","Bramkarz");
                 JednostkaPodstawowa leaf122= new JednostkaPodstawowa("Uryga","Obrońca");
                 JednostkaPodstawowa leaf123= new JednostkaPodstawowa("Lasicki","Obrońca");
                 JednostkaPodstawowa leaf120= new JednostkaPodstawowa("García","Obrońca");
                 JednostkaPodstawowa leaf124= new JednostkaPodstawowa("McGing","Obrońca");
                 JednostkaPodstawowa leaf125= new JednostkaPodstawowa("Furman","Pomocnik");
                 JednostkaPodstawowa leaf126= new JednostkaPodstawowa("Rasak","Pomocnik");
                 JednostkaPodstawowa leaf127= new JednostkaPodstawowa("Ricardinho","Pomocnik");
                 JednostkaPodstawowa leaf128= new JednostkaPodstawowa("Merebashvili","Pomocnik");
                 JednostkaPodstawowa leaf129= new JednostkaPodstawowa("Szwoch","Pomocnik");
                 JednostkaPodstawowa leaf1210= new JednostkaPodstawowa("Angielski","Napastnik");
                 JednostkaPodstawowa leaf1211= new JednostkaPodstawowa("Ojrzynski","Trener");
                 organizacja10.dodaj(ekstraklasa10);
                 ekstraklasa10.dodaj(wislap);
                 wislap.dodaj(leaf121);
                 wislap.dodaj(leaf122);
                wislap.dodaj(leaf123);
                 wislap.dodaj(leaf120);
                 wislap.dodaj(leaf124);
                 wislap.dodaj(leaf125);
                 wislap.dodaj(leaf126);
                 wislap.dodaj(leaf127);
                 wislap.dodaj(leaf128);
                 wislap.dodaj(leaf129);
                 wislap.dodaj(leaf1210);
                 wislap.dodaj(leaf1211);
                  wyb=0;
                 while(wyb!=3){
                       System.out.println("\nWybrany klub to Wisła Płock\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja10.wypiszInfo();
                      }
                      else if(wyb==2){
                      wislap.sprawdzUstawienie();
                      }
                    }
                 break;
                case 11:
                    JednostkaOrganizacyjna organizacja11= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa11= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna korona= new JednostkaOrganizacyjna("Korona Kielce","Klub");
                 JednostkaPodstawowa leaf131= new JednostkaPodstawowa("Hamrol","Bramkarz");
                 JednostkaPodstawowa leaf132= new JednostkaPodstawowa("Adnan Kovacevic","Obrońca");
                 JednostkaPodstawowa leaf133= new JednostkaPodstawowa("Márquez","Obrońca");
                 JednostkaPodstawowa leaf130= new JednostkaPodstawowa("Kosakiewicz","Obrońca");
                 JednostkaPodstawowa leaf134= new JednostkaPodstawowa("Gardawski","Obrońca");
                 JednostkaPodstawowa leaf135= new JednostkaPodstawowa("Gnjatic","Pomocnik");
                 JednostkaPodstawowa leaf136= new JednostkaPodstawowa("Zubrowski","Pomocnik");
                 JednostkaPodstawowa leaf137= new JednostkaPodstawowa("Jukic","Pomocnik");
                 JednostkaPodstawowa leaf138= new JednostkaPodstawowa("Arveladze","Pomocnik");
                 JednostkaPodstawowa leaf139= new JednostkaPodstawowa("Forbes","Pomocnik");
                 JednostkaPodstawowa leaf1310= new JednostkaPodstawowa("Soriano","Napastnik");
                 JednostkaPodstawowa leaf1311= new JednostkaPodstawowa("Gino Lettieri","Trener");
                 organizacja11.dodaj(ekstraklasa11);
                 ekstraklasa11.dodaj(korona);
                 korona.dodaj(leaf131);
                 korona.dodaj(leaf132);
                korona.dodaj(leaf133);
                 korona.dodaj(leaf130);
                 korona.dodaj(leaf134);
                 korona.dodaj(leaf135);
                 korona.dodaj(leaf136);
                 korona.dodaj(leaf137);
                 korona.dodaj(leaf138);
                 korona.dodaj(leaf139);
                 korona.dodaj(leaf1310);
                 korona.dodaj(leaf1311);
                wyb=0;
                 while(wyb!=3){
                       System.out.println("\nWybrany klub to Korona Kielce\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja11.wypiszInfo();
                      }
                      else if(wyb==2){
                      korona.sprawdzUstawienie();
                      }
                    }
                    break;
                    case 12:
                    JednostkaOrganizacyjna organizacja12= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa12= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna slask= new JednostkaOrganizacyjna("Śląsk Wrocław","Klub");
                 JednostkaPodstawowa leaf141= new JednostkaPodstawowa("Slowik","Bramkarz");
                 JednostkaPodstawowa leaf142= new JednostkaPodstawowa("Dankowski","Obrońca");
                 JednostkaPodstawowa leaf143= new JednostkaPodstawowa("Tarasovs","Obrońca");
                 JednostkaPodstawowa leaf140= new JednostkaPodstawowa("Golla","Obrońca");
                 JednostkaPodstawowa leaf144= new JednostkaPodstawowa("Holownia","Obrońca");
                 JednostkaPodstawowa leaf145= new JednostkaPodstawowa("Maczynski","Pomocnik");
                 JednostkaPodstawowa leaf146= new JednostkaPodstawowa("Labojko","Pomocnik");
                 JednostkaPodstawowa leaf147= new JednostkaPodstawowa("Chrapek","Pomocnik");
                 JednostkaPodstawowa leaf148= new JednostkaPodstawowa("Gaska","Napastnik");
                 JednostkaPodstawowa leaf149= new JednostkaPodstawowa("Piech","Napastnik");
                 JednostkaPodstawowa leaf1410= new JednostkaPodstawowa("Ahmadzadeh","Napastnik");
                 JednostkaPodstawowa leaf1411= new JednostkaPodstawowa("Lavicka","Trener");
                 organizacja12.dodaj(ekstraklasa12);
                 ekstraklasa12.dodaj(slask);
                 slask.dodaj(leaf141);
                 slask.dodaj(leaf142);
                slask.dodaj(leaf143);
                 slask.dodaj(leaf140);
                 slask.dodaj(leaf144);
                 slask.dodaj(leaf145);
                 slask.dodaj(leaf146);
                 slask.dodaj(leaf147);
                 slask.dodaj(leaf148);
                 slask.dodaj(leaf149);
                 slask.dodaj(leaf1410);
                 slask.dodaj(leaf1411);
                 wyb=0;
                 while(wyb!=3){
                      System.out.println("\nWybrany klub to Śląsk Wrocław\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja12.wypiszInfo();
                      }
                      else if(wyb==2){
                      slask.sprawdzUstawienie();
                      }
                    }
                    break;
                         case 13:
                    JednostkaOrganizacyjna organizacja13= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa13= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna miedz= new JednostkaOrganizacyjna("Miedź Legnica","Klub");
                 JednostkaPodstawowa leaf151= new JednostkaPodstawowa("Dzhanaev","Bramkarz");
                 JednostkaPodstawowa leaf152= new JednostkaPodstawowa("Osyra","Obrońca");
                 JednostkaPodstawowa leaf153= new JednostkaPodstawowa("Monteiro","Obrońca");
                 JednostkaPodstawowa leaf150= new JednostkaPodstawowa("Miljkovic","Obrońca");
                 JednostkaPodstawowa leaf154= new JednostkaPodstawowa("Pikk","Obrońca");
                 JednostkaPodstawowa leaf155= new JednostkaPodstawowa("Augustyniak","Pomocnik");
                 JednostkaPodstawowa leaf156= new JednostkaPodstawowa("Fernández","Pomocnik");
                 JednostkaPodstawowa leaf157= new JednostkaPodstawowa("Ojamaa","Pomocnik");
                 JednostkaPodstawowa leaf158= new JednostkaPodstawowa("Santana","Pomocnik");
                 JednostkaPodstawowa leaf159= new JednostkaPodstawowa("Cámara","Pomocnik");
                 JednostkaPodstawowa leaf1510= new JednostkaPodstawowa("Forsell","Napastnik");
                 JednostkaPodstawowa leaf1511= new JednostkaPodstawowa("Nowak","Trener");
                 organizacja13.dodaj(ekstraklasa13);
                 ekstraklasa13.dodaj(miedz);
                 miedz.dodaj(leaf151);
                 miedz.dodaj(leaf152);
                miedz.dodaj(leaf153);
                 miedz.dodaj(leaf150);
                 miedz.dodaj(leaf154);
                 miedz.dodaj(leaf155);
                 miedz.dodaj(leaf156);
                 miedz.dodaj(leaf157);
                 miedz.dodaj(leaf158);
                 miedz.dodaj(leaf159);
                 miedz.dodaj(leaf1510);
                 miedz.dodaj(leaf1511);
                 wyb=0;
                 while(wyb!=3){
                       System.out.println("\nWybrany klub to Miedz Legnica\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja13.wypiszInfo();
                      }
                      else if(wyb==2){
                      miedz.sprawdzUstawienie();
                      }
                    }
                    break;
                    case 14:
                    JednostkaOrganizacyjna organizacja14= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa14= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna zaglebie= new JednostkaOrganizacyjna(" Zagłebie Sosnowiec","Klub");
                 JednostkaPodstawowa leaf161= new JednostkaPodstawowa("Hrosso","Bramkarz");
                 JednostkaPodstawowa leaf162= new JednostkaPodstawowa("Toth","Obrońca");
                 JednostkaPodstawowa leaf163= new JednostkaPodstawowa("Cichocki","Obrońca");
                 JednostkaPodstawowa leaf160= new JednostkaPodstawowa("Heinloth","Obrońca");
                 JednostkaPodstawowa leaf164= new JednostkaPodstawowa("Mygas","Obrońca");
                 JednostkaPodstawowa leaf165= new JednostkaPodstawowa("Mozdzen","Pomocnik");
                 JednostkaPodstawowa leaf166= new JednostkaPodstawowa("Gressak","Pomocnik");
                 JednostkaPodstawowa leaf167= new JednostkaPodstawowa("Nawrotka","Pomocnik");
                 JednostkaPodstawowa leaf168= new JednostkaPodstawowa("Pawłowski","Pomocnik");
                 JednostkaPodstawowa leaf169= new JednostkaPodstawowa("Udovicic","Napastnik");
                 JednostkaPodstawowa leaf1610= new JednostkaPodstawowa("Sanogo","Napastnik");
                 JednostkaPodstawowa leaf1611= new JednostkaPodstawowa("Ivanauskas","Trener");
                 organizacja14.dodaj(ekstraklasa14);
                 ekstraklasa14.dodaj(zaglebie);
                 zaglebie.dodaj(leaf161);
                 zaglebie.dodaj(leaf162);
                zaglebie.dodaj(leaf163);
                 zaglebie.dodaj(leaf160);
                 zaglebie.dodaj(leaf164);
                 zaglebie.dodaj(leaf165);
                 zaglebie.dodaj(leaf166);
                 zaglebie.dodaj(leaf167);
                 zaglebie.dodaj(leaf168);
                 zaglebie.dodaj(leaf169);
                 zaglebie.dodaj(leaf1610);
                 zaglebie.dodaj(leaf1611);
                 wyb=0;
                 while(wyb!=3){
                       System.out.println("\nWybrany klub to Zagłebie Sosnowiec\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja14.wypiszInfo();
                      }
                      else if(wyb==2){
                      zaglebie.sprawdzUstawienie();
                      }
                    }
                    break;
                    case 15:
                    JednostkaOrganizacyjna organizacja15= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa15= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna gornik= new JednostkaOrganizacyjna("Górnik Zabrze","Klub");
                 JednostkaPodstawowa leaf171= new JednostkaPodstawowa("Chudy","Bramkarz");
                 JednostkaPodstawowa leaf172= new JednostkaPodstawowa("Wisniewski","Obrońca");
                 JednostkaPodstawowa leaf173= new JednostkaPodstawowa("Bochniewicz","Obrońca");
                 JednostkaPodstawowa leaf170= new JednostkaPodstawowa("Sekulic","Obrońca");
                 JednostkaPodstawowa leaf174= new JednostkaPodstawowa("Gryszkiewicz","Obrońca");
                 JednostkaPodstawowa leaf175= new JednostkaPodstawowa("Matras","Pomocnik");
                 JednostkaPodstawowa leaf176= new JednostkaPodstawowa("Zapolnik","Pomocnik");
                 JednostkaPodstawowa leaf177= new JednostkaPodstawowa("Gvilia","Pomocnik");
                 JednostkaPodstawowa leaf178= new JednostkaPodstawowa("Żurkowski","Pomocnik");
                 JednostkaPodstawowa leaf179= new JednostkaPodstawowa("Jimenez","Pomocnik");
                 JednostkaPodstawowa leaf1710= new JednostkaPodstawowa("Angulo","Napastnik");
                 JednostkaPodstawowa leaf1711= new JednostkaPodstawowa("Brosz","Trener");
                 organizacja15.dodaj(ekstraklasa15);
                 ekstraklasa15.dodaj(gornik);
                 gornik.dodaj(leaf171);
                 gornik.dodaj(leaf172);
                gornik.dodaj(leaf173);
                 gornik.dodaj(leaf170);
                 gornik.dodaj(leaf174);
                 gornik.dodaj(leaf175);
                 gornik.dodaj(leaf176);
                 gornik.dodaj(leaf177);
                 gornik.dodaj(leaf178);
                 gornik.dodaj(leaf179);
                 gornik.dodaj(leaf1710);
                 gornik.dodaj(leaf1711);
                  wyb=0;
                 while(wyb!=3){
                      System.out.println("\nWybrany klub to Górnik Zabrze\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja15.wypiszInfo();
                      }
                      else if(wyb==2){
                      gornik.sprawdzUstawienie();
                      }
                    }
                    break;
                    case 16:
                    JednostkaOrganizacyjna organizacja16= new JednostkaOrganizacyjna("UEFA","Organizacja");
                 JednostkaOrganizacyjna ekstraklasa16= new JednostkaOrganizacyjna("Ekstraklasa","Liga");
                 JednostkaOrganizacyjna arka= new JednostkaOrganizacyjna("Arka Gdynia","Klub");
                 JednostkaPodstawowa leaf181= new JednostkaPodstawowa("Steinbors","Bramkarz");
                 JednostkaPodstawowa leaf182= new JednostkaPodstawowa("Maghoma","Obrońca");
                 JednostkaPodstawowa leaf183= new JednostkaPodstawowa("Zbozień","Obrońca");
                 JednostkaPodstawowa leaf180= new JednostkaPodstawowa("Helstrup","Obrońca");
                 JednostkaPodstawowa leaf184= new JednostkaPodstawowa("Marciniak","Obrońca");
                 JednostkaPodstawowa leaf185= new JednostkaPodstawowa("Deja","Pomocnik");
                 JednostkaPodstawowa leaf186= new JednostkaPodstawowa("Vejinovic","Pomocnik");
                 JednostkaPodstawowa leaf187= new JednostkaPodstawowa("Nalepa","Pomocnik");
                 JednostkaPodstawowa leaf188= new JednostkaPodstawowa("Janota","Napastnik");
                 JednostkaPodstawowa leaf189= new JednostkaPodstawowa("Aankour","Napastnik");
                 JednostkaPodstawowa leaf1810= new JednostkaPodstawowa("Jankowski","Napastnik");
                 JednostkaPodstawowa leaf1811= new JednostkaPodstawowa("Zieliński","Trener");
                 organizacja16.dodaj(ekstraklasa16);
                 ekstraklasa16.dodaj(arka);
                 arka.dodaj(leaf181);
                 arka.dodaj(leaf182);
                arka.dodaj(leaf183);
                 arka.dodaj(leaf180);
                 arka.dodaj(leaf184);
                 arka.dodaj(leaf185);
                 arka.dodaj(leaf186);
                 arka.dodaj(leaf187);
                 arka.dodaj(leaf188);
                 arka.dodaj(leaf189);
                 arka.dodaj(leaf1810);
                 arka.dodaj(leaf1811);
                  wyb=0;
                 while(wyb!=3){
                      System.out.println("\nWybrany klub to Arka Gdynia\n1.Informacje o Klubie\n2.Aktualnie grana formacja\n3.Wyjscie");
                      wyb=in.nextInt();
                      if(wyb==1){
                      organizacja16.wypiszInfo();
                      }
                      else if(wyb==2){
                      arka.sprawdzUstawienie();
                      }
                    }
                    break;
         }
       
          System.out.println("Wybierz zespół\n 1.Lechia Gdańsk \n2.Piast Gliwice\n3.Zagłębie Lubin\n4.Pogoń Szczecin \n5.Legia Warszawa \n6.Cracovia\n7.Jagiellonia Białystok\n8.Lech Poznań\n9.Wisła Kraków\n10.Wisła Płock\n11.Korona Kielce\n12.Śląsk Wrocław\n13.Miedź Legnica\n14.Zagłębie Sosnowiec\n15.Górnik Zabrze\n16.Arka Gdynia\n0.Exit");
}while(a!=0);     
        System.out.println("Dziekuje za skorzystanie z programu");
}
    
}
