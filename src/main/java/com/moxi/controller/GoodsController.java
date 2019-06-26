package com.moxi.controller;

import com.moxi.model.News;
import com.moxi.model.NewsCategory;
import com.moxi.model.ResObject;
import com.moxi.service.NewsCategoryService;
import com.moxi.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

@Controller

public class GoodsController {

	/**
	 * 文章分类列表
	 * @param newsCategory
	 * @param pageCurrent
	 * @param pageSize
	 * @param pageCount
	 * @param model
	 * @return
	 */
	@RequestMapping("/admin/goods_management_{pageCurrent}_{pageSize}_{pageCount}")
	public String newsCategoryManage(News news, @PathVariable Integer pageCurrent, @PathVariable Integer pageSize, @PathVariable Integer pageCount, Model model) {
		return "goods/goods_management";
	}
}
