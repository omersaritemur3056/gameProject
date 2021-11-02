package Abstracts;

import Entities.Player;

public class BaseGameManager implements IGameService {
	public void add(Player player) {
		System.out.println("oyuncu eklendi");
	}
	
	public void delete(Player player) {
		System.out.println("Oyuncu silindi");
	}
	
	public void update(Player player) {
		System.out.println("Oyuncunun güncellendi");
	}

	@Override
	public void save(Player player) {
		System.out.println("Saved to game : " + player.getFirstName() + " " + player.getLastName());
	}
}
