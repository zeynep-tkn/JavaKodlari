import java.util.Scanner;
public class SayilarinToplamiFonk {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("Bir sayi girin:");
		int sayi=input.nextInt();
		System.out.println("sonuc="+toplaFonk(sayi));
		

	}

    public static int toplaFonk(int x) {
    	int toplam=0;
    	for(int i=1;i<=x;i++) {
    		toplam=toplam+i;
    	}
    	return toplam;
    		
    }
    
}
