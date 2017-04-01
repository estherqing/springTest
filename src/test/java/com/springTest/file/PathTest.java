package com.springTest.file;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		Path path=Paths.get("user.dir");
		System.out.println(path);
	}

}
