package org.zerock.controller;



import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.Criteria;
import org.zerock.domain.GoodsVO;
import org.zerock.domain.PageDTO;
import org.zerock.service.AdminService;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/admin")
@Log4j
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	/* 관리자 메인 페이지 이동 */
    @RequestMapping(value="main", method = RequestMethod.GET)
    public void adminMainGET() throws Exception{
        
        log.info("관리자 페이지 이동");
        
    }
    
    /* 상품 관리 페이지 접속 */
    @RequestMapping(value = "goodsManage", method = RequestMethod.GET)
    public void goodsManageGET(Criteria cri, Model model) throws Exception{
        log.info("상품 관리 페이지 접속");
        
        /* 상품 리스트 데이터 */
		List list = adminService.goodsGetList(cri);
		
		if(!list.isEmpty()) {
			model.addAttribute("list", list);
		} else {
			model.addAttribute("listCheck", "empty");
			return;
		}
		
		/* 페이지 인터페이스 데이터 */
		model.addAttribute("pageMaker", new PageDTO(cri, adminService.goodsGetTotal(cri)));
    }
    
    /* 상품 등록 페이지 접속 */
    @RequestMapping(value = "goodsEnroll", method = RequestMethod.GET)
    public void goodsEnrollGET(Model model) throws Exception{
        log.info("상품 등록 페이지 접속");
        
        ObjectMapper objm = new ObjectMapper();
        
        List list = adminService.cateList();
        
        String cateList = objm.writeValueAsString(list);
        
        model.addAttribute("cateList", cateList);
        
        log.info("변경 전.........." + list);
		log.info("변경 후.........." + cateList);
    }
   
    
    /* 공지사항 관리 페이지 접속 */
    @RequestMapping(value = "noticeEnroll", method = RequestMethod.GET)
    public void authorManageGET() throws Exception{
        log.info("공지사항 페이지 접속");
    }
    
    /* 상품 등록 */
   	@PostMapping("/goodsEnroll")
   	public String goodsEnrollPOST(GoodsVO goods, RedirectAttributes rttr) {
   		
   		log.info("goodsEnrollPOST......" + goods);
   		
   		adminService.goodsEnroll(goods);
   		
   		rttr.addFlashAttribute("enroll_result", goods.getGoodsName());
   		
   		return "redirect:/admin/goodsManage";
   	}	
}
