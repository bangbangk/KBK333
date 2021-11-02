<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/css/admin/goodsEnroll.css">
 
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
  <script src="https://cdn.ckeditor.com/ckeditor5/31.0.0/classic/ckeditor.js"></script>
</head>
</head>
<body>
 
    <%@include file="../includes/admin/header.jsp" %>
                <div class="admin_content_wrap">
                    <div class="admin_content_main">
                    	<form action="/admin/goodsEnroll" method="post" id="enrollForm">
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>제품 이름</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="goodsName">
                    			</div>
                    		</div>           
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품 카테고리</label>
                    			</div>
                    			<div class="form_section_content">
	                    			<div class="cate_wrap">
										<span>1차 분류</span>
										<select class="cate1">
											<option selected value="none">선택</option>
										</select>
									</div>
									<div class="cate_wrap">
										<span>2차 분류</span>
										<select class="cate2">
											<option selected value="none">선택</option>
										</select>
									</div>
								</div>							
                    		</div>          
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품 가격</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="goodsPrice" value="0">
                    			</div>
                    		</div>               
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품 재고</label>
                    			</div>
                    			<div class="form_section_content">
                    				<input name="goodsStock" value="0">
                    			</div>
                    		</div>    		
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품 요약</label>
                    			</div>
                    			<div class="form_section_content">
                    				<textarea name="goodsIntro" id="goodsIntro_textarea"></textarea>
                    			</div>
                    		</div>        		
                    		<div class="form_section">
                    			<div class="form_section_title">
                    				<label>상품 내용</label>
                    			</div>
                    			<div class="form_section_content">
                    				<textarea name="goodsContents" id="goodsContents_textarea"></textarea>
                    			</div>
                    		</div>
                   		</form>
                   			<div class="btn_section">
                   				<button id="cancelBtn" class="btn">취 소</button>
	                    		<button id="enrollBtn" class="btn enroll_btn">등 록</button>
	                    	</div> 
                    </div>  
                </div>
      <%@include file="../includes/admin/footer.jsp" %>
 
<script>

	let enrollForm = $("#enrollForm")
	
	/* 취소 버튼 */
	$("#cancelBtn").click(function(){
		
		location.href="/admin/goodsManage"
		
	});
	
	/* 상품 등록 버튼 */
	$("#enrollBtn").on("click",function(e){
		
		e.preventDefault();
		
		enrollForm.submit();
		
	});
	
	/* 위지윅 적용 */
	 
	/* 상품 소개 */
	ClassicEditor
		.create(document.querySelector('#goodsIntro_textarea'))
		.catch(error=>{
			console.error(error);
		});
		
	/* 상품 내용 */	
	ClassicEditor
		.create(document.querySelector('#goodsContents_textarea'))
		.catch(error=>{
			console.error(error);
	});
	
	/* $(document).ready(function(){
		console.log('${cateList}');
	}); */
	
	/* 카테고리 */
	let cateList = JSON.parse('${cateList}');
	
	let cate1Array = new Array();
	let cate2Array = new Array();
	let cate3Array = new Array();
	let cate1Obj = new Object();
	let cate2Obj = new Object();
	let cate3Obj = new Object();
	
	let cateSelect1 = $(".cate1");		
	let cateSelect2 = $(".cate2");
	
	/* 카테고리 배열 초기화 메서드 */
	function makeCateArray(obj,array,cateList, tier){
		for(let i = 0; i < cateList.length; i++){
			if(cateList[i].tier === tier){
				obj = new Object();
				
				obj.cateName = cateList[i].cateName;
				obj.cateCode = cateList[i].cateCode;
				obj.cateParent = cateList[i].cateParent;
				
				array.push(obj);				
				
			}
		}
	}	
	
	/* 배열 초기화 */
	makeCateArray(cate1Obj,cate1Array,cateList,1);
	makeCateArray(cate2Obj,cate2Array,cateList,2);
	makeCateArray(cate3Obj,cate3Array,cateList,3);
	/*
	$(document).ready(function(){
		console.log(cate1Array);
		console.log(cate2Array);
		console.log(cate3Array);
	});
	*/
	
	for(let i = 0; i < cate1Array.length; i++){
		cateSelect1.append("<option value='"+cate1Array[i].cateCode+"'>" + cate1Array[i].cateName + "</option>");
	}
	
	/* 2차분류 <option> 태그 */
	$(cateSelect1).on("change",function(){
		
		let selectVal1 = $(this).find("option:selected").val();	
		
		cateSelect2.children().remove();
		
		cateSelect2.append("<option value='none'>선택</option>");
		
		for(let i = 0; i < cate2Array.length; i++){
			if(selectVal1 === cate2Array[i].cateParent){
				cateSelect2.append("<option value='"+cate2Array[i].cateCode+"'>" + cate2Array[i].cateName + "</option>");	
			}
		}// for구문
		
	});
	
</script> 	
 
</body>
</html>
