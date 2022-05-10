package ua.ithillel.collections.map.homework;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {

    private final Map<Path, List<FileData>> files = new HashMap<>();

    public void add(Path path, FileData data) {
        List<FileData> foundFiles = files.getOrDefault(path, new ArrayList<>());
        files.put(path, foundFiles);
    }

    public List<FileData> find(Path path) {
        return files.getOrDefault(path, Collections.emptyList());
    }

    public List<FileData> filterBySize(long size) {
        List<FileData> filteredFiles = new ArrayList<>();

        for (List<FileData> value : files.values()) {
            for (FileData fileData : value) {
                if (fileData.getSize() <= size) {
                    filteredFiles.add(fileData);
                }
            }
        }

        return filteredFiles;
    }

    public List<FileData> remove(Path path) {
        return files.remove(path);
    }

}
