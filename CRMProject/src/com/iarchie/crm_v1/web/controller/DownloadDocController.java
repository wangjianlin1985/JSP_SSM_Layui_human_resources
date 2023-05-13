// 
// 
// 

package com.iarchie.crm_v1.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.service.IDownloadService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "/download" })
public class DownloadDocController
{
    @Autowired
    private IDownloadService downloadService;
    
    @RequestMapping({ "/downloadView" })
    public String downView() {
        return "documentFile/fileDoc";
    }
    
    @RequestMapping({ "/uploadView" })
    public String uploadView() {
        return "documentFile/uploadFile";
    }
}
