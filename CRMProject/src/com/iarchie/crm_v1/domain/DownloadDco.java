// 
// 
// 

package com.iarchie.crm_v1.domain;

public class DownloadDco
{
    private Long id;
    private String filename;
    private String filepath;
    private String filemsg;
    private String fileadmin;
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public String getFilename() {
        return this.filename;
    }
    
    public void setFilename(final String filename) {
        this.filename = ((filename == null) ? null : filename.trim());
    }
    
    public String getFilepath() {
        return this.filepath;
    }
    
    public void setFilepath(final String filepath) {
        this.filepath = ((filepath == null) ? null : filepath.trim());
    }
    
    public String getFilemsg() {
        return this.filemsg;
    }
    
    public void setFilemsg(final String filemsg) {
        this.filemsg = ((filemsg == null) ? null : filemsg.trim());
    }
    
    public String getFileadmin() {
        return this.fileadmin;
    }
    
    public void setFileadmin(final String fileadmin) {
        this.fileadmin = ((fileadmin == null) ? null : fileadmin.trim());
    }
}
