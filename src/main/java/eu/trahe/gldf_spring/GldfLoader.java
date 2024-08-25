package eu.trahe.gldf_spring;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class GldfLoader {

    public String processGldfFile(MultipartFile file) throws IOException {
        // Save the uploaded file to a temporary location
        File tempFile = convertMultiPartToFile(file);

        // Process the file using the Rust library
        String jsonResult = GldfRsLibrary.INSTANCE.load_gldf_to_json(tempFile.getAbsolutePath());

        // Free the memory allocated by the Rust library
        GldfRsLibrary.INSTANCE.free_string(jsonResult);

        // Delete the temporary file
        tempFile.delete();

        return jsonResult;
    }

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(System.getProperty("java.io.tmpdir") + "/" + file.getOriginalFilename());
        try (FileOutputStream fos = new FileOutputStream(convFile)) {
            fos.write(file.getBytes());
        }
        return convFile;
    }
}
