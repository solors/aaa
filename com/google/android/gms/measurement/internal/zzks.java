package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzks extends zze {
    @VisibleForTesting
    protected zzkp zza;
    private volatile zzkp zzb;
    private volatile zzkp zzc;
    private final Map<Activity, zzkp> zzd;
    @GuardedBy("activityLock")
    private Activity zze;
    @GuardedBy("activityLock")
    private volatile boolean zzf;
    private volatile zzkp zzg;
    private zzkp zzh;
    @GuardedBy("activityLock")
    private boolean zzi;
    private final Object zzj;

    public zzks(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    public final zzkp zzaa() {
        return this.zzb;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfq zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfp zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziv zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzks zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkx zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzmh zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    @MainThread
    private final zzkp zzd(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zzkp zzkpVar = this.zzd.get(activity);
        if (zzkpVar == null) {
            zzkp zzkpVar2 = new zzkp(null, zza(activity.getClass(), "Activity"), zzq().zzm());
            this.zzd.put(activity, zzkpVar2);
            zzkpVar = zzkpVar2;
        }
        return this.zzg != null ? this.zzg : zzkpVar;
    }

    @MainThread
    public final void zzb(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = zzb().elapsedRealtime();
        if (!zze().zzv()) {
            this.zzb = null;
            zzl().zzb(new zzkw(this, elapsedRealtime));
            return;
        }
        zzkp zzd = zzd(activity);
        this.zzc = this.zzb;
        this.zzb = null;
        zzl().zzb(new zzkv(this, zzd, elapsedRealtime));
    }

    @MainThread
    public final void zzc(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (zze().zzv()) {
                    this.zzg = null;
                    zzl().zzb(new zzky(this));
                }
            }
        }
        if (!zze().zzv()) {
            this.zzb = this.zzg;
            zzl().zzb(new zzkt(this));
            return;
        }
        zza(activity, zzd(activity), false);
        zzb zzc = zzc();
        zzc.zzl().zzb(new zzc(zzc, zzc.zzb().elapsedRealtime()));
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @WorkerThread
    public final zzkp zza(boolean z) {
        zzu();
        zzt();
        if (!z) {
            return this.zza;
        }
        zzkp zzkpVar = this.zza;
        return zzkpVar != null ? zzkpVar : this.zzh;
    }

    @VisibleForTesting
    private final String zza(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > zze().zza((String) null, false) ? str2.substring(0, zze().zza((String) null, false)) : str2;
    }

    public static /* synthetic */ void zza(zzks zzksVar, Bundle bundle, zzkp zzkpVar, zzkp zzkpVar2, long j) {
        if (bundle != null) {
            bundle.remove(FirebaseAnalytics.Param.SCREEN_NAME);
            bundle.remove(FirebaseAnalytics.Param.SCREEN_CLASS);
        }
        zzksVar.zza(zzkpVar, zzkpVar2, j, true, zzksVar.zzq().zza((String) null, FirebaseAnalytics.Event.SCREEN_VIEW, bundle, (List<String>) null, false));
    }

    @MainThread
    public final void zzb(Activity activity, Bundle bundle) {
        zzkp zzkpVar;
        if (!zze().zzv() || bundle == null || (zzkpVar = this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzkpVar.zzc);
        bundle2.putString("name", zzkpVar.zza);
        bundle2.putString("referrer_name", zzkpVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @MainThread
    private final void zza(Activity activity, zzkp zzkpVar, boolean z) {
        zzkp zzkpVar2;
        zzkp zzkpVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzkpVar.zzb == null) {
            zzkpVar2 = new zzkp(zzkpVar.zza, activity != null ? zza(activity.getClass(), "Activity") : null, zzkpVar.zzc, zzkpVar.zze, zzkpVar.zzf);
        } else {
            zzkpVar2 = zzkpVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzkpVar2;
        zzl().zzb(new zzku(this, zzkpVar2, zzkpVar3, zzb().elapsedRealtime(), z));
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.os.BaseBundle, long] */
    @WorkerThread
    public final void zza(zzkp zzkpVar, zzkp zzkpVar2, long j, boolean z, Bundle bundle) {
        long j2;
        zzt();
        boolean z2 = false;
        boolean z3 = (zzkpVar2 != null && zzkpVar2.zzc == zzkpVar.zzc && Objects.equals(zzkpVar2.zzb, zzkpVar.zzb) && Objects.equals(zzkpVar2.zza, zzkpVar.zza)) ? false : true;
        if (z && this.zza != null) {
            z2 = true;
        }
        if (z3) {
            zznp.zza(zzkpVar, bundle != null ? new Bundle(bundle) : new Bundle(), true);
            if (zzkpVar2 != null) {
                String str = zzkpVar2.zza;
                if (str != null) {
                    "_pn".putString("_pn", str);
                }
                String str2 = zzkpVar2.zzb;
                if (str2 != null) {
                    "_pc".putString("_pc", str2);
                }
                ?? r8 = zzkpVar2.zzc;
                r8.putLong("_pi", r8);
            }
            ?? r82 = 0;
            if (z2) {
                long zza = zzp().zzb.zza(j);
                if (zza > 0) {
                    zzq().zza((Bundle) null, zza);
                }
            }
            if (!zze().zzv()) {
                r82.putLong("_mst", 1L);
            }
            String str3 = zzkpVar.zze ? "app" : "auto";
            long currentTimeMillis = zzb().currentTimeMillis();
            if (zzkpVar.zze) {
                currentTimeMillis = zzkpVar.zzf;
                if (currentTimeMillis != 0) {
                    j2 = currentTimeMillis;
                    zzm().zza(str3, "_vs", j2, (Bundle) null);
                }
            }
            j2 = currentTimeMillis;
            zzm().zza(str3, "_vs", j2, (Bundle) null);
        }
        if (z2) {
            zza(this.zza, true, j);
        }
        this.zza = zzkpVar;
        if (zzkpVar.zze) {
            this.zzh = zzkpVar;
        }
        zzo().zza(zzkpVar);
    }

    @MainThread
    public final void zza(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!zze().zzv() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzkp(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @MainThread
    public final void zza(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (zze().zzv()) {
            this.zzd.remove(activity);
        }
    }

    @WorkerThread
    public final void zza(zzkp zzkpVar, boolean z, long j) {
        zzc().zza(zzb().elapsedRealtime());
        if (!zzp().zza(zzkpVar != null && zzkpVar.zzd, z, j) || zzkpVar == null) {
            return;
        }
        zzkpVar.zzd = false;
    }

    @Deprecated
    public final void zza(@NonNull Activity activity, @Size(max = 36, min = 1) String str, @Size(max = 36, min = 1) String str2) {
        if (!zze().zzv()) {
            zzj().zzv().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zzkp zzkpVar = this.zzb;
        if (zzkpVar == null) {
            zzj().zzv().zza("setCurrentScreen cannot be called while no activity active");
        } else if (this.zzd.get(activity) == null) {
            zzj().zzv().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = zza(activity.getClass(), "Activity");
            }
            boolean equals = Objects.equals(zzkpVar.zzb, str2);
            boolean equals2 = Objects.equals(zzkpVar.zza, str);
            if (equals && equals2) {
                zzj().zzv().zza("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > zze().zza((String) null, false))) {
                zzj().zzv().zza("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 != null && (str2.length() <= 0 || str2.length() > zze().zza((String) null, false))) {
                zzj().zzv().zza("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            } else {
                zzj().zzp().zza("Setting current screen to name, class", str == null ? "null" : str, str2);
                zzkp zzkpVar2 = new zzkp(str, str2, zzq().zzm());
                this.zzd.put(activity, zzkpVar2);
                zza(activity, zzkpVar2, true);
            }
        }
    }

    public final void zza(Bundle bundle, long j) {
        String str;
        synchronized (this.zzj) {
            if (!this.zzi) {
                zzj().zzv().zza("Cannot log screen view event when the app is in the background.");
                return;
            }
            String str2 = null;
            if (bundle != null) {
                String string = bundle.getString(FirebaseAnalytics.Param.SCREEN_NAME);
                if (string != null && (string.length() <= 0 || string.length() > zze().zza((String) null, false))) {
                    zzj().zzv().zza("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString(FirebaseAnalytics.Param.SCREEN_CLASS);
                if (string2 != null && (string2.length() <= 0 || string2.length() > zze().zza((String) null, false))) {
                    zzj().zzv().zza("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                } else {
                    str = string;
                    str2 = string2;
                }
            } else {
                str = null;
            }
            if (str2 == null) {
                Activity activity = this.zze;
                str2 = activity != null ? zza(activity.getClass(), "Activity") : "Activity";
            }
            String str3 = str2;
            zzkp zzkpVar = this.zzb;
            if (this.zzf && zzkpVar != null) {
                this.zzf = false;
                boolean equals = Objects.equals(zzkpVar.zzb, str3);
                boolean equals2 = Objects.equals(zzkpVar.zza, str);
                if (equals && equals2) {
                    zzj().zzv().zza("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            zzj().zzp().zza("Logging screen view with name, class", str == null ? "null" : str, str3 == null ? "null" : str3);
            zzkp zzkpVar2 = this.zzb == null ? this.zzc : this.zzb;
            zzkp zzkpVar3 = new zzkp(str, str3, zzq().zzm(), true, j);
            this.zzb = zzkpVar3;
            this.zzc = zzkpVar2;
            this.zzg = zzkpVar3;
            zzl().zzb(new zzkr(this, bundle, zzkpVar3, zzkpVar2, zzb().elapsedRealtime()));
        }
    }
}
