package com.smaato.sdk.core.p572ub;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.p572ub.AutoValue_UbId;

@AutoValue.CopyAnnotations
@AutoValue
/* renamed from: com.smaato.sdk.core.ub.UbId */
/* loaded from: classes7.dex */
public abstract class UbId {

    @AutoValue.Builder
    /* renamed from: com.smaato.sdk.core.ub.UbId$Builder */
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract Builder adSpaceId(String str);

        public abstract UbId build();

        public abstract Builder sessionId(String str);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_UbId.C27280b();
    }

    @Nullable
    public static UbId create(@NonNull String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String[] split = str2.split(":");
        if (split.length != 2) {
            return null;
        }
        String str3 = split[0];
        String str4 = split[1];
        if (TextUtils.isEmpty(str4) || !str.equalsIgnoreCase(str3)) {
            return null;
        }
        return builder().adSpaceId(str).sessionId(str4).build();
    }

    @NonNull
    public abstract String adSpaceId();

    @NonNull
    public abstract String sessionId();

    @NonNull
    public String toString() {
        return adSpaceId() + ":" + sessionId();
    }
}
