/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nme.nmeassessment.domain;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Chris
 */
@Entity
public class Artist {
    
    @Id
    @Column(name = "artistId")
    private int artistID;
    private String artistName;
    private String genre;
    private int sales;
    
    @OneToMany(mappedBy="Artist")
    private Set<Album> albums;
    
    
    public Artist() {
        albums = new HashSet<>();
    }

    public int getArtistID() {
        return artistID;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public Set<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(Set<Album> albums) {
        this.albums = albums;
    }
    
    

    @Override
    public String toString() {
        return "Artist{" + "artistID=" + artistID + ", artistName=" + artistName + ", genre=" + genre + ", sales=" + sales + '}';
    }
    
    
    
}
