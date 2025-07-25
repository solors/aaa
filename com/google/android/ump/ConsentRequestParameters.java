package com.google.android.ump;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes5.dex */
public class ConsentRequestParameters {

    /* renamed from: a */
    private final boolean f39285a;
    @Nullable

    /* renamed from: b */
    private final String f39286b;
    @Nullable

    /* renamed from: c */
    private final ConsentDebugSettings f39287c;

    /* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        private boolean f39288a;
        @Nullable

        /* renamed from: b */
        private String f39289b;
        @Nullable

        /* renamed from: c */
        private ConsentDebugSettings f39290c;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(@Nullable String str) {
            this.f39289b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.f39290c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z) {
            this.f39288a = z;
            return this;
        }
    }

    /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.f39285a = builder.f39288a;
        this.f39286b = builder.f39289b;
        this.f39287c = builder.f39290c;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f39287c;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f39285a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f39286b;
    }
}
