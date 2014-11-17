package cn.sunshine.dao;

import java.util.List;

import cn.sunshine.domain.Vip;

public interface VipDao extends BaseDao<Vip> {

	public Vip getVipId(String vuuid);	
	public void deleteByVuuid(String vuuid);

}
