package id.ac.unhas.infocovid19.model

import com.google.gson.annotations.SerializedName

data class DataHarian(
    @SerializedName("data")
    val data: List<Harian?>?
){
    override fun toString(): String {
        var stringOutput = ""
        data?.forEach{
            stringOutput += it.toString()
        }
        return stringOutput
    }
}

data class Harian(
    @SerializedName("harike")
    val harike: Int?,

    @SerializedName("tanggal")
    val tanggal: String?,

    @SerializedName("jumlahKasusBaruperHari")
    val jumlahKasusBaruperHari: Int?,

    @SerializedName("jumlahKasusKumulatif")
    val jumlahKasusKumulatif: Int?,

    @SerializedName("jumlahpasiendalamperawatan")
    val jumlahpasiendalamperawatan: Int?,

    @SerializedName("presentasePasiendalamPerawatan")
    val persentasePasiendalamPerawatan: Double?,

    @SerializedName("jumlahPasienSembuh")
    val jumlahPasienSembuh: Int?,

    @SerializedName("presentasePasienSembuh")
    val persentasePasienSembuh: Double?,

    @SerializedName("jumlahPasienMeninggal")
    val jumlahPasienMeninggal: Int?,

    @SerializedName("presentasePasienMeninggal")
    val persentasePasienMeninggal: Double?,

    @SerializedName("jumlahKasusSembuhperHari")
    val jumlahKasusSembuhperHari: Int?,

    @SerializedName("jumlahKasusmMeninggalperHari")
    val jumlahKasusMeninggalperHari: Int?,

    @SerializedName("jumlahKasusDirawatperHari")
    val jumlahKasusDirawatperHari: Int?,

    @SerializedName("fid")
    val fid: Int?
){
    override fun toString(): String {
        return "Hari ke ${this.harike}[#tanggal: ${this.tanggal}, " +
                "#jumlah kasus baru per hari: ${this.jumlahKasusBaruperHari}, " +
                "#jumlah kasus kumulatif: ${this.jumlahKasusKumulatif}, " +
                "#jumlah pasien dalam perawatan: ${this.jumlahpasiendalamperawatan}, " +
                "#persentase pasien dalam perawatan: ${this.persentasePasiendalamPerawatan}, " +
                "#jumlah pasien sembuh: ${this.jumlahPasienSembuh}, " +
                "#persentase pasien sembuh: ${this.persentasePasienSembuh}, " +
                "#jumlah pasien meninggal: ${this.jumlahPasienMeninggal}, " +
                "#persentase pasien meninggal: ${this.persentasePasienMeninggal}, " +
                "#jumlah kasus meninggal per hari: ${this.jumlahKasusMeninggalperHari}, " +
                "#jumlah kasus dirawat per hari: ${this.jumlahKasusDirawatperHari}]"
    }
}