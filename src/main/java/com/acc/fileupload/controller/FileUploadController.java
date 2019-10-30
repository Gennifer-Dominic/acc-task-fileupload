package com.acc.fileupload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.acc.fileupload.model.FileEntity;
import com.acc.fileupload.response.Response;
import com.acc.fileupload.service.FileUploadDaoImpl;

@RestController
public class FileUploadController {

    @Autowired
    private FileUploadDaoImpl fileUploadService;

    @PostMapping("/fileUpload")
    public Response uploadFile(@RequestParam("file") MultipartFile file) {
        
    	if(file!=null) {
    		FileEntity fileEntity = fileUploadService.uploadFile(file);
    		if(fileEntity!=null)
    			return new Response(fileEntity.getFileName(), "success",
    					file.getContentType(), file.getSize());
    		else
    			return new Response(file.getName(), "failed",
    					file.getContentType(), file.getSize());

    	}else
    		return new Response("Empty file recieved", "failed",
    				"", 0);
    	
    }

}
