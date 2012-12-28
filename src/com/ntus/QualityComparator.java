package com.ntus;

import java.util.Comparator;

public class QualityComparator implements Comparator<Song>{

	public int compare(Song song1, Song song2) {
		if (song1.getBitRate() == null || song1.getBitRate().equals("")) {
			return -1;
		}
		if (song2.getBitRate() == null || song2.getBitRate().equals("")) {
			return 1;
		}
		return Integer.parseInt(song1.getBitRate(), 10) - Integer.parseInt(song2.getBitRate(), 10);
	}

}
