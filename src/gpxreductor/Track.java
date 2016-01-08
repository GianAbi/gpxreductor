/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpxreductor;
import java.util.*;
/**
 *
 * @author Crivano
 */
public class Track {
    private Integer id;
	private String name;
	private ArrayList<TrackSegment> segments;
	
	public Track(Integer id, String name, ArrayList<TrackSegment> segments) {
		super();
		this.id = id;
		this.name = name;
		this.segments = segments;
	}

	public Track() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<TrackSegment> getSegments() {
		return segments;
	}

	public void setSegments(ArrayList<TrackSegment> segments) {
		this.segments = segments;
	}
}
