package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.content.Context;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.lgpd.SomaLgpdDataSource;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.util.DeviceUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class MraidSupportsProperties {
    @NonNull
    private final AppMetaData appMetaData;
    @NonNull
    private final SdkConfiguration sdkConfiguration;
    @NonNull
    private final SomaGdprDataSource somaGdprDataSource;
    @NonNull
    private final SomaLgpdDataSource somaLgpdDataSource;

    public MraidSupportsProperties(@NonNull AppMetaData appMetaData, @NonNull SdkConfiguration sdkConfiguration, @NonNull SomaGdprDataSource somaGdprDataSource, @NonNull SomaLgpdDataSource somaLgpdDataSource) {
        this.appMetaData = (AppMetaData) Objects.requireNonNull(appMetaData);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration);
        this.somaGdprDataSource = (SomaGdprDataSource) Objects.requireNonNull(somaGdprDataSource);
        this.somaLgpdDataSource = (SomaLgpdDataSource) Objects.requireNonNull(somaLgpdDataSource);
    }

    @NonNull
    public String[] getAllMraidFeatures() {
        return new String[]{"sms", "tel", "calendar", "storePicture", "inlineVideo", "location", "vpaid"};
    }

    @NonNull
    public List<String> getSupportedFeatures(@NonNull Context context, @NonNull WebView webView) {
        ArrayList arrayList = new ArrayList();
        if (DeviceUtils.isSmsAvailable(context)) {
            arrayList.add("sms");
        }
        if (DeviceUtils.isTelAvailable(context)) {
            arrayList.add("tel");
        }
        if (DeviceUtils.isInlineVideoSupported(context, webView)) {
            arrayList.add("inlineVideo");
        }
        return arrayList;
    }
}
