package vn.edu.ute.datphong.data

import vn.edu.ute.datphong.model.LoaiPhong

object DuLieuMau {
    val dsLoaiPhong: List<LoaiPhong> = listOf(
        LoaiPhong("P117", "Phòng Standard VIP", 500000L, 2),
        LoaiPhong("P202", "Phòng Deluxe Gia Đình", 1200000L, 4),
        LoaiPhong("P303", "Phòng Suite Cao Cấp", 2500000L, 6)
    )
}