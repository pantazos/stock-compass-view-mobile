package com.tradingstockview.android.presentation.company_info

import com.tradingstockview.android.domain.model.CompanyInfo
import com.tradingstockview.android.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
