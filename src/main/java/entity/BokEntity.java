package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bok", schema = "demoprojekt", catalog = "")
public class BokEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "bokId")
    private int bokId;
    @Basic
    @Column(name = "bokTitel")
    private String bokTitel;
    @Basic
    @Column(name = "bokForfattare")
    private String bokForfattare;
    @Basic
    @Column(name = "bokBeskrivn")
    private String bokBeskrivn;
    @Basic
    @Column(name = "bokIsbn")
    private String bokIsbn;
    @Basic
    @Column(name = "bokPris")
    private Double bokPris;

    public int getBokId() {
        return bokId;
    }

    public void setBokId(int bokId) {
        this.bokId = bokId;
    }

    public String getBokTitel() {
        return bokTitel;
    }

    public void setBokTitel(String bokTitel) {
        this.bokTitel = bokTitel;
    }

    public String getBokForfattare() {
        return bokForfattare;
    }

    public void setBokForfattare(String bokForfattare) {
        this.bokForfattare = bokForfattare;
    }

    public String getBokBeskrivn() {
        return bokBeskrivn;
    }

    public void setBokBeskrivn(String bokBeskrivn) {
        this.bokBeskrivn = bokBeskrivn;
    }

    public String getBokIsbn() {
        return bokIsbn;
    }

    public void setBokIsbn(String bokIsbn) {
        this.bokIsbn = bokIsbn;
    }

    public Double getBokPris() {
        return bokPris;
    }

    public void setBokPris(Double bokPris) {
        this.bokPris = bokPris;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BokEntity bokEntity = (BokEntity) o;

        if (bokId != bokEntity.bokId) return false;
        if (bokTitel != null ? !bokTitel.equals(bokEntity.bokTitel) : bokEntity.bokTitel != null) return false;
        if (bokForfattare != null ? !bokForfattare.equals(bokEntity.bokForfattare) : bokEntity.bokForfattare != null)
            return false;
        if (bokBeskrivn != null ? !bokBeskrivn.equals(bokEntity.bokBeskrivn) : bokEntity.bokBeskrivn != null)
            return false;
        if (bokIsbn != null ? !bokIsbn.equals(bokEntity.bokIsbn) : bokEntity.bokIsbn != null) return false;
        if (bokPris != null ? !bokPris.equals(bokEntity.bokPris) : bokEntity.bokPris != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bokId;
        result = 31 * result + (bokTitel != null ? bokTitel.hashCode() : 0);
        result = 31 * result + (bokForfattare != null ? bokForfattare.hashCode() : 0);
        result = 31 * result + (bokBeskrivn != null ? bokBeskrivn.hashCode() : 0);
        result = 31 * result + (bokIsbn != null ? bokIsbn.hashCode() : 0);
        result = 31 * result + (bokPris != null ? bokPris.hashCode() : 0);
        return result;
    }
}
