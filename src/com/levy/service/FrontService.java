package com.levy.service;

import com.levy.paginate.Paginator;
import com.levy.model.TbArticle;
import com.levy.service.FrontCacheService;
import com.jfinal.plugin.activerecord.Page;
import com.levy.controler.BaseController;
import com.levy.model.Tbfolder;

public class FrontService extends BaseService
{
	//这是一个主菜单
		public void menu(BaseController controller) {
			Integer folderId = controller.getParaToInt();//获取URL请求中的urlpara参数
			if (folderId == null || folderId <= 0) {
				folderId = Tbfolder.ROOT;   //令FolderId为1
			}
			// 活动目录
			controller.setAttr("folders_selected", folderId);

			if (folderId == Tbfolder.ROOT) {
				home(controller);
			} else if (folderId == 90) {
				controller.redirect("/front/about");
			} else {
				// 其他
				otherMenu(controller, folderId);
			}

		}
		public void otherMenu(BaseController controller,Integer folderId){
			
		}
		public void home(BaseController controller){
//			// 首页图片 13
//			Page<TbArticle> topPics = new FrontCacheService().getArticle(new Paginator(1, 4), 13);
//			controller.setAttr("topPics", topPics);
//
//			// 最新动态
//			Page<TbArticle> newArticle = new FrontCacheService().getNewArticle(new Paginator(1, 10));
//			controller.setAttr("newArticles", newArticle);
//
//			// 新闻 2
//			Page<TbArticle> news = new FrontCacheService().getArticle(new Paginator(1, 10), 2);
//			controller.setAttr("news", news);
//
//			// 美食 3
//			Page<TbArticle> foods = new FrontCacheService().getArticle(new Paginator(1, 10), 3);
//			controller.setAttr("foods", foods);
//
//			// 旅游 4
//			Page<TbArticle> travels = new FrontCacheService().getArticle(new Paginator(1, 9), 4);
//			controller.setAttr("travels", travels);
//
//			// 教育 5
//			Page<TbArticle> educations = new FrontCacheService().getArticle(new Paginator(1, 10), 5);
//			controller.setAttr("educations", educations);
//
//			// seo：title优化
//	//		controller.setAttr(JFlyFoxUtils.TITLE_ATTR, JFlyFoxCache.getHeadTitle() + " - " + "北京市门头沟区最全面的生活、新闻、美食、旅游、教育资讯");

			controller.render("/pages/front/home/home.html");
		}
}
