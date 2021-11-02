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
	
	/* 상품 내용 */
	private String goodsContents;
	
	/* 등록 날짜 */
	private Date regDate;
	
	/* 수정 날짜 */
	private Date updateDate;

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getCateCode() {
		return cateCode;
	}

	public void setCateCode(String cateCode) {
		this.cateCode = cateCode;
	}

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public int getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public int getGoodsStock() {
		return goodsStock;
	}

	public void setGoodsStock(int goodsStock) {
		this.goodsStock = goodsStock;
	}

	public String getGoodsIntro() {
		return goodsIntro;
	}

	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro;
	}

	public String getGoodsContents() {
		return goodsContents;
	}

	public void setGoodsContents(String goodsContents) {
		this.goodsContents = goodsContents;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "GoodsVO [goodsId=" + goodsId + ", goodsName=" + goodsName + ", cateCode=" + cateCode + ", cateName="
				+ cateName + ", goodsPrice=" + goodsPrice + ", goodsStock=" + goodsStock + ", goodsIntro=" + goodsIntro
				+ ", goodsContents=" + goodsContents + ", regDate=" + regDate + ", updateDate=" + updateDate + "]";
	}
	
	
}
