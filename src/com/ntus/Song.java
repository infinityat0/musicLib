package com.ntus;

public class Song {
	private String name ;
	private String artist ;
	private String composer ;
	private String album ;
	private String grouping ;
	private String genre ;
	private String size ;
	private String time ;
	private String discNumber ;
	private String discCount ;
	private String trackNumber ;
	private String trackCount ;
	private String year ;
	private String dateModified ;
	private String dateAdded ;
	private String bitRate ;
	private String sampleRate ;
	private String volumeAdjustment ;
	private String kind ;
	private String equalizer ;
	private String comments ;
	private String plays ;
	private String lastPlayed ;
	private String skips ;
	private String lastSkipped ;
	private String myRating ;
	private String location ;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Song [name=" + name + ", artist=" + artist + ", composer=" + composer + ", album=" + album + ", grouping=" + grouping
				+ ", genre=" + genre + ", size=" + size + ", time=" + time + ", discNumber=" + discNumber + ", discCount=" + discCount
				+ ", trackNumber=" + trackNumber + ", trackCount=" + trackCount + ", year=" + year + ", dateModified="
				+ dateModified + ", dateAdded=" + dateAdded + ", bitRate=" + bitRate + ", sampleRate=" + sampleRate
				+ ", volumeAdjustment=" + volumeAdjustment + ", kind=" + kind + ", equalizer=" + equalizer + ", comments="
				+ comments + ", plays=" + plays + ", lastPlayed=" + lastPlayed + ", skips=" + skips + ", lastSkipped="
				+ lastSkipped + ", myRating=" + myRating + ", location=" + location + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// two songs are same if their names and artists are same and they run the same time
		return obj instanceof Song ?  this.name.equals(((Song)obj).getName()) && this.artist.equals(((Song)obj).getArtist()) &&
				this.time.equals(((Song)obj).getTime()) : false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}
	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		this.artist = artist;
	}
	/**
	 * @return the composer
	 */
	public String getComposer() {
		return composer;
	}
	/**
	 * @param composer the composer to set
	 */
	public void setComposer(String composer) {
		this.composer = composer;
	}
	/**
	 * @return the album
	 */
	public String getAlbum() {
		return album;
	}
	/**
	 * @param album the album to set
	 */
	public void setAlbum(String album) {
		this.album = album;
	}
	/**
	 * @return the grouping
	 */
	public String getGrouping() {
		return grouping;
	}
	/**
	 * @param grouping the grouping to set
	 */
	public void setGrouping(String grouping) {
		this.grouping = grouping;
	}
	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}
	/**
	 * @return the discNumber
	 */
	public String getDiscNumber() {
		return discNumber;
	}
	/**
	 * @param discNumber the discNumber to set
	 */
	public void setDiscNumber(String discNumber) {
		this.discNumber = discNumber;
	}
	/**
	 * @return the discCount
	 */
	public String getDiscCount() {
		return discCount;
	}
	/**
	 * @param discCount the discCount to set
	 */
	public void setDiscCount(String discCount) {
		this.discCount = discCount;
	}
	/**
	 * @return the trackNumber
	 */
	public String getTrackNumber() {
		return trackNumber;
	}
	/**
	 * @param trackNumber the trackNumber to set
	 */
	public void setTrackNumber(String trackNumber) {
		this.trackNumber = trackNumber;
	}
	/**
	 * @return the trackCount
	 */
	public String getTrackCount() {
		return trackCount;
	}
	/**
	 * @param trackCount the trackCount to set
	 */
	public void setTrackCount(String trackCount) {
		this.trackCount = trackCount;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the dateModified
	 */
	public String getDateModified() {
		return dateModified;
	}
	/**
	 * @param dateModified the dateModified to set
	 */
	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}
	/**
	 * @return the dateAdded
	 */
	public String getDateAdded() {
		return dateAdded;
	}
	/**
	 * @param dateAdded the dateAdded to set
	 */
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
	/**
	 * @return the bitRate
	 */
	public String getBitRate() {
		return bitRate;
	}
	/**
	 * @param bitRate the bitRate to set
	 */
	public void setBitRate(String bitRate) {
		this.bitRate = bitRate;
	}
	/**
	 * @return the sampleRate
	 */
	public String getSampleRate() {
		return sampleRate;
	}
	/**
	 * @param sampleRate the sampleRate to set
	 */
	public void setSampleRate(String sampleRate) {
		this.sampleRate = sampleRate;
	}
	/**
	 * @return the volumeAdjustment
	 */
	public String getVolumeAdjustment() {
		return volumeAdjustment;
	}
	/**
	 * @param volumeAdjustment the volumeAdjustment to set
	 */
	public void setVolumeAdjustment(String volumeAdjustment) {
		this.volumeAdjustment = volumeAdjustment;
	}
	/**
	 * @return the kind
	 */
	public String getKind() {
		return kind;
	}
	/**
	 * @param kind the kind to set
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}
	/**
	 * @return the equalizer
	 */
	public String getEqualizer() {
		return equalizer;
	}
	/**
	 * @param equalizer the equalizer to set
	 */
	public void setEqualizer(String equalizer) {
		this.equalizer = equalizer;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/**
	 * @return the plays
	 */
	public String getPlays() {
		return plays;
	}
	/**
	 * @param plays the plays to set
	 */
	public void setPlays(String plays) {
		this.plays = plays;
	}
	/**
	 * @return the lastPlayed
	 */
	public String getLastPlayed() {
		return lastPlayed;
	}
	/**
	 * @param lastPlayed the lastPlayed to set
	 */
	public void setLastPlayed(String lastPlayed) {
		this.lastPlayed = lastPlayed;
	}
	/**
	 * @return the skips
	 */
	public String getSkips() {
		return skips;
	}
	/**
	 * @param skips the skips to set
	 */
	public void setSkips(String skips) {
		this.skips = skips;
	}
	/**
	 * @return the lastSkipped
	 */
	public String getLastSkipped() {
		return lastSkipped;
	}
	/**
	 * @param lastSkipped the lastSkipped to set
	 */
	public void setLastSkipped(String lastSkipped) {
		this.lastSkipped = lastSkipped;
	}
	/**
	 * @return the myRating
	 */
	public String getMyRating() {
		return myRating;
	}
	/**
	 * @param myRating the myRating to set
	 */
	public void setMyRating(String myRating) {
		this.myRating = myRating;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
}
