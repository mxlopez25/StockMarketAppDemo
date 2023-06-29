package com.plcoding.stockmarketapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plcoding.stockmarketapp.domain.model.CompanyListing

@Database(
    entities = [CompanyListing::class],
    version = 1
)
abstract class StockDatabase: RoomDatabase() {
    abstract val dao: StockDao
}