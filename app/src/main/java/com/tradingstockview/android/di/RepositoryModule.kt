package com.tradingstockview.android.di

import com.tradingstockview.android.data.csv.CSVParser
import com.tradingstockview.android.data.csv.CompanyListingsParser
import com.tradingstockview.android.data.csv.IntradayInfoParser
import com.tradingstockview.android.data.repository.StockRepositoryImpl
import com.tradingstockview.android.domain.model.CompanyListing
import com.tradingstockview.android.domain.model.IntradayInfo
import com.tradingstockview.android.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}