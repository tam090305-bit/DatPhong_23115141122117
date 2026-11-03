package vn.edu.ute.datphong.model
import java.io.Serializabledata
class DonDatPhong (
    val hoTen: String,
    val sdt: String,
    val email: String,
    val maLoaiPhong: String,
    val ngayNgan: String,
    val soDem: Int,
    val soKhach: Int,
    val ghiChu: String = ""
) : Serializable {
    fun tomTat(): String {
        return "Họ tên: $hoTen - Phòng: $maLoaiPhong - Ngày nhận: $ngayNhan - Số đêm: $soDem"
    }
}