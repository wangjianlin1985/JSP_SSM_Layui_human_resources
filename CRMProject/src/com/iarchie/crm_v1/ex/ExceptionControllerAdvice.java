// 
// 
// 

package com.iarchie.crm_v1.ex;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionControllerAdvice
{
    @ExceptionHandler({ Exception.class })
    @ResponseBody
    public String errorView(final Exception ex) {
        return "\u51fa\u73b0\u5f02\u5e38\u4e86" + ex.getMessage();
    }
}
