package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzdmy implements com.google.android.gms.ads.internal.client.zza, zzbif, com.google.android.gms.ads.internal.overlay.zzr, zzbih, com.google.android.gms.ads.internal.overlay.zzac {
    private com.google.android.gms.ads.internal.client.zza zza;
    private zzbif zzb;
    private com.google.android.gms.ads.internal.overlay.zzr zzc;
    private zzbih zzd;
    private com.google.android.gms.ads.internal.overlay.zzac zze;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zza;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbif
    public final synchronized void zza(String str, Bundle bundle) {
        zzbif zzbifVar = this.zzb;
        if (zzbifVar != null) {
            zzbifVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final synchronized void zzb(String str, @Nullable String str2) {
        zzbih zzbihVar = this.zzd;
        if (zzbihVar != null) {
            zzbihVar.zzb(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdE() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdE();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdi() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdi();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdo() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdo();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdp();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzdr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzds(int i) {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzc;
        if (zzrVar != null) {
            zzrVar.zzds(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzac
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzac zzacVar = this.zze;
        if (zzacVar != null) {
            zzacVar.zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zza zzaVar, zzbif zzbifVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbih zzbihVar, com.google.android.gms.ads.internal.overlay.zzac zzacVar) {
        this.zza = zzaVar;
        this.zzb = zzbifVar;
        this.zzc = zzrVar;
        this.zzd = zzbihVar;
        this.zze = zzacVar;
    }
}
