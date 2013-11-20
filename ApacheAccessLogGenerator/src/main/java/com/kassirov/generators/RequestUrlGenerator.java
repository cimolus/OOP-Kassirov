package com.kassirov.generators;

import java.util.Random;

import com.kassirov.models.RequestUrl;

public class RequestUrlGenerator {
	
	private String[] extensions = { "jpg", "php", "html", "png" , "gif", "mp3", "mp4", "txt", "doc" };
	
	private String[] urls = { "/home", "/product", "/fsd", "/file", "/file1", "fasdfasg" };
	
	private Random random = new Random();
	
	public RequestUrl generate() {
		return new RequestUrl( urls[random.nextInt(urls.length)] + "." + extensions[random.nextInt(extensions.length)] );
	}
	
}
