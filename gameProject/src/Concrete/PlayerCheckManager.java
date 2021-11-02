package Concrete;

import Abstracts.IPlayerCheckService;
import Entities.Player;

public class PlayerCheckManager implements IPlayerCheckService {

	@Override
	public boolean playerCheck(Player player) {
		
		return true;
	}

}
