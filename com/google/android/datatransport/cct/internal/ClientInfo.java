package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes4.dex */
public abstract class ClientInfo {

    @AutoValue.Builder
    /* loaded from: classes4.dex */
    public static abstract class Builder {
        @NonNull
        public abstract ClientInfo build();

        @NonNull
        public abstract Builder setAndroidClientInfo(@Nullable AndroidClientInfo androidClientInfo);

        @NonNull
        public abstract Builder setClientType(@Nullable ClientType clientType);
    }

    /* loaded from: classes4.dex */
    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        

        /* renamed from: b */
        private final int f30977b;

        ClientType(int i) {
            this.f30977b = i;
        }
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_ClientInfo.Builder();
    }

    @Nullable
    public abstract AndroidClientInfo getAndroidClientInfo();

    @Nullable
    public abstract ClientType getClientType();
}
