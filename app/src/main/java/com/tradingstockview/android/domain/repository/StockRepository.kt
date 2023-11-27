package com.tradingstockview.android.domain.repository

import com.tradingstockview.android.domain.model.CompanyInfo
import com.tradingstockview.android.domain.model.CompanyListing
import com.tradingstockview.android.domain.model.IntradayInfo
import com.tradingstockview.android.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}