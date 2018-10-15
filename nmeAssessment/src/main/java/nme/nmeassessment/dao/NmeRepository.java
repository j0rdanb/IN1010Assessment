/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nme.nmeassessment.dao;

import java.util.List;
import nme.nmeassessment.domain.Album;
import nme.nmeassessment.domain.Artist;
import nme.nmeassessment.domain.Track;

/**
 *
 * @author Chris
 */
public interface NmeRepository {
    List<Artist> findAllArtists();
    List<Track> findAllTracks();
    List<Album> findAllAlbums();
    List<Track> findTracksOnAlbum(int albumId);
    int artistCount();
    void addArtist(int artistId, String artistName, String genre, int sales);
    void removeAlbum(int albumId); 
}
