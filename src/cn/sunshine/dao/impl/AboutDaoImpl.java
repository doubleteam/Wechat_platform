package cn.sunshine.dao.impl;

import org.springframework.stereotype.Repository;

import cn.sunshine.dao.AboutDao;
import cn.sunshine.domain.About;

@Repository
public class AboutDaoImpl extends BaseDaoImpl<About> implements AboutDao {

	public AboutDaoImpl(){
		super.setNs("mapper.AboutMapper");
	}
}
