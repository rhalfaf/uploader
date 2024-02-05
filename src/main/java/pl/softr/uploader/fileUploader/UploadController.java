package pl.softr.uploader.fileUploader;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/uploader")
public class UploadController {
    @PostMapping
    String uploadFile(@RequestParam(name = "file", required = false) MultipartFile file) {
        System.out.println(file.getName() + ": " + file.getSize());
        return "uploaded update";
    }

    @GetMapping
    String getTest(){
        return "TEST";
    }
}
