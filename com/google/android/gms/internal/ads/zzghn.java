package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzghn {
    private zzghp zza;
    private String zzb;
    private zzgho zzc;
    private zzgeu zzd;

    private zzghn() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzghn(zzghq zzghqVar) {
    }

    public final zzghn zza(zzgeu zzgeuVar) {
        this.zzd = zzgeuVar;
        return this;
    }

    public final zzghn zzb(zzgho zzghoVar) {
        this.zzc = zzghoVar;
        return this;
    }

    public final zzghn zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzghn zzd(zzghp zzghpVar) {
        this.zza = zzghpVar;
        return this;
    }

    public final zzghr zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzghp.zzb;
        }
        if (this.zzb != null) {
            zzgho zzghoVar = this.zzc;
            if (zzghoVar != null) {
                zzgeu zzgeuVar = this.zzd;
                if (zzgeuVar != null) {
                    if (!zzgeuVar.zza()) {
                        if ((zzghoVar.equals(zzgho.zza) && (zzgeuVar instanceof zzggf)) || ((zzghoVar.equals(zzgho.zzc) && (zzgeuVar instanceof zzggw)) || ((zzghoVar.equals(zzgho.zzb) && (zzgeuVar instanceof zzgir)) || ((zzghoVar.equals(zzgho.zzd) && (zzgeuVar instanceof zzgfk)) || ((zzghoVar.equals(zzgho.zze) && (zzgeuVar instanceof zzgfu)) || (zzghoVar.equals(zzgho.zzf) && (zzgeuVar instanceof zzggq))))))) {
                            return new zzghr(this.zza, this.zzb, this.zzc, this.zzd, null);
                        }
                        String zzghoVar2 = this.zzc.toString();
                        String valueOf = String.valueOf(this.zzd);
                        throw new GeneralSecurityException("Cannot use parsing strategy " + zzghoVar2 + " when new keys are picked according to " + valueOf + ".");
                    }
                    throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                }
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        throw new GeneralSecurityException("kekUri must be set");
    }
}
