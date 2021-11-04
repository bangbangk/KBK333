package org.zerock.service;

import java.util.List;

import org.zerock.domain.CategoryVO;
import org.zerock.domain.GoodsVO;

public interface GoodsService {
	//카테고리
	public List<CategoryVO> category() throws Exception;
	
	//상품목록
	public List<GoodsVO> list() throws Exception;

}
