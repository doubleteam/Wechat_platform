package cn.sunshine.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import cn.sunshine.dao.VipDao;
import cn.sunshine.domain.Vip;

@Repository
public class VipDaoImpl extends BaseDaoImpl<Vip> implements VipDao {

	public VipDaoImpl(){
		super.setNs("mapper.VipMapper");
	}

	@Override
	public Vip getVipId(String vuuid) {
		return super.getSqlSession().selectOne(this.getNs()+".getVipId", vuuid);
	}


	@Override
	public void deleteByVuuid(String vuuid) {
		super.getSqlSession().delete(this.getNs()+".deleteByVuuid", vuuid);
	}
	
}
