public class Pasien {
    public String id;
    public String nama;
    public String alamat;
    public String bb;
    public String jk;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public void Pasien() {
        System.out.println("id pasien            : "+getId());
        System.out.println("nama pasien          : "+getNama());
        System.out.println("alamat pasien        : "+getAlamat());
        System.out.println("berat badan pasien   : "+getBb());
        System.out.println("jenis kelamin pasien : "+getJk());
    }
}
