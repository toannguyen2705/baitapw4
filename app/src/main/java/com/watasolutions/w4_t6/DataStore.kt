package com.watasolutions.w4_t6

import com.watasolutions.w4_t6.model.Idol


/**
 * Created by nampham on 4/16/21.
 */

object DataStore {
    fun getDataSet(): List<Idol> {
        return listOf(
            Idol(1, "Nguyen Quang Hai", "Footballer", R.drawable.quanghai),
            Idol(2, "Bui Tien Dung", "Footballer", R.drawable.buitiendung),
            Idol(3, "Duy Manh", "Footballer", R.drawable.duymanh),
            Idol(4, "Cong Phuong", "Footballer", R.drawable.congphuong),
            Idol(5, "Van Toan", "Footballer", R.drawable.vantoan),
            Idol(6, "Nguyen Quang Hai 1", "Footballer", R.drawable.quanghai),
            Idol(7, "Bui Tien Dung 1", "Footballer", R.drawable.buitiendung),
            Idol(8, "Duy Manh 1", "Footballer", R.drawable.duymanh),
            Idol(9, "Cong Phuong 1", "Footballer", R.drawable.congphuong),
            Idol(10, "Van Toan 1", "Footballer", R.drawable.vantoan),
            Idol(11, "Nguyen Quang Hai 2", "Footballer", R.drawable.quanghai),
            Idol(12, "Bui Tien Dung 2", "Footballer", R.drawable.buitiendung),
            Idol(13, "Duy Manh 2", "Footballer", R.drawable.duymanh),
            Idol(14, "Cong Phuong 2", "Footballer", R.drawable.congphuong),
            Idol(15, "Van Toan 2", "Footballer", R.drawable.vantoan),
        )
    }
}



