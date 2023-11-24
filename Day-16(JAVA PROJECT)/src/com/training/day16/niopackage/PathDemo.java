package com.training.day16.niopackage;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	public static void main(String[] args) {
		Path path = Paths.get("/home/administrator/Desktop/JavaProgram/Hello/input");
		Path path1 = Paths.get("input1/mk");
		FileSystem fs = path.getFileSystem();
		System.out.println(fs.toString());
		System.out.println(path.isAbsolute());
		System.out.println(path.getFileName());
		System.out.println(path.toAbsolutePath().toString());
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println("Name count is "+path.getNameCount());
		System.out.println(path.getName(0));
		System.out.println("Path from 0 to 2 is "+path.subpath(0, 2));
		System.out.println(path.toString());
		System.out.println(path.getNameCount());
		System.out.println("Ending with other path "+path.endsWith(path1));
		System.out.println(path.resolve(path1));
		//System.out.println(path.resolve("input1/mk"));

		System.out.println(path.resolveSibling(path1));
	}
}
