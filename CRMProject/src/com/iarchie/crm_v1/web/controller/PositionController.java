// 
// 
// 

package com.iarchie.crm_v1.web.controller;

import java.util.HashMap;
import com.github.pagehelper.PageHelper;
import java.util.Map;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import com.iarchie.crm_v1.domain.Position;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.service.IPositionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "/position" })
public class PositionController
{
    @Autowired
    private IPositionService positionService;
    
    @RequestMapping({ "/positionView" })
    public String showPosition() {
        return "position/position";
    }
    
    @RequestMapping(value = { "/positionDelete" }, method = { RequestMethod.GET })
    @ResponseBody
    public String delete(@RequestParam("id") final Long id) {
        System.out.println("id = " + id);
        final int index = this.positionService.deleteByPrimaryKey(id);
        if (index > 0) {
            return "success";
        }
        return "error";
    }
    
    @RequestMapping(value = { "/positionAdd" }, method = { RequestMethod.POST })
    @ResponseBody
    public String positionAdd(@RequestBody final Position position) {
        final int insert = this.positionService.insert(position);
        if (insert > 0) {
            return "success";
        }
        return "error";
    }
    
    @RequestMapping({ "/positionOption" })
    @ResponseBody
    public List<Position> positionOption(final String keyword) {
        final List<Position> positions = this.positionService.selectAll(keyword);
        return positions;
    }
    
    @RequestMapping({ "/addView" })
    public String positionAddView() {
        return "position/positionAdd";
    }
    
    @RequestMapping(value = { "/positionList" }, method = { RequestMethod.GET })
    @ResponseBody
    public Map<String, Object> positionList(@RequestParam("page") int page, @RequestParam("limit") final int limit, final String keyword) {
        System.out.println("keyword = " + keyword);
        final List<Position> countPos = this.positionService.selectAll(keyword);
        if (page < 0) {
            page = 1;
        }
        PageHelper.startPage(page, limit);
        final List<Position> resultData = this.positionService.selectAll(keyword);
        final Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("code", 0);
        resultMap.put("msg", "");
        resultMap.put("count", resultData.size());
        resultMap.put("data", resultData);
          
        return resultMap;
    }
}
