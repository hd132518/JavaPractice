package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.collection
 * 	|_Music
 * 
 * 개요 : 
 * 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author	박건
 * @version	1.0
 */
public class Music {
	
	private String title, singer;

	/**
	 * @param title
	 * @param singer
	 */
	public Music (String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle () {
		return title;
	}

	public void setTitle (String title) {
		this.title = title;
	}

	public String getSinger () {
		return singer;
	}

	public void setSinger (String singer) {
		this.singer = singer;
	}

	@Override
	public String toString () {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

}
