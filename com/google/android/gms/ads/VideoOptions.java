package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzga;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        @NonNull
        public VideoOptions build() {
            return new VideoOptions(this, null);
        }

        @NonNull
        public Builder setClickToExpandRequested(boolean z) {
            this.zzc = z;
            return this;
        }

        @NonNull
        public Builder setCustomControlsRequested(boolean z) {
            this.zzb = z;
            return this;
        }

        @NonNull
        public Builder setStartMuted(boolean z) {
            this.zza = z;
            return this;
        }
    }

    /* synthetic */ VideoOptions(Builder builder, zzj zzjVar) {
        this.zza = builder.zza;
        this.zzb = builder.zzb;
        this.zzc = builder.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }

    public VideoOptions(zzga zzgaVar) {
        this.zza = zzgaVar.zza;
        this.zzb = zzgaVar.zzb;
        this.zzc = zzgaVar.zzc;
    }
}
