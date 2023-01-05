package com.san.arrays;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PathExtractToLevels {

	public static void main(String[] args) {
		
		
		List<String> pathList = getPathList();
		Set<String> _paths = new HashSet<String>();
		for(String path : pathList) {
			String _path = getModifiedPath(path,3);
			_paths.add(_path);
		}
		System.out.println(_paths);
	}
	
	
	
	private static String getModifiedPath(String path, int cnt) {
		
		Path path2 = Paths.get(path);
		final int len = path2.getNameCount();
		if (len>=cnt) {
			Path subpath = path2.subpath(0, len - cnt);
			return subpath.toString();
		}else {
			return path;
		}
	}



	public static List<String> getPathList() {
		
		String [] arr = new String[] {
				
				"user/box",
				"users/box/blawrence/doc/ll/mnt",
				"users/kep/box/doc/ll/mnt",
				"users/ajay/box/doc/ll/mnt",
				
		};
		
		
		List<String> asList = Arrays.asList(arr);
		return asList;
		
		
	}
}
