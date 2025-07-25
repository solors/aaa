package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C21114v8;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdif {
    private int zza;
    @Nullable
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    @Nullable
    private zzbfp zzc;
    @Nullable
    private View zzd;
    @Nullable
    private List zze;
    @Nullable
    private com.google.android.gms.ads.internal.client.zzez zzg;
    @Nullable
    private Bundle zzh;
    @Nullable
    private zzcex zzi;
    @Nullable
    private zzcex zzj;
    @Nullable
    private zzcex zzk;
    @Nullable
    private zzecr zzl;
    @Nullable
    private ListenableFuture zzm;
    @Nullable
    private zzcab zzn;
    @Nullable
    private View zzo;
    @Nullable
    private View zzp;
    @Nullable
    private IObjectWrapper zzq;
    private double zzr;
    @Nullable
    private zzbfw zzs;
    @Nullable
    private zzbfw zzt;
    @Nullable
    private String zzu;
    private float zzx;
    @Nullable
    private String zzy;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private List zzf = Collections.emptyList();

    @Nullable
    public static zzdif zzag(zzbpp zzbppVar) {
        try {
            zzdie zzak = zzak(zzbppVar.zzg(), null);
            zzbfp zzh = zzbppVar.zzh();
            String zzo = zzbppVar.zzo();
            List zzr = zzbppVar.zzr();
            String zzm = zzbppVar.zzm();
            Bundle zzf = zzbppVar.zzf();
            String zzn = zzbppVar.zzn();
            IObjectWrapper zzl = zzbppVar.zzl();
            String zzq = zzbppVar.zzq();
            String zzp = zzbppVar.zzp();
            double zze = zzbppVar.zze();
            zzbfw zzi = zzbppVar.zzi();
            zzdif zzdifVar = new zzdif();
            zzdifVar.zza = 2;
            zzdifVar.zzb = zzak;
            zzdifVar.zzc = zzh;
            zzdifVar.zzd = (View) zzam(zzbppVar.zzj());
            zzdifVar.zzZ("headline", zzo);
            zzdifVar.zze = zzr;
            zzdifVar.zzZ("body", zzm);
            zzdifVar.zzh = zzf;
            zzdifVar.zzZ("call_to_action", zzn);
            zzdifVar.zzo = (View) zzam(zzbppVar.zzk());
            zzdifVar.zzq = zzl;
            zzdifVar.zzZ("store", zzq);
            zzdifVar.zzZ("price", zzp);
            zzdifVar.zzr = zze;
            zzdifVar.zzs = zzi;
            return zzdifVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdif zzah(zzbpq zzbpqVar) {
        try {
            zzdie zzak = zzak(zzbpqVar.zzf(), null);
            zzbfp zzg = zzbpqVar.zzg();
            String zzo = zzbpqVar.zzo();
            List zzp = zzbpqVar.zzp();
            String zzm = zzbpqVar.zzm();
            Bundle zze = zzbpqVar.zze();
            String zzn = zzbpqVar.zzn();
            IObjectWrapper zzk = zzbpqVar.zzk();
            String zzl = zzbpqVar.zzl();
            zzbfw zzh = zzbpqVar.zzh();
            zzdif zzdifVar = new zzdif();
            zzdifVar.zza = 1;
            zzdifVar.zzb = zzak;
            zzdifVar.zzc = zzg;
            zzdifVar.zzd = (View) zzam(zzbpqVar.zzi());
            zzdifVar.zzZ("headline", zzo);
            zzdifVar.zze = zzp;
            zzdifVar.zzZ("body", zzm);
            zzdifVar.zzh = zze;
            zzdifVar.zzZ("call_to_action", zzn);
            zzdifVar.zzo = (View) zzam(zzbpqVar.zzj());
            zzdifVar.zzq = zzk;
            zzdifVar.zzZ(C21114v8.C21122h.f54027F0, zzl);
            zzdifVar.zzt = zzh;
            return zzdifVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdif zzai(zzbpp zzbppVar) {
        try {
            return zzal(zzak(zzbppVar.zzg(), null), zzbppVar.zzh(), (View) zzam(zzbppVar.zzj()), zzbppVar.zzo(), zzbppVar.zzr(), zzbppVar.zzm(), zzbppVar.zzf(), zzbppVar.zzn(), (View) zzam(zzbppVar.zzk()), zzbppVar.zzl(), zzbppVar.zzq(), zzbppVar.zzp(), zzbppVar.zze(), zzbppVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    @Nullable
    public static zzdif zzaj(zzbpq zzbpqVar) {
        try {
            return zzal(zzak(zzbpqVar.zzf(), null), zzbpqVar.zzg(), (View) zzam(zzbpqVar.zzi()), zzbpqVar.zzo(), zzbpqVar.zzp(), zzbpqVar.zzm(), zzbpqVar.zze(), zzbpqVar.zzn(), (View) zzam(zzbpqVar.zzj()), zzbpqVar.zzk(), null, null, -1.0d, zzbpqVar.zzh(), zzbpqVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    @Nullable
    private static zzdie zzak(@Nullable com.google.android.gms.ads.internal.client.zzeb zzebVar, @Nullable zzbpt zzbptVar) {
        if (zzebVar == null) {
            return null;
        }
        return new zzdie(zzebVar, zzbptVar);
    }

    private static zzdif zzal(@Nullable com.google.android.gms.ads.internal.client.zzeb zzebVar, zzbfp zzbfpVar, @Nullable View view, String str, List list, String str2, Bundle bundle, String str3, @Nullable View view2, IObjectWrapper iObjectWrapper, @Nullable String str4, @Nullable String str5, double d, zzbfw zzbfwVar, @Nullable String str6, float f) {
        zzdif zzdifVar = new zzdif();
        zzdifVar.zza = 6;
        zzdifVar.zzb = zzebVar;
        zzdifVar.zzc = zzbfpVar;
        zzdifVar.zzd = view;
        zzdifVar.zzZ("headline", str);
        zzdifVar.zze = list;
        zzdifVar.zzZ("body", str2);
        zzdifVar.zzh = bundle;
        zzdifVar.zzZ("call_to_action", str3);
        zzdifVar.zzo = view2;
        zzdifVar.zzq = iObjectWrapper;
        zzdifVar.zzZ("store", str4);
        zzdifVar.zzZ("price", str5);
        zzdifVar.zzr = d;
        zzdifVar.zzs = zzbfwVar;
        zzdifVar.zzZ(C21114v8.C21122h.f54027F0, str6);
        zzdifVar.zzR(f);
        return zzdifVar;
    }

    @Nullable
    private static Object zzam(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    @Nullable
    public static zzdif zzt(zzbpt zzbptVar) {
        try {
            return zzal(zzak(zzbptVar.zzj(), zzbptVar), zzbptVar.zzk(), (View) zzam(zzbptVar.zzm()), zzbptVar.zzs(), zzbptVar.zzv(), zzbptVar.zzq(), zzbptVar.zzi(), zzbptVar.zzr(), (View) zzam(zzbptVar.zzn()), zzbptVar.zzo(), zzbptVar.zzu(), zzbptVar.zzt(), zzbptVar.zze(), zzbptVar.zzl(), zzbptVar.zzp(), zzbptVar.zzf());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    @Nullable
    public final synchronized String zzA() {
        return this.zzu;
    }

    @Nullable
    public final synchronized String zzB() {
        return zzF("headline");
    }

    @Nullable
    public final synchronized String zzC() {
        return this.zzy;
    }

    @Nullable
    public final synchronized String zzD() {
        return zzF("price");
    }

    @Nullable
    public final synchronized String zzE() {
        return zzF("store");
    }

    @Nullable
    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    @Nullable
    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcex zzcexVar = this.zzi;
        if (zzcexVar != null) {
            zzcexVar.destroy();
            this.zzi = null;
        }
        zzcex zzcexVar2 = this.zzj;
        if (zzcexVar2 != null) {
            zzcexVar2.destroy();
            this.zzj = null;
        }
        zzcex zzcexVar3 = this.zzk;
        if (zzcexVar3 != null) {
            zzcexVar3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzcab zzcabVar = this.zzn;
        if (zzcabVar != null) {
            zzcabVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzbfp zzbfpVar) {
        this.zzc = zzbfpVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(@Nullable com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.zzg = zzezVar;
    }

    public final synchronized void zzM(zzbfw zzbfwVar) {
        this.zzs = zzbfwVar;
    }

    public final synchronized void zzN(String str, zzbfj zzbfjVar) {
        if (zzbfjVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbfjVar);
        }
    }

    public final synchronized void zzO(zzcex zzcexVar) {
        this.zzj = zzcexVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbfw zzbfwVar) {
        this.zzt = zzbfwVar;
    }

    public final synchronized void zzR(float f) {
        this.zzx = f;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcex zzcexVar) {
        this.zzk = zzcexVar;
    }

    public final synchronized void zzU(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzV(@Nullable String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzecr zzecrVar) {
        this.zzl = zzecrVar;
    }

    public final synchronized void zzX(zzcab zzcabVar) {
        this.zzn = zzcabVar;
    }

    public final synchronized void zzY(double d) {
        this.zzr = d;
    }

    public final synchronized void zzZ(String str, @Nullable String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i) {
        this.zza = i;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzeb zzebVar) {
        this.zzb = zzebVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcex zzcexVar) {
        this.zzi = zzcexVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        if (this.zzj != null) {
            return true;
        }
        return false;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    @Nullable
    public final synchronized View zze() {
        return this.zzd;
    }

    @Nullable
    public final synchronized View zzf() {
        return this.zzo;
    }

    @Nullable
    public final synchronized View zzg() {
        return this.zzp;
    }

    @Nullable
    public final synchronized SimpleArrayMap zzh() {
        return this.zzv;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzw;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzj() {
        return this.zzb;
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzez zzk() {
        return this.zzg;
    }

    @Nullable
    public final synchronized zzbfp zzl() {
        return this.zzc;
    }

    @Nullable
    public final zzbfw zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbfv.zzg((IBinder) obj);
            }
            return null;
        }
        return null;
    }

    @Nullable
    public final synchronized zzbfw zzn() {
        return this.zzs;
    }

    @Nullable
    public final synchronized zzbfw zzo() {
        return this.zzt;
    }

    @Nullable
    public final synchronized zzcab zzp() {
        return this.zzn;
    }

    @Nullable
    public final synchronized zzcex zzq() {
        return this.zzj;
    }

    @Nullable
    public final synchronized zzcex zzr() {
        return this.zzk;
    }

    @Nullable
    public final synchronized zzcex zzs() {
        return this.zzi;
    }

    @Nullable
    public final synchronized zzecr zzu() {
        return this.zzl;
    }

    @Nullable
    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    @Nullable
    public final synchronized ListenableFuture zzw() {
        return this.zzm;
    }

    @Nullable
    public final synchronized String zzx() {
        return zzF(C21114v8.C21122h.f54027F0);
    }

    @Nullable
    public final synchronized String zzy() {
        return zzF("body");
    }

    @Nullable
    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
