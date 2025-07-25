package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.WorkerThread;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzin;
import com.google.common.annotations.VisibleForTesting;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzgh extends zzii {
    static final Pair<String, Long> zza = new Pair<>("", 0L);
    private long zzaa;
    public zzgl zzb;
    public final zzgm zzc;
    public final zzgm zzd;
    public final zzgn zze;
    public final zzgm zzf;
    public final zzgk zzg;
    public final zzgn zzh;
    public final zzgj zzi;
    public final zzgk zzj;
    public final zzgm zzk;
    public final zzgm zzl;
    public boolean zzm;
    public zzgk zzn;
    public zzgk zzo;
    public zzgm zzp;
    public final zzgn zzq;
    public final zzgn zzr;
    public final zzgm zzs;
    public final zzgj zzt;
    private SharedPreferences zzv;
    private Object zzw;
    private SharedPreferences zzx;
    private String zzy;
    private boolean zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgh(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzw = new Object();
        this.zzf = new zzgm(this, "session_timeout", 1800000L);
        this.zzg = new zzgk(this, "start_new_session", true);
        this.zzk = new zzgm(this, "last_pause_time", 0L);
        this.zzl = new zzgm(this, SDKAnalyticsEvents.PARAMETER_SESSION_ID, 0L);
        this.zzh = new zzgn(this, "non_personalized_ads", null);
        this.zzi = new zzgj(this, "last_received_uri_timestamps_by_source", null);
        this.zzj = new zzgk(this, "allow_remote_dynamite", false);
        this.zzc = new zzgm(this, "first_open_time", 0L);
        this.zzd = new zzgm(this, "app_install_time", 0L);
        this.zze = new zzgn(this, "app_instance_id", null);
        this.zzn = new zzgk(this, "app_backgrounded", false);
        this.zzo = new zzgk(this, "deep_link_retrieval_complete", false);
        this.zzp = new zzgm(this, "deep_link_retrieval_attempts", 0L);
        this.zzq = new zzgn(this, "firebase_feature_rollouts", null);
        this.zzr = new zzgn(this, "deferred_attribution_cache", null);
        this.zzs = new zzgm(this, "deferred_attribution_cache_timestamp", 0L);
        this.zzt = new zzgj(this, "default_event_parameters", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final Pair<String, Boolean> zza(String str) {
        zzt();
        if (!zzn().zza(zzin.zza.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long elapsedRealtime = zzb().elapsedRealtime();
        if (this.zzy != null && elapsedRealtime < this.zzaa) {
            return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
        }
        this.zzaa = elapsedRealtime + zze().zzd(str);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.zzy = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.zzy = id2;
            }
            this.zzz = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            zzj().zzc().zza("Unable to get advertising id", e);
            this.zzy = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzy, Boolean.valueOf(this.zzz));
    }

    @Override // com.google.android.gms.measurement.internal.zzii
    @WorkerThread
    protected final void zzaa() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzv = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzm = z;
        if (!z) {
            SharedPreferences.Editor edit = this.zzv.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzb = new zzgl(this, "health_monitor", Math.max(0L, zzbf.zzc.zza(null).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final boolean zzab() {
        SharedPreferences sharedPreferences = this.zzv;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final void zzb(String str) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    public final SharedPreferences zzc() {
        zzt();
        zzac();
        if (this.zzx == null) {
            synchronized (this.zzw) {
                if (this.zzx == null) {
                    String str = zza().getPackageName() + "_preferences";
                    zzj().zzp().zza("Default prefs file", str);
                    this.zzx = zza().getSharedPreferences(str, 0);
                }
            }
        }
        return this.zzx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    @WorkerThread
    public final SharedPreferences zzg() {
        zzt();
        zzac();
        Preconditions.checkNotNull(this.zzv);
        return this.zzv;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SparseArray<Long> zzh() {
        Bundle zza2 = this.zzi.zza();
        if (zza2 == null) {
            return new SparseArray<>();
        }
        int[] intArray = zza2.getIntArray("uriSources");
        long[] longArray = zza2.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                zzj().zzg().zza("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray<>();
            }
            SparseArray<Long> sparseArray = new SparseArray<>();
            for (int i = 0; i < intArray.length; i++) {
                sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
            }
            return sparseArray;
        }
        return new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final zzav zzm() {
        zzt();
        return zzav.zza(zzg().getString("dma_consent_settings", null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final zzin zzn() {
        zzt();
        return zzin.zza(zzg().getString("consent_settings", "G1"), zzg().getInt("consent_source", 100));
    }

    @Override // com.google.android.gms.measurement.internal.zzii
    protected final boolean zzo() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final Boolean zzp() {
        zzt();
        if (!zzg().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(zzg().getBoolean("use_service", false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final Boolean zzu() {
        zzt();
        if (zzg().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final Boolean zzv() {
        zzt();
        if (zzg().contains("measurement_enabled")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    public final String zzw() {
        zzt();
        String string = zzg().getString("previous_os_version", null);
        zzf().zzac();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = zzg().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final String zzx() {
        zzt();
        return zzg().getString("admob_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final String zzy() {
        zzt();
        return zzg().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final void zzz() {
        zzt();
        Boolean zzv = zzv();
        SharedPreferences.Editor edit = zzg().edit();
        edit.clear();
        edit.apply();
        if (zzv != null) {
            zza(zzv);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final void zzb(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final void zzb(boolean z) {
        zzt();
        zzj().zzp().zza("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final void zzc(String str) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final void zza(Boolean bool) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final void zza(boolean z) {
        zzt();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(SparseArray<Long> sparseArray) {
        if (sparseArray == null) {
            this.zzi.zza(null);
            return;
        }
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            iArr[i] = sparseArray.keyAt(i);
            jArr[i] = sparseArray.valueAt(i).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.zzi.zza(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(long j) {
        return j - this.zzf.zza() > this.zzk.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final boolean zza(zzav zzavVar) {
        zzt();
        if (zzin.zza(zzavVar.zza(), zzm().zza())) {
            SharedPreferences.Editor edit = zzg().edit();
            edit.putString("dma_consent_settings", zzavVar.zzf());
            edit.apply();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final boolean zza(zzin zzinVar) {
        zzt();
        int zza2 = zzinVar.zza();
        if (zza(zza2)) {
            SharedPreferences.Editor edit = zzg().edit();
            edit.putString("consent_settings", zzinVar.zzh());
            edit.putInt("consent_source", zza2);
            edit.apply();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public final boolean zza(int i) {
        return zzin.zza(i, zzg().getInt("consent_source", 100));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @WorkerThread
    public final boolean zza(zzms zzmsVar) {
        zzt();
        String string = zzg().getString("stored_tcf_param", "");
        String zzc = zzmsVar.zzc();
        if (zzc.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("stored_tcf_param", zzc);
        edit.apply();
        return true;
    }
}
