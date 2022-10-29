package com.demo.springboot.aws.controller;

import com.amazonaws.services.s3.AmazonS3Client;
import com.demo.springboot.aws.configurations.AmazonS3Configuration;
import com.demo.springboot.aws.configurations.services.AmazonS3ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/s3/bucket")
@RequiredArgsConstructor
public class BucketController {
    private final AmazonS3ClientService amazonClient;
    private final AmazonS3Configuration amazonS3Configuration;

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file) {
        return this.amazonClient.uploadFile(file);
    }

    @DeleteMapping("/deleteFile")
    public String deleteFile(@RequestPart(value = "url") String fileUrl) {
        return this.amazonClient.deleteFileFromS3Bucket(fileUrl);
    }
}
