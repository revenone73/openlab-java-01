package cn.openlab.spring.dao;

import org.springframework.dao.DataAccessException;

import cn.openlab.hibernate.domain.Gender;

public interface GenderDao {

	Gender getGenderById(Integer id) throws DataAccessException;
	
	void saveGender(Gender gender) throws DataAccessException;
}
