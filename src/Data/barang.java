package data;

public class barang {
    private final String kode_barang;
    private final String id_jns_barang;
    private final String nama_barang;
    private final String harga;
    private final String stok_barang;
    private final String id_pemasok_barang;
    private final String id_karyawan_input;
    private final String tgl_posting;

    public barang(String kode_barang, String id_jns_barang, String nama_barang, String harga, String stok_barang, String id_pemasok_barang, String id_karyawan_input, String tgl_posting) {
        this.kode_barang = kode_barang;
        this.id_jns_barang = id_jns_barang;
        this.nama_barang = nama_barang;
        this.harga = harga;
        this.stok_barang = stok_barang;
        this.id_pemasok_barang = id_pemasok_barang;
        this.id_karyawan_input = id_karyawan_input;
        this.tgl_posting = tgl_posting;
    }


    public String getkode_barang() {
        return kode_barang;
    }

    public String getId_jns_barang() {
        return id_jns_barang;
    }
    
    public String getNama_barang() {
        return nama_barang;
    }
    public String getHarga() {
        return harga;
    }
    public String getStok_barang() {
        return stok_barang;
    }

    public String getId_pemasok_barang() {
        return id_pemasok_barang;
    }

    public String getId_karyawan_input() {
        return id_karyawan_input;
    }
    
    public String getTgl_posting() {
        return tgl_posting;
    }
    
    public void setbarang(String data_barang) {
    }


    @Override
    public String toString() {
        return "barang{" +
                "kode_barang='" + kode_barang + '\'' +
                ", id_jns_barang='" + id_jns_barang + '\'' +
                ", nama_barang='" + nama_barang + '\'' +
                ", harga='" + harga + '\'' +
                ", stok_barang='" + stok_barang + '\'' +
                ", id_pemasok_barang='" + id_pemasok_barang + '\'' +
                ", id_karyawan_input='" + id_karyawan_input + '\'' +
                ", tgl_posting='" + tgl_posting + '\'' +
                '}';
    }
}