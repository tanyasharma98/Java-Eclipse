package com.harman.ui;

import java.io.File;
import java.io.FilenameFilter;

public class DisplayFiles {

	public static void main(String[] args) {
		String[] pathnames;
		 File f = new File("D:\\harman\\CoreJavaWorkspace\\ToStartWith\\src\\com\\harman\\ui");
		 
		 pathnames = f.list();
		 
	            // Print the names of files and directories
	            //System.out.println(pathname.endsWith(".c"));
			 FilenameFilter filter = new FilenameFilter() {
			        @Override
			        public boolean accept(File f, String name) {
			            return name.endsWith(".c");
			        }
			    };
			    pathnames = f.list(filter);
			    for (String pathname : pathnames) {
		            // Print the names of files and directories
		            System.out.println(pathname);
		        }

	}

}
