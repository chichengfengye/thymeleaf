package com.jf.focus.service;

import com.jf.focus.dto.ReturnResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.concurrent.RecursiveTask;

public interface UploadFileService {
    ReturnResult saveFile(MultipartFile multipartFile) throws IOException;
}
