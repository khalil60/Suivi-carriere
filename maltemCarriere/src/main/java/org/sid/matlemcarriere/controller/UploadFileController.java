package org.sid.matlemcarriere.controller;

import org.sid.matlemcarriere.dao.FileRepository;
import org.sid.matlemcarriere.entities.Employee;
import org.sid.matlemcarriere.entities.FileModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class UploadFileController {
	
	 @Autowired
	  FileRepository fileRepository;
	 
	    /*
	     * MultipartFile Upload
	     */
	    @PostMapping("/upload")
	    public String uploadMultipartFile(@RequestParam("uploadfile") MultipartFile file) {
	      try {
	        // save file to PostgreSQL
	        FileModel filemode = new FileModel(null, file.getOriginalFilename(), file.getContentType(), file.getBytes(), null);
	        fileRepository.save(filemode);
	        return "File uploaded successfully! -> filename = " + file.getOriginalFilename();
	    } catch (  Exception e) {
	      return "FAIL! Maybe You had uploaded the file before or the file's size > 500KB";
	    }    
	    }
	}
