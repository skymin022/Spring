package com.aloha.spring_response.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aloha.spring_response.util.MediaUtil;

import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletResponse;


@Slf4j
@Controller
@RequestMapping("/file")
public class FileController {
    
    /**
     * 이미지 썸네일
     * ✅ 요청 경로 : /file/img?filepath=C:/upload/sample.png
     * @param filepath
     * @param response
     * @throws IOException 
     */
    @GetMapping("/img")
    public void showImg(@RequestParam("filepath") String filepath
                        ,HttpServletResponse response) throws Exception {
        log.info("filepath : {}", filepath);
        // 업로드된 파일을 입력받아 클라이언트로 출력
        File file = new File(filepath);
        FileInputStream fis = new FileInputStream(file);
        ServletOutputStream sos = response.getOutputStream();
        FileCopyUtils.copy(fis, sos);

        // 이미지 썸네일로 응답이 되도록 헤더 세팅
        // - 확장자로 컨텐츠 타입 지정
        // ex) C:/upload/test.sample.png
        String ext = filepath.substring(filepath.lastIndexOf(".") + 1); //확장자
        MediaType mediaType = MediaUtil.getMediaType(ext);
        if ( mediaType == null ) { 
            // 기본 이미지를 출력 
            return;
        }
        log.info("mediaType: { }", mediaType);
        response.setContentType(mediaType.toString()); //image/png

    }

    // http://localhost:8080/file/img?filePath=C:/upload/sample.png
    // http://localhost:8080/file/download?filepath=C:/upload/sample.png
    @GetMapping("/download")
    public void fileDownload(@RequestParam("filePath") String filePath
                            ,HttpServletResponse response) throws Exception {
        log.info("filePath : {}", filePath);

        // 파일 다운로드를 위한 헤더 세팅
        // - ContentType            : application/octet-stream
        // - Content-Disposition    : attachment; filename="파일명.확장자" 

        File file = new File(filePath);
        String fileName = file.getName();
        response.setContentType("application/octet-stream");
        // response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
        response.setHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");

        // 다운로드
        FileInputStream fis = new FileInputStream(file);
        ServletOutputStream sos = response.getOutputStream();
        FileCopyUtils.copy(fis,sos);
    }

    
}
