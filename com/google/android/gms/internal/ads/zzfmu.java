package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfmu implements zzflv {
    private static final zzfmu zza = new zzfmu();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfmq();
    private static final Runnable zze = new zzfmr();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfmn zzk = new zzfmn();
    private final zzflx zzj = new zzflx();
    private final zzfmo zzl = new zzfmo(new zzfmx());

    zzfmu() {
    }

    public static zzfmu zzd() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzg(zzfmu zzfmuVar) {
        zzfmuVar.zzg = 0;
        zzfmuVar.zzi.clear();
        zzfmuVar.zzh = false;
        for (zzfkt zzfktVar : zzflk.zza().zzb()) {
        }
        zzfmuVar.zzm = System.nanoTime();
        zzfmuVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzflw zza2 = zzfmuVar.zzj.zza();
        if (zzfmuVar.zzk.zze().size() > 0) {
            Iterator it = zzfmuVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zza4 = zzfmuVar.zzk.zza(str);
                zzflw zzb2 = zzfmuVar.zzj.zzb();
                String zzc2 = zzfmuVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfmg.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e) {
                        zzfmh.zza("Error with setting not visible reason", e);
                    }
                    zzfmg.zzc(zza3, zza5);
                }
                zzfmg.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfmuVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfmuVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza(null);
            zzfmuVar.zzk(null, zza2, zza6, 1, false);
            zzfmg.zzf(zza6);
            zzfmuVar.zzl.zzd(zza6, zzfmuVar.zzk.zzf(), nanoTime);
        } else {
            zzfmuVar.zzl.zzb();
        }
        zzfmuVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfmuVar.zzm;
        if (zzfmuVar.zzf.size() > 0) {
            for (zzfmt zzfmtVar : zzfmuVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfmtVar.zzb();
                if (zzfmtVar instanceof zzfms) {
                    ((zzfms) zzfmtVar).zza();
                }
            }
        }
        zzflu.zza().zzc();
    }

    private final void zzk(View view, zzflw zzflwVar, JSONObject jSONObject, int i, boolean z) {
        boolean z2 = true;
        if (i != 1) {
            z2 = false;
        }
        zzflwVar.zzb(view, jSONObject, this, z2, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflv
    public final void zza(View view, zzflw zzflwVar, JSONObject jSONObject, boolean z) {
        int zzl;
        boolean z2;
        boolean z3;
        if (zzfml.zza(view) == null && (zzl = this.zzk.zzl(view)) != 3) {
            JSONObject zza2 = zzflwVar.zza(view);
            zzfmg.zzc(jSONObject, zza2);
            String zzd2 = this.zzk.zzd(view);
            if (zzd2 != null) {
                zzfmg.zzb(zza2, zzd2);
                try {
                    zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzk(view)));
                } catch (JSONException e) {
                    zzfmh.zza("Error with setting has window focus", e);
                }
                Boolean valueOf = Boolean.valueOf(this.zzk.zzj(zzd2));
                if (valueOf.booleanValue()) {
                    try {
                        zza2.put("isPipActive", valueOf);
                    } catch (JSONException e2) {
                        zzfmh.zza("Error with setting is picture-in-picture active", e2);
                    }
                }
                this.zzk.zzh();
            } else {
                zzfmm zzb2 = this.zzk.zzb(view);
                if (zzb2 != null) {
                    zzfln zza3 = zzb2.zza();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList zzb3 = zzb2.zzb();
                    int size = zzb3.size();
                    for (int i = 0; i < size; i++) {
                        jSONArray.put((String) zzb3.get(i));
                    }
                    try {
                        zza2.put("isFriendlyObstructionFor", jSONArray);
                        zza2.put("friendlyObstructionClass", zza3.zzd());
                        zza2.put("friendlyObstructionPurpose", zza3.zza());
                        zza2.put("friendlyObstructionReason", zza3.zzc());
                    } catch (JSONException e3) {
                        zzfmh.zza("Error with setting friendly obstruction", e3);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && !z2) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                zzk(view, zzflwVar, zza2, zzl, z3);
            }
            this.zzg++;
        }
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfmp(this));
    }
}
