/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.interfaces;

import Persistence.Sport;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author Johannes
 */
public interface IRule extends Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    Integer getId();

    @Column(name = "nrplayer", nullable = false)
    int getNrplayer();

    @Column(name = "pointsdraw", nullable = false)
    int getPointsdraw();

    @Column(name = "pointslose", nullable = false)
    int getPointslose();

    @Column(name = "pointswin", nullable = false)
    int getPointswin();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rule")
    Set<Sport> getSports();

    void setId(Integer id);

    void setNrplayer(int nrplayer);

    void setPointsdraw(int pointsdraw);

    void setPointslose(int pointslose);

    void setPointswin(int pointswin);

    void setSports(Set<Sport> sports);
    
}
