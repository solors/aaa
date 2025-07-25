package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzglr {
    private ArrayList zza = new ArrayList();
    private zzglo zzb = zzglo.zza;
    private Integer zzc = null;

    public final zzglr zza(zzgdz zzgdzVar, int i, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzgls(zzgdzVar, i, str, str2, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzglr zzb(zzglo zzgloVar) {
        if (this.zza != null) {
            this.zzb = zzgloVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzglr zzc(int i) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzglu zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.zza;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int zza = ((zzgls) arrayList.get(i)).zza();
                    i++;
                    if (zza == intValue) {
                        zzglu zzgluVar = new zzglu(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
                        this.zza = null;
                        return zzgluVar;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zzglu zzgluVar2 = new zzglu(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
            this.zza = null;
            return zzgluVar2;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
