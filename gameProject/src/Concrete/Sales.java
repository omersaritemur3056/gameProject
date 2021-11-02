package Concrete;

import Abstracts.BaseSales;
import Abstracts.IGameOffers;
import Entities.Player;

public class Sales extends BaseSales implements IGameOffers {

	@Override
	public void addOffers(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName() +" adlý oyuncu için kampanya eklenmiþtir.");
		
	}

	@Override
	public void deleteOffers(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName() +" adlý oyuncunun kampanyasý silinmiþtir.");
		
	}

	@Override
	public void updateOffers(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName() +" adlý oyuncunun kampanyasý güncellenmiþtir.");
		
	}
	
}
