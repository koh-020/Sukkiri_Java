package practice.practice15;

public class Practice15_2 {
	
	String folder;
	String file;
	
	public String getFolder() {
		return this.folder;
		
	}
	
	public String fileProperty(String folder, String file) {
		if (folder.endsWith("\\")) {
			StringBuilder sb = new StringBuilder();
			sb.append(folder).append(file);
			return sb.toString();
		}
		StringBuilder sb2 = new StringBuilder();
		sb2.append(folder).append("\\").append(file);
		return sb2.toString();
	}
	

}