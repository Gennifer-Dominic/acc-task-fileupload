package com.acc.fileupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.acc.fileupload.model.FileEntity;

@Repository
public interface FileUploadDao extends JpaRepository<FileEntity, String> {

}
