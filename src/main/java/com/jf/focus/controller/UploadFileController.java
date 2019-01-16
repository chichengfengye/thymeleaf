package com.jf.focus.controller;

import com.jf.focus.dto.ReturnResult;
import com.jf.focus.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class UploadFileController {
    @Autowired
    private UploadFileService uploadFileService;

    @RequestMapping("/userPage")
    public String getUserPage(){
        return "/userInfo";
    }

    /**
     * 上传用户图片
     * @param multipartFile
     * @return
     * @throws IOException
     */
    @RequestMapping("/usr/uploadFile")
    @ResponseBody
    public ReturnResult uploadFile(MultipartFile multipartFile) throws IOException {
        ReturnResult returnResult;
        if (!multipartFile.isEmpty()) {
            ReturnResult res = uploadFileService.saveFile(multipartFile);
            return res;
        }
        return ReturnResult.FAILUER();

    }
}
