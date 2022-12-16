package dao;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {
	
		T get(long id);
	    
	    List<T> getAll();
	    
	    void save(T t);
	    
	    void update(T t, String name , String prenom , String adresse , String phone);
	    
	    void delete(T t);

}
