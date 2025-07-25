package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbdk extends CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    @Nullable
    private Context zzc;
    @Nullable
    private zzdrw zzd;
    @Nullable
    private CustomTabsSession zze;
    @Nullable
    private CustomTabsClient zzf;

    private final void zzf(@Nullable Context context) {
        String packageName;
        if (this.zzf == null && context != null && (packageName = CustomTabsClient.getPackageName(context, null)) != null) {
            CustomTabsClient.bindCustomTabsService(context, packageName, this);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.warmup(0L);
        this.zze = customTabsClient.newSession(new zzbdj(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    @Nullable
    public final CustomTabsSession zza() {
        if (this.zze == null) {
            zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdi
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdk.this.zzc();
                }
            });
        }
        return this.zze;
    }

    public final void zzb(Context context, zzdrw zzdrwVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdrwVar;
        zzf(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        zzf(this.zzc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(int i) {
        zzdrw zzdrwVar = this.zzd;
        if (zzdrwVar != null) {
            zzdrv zza2 = zzdrwVar.zza();
            zza2.zzb("action", "cct_nav");
            zza2.zzb("cct_navs", String.valueOf(i));
            zza2.zzg();
        }
    }

    @VisibleForTesting
    public final void zze(final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeF)).booleanValue() && this.zzd != null) {
            zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdh
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdk.this.zzd(i);
                }
            });
        }
    }
}
