package com.facebook.appevents.cloudbridge;

import com.applovin.sdk.AppLovinEventParameters;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppEventsConversionsAPITransformer.kt */
@Metadata
/* loaded from: classes2.dex */
public enum AppEventUserAndAppDataField {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
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
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String rawValue;

    /* compiled from: AppEventsConversionsAPITransformer.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final AppEventUserAndAppDataField invoke(@NotNull String rawValue) {
            AppEventUserAndAppDataField[] valuesCustom;
            Intrinsics.checkNotNullParameter(rawValue, "rawValue");
            for (AppEventUserAndAppDataField appEventUserAndAppDataField : AppEventUserAndAppDataField.valuesCustom()) {
                if (Intrinsics.m17075f(appEventUserAndAppDataField.getRawValue(), rawValue)) {
                    return appEventUserAndAppDataField;
                }
            }
            return null;
        }
    }

    AppEventUserAndAppDataField(String str) {
        this.rawValue = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AppEventUserAndAppDataField[] valuesCustom() {
        AppEventUserAndAppDataField[] valuesCustom = values();
        return (AppEventUserAndAppDataField[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }
}
