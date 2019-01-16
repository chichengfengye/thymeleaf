package com.jf.focus.service.impl;

import com.jf.focus.dto.ReturnResult;
import com.jf.focus.mapper.UploadFileMapper;
import com.jf.focus.model.UserFileModel;
import com.jf.focus.service.UploadFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;

@Service
public class UploadServiceImpl implements UploadFileService {
    private String filepath = "/usr/local/image/";

    private String username = "jf";

    @Autowired
    private UploadFileMapper uploadFileMapper;

    public UploadServiceImpl(){
        System.out.println("UploadServiceImpl init...");
    }

    @Override
    public ReturnResult saveFile(MultipartFile multipartFile) throws IOException {
        String contentType = multipartFile.getContentType();
        String fileName = multipartFile.getName();
        byte[] datas = multipartFile.getBytes();
        String originFilwName = multipartFile.getOriginalFilename();
        Long size = multipartFile.getSize();

        UserFileModel userFileModel = new UserFileModel();
        userFileModel.setUserName("asd");
        userFileModel.setCreateTime(new Date());
        userFileModel.setStutas(1);
        userFileModel.setType(1);
        userFileModel.setVersion(1);
        userFileModel.setFilePath(filepath+username+"/"+fileName);
        userFileModel.setReqUrl("asdsadsad");

        uploadFileMapper.saveUserFile(userFileModel);

        return ReturnResult.SUCCESS();
    }

}
