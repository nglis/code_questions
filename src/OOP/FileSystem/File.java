package OOP.FileSystem;

import OOP.CallCenter.Director;

public class File {
    private String name;
    private String type;
    private String createdOn;
    private String lastAccessed;

    private Directory parent;

    private int size;

    public File(String n, String t, Directory p) {
        name = n;
        type = t;
        parent = p;
        createdOn = getCurrentDate().toString();
        lastAccessed = createdOn;
    }

    public void delete() {
        // implement delete
    }

    public void setName(String n) {
        name = n;
    }

    public void setType(String t) {
        type = t;
    }

    public void setLastAccessed(String d) {
        lastAccessed = d;
    }

    public void setParent(Directory p) {
        parent = p;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public String getLastAccessed() {
        return lastAccessed;
    }

    public Directory getParent() {
        return parent;
    }

    public int getSize() {
        return size;
    }
}
