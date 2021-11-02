package Abstracts;

import Entities.Player;

public class BaseSales {
	public void sale(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName() +" için satýþ iþlemi yapýlacaktýr.");
	}
}
