package com.smaato.sdk.core.gpp;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public class SomaGppData {
    @NonNull
    private final SharedPreferences defaultSharedPreferences;

    public SomaGppData(@NonNull SharedPreferences sharedPreferences) {
        this.defaultSharedPreferences = (SharedPreferences) Objects.requireNonNull(sharedPreferences, "defaultSharedPreferences must not be null for Gpp::new");
    }

    public String getGppSid() {
        return this.defaultSharedPreferences.getString("IABGPP_GppSID", null);
    }

    public String getGppString() {
        return this.defaultSharedPreferences.getString("IABGPP_HDR_GppString", null);
    }
}
