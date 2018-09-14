package cde.springbootbook.commentstore;

import java.util.List;

import org.springframework.data.repository.CrudRepository;




public interface CommentModelRepository extends CrudRepository<CommentModel,String> {
    public CommentModel findByPageId(String pageId);

    //public CommentModel findByEmailAddress(String emailAddress);
}



