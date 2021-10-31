package org.zerock.domain;

import java.util.Date;

public class GoodsVO {
	/* 상품 id */
	private int goodsId;
	
	/* 상품 이름 */
	private String goodsName;
	
	/* 카테고리 코드 */
	private String cateCode;
	
	/* 카테고리 이름 */
	private String cateName;
	
	/* 상품 가격 */
	private int goodsPrice;
	
	/* 상품 재고 */
	private int goodsStock;
	
	/* 상품 소개 */
	private String goodsIntro;
	
	/* 상품 목차 */
	private String goodsContents;
	
	/* 등록 날짜 */
	private Date regDate;
	
	/* 수정 날짜 */
	private Date updateDate;
	
}
