package cn.sunshine.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sunshine.dao.MoreDao;
import cn.sunshine.dao.MoreDao;
import cn.sunshine.domain.More;
import cn.sunshine.service.MoreService;

@Service("moreService")
public class MoreServiceImpl implements MoreService {
	
	@Resource
	MoreDao moreDao;

	public List<More> find(Map paraMap) {
		return moreDao.find(paraMap);
	}

	public More get(Serializable id) {
		return moreDao.get(id);
	}

	public void insert(More more) {
		moreDao.insert(more);
	}

	public void update(More more) {
		moreDao.update(more);
	}

	public void deleteById(Serializable id) {
		moreDao.deleteById(id);
	}

	public void delete(Serializable[] ids) {
		moreDao.delete(ids);
	}
}
