package by.grsu.accesslog.generator.impl;

import java.util.Random;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import by.grsu.accesslog.generator.IRequestUrlGenerator;
import by.grsu.accesslog.model.RequestUrl;

@Component
public class RequestUrlGenerator implements IRequestUrlGenerator {
	
	private String[] extensions = { "jpg", "php", "html", "png" , "gif", "mp3", "mp4", "txt", "doc" };
	
	private String[] urls = { "/home", "/product", "/fsd", "/file", "/file1", "fasdfasg" };
	
	@Autowired
	private Random random;
	
	public RequestUrl generate() {
		return new RequestUrl( urls[random.nextInt(urls.length)],extensions[random.nextInt(extensions.length)] );
	}
	
}
