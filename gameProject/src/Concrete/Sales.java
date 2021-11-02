package Concrete;

import Abstracts.BaseSales;
import Abstracts.IGameOffers;
import Entities.Player;

public class Sales extends BaseSales implements IGameOffers {

	@Override
	public void addOffers(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName() +" adl� oyuncu i�in kampanya eklenmi�tir.");
		
	}

	@Override
	public void deleteOffers(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName() +" adl� oyuncunun kampanyas� silinmi�tir.");
		
	}

	@Override
	public void updateOffers(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName() +" adl� oyuncunun kampanyas� g�ncellenmi�tir.");
		
	}
	
}
