package org.sid.matlemcarriere.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class UploadFileResponse {
	
	private String fileName;
    private String fileDownloadUri;
    private String fileType;
    private long size;

}
