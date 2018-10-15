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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Chris
 */

@Entity
public class Album {
    @Id
    @Column(name="albumId")
    private int albumID;
    
    private String albumTitle;
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    

    


    @ManyToOne
    @JoinColumn(name="artistId")
    private Artist artist;
    
    public Album() {
        
    }

    public int getAlbumID() {
        return albumID;
    }

    public void setAlbumID(int albumID) {
        this.albumID = albumID;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    
    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" + "albumID=" + albumID + ", albumTitle=" + albumTitle + ", releaseDate=" + releaseDate + '}';
    }


   
    



        
    
 
    
    
    
}
