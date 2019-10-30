package com.acc.fileupload.response;


public class Response {
	private String status;
    private String fileName;
    private String fileType;
    private long size;

    public Response(String fileName, String status, String fileType, long size) {
        this.fileName = fileName;
        this.status = status;
        this.fileType = fileType;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
