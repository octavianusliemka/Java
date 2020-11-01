import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	
	public Main() {
		
		int chooseBook = 0;
		
		System.out.println("DeluXe Book Store");
		System.out.println("=================\n");
		
		do {
			System.out.println("Choose one of these items to buy");
			System.out.println("1. Regular Book");
			System.out.println("2. Premium Book");
			System.out.print(">> ");
			
			try {
				chooseBook = sc.nextInt();
			} catch (Exception e) {
				chooseBook = 0;
				sc.nextLine();
			}
			
		}while(chooseBook < 1 || chooseBook > 2);
		
		if(chooseBook == 1) {
			
			RegularBook newRegular = new RegularBook();
			
			String tempCategory;
			do {
				tempCategory = "";
				System.out.println("Input book's category[Comedy | Romance | Fiction]: ");
				tempCategory = sc.nextLine();
			}while(!newRegular.setCategory(tempCategory));
			
			String tempName;
			do {
				tempName = "";
				System.out.println("Input book's name[5 - 15 characters]: ");
				tempName = sc.nextLine();
			}while(!newRegular.setName(tempName));
			
			int tempPages;
			do {
				tempPages = 0;
				System.out.println("Input book's pages[more than or equals 50 pages]: ");
				
				try {
					tempPages = sc.nextInt();
				} catch (Exception e) {
					tempPages = 0;
					sc.nextLine();
				}
				
			}while(!newRegular.setTotalPages(tempPages));
			
			System.out.println("*=======================DeluXe Book Store==========================*");
			System.out.println("*==================================================================*");
			System.out.printf("| %-17s | %-12s | %-13s | %-13s |\n", "Name", "Category", "Total Pages", "Total Price");
			System.out.println("*==================================================================*");
			System.out.printf("| %-17s | %-12s | %-13d | %-13d |\n", newRegular.getName(), newRegular.getCategory(), newRegular.getTotalPages(), newRegular.getTotalPrice());
			System.out.println("*==================================================================*");
			
		}else if(chooseBook == 2) {
			
			PremiumBook newPremium = new PremiumBook();
			
			String tempCategory;
			do {
				tempCategory = "";
				System.out.println("Input book's category[Comedy | Romance | Fiction]: ");
				tempCategory = sc.nextLine();
			}while(!newPremium.setCategory(tempCategory));
			
			String tempName;
			do {
				tempName = "";
				System.out.println("Input book's name[5 - 15 characters]: ");
				tempName = sc.nextLine();
			}while(!newPremium.setName(tempName));
			
			int tempPages;
			do {
				tempPages = 0;
				System.out.println("Input book's pages[more than or equals 50 pages]: ");
				
				try {
					tempPages = sc.nextInt();
				} catch (Exception e) {
					tempPages = 0;
					sc.nextLine();
				}
				
			}while(!newPremium.setTotalPages(tempPages));
			
			String tempCover;
			do {
				tempCover = "";
				System.out.println("Input book's cover[Soft | Hard]: ");
				tempCover = sc.nextLine();
			}while(!newPremium.setBookCover(tempCover));
			
			System.out.println("*===========================DeluXe Book Store===============================*");
			System.out.println("*===========================================================================*");
			System.out.printf("| %-17s | %-12s | %-13s | %-9s | %-13s |\n", "Name", "Category", "Total Pages", "Cover", "Total Price");
			System.out.println("*===========================================================================*");
			System.out.printf("| %-17s | %-12s | %-13s | %-9s | %-13s |\n", newPremium.getName(), newPremium.getCategory(), newPremium.getTotalPages(), newPremium.getBookCover(), newPremium.getTotalPrice());
			System.out.println("*===========================================================================*");
			
		}
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
