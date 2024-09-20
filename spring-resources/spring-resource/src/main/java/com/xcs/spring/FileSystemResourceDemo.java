package com.xcs.spring;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.InputStream;

/**
 * @author xcs
 * @date 2023年10月30日 11时11分
 **/
public class FileSystemResourceDemo {
    public static void main(String[] args) throws Exception {
        // 请替换你自己的目录
        String path = "D:\\test\\123.md";
        Resource resource = new FileSystemResource(path);
        try (InputStream is = resource.getInputStream()) {
            // 读取和处理资源内容
            System.out.println(new String(is.readAllBytes()));
        }
    }
}
