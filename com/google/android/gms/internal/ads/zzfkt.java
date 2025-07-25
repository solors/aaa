package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfkt extends zzfkp {
    private final zzfkr zza;
    private zzfnb zzc;
    private zzfma zzd;
    private final String zzg;
    private final zzflo zzb = new zzflo();
    private boolean zze = false;
    private boolean zzf = false;

    public zzfkt(zzfkq zzfkqVar, zzfkr zzfkrVar, String str) {
        this.zza = zzfkrVar;
        this.zzg = str;
        zzk(null);
        if (zzfkrVar.zzd() != zzfks.HTML && zzfkrVar.zzd() != zzfks.JAVASCRIPT) {
            this.zzd = new zzfme(str, zzfkrVar.zzi(), null);
        } else {
            this.zzd = new zzfmb(str, zzfkrVar.zza());
        }
        this.zzd.zzo();
        zzflk.zza().zzd(this);
        this.zzd.zzf(zzfkqVar);
    }

    private final void zzk(@Nullable View view) {
        this.zzc = new zzfnb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zzb(View view, zzfkw zzfkwVar, @Nullable String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfkwVar, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zze();
        zzflk.zza().zze(this);
        this.zzd.zzc();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zzd(@Nullable View view) {
        if (!this.zzf && zzf() != view) {
            zzk(view);
            this.zzd.zzb();
            Collection<zzfkt> zzc = zzflk.zza().zzc();
            if (zzc != null && !zzc.isEmpty()) {
                for (zzfkt zzfktVar : zzc) {
                    if (zzfktVar != this && zzfktVar.zzf() == view) {
                        zzfktVar.zzc.clear();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zze() {
        if (!this.zze && this.zzd != null) {
            this.zze = true;
            zzflk.zza().zzf(this);
            this.zzd.zzl(zzfls.zzb().zza());
            this.zzd.zzg(zzfli.zza().zzb());
            this.zzd.zzi(this, this.zza);
        }
    }

    public final View zzf() {
        return (View) this.zzc.get();
    }

    public final zzfma zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzb.zza();
    }

    public final boolean zzj() {
        if (this.zze && !this.zzf) {
            return true;
        }
        return false;
    }
}
