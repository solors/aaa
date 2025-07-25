package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzenq implements zzetq {
    private final Integer zza;

    private zzenq(Integer num) {
        this.zza = num;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzenq zzc(VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjT)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            int i = 0;
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                    i = SdkExtensions.getExtensionVersion(1000000);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjW)).booleanValue()) {
                        if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjV)).intValue() && i2 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                            i = SdkExtensions.getExtensionVersion(31);
                        }
                    }
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdUtil.getAdServicesExtensionVersion");
            }
            return new zzenq(Integer.valueOf(i));
        }
        return new zzenq(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (num != null) {
            zzcuvVar.zza.putInt("aos", num.intValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }
}
