package com.smaato.sdk.richmedia.util;

import android.content.Context;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import com.vungle.ads.internal.Constants;

/* loaded from: classes7.dex */
public final class RichMediaHtmlUtils {
    private final boolean loggingEnabled;

    public RichMediaHtmlUtils(@NonNull Boolean bool) {
        this.loggingEnabled = ((Boolean) Objects.requireNonNull(bool)).booleanValue();
    }

    /* renamed from: a */
    public static /* synthetic */ void m39019a(StringBuilder sb2, String str) {
        lambda$getMraidEnvironmentDetails$0(sb2, str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39018b(StringBuilder sb2, Integer num) {
        lambda$getMraidEnvironmentDetails$2(sb2, num);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39017c(StringBuilder sb2, Boolean bool) {
        lambda$getMraidEnvironmentDetails$1(sb2, bool);
    }

    @NonNull
    private String getMraidEnvironmentDetails(@NonNull MraidEnvironmentProperties mraidEnvironmentProperties) {
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("window.MRAID_ENV = {\n");
        sb2.append(String.format("version:'%s',\n", MraidEnvironmentProperties.VERSION));
        sb2.append(String.format("sdk: '%s',\n", MraidEnvironmentProperties.SDK));
        sb2.append(String.format("sdkVersion: '%s',\n", mraidEnvironmentProperties.sdkVersion));
        sb2.append(String.format("appId: '%s',\n", mraidEnvironmentProperties.appId));
        Objects.onNotNull(mraidEnvironmentProperties.googleAdId, new Consumer() { // from class: com.smaato.sdk.richmedia.util.f
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                RichMediaHtmlUtils.m39019a(sb2, (String) obj);
            }
        });
        Objects.onNotNull(mraidEnvironmentProperties.googleDnt, new Consumer() { // from class: com.smaato.sdk.richmedia.util.g
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                RichMediaHtmlUtils.m39017c(sb2, (Boolean) obj);
            }
        });
        Objects.onNotNull(mraidEnvironmentProperties.coppa, new Consumer() { // from class: com.smaato.sdk.richmedia.util.h
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                RichMediaHtmlUtils.m39018b(sb2, (Integer) obj);
            }
        });
        sb2.append("};");
        return sb2.toString();
    }

    public static /* synthetic */ void lambda$getMraidEnvironmentDetails$0(StringBuilder sb2, String str) {
        sb2.append(String.format("ifa: '%s',\n", str));
    }

    public static /* synthetic */ void lambda$getMraidEnvironmentDetails$1(StringBuilder sb2, Boolean bool) {
        sb2.append(String.format("limitAdTracking: %b,\n", bool));
    }

    public static /* synthetic */ void lambda$getMraidEnvironmentDetails$2(StringBuilder sb2, Integer num) {
        boolean z = true;
        Object[] objArr = new Object[1];
        if (num.intValue() != 1) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        sb2.append(String.format("coppa: %b,\n", objArr));
    }

    @NonNull
    public String createHtml(@NonNull String str, @NonNull Context context, @NonNull MraidEnvironmentProperties mraidEnvironmentProperties) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(context);
        Objects.requireNonNull(mraidEnvironmentProperties);
        return "<!DOCTYPE html><html style='margin: 0px; padding: 0px; width: 100%; height: 100%;'><head><meta name='viewport' content='initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no'/><style>body {margin: 0px; min-height: 100%%; position: relative; padding: 0px; width: 100%%; height: 100%%;}</style><script src=\"file:///android_asset/mraid.js\"></script><script>" + getMraidEnvironmentDetails(mraidEnvironmentProperties) + "</script></head><body><script src=\"file:///android_asset/omsdk-v1.js\"></script>" + str.replaceAll(Constants.AD_MRAID_JS_FILE_NAME, "file:///android_asset/mraid.js") + "</body></html>";
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }
}
