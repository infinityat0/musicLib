package com.ntus;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DuplicateScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		final String aFilePath = "/Users/sunny/Desktop/Music1.txt";
		Scanner scanner = new Scanner(new File(aFilePath));
		String line = scanner.nextLine();
		Song song ; int result ;
		String []tokens ;
		List<Song> duplicates = new ArrayList<Song>(4096);
		Map<String, Song> uniques = new HashMap<String, Song>(4096);
		Comparator<Song> qualityComparator = new QualityComparator();
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			tokens = line.split("\t");
			song = new Song();
			song.setName(tokens[0].trim().toLowerCase());
			song.setArtist(tokens[1].trim());
			song.setComposer(tokens[2]);
			song.setAlbum(tokens[3]);
			song.setGrouping(tokens[4]);
			song.setGenre(tokens[5]);
			song.setSize(tokens[6]);
			song.setTime(tokens[7]);
			song.setDiscNumber(tokens[8]);
			song.setDiscCount(tokens[9]);
			song.setTrackNumber(tokens[10]);
			song.setTrackCount(tokens[11]);
			song.setYear(tokens[12]);
			song.setDateModified(tokens[13]);
			song.setDateAdded(tokens[14]);
			song.setBitRate(tokens[15]);
			song.setSampleRate(tokens[16]);
			song.setVolumeAdjustment(tokens[17]);
			song.setKind(tokens[18]);
			song.setEqualizer(tokens[19]);
			song.setComments(tokens[20]);
			song.setPlays(tokens[21]);
			song.setLastPlayed(tokens[22]);
			song.setSkips(tokens[23]);
			song.setLastSkipped(tokens[24]);
			song.setMyRating(tokens[25]);
			song.setLocation(tokens[26]);
			if (uniques.containsKey(song.getName()+song.getArtist()+song.getTime())) {
				result = qualityComparator.compare(song, uniques.get(song.getName()+song.getArtist()+song.getTime()));
				if (result > 0) {
					duplicates.add(uniques.get(song.getName()+song.getArtist()+song.getTime()));
					uniques.remove(song.getName()+song.getArtist()+song.getTime());
					uniques.put(song.getName()+song.getArtist()+song.getTime(), song);
				} else {
					duplicates.add(song);
				}
			} 
			else {
				uniques.put(song.getName()+song.getArtist()+song.getTime(), song);
			}
		}
		Collections.sort(duplicates, new Comparator<Song>() {
			public int compare(Song o1, Song o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		System.out.println("-------------------------------------------------------");
		for (Song aSong : duplicates) {
			System.out.println("/Volumes/"+aSong.getLocation().replaceAll(":", "/"));
			new File("/Volumes/"+aSong.getLocation().replaceAll(":", "/")).delete();
		}
		System.out.println("-------------------------------------------------------");
		for (String key : uniques.keySet()) {
			System.out.println(uniques.get(key).getLocation().replaceAll(":", "/"));
		}
		System.out.println("-------------------------------------------------------");
	}

}
