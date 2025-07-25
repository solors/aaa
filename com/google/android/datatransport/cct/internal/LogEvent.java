package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.AutoValue_LogEvent;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes4.dex */
public abstract class LogEvent {

    @AutoValue.Builder
    /* loaded from: classes4.dex */
    public static abstract class Builder {
        @NonNull
        /* renamed from: a */
        abstract Builder mo76328a(@Nullable byte[] bArr);

        @NonNull
        /* renamed from: b */
        abstract Builder mo76327b(@Nullable String str);

        @NonNull
        public abstract LogEvent build();

        @NonNull
        public abstract Builder setEventCode(@Nullable Integer num);

        @NonNull
        public abstract Builder setEventTimeMs(long j);

        @NonNull
        public abstract Builder setEventUptimeMs(long j);

        @NonNull
        public abstract Builder setNetworkConnectionInfo(@Nullable NetworkConnectionInfo networkConnectionInfo);

        @NonNull
        public abstract Builder setTimezoneOffsetSeconds(long j);
    }

    /* renamed from: a */
    private static Builder m76329a() {
        return new AutoValue_LogEvent.Builder();
    }

    @NonNull
    public static Builder jsonBuilder(@NonNull String str) {
        return m76329a().mo76327b(str);
    }

    @NonNull
    public static Builder protoBuilder(@NonNull byte[] bArr) {
        return m76329a().mo76328a(bArr);
    }

    @Nullable
    public abstract Integer getEventCode();

    public abstract long getEventTimeMs();

    public abstract long getEventUptimeMs();

    @Nullable
    public abstract NetworkConnectionInfo getNetworkConnectionInfo();

    @Nullable
    public abstract byte[] getSourceExtension();

    @Nullable
    public abstract String getSourceExtensionJsonProto3();

    public abstract long getTimezoneOffsetSeconds();
}
