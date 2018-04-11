package com.java4all.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Author: momo
 * Date: 2018/4/11
 * Description:Thymeleaf页面测试
 */
@Controller
@RequestMapping("thymeleaf")
public class ThymeleafController {
    /**
     * 跳转到文件上传页面
     * @return
     */
    @RequestMapping(value = "upload",method = RequestMethod.GET)
    public String upload(){
        return "upload";
    }

    /**
     * 接收文件
     * @param file212
     * @return
     */
    @RequestMapping(value = "uploadBlog",method = RequestMethod.POST)
    @ResponseBody
    public String uploadBlog(MultipartFile file212){
        String originalFilename = file212.getOriginalFilename();
        String name = file212.getName();
        return "name:"+name+";=====================originalFilename:"+originalFilename;
    }
}
