package com.qf.control;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@Controller
public class RequestHeaderController {
    @ResponseBody
    @RequestMapping("getHeaderValue")
    public Object getHeaderValue(@RequestHeader(value="Host",required = true) String host){
        return host;
    }

    @ResponseBody
    @RequestMapping("fileUpload")
    public String fileUpload(@RequestParam("file") CommonsMultipartFile file) throws IOException {
        long startTime = System.currentTimeMillis();
        System.out.println("fileName:"+file.getOriginalFilename());
        String path = "D:/"+new Date().getTime()+file.getOriginalFilename();
        File newFile = new File(path);
        file.transferTo(newFile);
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间："+String.valueOf(endTime-startTime)+"ms");
        return "upload success";
    }

    @RequestMapping("/testDownload")
    public ResponseEntity<byte[]> download() throws IOException{
        //创建文件
        File file = new File("D://a.txt");
        byte[] body = null;
        //创建输入流（从硬盘读取数据）
        InputStream is = new FileInputStream(file);
        //创建字节数组并指定长度
        body = new byte[is.available()];
        //将数据从输入流导到输出流
        is.read(body);
        //创建响应头并设置指定值
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition","attchment;filename=" + file.getName());
        //设置HTTP响应状态
        HttpStatus statusCode = HttpStatus.OK;
        //创建响应实体对象
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body,headers,statusCode);
        return entity;
    }

}
