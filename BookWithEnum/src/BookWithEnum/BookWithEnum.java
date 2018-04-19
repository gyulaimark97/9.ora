package BookWithEnum;

public class BookWithEnum extends Book{
	public enum styles{
		 SCIFI, COOK, ROMANCE, OTHER
	}
	private String style;
	
	public BookWithEnum(String author,String title,int realeseyear, double price, String style)
	{
		super(author,title,realeseyear,price);
		this.style=style;
	}
	
	public String toString() {
		return super.toString() +" style: "+style;
	}
	
	public String getStyle() {
		return style;
	}
}
