package dao.impl;

import dao.DAO;
import dao.PersonDAO;
import domain.Person;

public class PersonDAOImpl extends DAO<Person> implements PersonDAO {

	@Override
	public void save(Person person) {
		// TODO Auto-generated method stub

		String sql = "INSERT INTO persons VALUES(?,?,?,?,?,?,?,?,?,?)";
		update(sql,person.getId(),person.getUsername(),person.getPassword()
				,person.getBirth(),person.getEducation(),person.getLocation()
				,person.getEmail(),person.getAddress(),person.getTel()
				,person.getTip()); 
	}

}
