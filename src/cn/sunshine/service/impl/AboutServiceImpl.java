package cn.sunshine.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sunshine.dao.AboutDao;
import cn.sunshine.domain.About;
import cn.sunshine.domain.About;
import cn.sunshine.service.AboutService;

@Service("aboutService")
public class AboutServiceImpl implements AboutService {

	@Resource
	AboutDao aboutDao;
	
	public List<About> find(Map paraMap) {
		return aboutDao.find(paraMap);
	}

	public About get(Serializable id) {
		return aboutDao.get(id);
	}

	public void insert(About about) {
		aboutDao.insert(about);
	}

	public void update(About about) {
		aboutDao.update(about);
	}

	public void deleteById(Serializable id) {
		aboutDao.deleteById(id);
	}

	public void delete(Serializable[] ids) {
		aboutDao.delete(ids);
	}

}
