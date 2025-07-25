package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.measurement.internal.zzin;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzgt extends zzmx implements zzai {
    @VisibleForTesting
    final LruCache<String, com.google.android.gms.internal.measurement.zzb> zza;
    final com.google.android.gms.internal.measurement.zzv zzb;
    private final Map<String, Map<String, String>> zzc;
    @VisibleForTesting
    private final Map<String, Set<String>> zzd;
    @VisibleForTesting
    private final Map<String, Map<String, Boolean>> zze;
    @VisibleForTesting
    private final Map<String, Map<String, Boolean>> zzg;
    private final Map<String, zzfi.zzd> zzh;
    private final Map<String, Map<String, Integer>> zzi;
    private final Map<String, String> zzj;
    private final Map<String, String> zzk;
    private final Map<String, String> zzl;

    public zzgt(zznc zzncVar) {
        super(zzncVar);
        this.zzc = new ArrayMap();
        this.zzd = new ArrayMap();
        this.zze = new ArrayMap();
        this.zzg = new ArrayMap();
        this.zzh = new ArrayMap();
        this.zzj = new ArrayMap();
        this.zzk = new ArrayMap();
        this.zzl = new ArrayMap();
        this.zzi = new ArrayMap();
        this.zza = new zzgz(this, 20);
        this.zzb = new zzgy(this);
    }

    @WorkerThread
    private final void zzv(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzan zzf = zzh().zzf(str);
            if (zzf == null) {
                this.zzc.put(str, null);
                this.zze.put(str, null);
                this.zzd.put(str, null);
                this.zzg.put(str, null);
                this.zzh.put(str, null);
                this.zzj.put(str, null);
                this.zzk.put(str, null);
                this.zzl.put(str, null);
                this.zzi.put(str, null);
                return;
            }
            zzfi.zzd.zza zzcc = zza(str, zzf.zza).zzcc();
            zza(str, zzcc);
            this.zzc.put(str, zza((zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai())));
            this.zzh.put(str, (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
            zza(str, (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
            this.zzj.put(str, zzcc.zzc());
            this.zzk.put(str, zzf.zzb);
            this.zzl.put(str, zzf.zzc);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    /* renamed from: g_ */
    public final /* bridge */ /* synthetic */ zznl mo72281g_() {
        return super.mo72281g_();
    }

    @WorkerThread
    public final int zzb(String str, String str2) {
        Integer num;
        zzt();
        zzv(str);
        Map<String, Integer> map = this.zzi.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzmx
    protected final boolean zzc() {
        return false;
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

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzu zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzal zzh() {
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

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzgt zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzmc zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzna zzo() {
        return super.zzo();
    }

    @WorkerThread
    public final boolean zzp(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null && this.zzd.get(str).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @WorkerThread
    public final boolean zzu(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null && this.zzd.get(str).contains("user_id")) {
            return true;
        }
        return false;
    }

    @WorkerThread
    public final long zza(String str) {
        String zza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(zza)) {
            return 0L;
        }
        try {
            return Long.parseLong(zza);
        } catch (NumberFormatException e) {
            zzj().zzu().zza("Unable to parse timezone offset. appId", zzfw.zza(str), e);
            return 0L;
        }
    }

    @WorkerThread
    public final zzfi.zzd zzc(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzv(str);
        return this.zzh.get(str);
    }

    @WorkerThread
    public final String zzd(String str) {
        zzt();
        return this.zzl.get(str);
    }

    @WorkerThread
    public final String zze(String str) {
        zzt();
        return this.zzk.get(str);
    }

    @WorkerThread
    public final String zzf(String str) {
        zzt();
        zzv(str);
        return this.zzj.get(str);
    }

    @WorkerThread
    public final Set<String> zzg(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str);
    }

    @WorkerThread
    public final SortedSet<String> zzh(String str) {
        zzt();
        zzv(str);
        TreeSet treeSet = new TreeSet();
        zzfi.zza zzb = zzb(str);
        if (zzb == null) {
            return treeSet;
        }
        for (zzfi.zza.zzf zzfVar : zzb.zzc()) {
            treeSet.add(zzfVar.zzb());
        }
        return treeSet;
    }

    @WorkerThread
    public final void zzi(String str) {
        zzt();
        this.zzk.put(str, null);
    }

    @WorkerThread
    public final void zzj(String str) {
        zzt();
        this.zzh.remove(str);
    }

    @WorkerThread
    public final boolean zzk(String str) {
        zzt();
        zzfi.zzd zzc = zzc(str);
        if (zzc == null) {
            return false;
        }
        return zzc.zzo();
    }

    public final boolean zzl(String str) {
        zzfi.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.zzh.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    public final boolean zzm(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    @WorkerThread
    public final boolean zzn(String str) {
        zzt();
        zzv(str);
        zzfi.zza zzb = zzb(str);
        return zzb == null || !zzb.zzh() || zzb.zzg();
    }

    public final boolean zzo(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    @WorkerThread
    public final boolean zzq(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("device_model") || this.zzd.get(str).contains(DeviceRequestsHelper.DEVICE_INFO_PARAM);
        }
        return false;
    }

    @WorkerThread
    public final boolean zzr(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("enhanced_user_id");
    }

    @WorkerThread
    public final boolean zzs(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("google_signals");
    }

    @WorkerThread
    public final boolean zzt(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains(CommonUrlParts.OS_VERSION) || this.zzd.get(str).contains(DeviceRequestsHelper.DEVICE_INFO_PARAM);
        }
        return false;
    }

    @WorkerThread
    public final boolean zzd(String str, String str2) {
        Boolean bool;
        zzt();
        zzv(str);
        if (zzm(str) && zznp.zzg(str2)) {
            return true;
        }
        if (zzo(str) && zznp.zzh(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zze.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @WorkerThread
    public final zzin.zza zzb(String str, zzin.zza zzaVar) {
        zzt();
        zzv(str);
        zzfi.zza zzb = zzb(str);
        if (zzb == null) {
            return null;
        }
        for (zzfi.zza.zzc zzcVar : zzb.zze()) {
            if (zzaVar == zza(zzcVar.zzc())) {
                return zza(zzcVar.zzb());
            }
        }
        return null;
    }

    @WorkerThread
    public final boolean zzc(String str, zzin.zza zzaVar) {
        zzt();
        zzv(str);
        zzfi.zza zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        Iterator<zzfi.zza.C45358zza> it = zzb.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfi.zza.C45358zza next = it.next();
            if (zzaVar == zza(next.zzc())) {
                if (next.zzb() == zzfi.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzb zza(zzgt zzgtVar, String str) {
        zzgtVar.zzal();
        Preconditions.checkNotEmpty(str);
        if (zzgtVar.zzl(str)) {
            if (zzgtVar.zzh.containsKey(str) && zzgtVar.zzh.get(str) != null) {
                zzgtVar.zza(str, zzgtVar.zzh.get(str));
            } else {
                zzgtVar.zzv(str);
            }
            return zzgtVar.zza.snapshot().get(str);
        }
        return null;
    }

    @WorkerThread
    public final zzfi.zza zzb(String str) {
        zzt();
        zzv(str);
        zzfi.zzd zzc = zzc(str);
        if (zzc == null || !zzc.zzp()) {
            return null;
        }
        return zzc.zzd();
    }

    @WorkerThread
    public final boolean zzc(String str, String str2) {
        Boolean bool;
        zzt();
        zzv(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzg.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    public final zzim zza(String str, zzin.zza zzaVar) {
        zzt();
        zzv(str);
        zzfi.zza zzb = zzb(str);
        if (zzb == null) {
            return zzim.UNINITIALIZED;
        }
        for (zzfi.zza.C45358zza c45358zza : zzb.zzf()) {
            if (zza(c45358zza.zzc()) == zzaVar) {
                int i = zzha.zzc[c45358zza.zzb().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return zzim.UNINITIALIZED;
                    }
                    return zzim.GRANTED;
                }
                return zzim.DENIED;
            }
        }
        return zzim.UNINITIALIZED;
    }

    private static zzin.zza zza(zzfi.zza.zze zzeVar) {
        int i = zzha.zzb[zzeVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return zzin.zza.AD_PERSONALIZATION;
                }
                return zzin.zza.AD_USER_DATA;
            }
            return zzin.zza.ANALYTICS_STORAGE;
        }
        return zzin.zza.AD_STORAGE;
    }

    @WorkerThread
    private final zzfi.zzd zza(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfi.zzd.zzg();
        }
        try {
            zzfi.zzd zzdVar = (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) ((zzfi.zzd.zza) zznl.zza(zzfi.zzd.zze(), bArr)).zzai());
            zzj().zzp().zza("Parsed config. version, gmp_app_id", zzdVar.zzs() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzq() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (com.google.android.gms.internal.measurement.zzjs e) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzfw.zza(str), e);
            return zzfi.zzd.zzg();
        } catch (RuntimeException e2) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzfw.zza(str), e2);
            return zzfi.zzd.zzg();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzai
    @WorkerThread
    public final String zza(String str, String str2) {
        zzt();
        zzv(str);
        Map<String, String> map = this.zzc.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    private static Map<String, String> zza(zzfi.zzd zzdVar) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzdVar != null) {
            for (zzfi.zzg zzgVar : zzdVar.zzn()) {
                arrayMap.put(zzgVar.zzb(), zzgVar.zzc());
            }
        }
        return arrayMap;
    }

    private final void zza(String str, zzfi.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (zzaVar != null) {
            for (zzfi.zzb zzbVar : zzaVar.zze()) {
                hashSet.add(zzbVar.zzb());
            }
            for (int i = 0; i < zzaVar.zza(); i++) {
                zzfi.zzc.zza zzcc = zzaVar.zza(i).zzcc();
                if (zzcc.zzb().isEmpty()) {
                    zzj().zzu().zza("EventConfig contained null event name");
                } else {
                    String zzb = zzcc.zzb();
                    String zzb2 = zziq.zzb(zzcc.zzb());
                    if (!TextUtils.isEmpty(zzb2)) {
                        zzcc = zzcc.zza(zzb2);
                        zzaVar.zza(i, zzcc);
                    }
                    if (zzcc.zze() && zzcc.zzc()) {
                        arrayMap.put(zzb, Boolean.TRUE);
                    }
                    if (zzcc.zzf() && zzcc.zzd()) {
                        arrayMap2.put(zzcc.zzb(), Boolean.TRUE);
                    }
                    if (zzcc.zzg()) {
                        if (zzcc.zza() >= 2 && zzcc.zza() <= 65535) {
                            arrayMap3.put(zzcc.zzb(), Integer.valueOf(zzcc.zza()));
                        } else {
                            zzj().zzu().zza("Invalid sampling rate. Event name, sample rate", zzcc.zzb(), Integer.valueOf(zzcc.zza()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, hashSet);
        this.zze.put(str, arrayMap);
        this.zzg.put(str, arrayMap2);
        this.zzi.put(str, arrayMap3);
    }

    @WorkerThread
    private final void zza(final String str, zzfi.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.zza.remove(str);
            return;
        }
        zzj().zzp().zza("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzft.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzb zzbVar = new com.google.android.gms.internal.measurement.zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgu
                {
                    zzgt.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzm("internal.remoteConfig", new zzhb(zzgt.this, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgx
                {
                    zzgt.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzgt zzgtVar = zzgt.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzx("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgv
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzgt zzgtVar2 = zzgtVar;
                            String str3 = str2;
                            zzg zze = zzgtVar2.zzh().zze(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            hashMap.put("gmp_version", 97001L);
                            if (zze != null) {
                                String zzaf = zze.zzaf();
                                if (zzaf != null) {
                                    hashMap.put("app_version", zzaf);
                                }
                                hashMap.put("app_version_int", Long.valueOf(zze.zze()));
                                hashMap.put("dynamite_version", Long.valueOf(zze.zzo()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzbVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgw
                {
                    zzgt.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzr(zzgt.this.zzb);
                }
            });
            zzbVar.zza(zzcVar);
            this.zza.put(str, zzbVar);
            zzj().zzp().zza("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            for (zzft.zzb zzbVar2 : zzcVar.zza().zzd()) {
                zzj().zzp().zza("EES program activity", zzbVar2.zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            zzj().zzg().zza("Failed to load EES program. appId", str);
        }
    }

    @WorkerThread
    public final boolean zza(String str, byte[] bArr, String str2, String str3) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzfi.zzd.zza zzcc = zza(str, bArr).zzcc();
        if (zzcc == null) {
            return false;
        }
        zza(str, zzcc);
        zza(str, (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
        this.zzh.put(str, (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
        this.zzj.put(str, zzcc.zzc());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzc.put(str, zza((zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai())));
        zzh().zza(str, new ArrayList(zzcc.zzd()));
        try {
            zzcc.zzb();
            bArr = ((zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai())).zzbz();
        } catch (RuntimeException e) {
            zzj().zzu().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzfw.zza(str), e);
        }
        zzal zzh = zzh();
        Preconditions.checkNotEmpty(str);
        zzh.zzt();
        zzh.zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzh.m72283e_().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzh.zzj().zzg().zza("Failed to update remote config (got 0). appId", zzfw.zza(str));
            }
        } catch (SQLiteException e2) {
            zzh.zzj().zzg().zza("Error storing remote config. appId", zzfw.zza(str), e2);
        }
        this.zzh.put(str, (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
        return true;
    }
}
