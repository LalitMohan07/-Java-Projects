package com.training.day16.niopackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListAllFiles {
	public static List<Path> listfiles(Path path) throws IOException {
		List<Path> result;
		try(Stream<Path> walk = Files.walk(path)){
			result= 
					//walk.filter(FIles::isRegularFile)
					walk.collect(Collectors.toList());
		}
		return result;
				
		
	}
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/home/administrator/Desktop/JavaProgram/Hello");
		List<Path> paths = listfiles(path);
		paths.forEach(x->System.out.println(x));
	}
}
