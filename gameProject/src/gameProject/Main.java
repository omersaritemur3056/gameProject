package gameProject;

import Adapters.MernisServiceAdapters;
import Concrete.GameManager;
import Concrete.Sales;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager(new MernisServiceAdapters());
		Player player = new Player();
		Sales sales = new Sales();
		
		player.setId(1);
		player.setFirstName("Ömer");
		player.setLastName("Sarýtemur");
		player.setYearOfBirth(1992);
		player.setNationalityId("51931157226");
		
		gameManager.save(player);
		sales.sale(player);
		sales.addOffers(player);
		
		
	}

}
