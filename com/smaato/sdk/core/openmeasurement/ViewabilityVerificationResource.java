package com.smaato.sdk.core.openmeasurement;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public final class ViewabilityVerificationResource {
    @NonNull
    private final String apiFramework;
    @NonNull
    private String jsScriptUrl;
    private final boolean noBrowser;
    @Nullable
    private final String parameters;
    @NonNull
    private final String vendor;

    public ViewabilityVerificationResource(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4, boolean z) {
        this.jsScriptUrl = "";
        this.vendor = (String) Objects.requireNonNull(str);
        this.jsScriptUrl = (String) Objects.requireNonNull(str2);
        this.apiFramework = (String) Objects.requireNonNull(str3);
        this.parameters = str4;
        this.noBrowser = z;
    }

    @NonNull
    public String getApiFramework() {
        return this.apiFramework;
    }

    @NonNull
    public String getJsScriptUrl() {
        return this.jsScriptUrl;
    }

    @Nullable
    public String getParameters() {
        return this.parameters;
    }

    @NonNull
    public String getVendor() {
        return this.vendor;
    }

    public boolean isNoBrowser() {
        return this.noBrowser;
    }
}
