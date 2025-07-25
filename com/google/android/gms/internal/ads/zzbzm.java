package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbzm {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzbzq zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;
    @Nullable
    private zzbcq zzh;
    @Nullable
    private Boolean zzi;
    private final AtomicInteger zzj;
    private final AtomicInteger zzk;
    private final zzbzk zzl;
    private final Object zzm;
    @GuardedBy("grantedPermissionLock")
    private ListenableFuture zzn;
    private final AtomicBoolean zzo;

    public zzbzm() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzbzq(com.google.android.gms.ads.internal.client.zzbc.zzd(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = new AtomicInteger(0);
        this.zzk = new AtomicInteger(0);
        this.zzl = new zzbzk(null);
        this.zzm = new Object();
        this.zzo = new AtomicBoolean();
    }

    public final boolean zzA(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzim)).booleanValue()) {
                return this.zzo.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final int zza() {
        return this.zzk.get();
    }

    public final int zzb() {
        return this.zzj.get();
    }

    @Nullable
    public final Context zzd() {
        return this.zze;
    }

    @Nullable
    public final Resources zze() {
        if (this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkL)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzs.zza(this.zze).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zza(this.zze).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    @Nullable
    public final zzbcq zzg() {
        zzbcq zzbcqVar;
        synchronized (this.zza) {
            zzbcqVar = this.zzh;
        }
        return zzbcqVar;
    }

    public final zzbzq zzh() {
        return this.zzc;
    }

    public final com.google.android.gms.ads.internal.util.zzg zzi() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final ListenableFuture zzk() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcW)).booleanValue()) {
                synchronized (this.zzm) {
                    ListenableFuture listenableFuture = this.zzn;
                    if (listenableFuture != null) {
                        return listenableFuture;
                    }
                    ListenableFuture zzb = zzbzw.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzbzh
                        {
                            zzbzm.this = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzbzm.this.zzo();
                        }
                    });
                    this.zzn = zzb;
                    return zzb;
                }
            }
        }
        return zzgch.zzh(new ArrayList());
    }

    public final Boolean zzl() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzi;
        }
        return bool;
    }

    public final String zzn() {
        return this.zzg;
    }

    public final /* synthetic */ ArrayList zzo() throws Exception {
        Context zza = zzbvu.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(zza).getPackageInfo(zza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzl.zza();
    }

    public final void zzr() {
        this.zzj.decrementAndGet();
    }

    public final void zzs() {
        this.zzk.incrementAndGet();
    }

    public final void zzt() {
        this.zzj.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzu(Context context, VersionInfoParcel versionInfoParcel) {
        zzbcq zzbcqVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = versionInfoParcel;
                com.google.android.gms.ads.internal.zzv.zzb().zzc(this.zzc);
                this.zzb.zzp(this.zze);
                zzbuh.zzb(this.zze, this.zzf);
                com.google.android.gms.ads.internal.zzv.zze();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcf)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbcqVar = null;
                } else {
                    zzbcqVar = new zzbcq();
                }
                this.zzh = zzbcqVar;
                if (zzbcqVar != null) {
                    zzbzz.zza(new zzbzi(this).zzb(), "AppState.registerCsiReporter");
                }
                Context context2 = this.zze;
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzim)).booleanValue()) {
                        try {
                            ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzbzj(this));
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to register network callback", e);
                            this.zzo.set(true);
                        }
                    }
                }
                this.zzd = true;
                zzk();
            }
        }
        com.google.android.gms.ads.internal.zzv.zzq().zzc(context, versionInfoParcel.afmaVersion);
    }

    public final void zzv(Throwable th, String str) {
        zzbuh.zzb(this.zze, this.zzf).zzi(th, str, ((Double) zzbeu.zzg.zze()).floatValue());
    }

    public final void zzw(Throwable th, String str) {
        zzbuh.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzx(Throwable th, String str) {
        zzbuh.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzy(Boolean bool) {
        synchronized (this.zza) {
            this.zzi = bool;
        }
    }

    public final void zzz(String str) {
        this.zzg = str;
    }
}
