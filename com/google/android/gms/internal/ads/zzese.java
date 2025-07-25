package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzese implements zzetr {
    private final ApplicationInfo zza;
    @Nullable
    private final PackageInfo zzb;
    private final Context zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzese(ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        Integer valueOf;
        String str;
        String str2;
        String str3;
        String str4;
        PackageManager.NameNotFoundException e;
        String str5;
        InstallSourceInfo installSourceInfo;
        String str6 = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        if (packageInfo == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(packageInfo.versionCode);
        }
        PackageInfo packageInfo2 = this.zzb;
        if (packageInfo2 == null) {
            str = null;
        } else {
            str = packageInfo2.versionName;
        }
        try {
            Context context = this.zzc;
            zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
            str2 = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str6));
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmD)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str6);
                } catch (PackageManager.NameNotFoundException e2) {
                    str3 = null;
                    e = e2;
                    str5 = null;
                }
                if (installSourceInfo != null) {
                    str3 = installSourceInfo.getInstallingPackageName();
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                            str3 = null;
                        }
                        str5 = installSourceInfo.getInitiatingPackageName();
                        try {
                        } catch (PackageManager.NameNotFoundException e3) {
                            e = e3;
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "PackageInfoSignalSource.getInstallSourceInfo");
                            str4 = str5;
                            return zzgch.zzh(new zzesf(str6, valueOf, str, str2, str3, str4));
                        }
                    } catch (PackageManager.NameNotFoundException e4) {
                        e = e4;
                        str5 = null;
                    }
                    if (TextUtils.isEmpty(str5)) {
                        com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                        str4 = null;
                        return zzgch.zzh(new zzesf(str6, valueOf, str, str2, str3, str4));
                    }
                    str4 = str5;
                    return zzgch.zzh(new zzesf(str6, valueOf, str, str2, str3, str4));
                }
            }
        }
        str3 = null;
        str4 = null;
        return zzgch.zzh(new zzesf(str6, valueOf, str, str2, str3, str4));
    }
}
