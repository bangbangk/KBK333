package org.zerock.domain;

public class CategoryVO {
	private String cateName;
	private int cateCode;
	private int cateCodeRef;
	private int level;
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public int getCateCode() {
		return cateCode;
	}
	public void setCateCode(int cateCode) {
		this.cateCode = cateCode;
	}
	public int getCateCodeRef() {
		return cateCodeRef;
	}
	public void setCateCodeRef(int cateCodeRef) {
		this.cateCodeRef = cateCodeRef;
	}
}
