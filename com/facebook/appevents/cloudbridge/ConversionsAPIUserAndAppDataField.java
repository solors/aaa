package com.facebook.appevents.cloudbridge;

import com.applovin.sdk.AppLovinEventParameters;
import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppEventsConversionsAPITransformer.kt */
@Metadata
/* loaded from: classes2.dex */
public enum ConversionsAPIUserAndAppDataField {
    ANON_ID("anon_id"),
    FB_LOGIN_ID("fb_login_id"),
    MAD_ID("madid"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA(AppLovinEventParameters.IN_APP_PURCHASE_DATA),
    URL_SCHEMES("url_schemes");
    
    @NotNull
    private final String rawValue;

    ConversionsAPIUserAndAppDataField(String str) {
        this.rawValue = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ConversionsAPIUserAndAppDataField[] valuesCustom() {
        ConversionsAPIUserAndAppDataField[] valuesCustom = values();
        return (ConversionsAPIUserAndAppDataField[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
