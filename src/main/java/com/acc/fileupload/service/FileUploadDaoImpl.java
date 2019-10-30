package com.acc.fileupload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.acc.fileupload.model.FileEntity;
import com.acc.fileupload.repository.FileUploadDao;

import java.io.IOException;

@Service
public class FileUploadDaoImpl {

    @Autowired
    private FileUploadDao fileUploadDao;

    public FileEntity uploadFile(MultipartFile file) {
       
    	String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
          
            FileEntity fileEntityObj = new FileEntity(fileName, file.getContentType(), file.getBytes());

            return fileUploadDao.save(fileEntityObj);
        } catch (IOException ex) {
        	System.out.println("Unable to save file -- > "+ ex);
        }
        
        
        return null;
    }

   
}
