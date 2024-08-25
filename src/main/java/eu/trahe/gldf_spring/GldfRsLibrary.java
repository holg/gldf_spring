package eu.trahe.gldf_spring;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public interface GldfRsLibrary extends Library {
    GldfRsLibrary INSTANCE = Native.load(
            Platform.isWindows() ? "gldf_rs" : "gldf_rs", // Use "gldf_rs" for all platforms
            GldfRsLibrary.class
    );

    String load_gldf_to_json(String path);
    void free_string(String s);
}
