package com.google.android.gms.ads.nonagon.util.logging.csi;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzher;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class CsiUrlBuilder_Factory implements zzher<CsiUrlBuilder> {
    @NonNull
    public static CsiUrlBuilder_Factory create() {
        CsiUrlBuilder_Factory csiUrlBuilder_Factory;
        csiUrlBuilder_Factory = zza.zza;
        return csiUrlBuilder_Factory;
    }

    @NonNull
    public static CsiUrlBuilder newInstance() {
        return new CsiUrlBuilder();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    @NonNull
    /* renamed from: get */
    public CsiUrlBuilder zzb() {
        return newInstance();
    }
}
