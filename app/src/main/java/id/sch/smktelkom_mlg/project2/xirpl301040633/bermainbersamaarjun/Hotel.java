package id.sch.smktelkom_mlg.project2.xirpl301040633.bermainbersamaarjun;

import java.io.Serializable;

/**
 * Created by Dayinta-PC on 3/28/2017.
 */

public class Hotel implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;
    public String foto;

    public Hotel(String judul, String deskripsi, String detail, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.foto = foto;
    }
}
