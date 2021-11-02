package org.zerock.mapper;

import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
	/* 작성자 등록 */
    public void enroll(BoardVO board);
}
