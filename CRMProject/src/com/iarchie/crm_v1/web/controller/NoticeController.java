// 
// 
// 

package com.iarchie.crm_v1.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import com.iarchie.crm_v1.domain.User;
import com.iarchie.crm_v1.context.UserContext;
import org.springframework.web.bind.annotation.RequestBody;
import com.iarchie.crm_v1.domain.DocTest;
import java.util.List;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.service.IDocTestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "/notice" })
public class NoticeController
{
    @Autowired
    private IDocTestService docTestService;
    
    @RequestMapping({ "/noticeView" })
    public String noticeView(final Model model, Integer pageIndex) {
        final int pageSize = 5;
        if (pageIndex == null) {
            pageIndex = 1;
        }
        PageHelper.startPage((int)pageIndex, pageSize);
        final List<DocTest> docTests = this.docTestService.selectAll();
        final PageInfo<DocTest> personPageInfo = (PageInfo<DocTest>)new PageInfo((List)docTests);
        final List<DocTest> pageList = (List<DocTest>)personPageInfo.getList();
        model.addAttribute("docList", (Object)pageList);
        model.addAttribute("page", (Object)personPageInfo);
        return "notice/notice";
    }
    
    @RequestMapping({ "/addView" })
    public String updateOrAddView() {
        return "notice/noticeAddOrUpdate";
    }
    
    @RequestMapping(value = { "/noticeAdd" }, method = { RequestMethod.POST })
    @ResponseBody
    public String noticeAdd(@RequestBody final DocTest docTest) {
        final User user = UserContext.getCurrentUser();
        docTest.setUseraction(user.getLoginname());
        final int insert = this.docTestService.insert(docTest);
        System.out.println(insert);
        if (insert < 0) {
            return "error";
        }
        return "success";
    }
    
    @RequestMapping(value = { "/noticeDelete" }, method = { RequestMethod.GET })
    @ResponseBody
    public ModelAndView delete(@RequestParam("id") final Long id, final ModelAndView mv) {
        if (id != null) {
            this.docTestService.deleteByPrimaryKey(id);
        }
        mv.setViewName("redirect:noticeView");
        return mv;
    }
}
