package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbym implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbyn zza;
    private final String zzb;

    public zzbym(zzbyn zzbynVar, String str) {
        this.zza = zzbynVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzbyl> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzbyl zzbylVar : list) {
                zzbylVar.zza.zzb(zzbylVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
