package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzetf implements zzetr {
    private final zzgcs zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    @Nullable
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzetf(zzgcs zzgcsVar, Context context, VersionInfoParcel versionInfoParcel, @Nullable String str) {
        this.zza = zzgcsVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzete
            {
                zzetf.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetf.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzetg zzc() throws Exception {
        int i;
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zzF = com.google.android.gms.ads.internal.util.zzs.zzF(this.zzb);
        String str = this.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zzG = com.google.android.gms.ads.internal.util.zzs.zzG();
        com.google.android.gms.ads.internal.zzv.zzq();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        if (applicationInfo == null) {
            i = 0;
        } else {
            i = applicationInfo.targetSdkVersion;
        }
        int i2 = i;
        Context context = this.zzb;
        return new zzetg(isCallerInstantApp, zzF, str, zzG, i2, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
