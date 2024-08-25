package eu.trahe.gldf_spring.controller;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import eu.trahe.gldf_spring.GldfLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.util.FileCopyUtils;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class FileUploadControllerTest {

    @Autowired
    private GldfLoader gldfLoader;

    @Test
    public void testGldfProcessing() throws IOException {
        // Load the test.gldf file from resources
        ClassPathResource gldfResource = new ClassPathResource("test.gldf");
        byte[] gldfBytes = FileCopyUtils.copyToByteArray(gldfResource.getInputStream());

        // Create a MockMultipartFile to simulate file upload
        MockMultipartFile mockGldfFile = new MockMultipartFile("file", "test.gldf", "application/octet-stream", gldfBytes);

        // Process the file using GldfLoader
        String actualJson = gldfLoader.processGldfFile(mockGldfFile);

        // Load the expected JSON from test.json
        ClassPathResource jsonResource = new ClassPathResource("test.json");
        String expectedJson = new String(FileCopyUtils.copyToByteArray(jsonResource.getInputStream()), StandardCharsets.UTF_8);

        // Compare the actual JSON with the expected JSON
        assertNotNull(actualJson);
        assertEquals(expectedJson.trim(), actualJson.trim(), "The JSON output does not match the expected output.");
    }
}
