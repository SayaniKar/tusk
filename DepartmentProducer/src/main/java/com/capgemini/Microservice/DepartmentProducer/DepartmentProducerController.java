package com.capgemini.Microservice.DepartmentProducer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableAutoConfiguration
public class DepartmentProducerController {


@Autowired
private DepartmentProducerService departmentProducerService;
	@RequestMapping("/show")
	public List<DepartmentPojo> getAllContent()
	{
		return departmentProducerService.getAllContent();
	}

	/*@RequestMapping("/commentsList/{pageId}")
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
	}*/
}

