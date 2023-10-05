package com.no3.gameproject.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.util.UUID;

@Service
@Log4j2
public class FileService {

    public String uploadFile(String uploadPath, String originalFileName, byte[] fileData) throws Exception{
        UUID uuid = UUID.randomUUID(); // 서로 다른 개체들을 구별하기 위해서 이름을 부여할 때 사용

        String extension = originalFileName.substring(originalFileName.lastIndexOf("."));
        String savedFileName = uuid.toString() + extension; // UUID로 받은 값과 원래 파일이름의 확장자를 조합해서 저장될 파일 이름을 만듦
        String fileUploadFullUrl = uploadPath + "/" + savedFileName;

        FileOutputStream fos = new FileOutputStream(fileUploadFullUrl);

        fos.write(fileData);
        fos.close();

        return savedFileName;
    }
}
