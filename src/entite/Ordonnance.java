package entite;
// Generated 8-May-2020 12:51:34 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ordonnance generated by hbm2java
 */
@Entity
@Table(name="ORDONNANCE"
    ,schema="A18PROJET3"
)
public class Ordonnance  implements java.io.Serializable {


     private int numord;
     private String recommandations;
     private String typeo;
     private Date datec;
     private Set<Ordonnancemedicaments> ordonnancemedicamentses = new HashSet<Ordonnancemedicaments>(0);
     private Set<Ordonnancechirurgie> ordonnancechirurgies = new HashSet<Ordonnancechirurgie>(0);
     private Set<Consultation> consultations = new HashSet<Consultation>(0);

    public Ordonnance() {
    }

	
    public Ordonnance(int numord) {
        this.numord = numord;
    }
    public Ordonnance(int numord, String recommandations, String typeo, Date datec, Set<Ordonnancemedicaments> ordonnancemedicamentses, Set<Ordonnancechirurgie> ordonnancechirurgies, Set<Consultation> consultations) {
       this.numord = numord;
       this.recommandations = recommandations;
       this.typeo = typeo;
       this.datec = datec;
       this.ordonnancemedicamentses = ordonnancemedicamentses;
       this.ordonnancechirurgies = ordonnancechirurgies;
       this.consultations = consultations;
    }
   
     @Id 

    
    @Column(name="NUMORD", unique=true, nullable=false, precision=8, scale=0)
    public int getNumord() {
        return this.numord;
    }
    
    public void setNumord(int numord) {
        this.numord = numord;
    }

    
    @Column(name="RECOMMANDATIONS", length=50)
    public String getRecommandations() {
        return this.recommandations;
    }
    
    public void setRecommandations(String recommandations) {
        this.recommandations = recommandations;
    }

    
    @Column(name="TYPEO", length=11)
    public String getTypeo() {
        return this.typeo;
    }
    
    public void setTypeo(String typeo) {
        this.typeo = typeo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATEC", length=7)
    public Date getDatec() {
        return this.datec;
    }
    
    public void setDatec(Date datec) {
        this.datec = datec;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ordonnance")
    public Set<Ordonnancemedicaments> getOrdonnancemedicamentses() {
        return this.ordonnancemedicamentses;
    }
    
    public void setOrdonnancemedicamentses(Set<Ordonnancemedicaments> ordonnancemedicamentses) {
        this.ordonnancemedicamentses = ordonnancemedicamentses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ordonnance")
    public Set<Ordonnancechirurgie> getOrdonnancechirurgies() {
        return this.ordonnancechirurgies;
    }
    
    public void setOrdonnancechirurgies(Set<Ordonnancechirurgie> ordonnancechirurgies) {
        this.ordonnancechirurgies = ordonnancechirurgies;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="ordonnance")
    public Set<Consultation> getConsultations() {
        return this.consultations;
    }
    
    public void setConsultations(Set<Consultation> consultations) {
        this.consultations = consultations;
    }




}


