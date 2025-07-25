package com.google.android.gms.internal.ads;

import com.google.firebase.sessions.settings.RemoteSettings;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzanx {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzanx(int i, int i2, int i3) {
        String str;
        if (i == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = i + RemoteSettings.FORWARD_SLASH_STRING;
        }
        this.zza = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public final int zza() {
        zzd();
        return this.zzd;
    }

    public final String zzb() {
        zzd();
        return this.zze;
    }

    public final void zzc() {
        int i;
        int i2 = this.zzd;
        if (i2 == Integer.MIN_VALUE) {
            i = this.zzb;
        } else {
            i = i2 + this.zzc;
        }
        this.zzd = i;
        String str = this.zza;
        this.zze = str + i;
    }
}
