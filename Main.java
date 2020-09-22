import java.util.GregorianCalendar;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    GregorianCalendar today = new GregorianCalendar();
    Random rand = new Random();

    int y = today.get(GregorianCalendar.YEAR);
    int m = today.get(GregorianCalendar.MONTH)+1;
    int d = today.get(GregorianCalendar.DATE);


    System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n",y,m,d);

    int k = rand.nextInt(5);
    System.out.print("오늘의 운세는 ");
    switch (k){
      case 0 : 
        System.out.println("대길"); break; 
      case 1 : 
        System.out.println("길");  break; 
      case 2 : 
        System.out.println("소길");  break; 
      case 3 : 
        System.out.println("흉");  break; 
      case 4 : 
      System.out.println("대흉");  break; 
      
    }


  }
}