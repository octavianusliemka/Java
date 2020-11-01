
public class Books {

	private String category;
	private String name;
	private int totalPages;
	
	public String getCategory() {
		return category;
	}
	
	public boolean setCategory(String category) {
		
		//Validating category
		if(!category.equals("Comedy") && !category.equals("Romance") && !category.equals("Fiction")) {
			return false;
		}
		
		this.category = category;
		return true;
		
	}
	
	public String getName() {
		return name;
	}
	
	public boolean setName(String name) {
		
		//Validating length of name
		if (name.length() < 5 || name.length() > 15) {
			return false;
		}
		
		this.name = name;
		return true;
	}
	
	public int getTotalPages() {
		return totalPages;
	}
	
	public boolean setTotalPages(int totalPages) {
		
		//Validating total pages
		if(totalPages < 50) {
			return false;
		}
		
		this.totalPages = totalPages;
		return true;
		
	}
	
	public int getBasePrice() {
		
		int basePrice = 0;
		
		if(this.category.equals("Comedy")) {
			basePrice = 55000;
		}else if(this.category.equals("Romance")) {
			basePrice = 58000;
		}else if(this.category.equals("Fiction")) {
			basePrice = 60000;
		}
		
		return basePrice;
		
	}
	
	public int getAdditionalPrice() {
		
		int additionalPrice = 0;
		
		if(this.totalPages >= 50 && this.totalPages < 100) {
			additionalPrice = this.getBasePrice() / 10 / 100;
		}else if(this.totalPages >= 100 && this.totalPages < 150) {
			additionalPrice = this.getBasePrice() * 20 / 100;
		}else if(this.totalPages >= 150) {
			additionalPrice = this.getBasePrice() * 30 / 100;
		}
		
		return additionalPrice;
		
	}
	
	public int getTotalPrice() {
		return this.getBasePrice() + this.getAdditionalPrice();
	}
	
}
