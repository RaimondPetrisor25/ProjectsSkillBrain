package util;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetProjectPath {

    public static String getProjectPath(){
        Path path  = Paths.get("");
        return  path.toAbsolutePath().toString();
    }
}
