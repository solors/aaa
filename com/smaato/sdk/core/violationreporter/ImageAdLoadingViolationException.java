package com.smaato.sdk.core.violationreporter;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ImageAdLoadingViolationException extends Exception {
    @NonNull
    public final String adQualityViolationType;
    @NonNull
    public String adSpaceId;
    @NonNull
    public String bundle;
    @NonNull
    public final List<String> clickTrackingUrls;
    @NonNull
    public final String clickUrl;
    @NonNull
    public String client;
    @NonNull
    public final String originalUrl;
    @NonNull
    public String publisherId;
    @NonNull
    public Map<String, List<String>> responseHeaders;
    @NonNull
    public final String violatedUrl;

    public ImageAdLoadingViolationException(@NonNull String str, @NonNull Map<String, List<String>> map, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6, @NonNull List<String> list, @NonNull String str7, @NonNull String str8) {
        this.adQualityViolationType = (String) Objects.requireNonNull(str);
        this.responseHeaders = map;
        this.publisherId = str2;
        this.adSpaceId = str3;
        this.bundle = str4;
        this.client = str5;
        this.clickUrl = str6;
        this.clickTrackingUrls = list;
        this.violatedUrl = (String) Objects.requireNonNull(str7);
        this.originalUrl = (String) Objects.requireNonNull(str8);
    }

    @Override // java.lang.Throwable
    @NonNull
    public String toString() {
        return "ImageAdLoadingViolationException{adQualityViolationType=" + this.adQualityViolationType + ", publisherId=" + this.publisherId + ", adSpaceId=" + this.adSpaceId + ", bundle=" + this.bundle + ", client=" + this.client + ", clickUrl=" + this.clickUrl + ", violatedUrl='" + this.violatedUrl + "', originalUrl='" + this.originalUrl + "'}";
    }
}
