package com.arcao.geocaching.api.data.userprofile;

import com.arcao.geocaching.api.util.DebugUtils;

import java.io.Serializable;
import java.util.Date;

public class PublicProfile implements Serializable {
	private static final long serialVersionUID = 7624712344301138677L;

	private final String forumTitle;
	private final Date lastVisit;
	private final String location;
	private final Date memberSince;
	private final String occupation;
	private final ProfilePhoto profilePhoto;
	private final String profileText;
	
	public PublicProfile(String forumTitle, Date lastVisit, String location, Date memberSince, String occupation, ProfilePhoto profilePhoto, String profileText) {
	  this.forumTitle = forumTitle;
	  this.lastVisit = lastVisit;
	  this.location = location;
	  this.memberSince = memberSince;
	  this.occupation = occupation;
	  this.profilePhoto = profilePhoto;
	  this.profileText = profileText;
  }

	public String getForumTitle() {
  	return forumTitle;
  }

	public Date getLastVisit() {
  	return lastVisit;
  }

	public String getLocation() {
  	return location;
  }

	public Date getMemberSince() {
  	return memberSince;
  }

	public String getOccupation() {
  	return occupation;
  }

	public ProfilePhoto getProfilePhoto() {
  	return profilePhoto;
  }

	public String getProfileText() {
  	return profileText;
  }
	
	@Override
	public String toString() {
    return DebugUtils.toString(this);
	}
}
