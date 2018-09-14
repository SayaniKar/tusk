package cde.springbootbook.commentstore;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.persistence.Index;
//import javax.jdo.annotations.Index;




import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.boot.autoconfigure.domain.EntityScan;


	@EntityScan(basePackages= {
			"de.codeboje.springbootbook"
			})
	@Entity
	@Table(
	  name = "comments")
	/*@TypeDefs({
	  @TypeDef(name = "calendarUTC",
	       typeClass = UtcCalendarType.class,
	       defaultForType = Calendar.class)
	})*/
	public class CommentModel implements Serializable {

	   @Id
	   @Column
	   private String id;

	 
	/*@Temporal(TemporalType.TIMESTAMP)
	   //@Type(type = "calendarUTC")
	   private Calendar lastModificationDate;

	   @Temporal(TemporalType.TIMESTAMP)
	   //@Type(type = "calendarUTC")
	   private Calendar creationDate;*/
        @Column
	   private String pageId;

	   @Column(length = 32)
	   private String username;

	   @Column(length = 32)
	private String emailAddress;

	   @Column
	   private boolean spam;

	public CommentModel(String id, String pageId, String username,
			String emailAddress, boolean spam) {
		super();
		this.id = id;
		this.pageId = pageId;
		this.username = username;
		this.emailAddress = emailAddress;
		this.spam = spam;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public boolean isSpam() {
		return spam;
	}

	public void setSpam(boolean spam) {
		this.spam = spam;
	}
	

	public CommentModel() {
		super();
	}

	@Override
	public String toString() {
		return "CommentModel [id=" + id + ", pageId=" + pageId + ", username="
				+ username + ", emailAddress=" + emailAddress + ", spam="
				+ spam + "]";
	}


	}
	
