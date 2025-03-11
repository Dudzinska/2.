package Tasks;
import java.util.Scanner;
import java.util.Random;
public class Task {
    public Task(int wybor) {}
    public void zadanie1() {
        int studenci=0,suma=0,ocena=0,licz=0;
        float srednia=0;
        System.out.print("podaj liczbe studentow: ");
        Scanner input = new Scanner(System.in);
        studenci=input.nextInt();
        licz=studenci;
        if(studenci<0){
            System.out.print("Podano zla ilosc.");
        }else{
            while(licz>0){
                System.out.print("Podaj ocene studenta: ");
                ocena=input.nextInt();
                if(ocena>0&&ocena<=10){
                    suma=suma+ocena;
                }else{
                    System.out.print("zla liczba");
                }
                licz--;
            }
            srednia=suma/studenci;
            System.out.print("srednia wynosi: "+srednia);
        }
    }
    public void zadanie2(){
        int liczba=0,licz_U=0,licz_D=0,suma_U=0,suma_D=0;
        for(int i=0;i<10;i++){
            System.out.print("\npodaj liczbe: ");
            Scanner input = new Scanner(System.in);
            liczba=input.nextInt();
            if(liczba<0){
                licz_U++;
                suma_U=suma_U+liczba;
            }else{
                licz_D++;
                suma_D=suma_D+liczba;
            }
        }
        System.out.print("Suma liczb ujemnych to: "+suma_U+" ,ilosc liczb ujemnych to: "+licz_U+"\n");
        System.out.print("Suma liczb dodatnich to: "+suma_D+" ilosc liczb dodatnich to: "+licz_D);
    }
    public void zadanie3(){
        int elementy=0,liczba=0,suma=0;
        System.out.print("Podaj liczbe elementow ciagu (n>0): ");
        Scanner input = new Scanner(System.in);
        elementy=input.nextInt();
        do{
            System.out.print("\nPodaj liczbe ciagu: ");
            liczba=input.nextInt();
            if(liczba%2==0){
                suma+=liczba;
            }
            elementy--;
        }while(elementy>0);
        System.out.print("\nSrednia liczb parzystych ciagu to: "+suma);
    }
    public void zadanie4() {
        int IloscLiczb, WylosowanaLiczba = 0, suma = 0;
        System.out.print("Podaj ilosc liczb do losowania: ");
        Scanner input = new Scanner(System.in);
        IloscLiczb = input.nextInt();
        if (IloscLiczb <= 0) {
            System.out.print("\nNie wylosowano zadnych liczb.");
        }else{
            do{
                //losowanie liczby
                Random rand = new Random();
                WylosowanaLiczba = rand.nextInt(51)-10;
                System.out.print("\nWylosowana liczba z zakresu: [-10;45]: "+WylosowanaLiczba);

                if (WylosowanaLiczba % 2 == 0) {
                    suma += WylosowanaLiczba;
                }
                IloscLiczb--;
            } while (IloscLiczb > 0);
            System.out.print("\nsuma liczb wylosowanych, parzystych to: " + suma);
        }
    }
    public boolean zadanie5(){
        String Slowo,BezSpacji;
        int DlugoscSlowa;
        System.out.print("\nPodaj slowo do sprawdzenia czy jest Palindromem: " );
        Scanner input = new Scanner(System.in);
        Slowo = input.nextLine();
        //System.out.print("\nPodane slowo:"+Slowo);
        DlugoscSlowa =Slowo.length();
        //System.out.print("\nznakow jest:"+DlugoscSlowa);
        BezSpacji=Slowo.replace(" ","");
        int dlugosc = BezSpacji.length();
        for (int i = 0; i <DlugoscSlowa/2; i++) {
            if (BezSpacji.charAt(i) != BezSpacji.charAt(dlugosc - 1 - i)) {
                System.out.print("Slowo nie jest Palindromem" );
                return false;
            }else{
            }
        }
        System.out.print("Slowo jest Palindromem" );
        return false;
    }
}