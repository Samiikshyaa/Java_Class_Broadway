package abstraction;

import java.io.Serializable;
import java.util.List;

public interface UsersService extends CommonService, Serializable, List<String>{
	//by default abstract huncha ani private public haru rakhna mildaina
	
	//int Max = 800;// yo kkatai ni change hudaina
	
	
	void addUser();
	void deleteUser();
	
}
