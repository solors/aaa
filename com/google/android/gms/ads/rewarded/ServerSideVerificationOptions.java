package com.google.android.gms.ads.rewarded;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public class ServerSideVerificationOptions {
    private final String zza;
    private final String zzb;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private String zza = "";
        private String zzb = "";

        @NonNull
        public ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this, null);
        }

        @NonNull
        public Builder setCustomData(@NonNull String str) {
            this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setUserId(@NonNull String str) {
            this.zza = str;
            return this;
        }
    }

    /* synthetic */ ServerSideVerificationOptions(Builder builder, zzd zzdVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
    }

    @NonNull
    public String getCustomData() {
        return this.zzb;
    }

    @NonNull
    public String getUserId() {
        return this.zza;
    }
}
