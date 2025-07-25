package com.google.android.gms.ads.internal.client;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbpe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@KeepForSdk
/* loaded from: classes4.dex */
public class LiteSdkInfo extends zzcv {
    public LiteSdkInfo(@NonNull Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public zzbpe getAdapterCreator() {
        return new zzbpa();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public zzfb getLiteSdkVersion() {
        return new zzfb(ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }
}
