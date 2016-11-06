package model;

import java.io.File;
import javax.swing.JFileChooser;

public class FileChooser {
	private File file;
	
	public FileChooser(){
	}
	
	public File getFile() {
		JFileChooser chooser;
		chooser = new JFileChooser();
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		int returnValue = chooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
	        file = chooser.getSelectedFile();
	        System.out.println(file.getName());
	        return file;
        } else
        	return null;
	}

	
	
	
}
