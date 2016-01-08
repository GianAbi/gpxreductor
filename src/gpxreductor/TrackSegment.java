/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpxreductor;

import java.util.ArrayList;

/**
 *
 * @author Crivano
 */
public class TrackSegment {
    private Integer id;
	private ArrayList<TrackPoint> trackPoints;
	
	public TrackSegment(ArrayList<TrackPoint> trackPoints) {
		super();
		this.id = id;
		this.trackPoints = trackPoints;
	}

	public TrackSegment() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ArrayList<TrackPoint> getTrackPoints() {
		return trackPoints;
	}

	public void setTrackPoints(ArrayList<TrackPoint> trackPoints) {
		this.trackPoints = trackPoints;
	}
}
