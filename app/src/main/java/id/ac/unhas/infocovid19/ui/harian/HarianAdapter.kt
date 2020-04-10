package id.ac.unhas.infocovid19.ui.harian

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ac.unhas.infocovid19.R
import id.ac.unhas.infocovid19.model.Harian
import kotlinx.android.synthetic.main.recyclerview_item_harian.view.*

class HarianAdapter(private val daftarHarian: ArrayList<Harian>) :
    RecyclerView.Adapter<HarianAdapter.HarianHolder>() {
    class HarianHolder (itemView: View):RecyclerView.ViewHolder(itemView) {
        fun bind(itemHarian: Harian){
            with(itemView){
                hari_ke.text = "Hari Ke- ${itemHarian.harike.toString()}"
                data_harian.text = "Tanggal: ${itemHarian.tanggal} \n" +
                        "Jumlah kasus baru per hari: ${itemHarian.jumlahKasusBaruperHari} Kasus \n" +
                        "Jumlah kasus kumulatif: ${itemHarian.jumlahKasusKumulatif} Kasus \n" +
                        "Jumlah pasien dalam perawatan: ${itemHarian.jumlahpasiendalamperawatan} Orang \n" +
                        "Persentase pasien dalam perawatan: ${itemHarian.persentasePasiendalamPerawatan}% \n" +
                        "Jumlah pasien sembuh: ${itemHarian.jumlahPasienSembuh} Orang \n" +
                        "Persentase pasien sembuh: ${itemHarian.persentasePasienSembuh}% \n" +
                        "Jumlah pasien meninggal: ${itemHarian.jumlahPasienMeninggal} Orang \n" +
                        "Persentase pasien meninggal: ${itemHarian.persentasePasienMeninggal}% \n" +
                        "Jumlah kasus meninggal per hari: ${itemHarian.jumlahKasusMeninggalperHari} Kasus \n" +
                        "Jumlah kasus dirawat per hari: ${itemHarian.jumlahKasusDirawatperHari} Kasus"
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewtype: Int
    ): HarianAdapter.HarianHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.recyclerview_item_harian,parent, false)
        return HarianHolder(view)
    }

    override fun getItemCount() = daftarHarian.size

    override fun onBindViewHolder(holder: HarianAdapter.HarianHolder, position: Int) {
        holder.bind(daftarHarian[position])
    }
}