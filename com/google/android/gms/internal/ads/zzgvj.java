package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgvj extends ThreadLocal {
    final /* synthetic */ zzgvk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgvj(zzgvk zzgvkVar) {
        this.zza = zzgvkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzguw zzguwVar = zzguw.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzguwVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
