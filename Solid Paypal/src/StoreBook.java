
import java.util.ArrayList;
import solid.paypal.Book;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CltControl
 */
class StoreBook {

	private ArrayList<Book> books;
	private Book book;
	
	
	public StoreBook() {
		/** 
		 * Initialize array with books
		 */
	}
	
	public void pay(String method, Book book) {
		if(method == "card") {
			pay_card("numberCard", book);
		}else if ( method == "cash") {
			pay_cash( "money", book);
		}
	}
	
	public void pay_card(String card, Book book) {
		/*
		 * change state to true
		 */
	}
	
	public void pay_cash(String money, Book book) {
		/*
		 * change state to true
		 */
	}
	
	public void removeBooksPurchased(ArrayList<Book> books) {
		/*
		 * store books with state true in new array and remove the original array
		 * 
		 */
	}
	

}


