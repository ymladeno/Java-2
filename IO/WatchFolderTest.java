package IO;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class WatchFolderTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        System.out.println(path);

        WatchService watchFolder = FileSystems.getDefault().newWatchService();
        WatchKey watchKey = path.register(watchFolder, StandardWatchEventKinds.ENTRY_CREATE);

        while(true) {
            WatchKey key = null;
            try {
                key = watchFolder.take();
                List<WatchEvent<?>> events = key.pollEvents();
                
                for (WatchEvent<?> ev : events) {
                    Path p = (Path)ev.context();
                    System.out.println(p.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally { key.reset(); }
        }
    }
}
