package com.san.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "story")
public class Story {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int storyId;

	@Column(name = "story_name")
	private String storyName;

	@Column(name = "story_author")
	private String storyAuthor;

	public Story() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Story(int storyId, String storyName, String storyAuthor) {
		super();
		this.storyId = storyId;
		this.storyName = storyName;
		this.storyAuthor = storyAuthor;
	}

	public int getStoryId() {
		return storyId;
	}

	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}

	public String getStoryName() {
		return storyName;
	}

	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}

	public String getStoryAuthor() {
		return storyAuthor;
	}

	public void setStoryAuthor(String storyAuthor) {
		this.storyAuthor = storyAuthor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((storyAuthor == null) ? 0 : storyAuthor.hashCode());
		result = prime * result + storyId;
		result = prime * result + ((storyName == null) ? 0 : storyName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Story other = (Story) obj;
		if (storyAuthor == null) {
			if (other.storyAuthor != null)
				return false;
		} else if (!storyAuthor.equals(other.storyAuthor))
			return false;
		if (storyId != other.storyId)
			return false;
		if (storyName == null) {
			if (other.storyName != null)
				return false;
		} else if (!storyName.equals(other.storyName))
			return false;
		return true;
	}

}
