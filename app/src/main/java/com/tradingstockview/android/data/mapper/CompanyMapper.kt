package com.tradingstockview.android.data.mapper

import com.tradingstockview.android.data.local.CompanyListingEntity
import com.tradingstockview.android.data.remote.dto.CompanyInfoDto
import com.tradingstockview.android.domain.model.CompanyInfo
import com.tradingstockview.android.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}