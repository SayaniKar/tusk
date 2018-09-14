package cde.springbootbook.commentstore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CommentService{
	@Autowired
	private CommentModelRepository commentModelRepository;

	 
	public  CommentModel addComment(CommentModel commentModel) {
		return commentModelRepository.save(commentModel);
	}


	public CommentModel findByPageId(String pageId)
	{
	return  commentModelRepository.findByPageId(pageId);
	}
	public  List<CommentModel> getAllContent()
	{
	
	List<CommentModel>comment=new ArrayList<>();
	commentModelRepository.findAll().forEach(comment::add);
	return comment;
}
	public void deleteComment(String id)
	{
		commentModelRepository.deleteById(id);
	}



	public void updateComment(String id, CommentModel commentModel) {
		// TODO Auto-generated method stub
		commentModelRepository.save(commentModel);
	}


	
		
	
}