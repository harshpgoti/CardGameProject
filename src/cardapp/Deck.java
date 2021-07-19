/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardapp;

import java.util.Arrays;
import java.util.List;


public class Deck {

    private List<Card> cards = Arrays.asList(GenerateCard.getCards());
    private int emptyDeck = 0;
    public void print() {
        for(Card c: cards) {
            System.out.println(c);
        }
    }
    public List<Card> getCards(){
        return cards;
    }
    public void setCards(List<Card> cards){
    
        this.cards = cards;
    }
    public boolean checkDeck(){
        emptyDeck = 0;
        for(int i=0;i<52;i++){
            if(cards.get(i).getSuit()==null){
                emptyDeck++;
            }
        }
        
        if(emptyDeck == 52){
            return false;
        }
        return true;
    }
}