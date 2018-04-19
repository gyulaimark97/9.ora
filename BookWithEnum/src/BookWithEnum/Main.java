package BookWithEnum;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		BookWithEnum [] library=new BookWithEnum[3];
		
		
		for(int i=0; i<library.length;i++) {
			library[i]=new BookWithEnum(scan.next(),scan.next(),scan.nextInt(),scan.nextDouble(),scan.next());
		}
		libraryDeatails(library);
		
		BookWithEnum [] scifiBooks=getBooksWithThisStyle(library, "Scifi");
		libraryDeatails(scifiBooks);
		
		scan.close();
	}
	
	
	
	
	public static void libraryDeatails(BookWithEnum library[]) {
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i].toString());
		}
	}
	
	public static BookWithEnum[] getBooksWithThisStyle(BookWithEnum library[], String style) {
		int counter=0;
		for(int i=0;i<library.length;i++) {
			if(library[i].getStyle().equalsIgnoreCase(style)) {
				counter++;
				}
		}
		BookWithEnum [] booksWithGivenStyle=new BookWithEnum[counter];
		counter=0;
		for(int i=0;i<library.length;i++) {
			if(library[i].getStyle().equalsIgnoreCase(style)) {
				booksWithGivenStyle[counter]=library[i];
				counter++;
				}
			}
		return booksWithGivenStyle;
	}
}
