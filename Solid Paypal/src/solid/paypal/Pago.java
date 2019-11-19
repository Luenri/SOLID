/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.paypal;

/**
 *
 * @author Luis
 */
public interface Pago {
    
    public void pay_card(Card card, Book book);
    public void pay_cash(String money, Book book);
    public void pay_paypal(Book book);
}
