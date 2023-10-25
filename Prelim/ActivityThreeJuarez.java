import java.util.Scanner;
import java.util.Random;

public class ActivityThreeJuarez
{
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      Random random = new Random();
      int totalQty = 0;
      int qtyC1 = 0, qtyC2 = 0, qtyC3 = 0, qtyR1 = 0, qtyR2 = 0;
      int ttlC1 = 0, ttlC2 = 0, ttlC3 = 0, ttlR1 = 0, ttlR2 = 0;
      String orderName;
      int orderCode = random.nextInt(1000000);
      
      System.out.println("========= Menu ========= ");
      System.out.println("   1. C1 - Php 100.00   ");
      System.out.println("   2. C2 - Php 150.00   ");
      System.out.println("   3. C3 - Php 200.00   ");
      System.out.println("======= Add ons ======== ");
      System.out.println("   4. R1 - Php 35.00    ");
      System.out.println("   5. R2 - Php 50.00    ");
      
      
      while(true)
      {
         System.out.print("\nEnter your order or '00' to exit: ");
         String Order = scan.nextLine();
         if(Order.equals("00"))
         {
            System.out.println("Thank you for ordering!");
            break;
         }
      
         System.out.print("Enter quantity: " );
         int quanti = scan.nextInt();
         scan.nextLine();
      
         switch (Order)
         {
            case "1":
               orderName = "C1";
               ttlC1 += 100 * quanti;
               qtyC1 += quanti;
            break;
         
            case "2":
               orderName = "C2";
               ttlC2 += 150 * quanti;
               qtyC2 += quanti;
            break;
         
            case "3":
               orderName = "C3";
               ttlC3 += 200 * quanti;
               qtyC3 += quanti;
            break;
         
            case "4":
               orderName = "R1";
               ttlR1 += 35 * quanti;
               qtyR1 += quanti;
            break;
         
            case "5":
               orderName = "R2";
               ttlR2 += 50 * quanti;
               qtyR2 += quanti;
            break;
         
            default:
               System.out.println("Invalid Order!");
            continue;
         }
         totalQty += quanti;
         System.out.println("Your order " + orderName + " with quantity of " + quanti + " is added.");
      }
      
      float totalPrice = ttlC1 + ttlC2 + ttlC3 + ttlR1 + ttlR2;
      
      System.out.println("\n============================================");
      System.out.println("                 Fastfood Corp.           "); 
      System.out.println("        Sanciangko Street, Cebu City      ");
      System.out.println("        6000 Cebu City, Philippines       ");
      System.out.println("                +63 9123456789            ");
      System.out.println("============================================");
      System.out.println("     Item Name                  Price       ");
      System.out.println("============================================");
      System.out.println("\n     Item 1                       "  + ttlC1);
      System.out.println("         C1  *  " + qtyC1 );
      System.out.println("\n     Item 2                       "  + ttlC2);
      System.out.println("         C2  *  " + qtyC2  );
      System.out.println("\n     Item 3                       "  + ttlC3);
      System.out.println("         C3  *  " + qtyC3  );
      System.out.println("\n     Item 4                       "  + ttlR1);
      System.out.println("         R1  *  " + qtyR1 );
      System.out.println("\n     Item 5                       "  + ttlR2);
      System.out.println("         R2  *  " + qtyR2 );
      System.out.println("\n============================================");
      System.out.println("   Total Qty: " + totalQty);
      System.out.println("   Total Amount: Php " + totalPrice);
      System.out.println("   Total Amount in Dollars: $ " + totalPrice/56);
      System.out.println("============================================");
      System.out.println("   Order Number: " + orderCode);
      System.out.println("   Cashier: Erica Juarez" );
      System.out.println("============================================");
      System.out.println("     This serve as your Official Receipt.   ");
      System.out.println("       Thank you, and please come again.    ");
      System.out.println("        For feedback, please call us at     ");
      System.out.println("   (2) 898 7777 or text us at 09123456789   ");
      System.out.println("     Email: feedback@fastfoodcorp.com.ph    ");
      System.out.println("  Visit us also at www.fastfoodcorp.com.ph    ");
      System.out.println("============================================");
           
   }
}
