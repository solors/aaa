package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapr;
import com.google.android.gms.internal.ads.zzaqr;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzbj extends zzaqr {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbo zzboVar, int i, String str, zzapr zzaprVar, zzapq zzapqVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, zzaprVar, zzapqVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final Map zzl() throws zzaou {
        Map map = this.zzb;
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqr, com.google.android.gms.internal.ads.zzapm
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final byte[] zzx() throws zzaou {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqr
    public final void zzz(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
