package OOP.FileSystem;

import java.util.ArrayList;

public class Directory {
    private Directory parent;

    private String name;
    private String createdOn;
    private String lastAccessed;

    private int size;

    private ArrayList<Directory> directories;
    private ArrayList<File> files;

    public Directory(String n, Directory p) {
        name = n;
        parent = p;
        createdOn = getCurrentDate().toString();
        size = 0;
    }

    public ArrayList<Directory> getSubDirectories() {
        return directories;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void addFile(File f) {
        // Implement addFile
    }

    public void removeFile(File f) {
        // Implement removeFile
    }

    public void addDirectory(Directory d) {
        // Implement add directory
    }

    public void removeDirectory(Directory d) {
        // Implement remove directory
    }

    public void delete() {
        // Implement delete
    }

    public void setParent(Directory p) {
        parent = p;
    }

    public void setName(String n) {
        name = n;
    }

    public void setLastAccessed(String d) {
        lastAccessed = d;
    }

    public String getName() {
        return name;
    }

    public Directory getParent() {
        return parent;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public String getLastAccessed() {
        return lastAccessed;
    }

    public int getSize() {
        return size;
    }
}
