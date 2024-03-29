package com.example.seoulparkinfoex.seoulParkApi


import com.squareup.moshi.Json

data class Row(
    @field:Json(name = "ADDR")
    val aDDR: String?,
    @field:Json(name = "ADD_RATES")
    val aDDRATES: Double?,
    @field:Json(name = "ADD_TIME_RATE")
    val aDDTIMERATE: Double?,
    @field:Json(name = "BUS_ADD_RATES")
    val bUSADDRATES: Double?,
    @field:Json(name = "BUS_ADD_TIME_RATE")
    val bUSADDTIMERATE: Double?,
    @field:Json(name = "BUS_RATES")
    val bUSRATES: Double?,
    @field:Json(name = "BUS_TIME_RATE")
    val bUSTIMERATE: Double?,
    @field:Json(name = "CAPACITY")
    val cAPACITY: Double?,
    @field:Json(name = "DAY_MAXIMUM")
    val dAYMAXIMUM: Double?,
    @field:Json(name = "FULLTIME_MONTHLY")
    val fULLTIMEMONTHLY: String?,
    @field:Json(name = "GRP_PARKNM")
    val gRPPARKNM: String?,
    @field:Json(name = "HOLIDAY_BEGIN_TIME")
    val hOLIDAYBEGINTIME: String?,
    @field:Json(name = "HOLIDAY_END_TIME")
    val hOLIDAYENDTIME: String?,
    @field:Json(name = "HOLIDAY_PAY_NM")
    val hOLIDAYPAYNM: String?,
    @field:Json(name = "HOLIDAY_PAY_YN")
    val hOLIDAYPAYYN: String?,
    @field:Json(name = "LAT")
    val lAT: Double?,
    @field:Json(name = "LNG")
    val lNG: Double?,
    @field:Json(name = "NIGHT_FREE_OPEN")
    val nIGHTFREEOPEN: String?,
    @field:Json(name = "NIGHT_FREE_OPEN_NM")
    val nIGHTFREEOPENNM: String?,
    @field:Json(name = "OPERATION_RULE")
    val oPERATIONRULE: String?,
    @field:Json(name = "OPERATION_RULE_NM")
    val oPERATIONRULENM: String?,
    @field:Json(name = "PARKING_CODE")
    val pARKINGCODE: String?,
    @field:Json(name = "PARKING_NAME")
    val pARKINGNAME: String?,
    @field:Json(name = "PARKING_TYPE")
    val pARKINGTYPE: String?,
    @field:Json(name = "PARKING_TYPE_NM")
    val pARKINGTYPENM: String?,
    @field:Json(name = "PAY_NM")
    val pAYNM: String?,
    @field:Json(name = "PAY_YN")
    val pAYYN: String?,
    @field:Json(name = "QUE_STATUS")
    val qUESTATUS: String?,
    @field:Json(name = "QUE_STATUS_NM")
    val qUESTATUSNM: String?,
    @field:Json(name = "RATES")
    val rATES: Double?,
    @field:Json(name = "SATURDAY_PAY_NM")
    val sATURDAYPAYNM: String?,
    @field:Json(name = "SATURDAY_PAY_YN")
    val sATURDAYPAYYN: String?,
    @field:Json(name = "SYNC_TIME")
    val sYNCTIME: String?,
    @field:Json(name = "TEL")
    val tEL: String?,
    @field:Json(name = "TIME_RATE")
    val tIMERATE: Double?,
    @field:Json(name = "WEEKDAY_BEGIN_TIME")
    val wEEKDAYBEGINTIME: String?,
    @field:Json(name = "WEEKDAY_END_TIME")
    val wEEKDAYENDTIME: String?,
    @field:Json(name = "WEEKEND_BEGIN_TIME")
    val wEEKENDBEGINTIME: String?,
    @field:Json(name = "WEEKEND_END_TIME")
    val wEEKENDENDTIME: String?
)