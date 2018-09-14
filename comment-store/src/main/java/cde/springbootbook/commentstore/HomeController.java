package cde.springbootbook.commentstore;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class HomeController {
	@RequestMapping("/home")
	String home() {
	    return "Hello World!";
	}

	@Autowired
		private CommentService commentService;
			@RequestMapping("/comments")
			public List<CommentModel> getAllContent()
			{
				return commentService.getAllContent();
			}
		
			@RequestMapping("/commentsList/{pageId}")
			public CommentModel findByPageId(@PathVariable String pageId)
			{
				return commentService.findByPageId(pageId);
			}
			@RequestMapping(method=RequestMethod.POST,value="/comments")
			public void addComment(@RequestBody CommentModel commentModel)
			{
				commentService.addComment(commentModel);
			}
			@RequestMapping(method=RequestMethod.DELETE, value="/comments/{id}")
			public void deleteComment(@PathVariable String id)
			{
				 commentService.deleteComment(id);
			}
			@RequestMapping(method=RequestMethod.PUT, value="/comments/{id}")
			public void updateComment(@PathVariable String id,@RequestBody CommentModel commentModel)
			{
				 commentService.updateComment(id,commentModel);
			}
	}


