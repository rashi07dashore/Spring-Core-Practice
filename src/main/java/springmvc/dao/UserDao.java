package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.model.User;

@Repository          //creates object and injects where ever needed (work of Dao)
public class UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional          //allows writing mode too in hibernate. By default it has read only mode
	public int saveUser(User user) 
	{
		int id = (Integer)this.hibernateTemplate.save(user);
		return id;
	}
}
