package Concrete;

import Abstracts.BaseGameManager;
import Abstracts.IPlayerCheckService;
import Entities.Player;

public class GameManager extends BaseGameManager {
	private IPlayerCheckService _checkService;
	
	
	public GameManager(IPlayerCheckService _checkService) {
		super();
		this._checkService = _checkService;
	}
	

	@Override
	public void save(Player player) {
		if(_checkService.playerCheck(player)) {
			super.save(player);
		}else {
			System.out.println("Not a valid");
		}
		
	}
	
	
}
