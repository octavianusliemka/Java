
public class PremiumBook extends Books {

	private String bookCover;
	
	public PremiumBook() {
		// TODO Auto-generated constructor stub
	}

	public String getBookCover() {
		return bookCover;
	}

	public boolean setBookCover(String bookCover) {
		
		//Validating book cover soft/hard
		if(!bookCover.equals("Soft") && !bookCover.equals("Hard")) {
			return false;
		}
		
		this.bookCover = bookCover;
		return true;
		
	}
	
	public int getVariationPrice() {
		
		int variationPrice = 0;
		
		if(this.getBookCover().equals("Soft")) {
			variationPrice = 15000;
		}else if(this.getBookCover().equals("Hard")) {
			variationPrice = 10000;
		}
		
		return variationPrice;
	}
	
	@Override
	public int getTotalPrice() {
		return this.getBasePrice() + this.getAdditionalPrice() + this.getVariationPrice();
	}

}
