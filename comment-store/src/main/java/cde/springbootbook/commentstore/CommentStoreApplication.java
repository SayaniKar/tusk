package cde.springbootbook.commentstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class CommentStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentStoreApplication.class, args);
	}
	
}
