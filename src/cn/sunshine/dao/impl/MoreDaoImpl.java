package cn.sunshine.dao.impl;

import org.springframework.stereotype.Repository;

import cn.sunshine.dao.MoreDao;
import cn.sunshine.domain.More;

@Repository
public class MoreDaoImpl extends BaseDaoImpl<More> implements MoreDao {

	public MoreDaoImpl(){
		super.setNs("mapper.MoreMapper");
	}
}
