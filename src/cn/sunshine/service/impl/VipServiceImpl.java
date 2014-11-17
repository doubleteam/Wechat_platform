package cn.sunshine.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sunshine.dao.VipDao;
import cn.sunshine.domain.Vip;
import cn.sunshine.service.VipService;

@Service("vipService")
public class VipServiceImpl implements VipService{

	@Resource
	VipDao vipDao;
	
	@Override
	public List<Vip> find(Map paraMap) {
		return vipDao.find(paraMap);
	}

	@Override
	public Vip get(Serializable id) {
		return vipDao.get(id);
	}
	
	@Override
	public void insert(Vip vip) {
		vipDao.insert(vip);
	}

	@Override
	public void update(Vip vip) {
		vipDao.update(vip);
	}

	@Override
	public void deleteById(Serializable id) {
		vipDao.deleteById(id);
	}

	@Override
	public void delete(Serializable[] ids) {
		vipDao.delete(ids);
	}

	@Override
	public Vip getVipId(String vuuid) {
		return vipDao.getVipId(vuuid);
	}
	@Override
	public void deleteByVuuid(String vuuid) {
		vipDao.deleteByVuuid(vuuid);
	}

}
