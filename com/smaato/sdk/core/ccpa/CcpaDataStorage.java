package com.smaato.sdk.core.ccpa;

import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public final class CcpaDataStorage {
    @NonNull
    private final SharedPreferences defaultSharedPreferences;

    public CcpaDataStorage(@NonNull SharedPreferences sharedPreferences) {
        this.defaultSharedPreferences = (SharedPreferences) Objects.requireNonNull(sharedPreferences);
    }

    @NonNull
    public String getUsPrivacyString() {
        return this.defaultSharedPreferences.getString("IABUSPrivacy_String", "");
    }
}
