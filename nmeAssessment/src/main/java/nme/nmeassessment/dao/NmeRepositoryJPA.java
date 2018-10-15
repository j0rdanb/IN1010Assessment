/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nme.nmeassessment.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import nme.nmeassessment.domain.Album;
import nme.nmeassessment.domain.Artist;
import javax.persistence.TypedQuery;
import nme.nmeassessment.domain.Track;

/**
 *
 * @author Jordan Bolton
 */
@Stateless
public class NmeRepositoryJPA implements NmeRepository {
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public List<Track> findTracksOnAlbum(int albumID) {
        TypedQuery<Track> query = em.createQuery("SELECT t from Track as t WHERE t.albumID =:albumID", Track.class);
        query.setParameter("albumID", albumID);
        return query.getResultList();
    }
    
    @Override
    public List<Artist> findAllArtists() {
        TypedQuery<Artist>query = em.createQuery("SELECT a FROM Artist as a", Artist.class);
        return query.getResultList();
    }
    
    @Override
    public List<Track> findAllTracks() {
        TypedQuery<Track>query = em.createQuery("SELECT t FROM Track as t", Track.class);
        return query.getResultList();
    }
    
    @Override
    public List<Album> findAllAlbums() {
        TypedQuery<Album>query = em.createQuery("SELECT a FROM Album as a", Album.class);
        return query.getResultList();
    }
    

    @Override
    public int artistCount() {
        TypedQuery<Long> query = em.createQuery("SELECT COUNT(a) FROM Artist AS a", Long.class);
        Long result = query.getSingleResult();
        Integer returnResult = result.intValue();
        return returnResult;
    }
    
    @Override
    public void addArtist(int artistId, String artistName, String genre, int sales) {
        Artist artist = new Artist();
        artist.setArtistID(artistId);
        artist.setArtistName(artistName);
        artist.setGenre(genre);
        artist.setSales(sales);
        em.persist(artist);
    }
    
    @Override
    public void removeAlbum(int albumId){
        Album album = em.find(Album.class, albumId);
        em.remove(album);
    }
    
    
    
}
