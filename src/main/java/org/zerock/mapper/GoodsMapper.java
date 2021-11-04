package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.CategoryVO;
import org.zerock.domain.GoodsVO;

public interface GoodsMapper {
	public List<CategoryVO> category();
	
	public List<GoodsVO> list();
	
}
