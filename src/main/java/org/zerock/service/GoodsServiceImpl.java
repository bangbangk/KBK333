package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import org.zerock.mapper.GoodsMapper;
import org.zerock.domain.CategoryVO;
import org.zerock.domain.GoodsVO;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Inject
	private GoodsMapper dao;
	
	@Override
	public List<CategoryVO> category() throws Exception {
		
		return dao.category();
	}
	
	public List<GoodsVO> list() throws Exception{
		return dao.list();
	}
	
}
