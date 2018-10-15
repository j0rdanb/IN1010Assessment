/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nme.nmeassessment.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Chris
 */
@Entity
public class Track {
    @Id
    @Column(name="trackId")
    private int trackID;
    private String trackName;
    private float duration;
    private Date recordingDate;
    @Column(name="artistId")
    private int artistID;
    @Column(name="albumId")
    private int albumID;
    
    public Track() {
        
    }

    public int getTrackID() {
        return trackID;
    }

    public void setTrackID(int trackID) {
        this.trackID = trackID;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public Date getRecordingDate() {
        return recordingDate;
    }

    public void setRecordingDate(Date recordingDate) {
        this.recordingDate = recordingDate;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    @Override
    public String toString() {
        return "Track{" + "trackID=" + trackID + ", trackName=" + trackName + ", duration=" + duration + ", recordingDate=" + recordingDate + ", artistID=" + artistID + ", albumID=" + albumID + '}';
    }
    
    
    
    
}
