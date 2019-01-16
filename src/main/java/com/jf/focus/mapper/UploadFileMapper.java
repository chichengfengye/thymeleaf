package com.jf.focus.mapper;

import com.jf.focus.model.UserFileModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UploadFileMapper {
    int saveUserFile(UserFileModel userFileModel);
}
