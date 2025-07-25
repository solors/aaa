package com.taurusx.tax.vast;

import com.bykv.p135vk.openvk.preload.falconx.statistic.StatisticData;
import com.taurusx.tax.p606j.C28530n;

/* loaded from: classes7.dex */
public enum VastErrorCode {
    XML_PARSING_ERROR(StatisticData.ERROR_CODE_NOT_FOUND),
    WRAPPER_TIMEOUT("301"),
    NO_ADS_VAST_RESPONSE("303"),
    GENERAL_LINEAR_AD_ERROR("400"),
    GENERAL_COMPANION_AD_ERROR("600"),
    UNDEFINED_ERROR("900");

    VastErrorCode(String str) {
        C28530n.m37996a(str, "errorCode cannot be null");
    }
}
