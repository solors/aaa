package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdki implements zzdin {
    @Nullable
    private final zzbpt zza;
    private final zzcwl zzb;
    private final zzcvr zzc;
    private final zzddq zzd;
    private final Context zze;
    private final zzfbo zzf;
    private final VersionInfoParcel zzg;
    private final zzfcj zzh;
    private boolean zzi = false;
    private boolean zzj = false;
    private boolean zzk = true;
    @Nullable
    private final zzbpp zzl;
    @Nullable
    private final zzbpq zzm;

    public zzdki(@Nullable zzbpp zzbppVar, @Nullable zzbpq zzbpqVar, @Nullable zzbpt zzbptVar, zzcwl zzcwlVar, zzcvr zzcvrVar, zzddq zzddqVar, Context context, zzfbo zzfboVar, VersionInfoParcel versionInfoParcel, zzfcj zzfcjVar) {
        this.zzl = zzbppVar;
        this.zzm = zzbpqVar;
        this.zza = zzbptVar;
        this.zzb = zzcwlVar;
        this.zzc = zzcvrVar;
        this.zzd = zzddqVar;
        this.zze = context;
        this.zzf = zzfboVar;
        this.zzg = versionInfoParcel;
        this.zzh = zzfcjVar;
    }

    private final void zzb(View view) {
        try {
            zzbpt zzbptVar = this.zza;
            if (zzbptVar != null && !zzbptVar.zzA()) {
                this.zza.zzw(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            zzbpp zzbppVar = this.zzl;
            if (zzbppVar != null && !zzbppVar.zzx()) {
                this.zzl.zzs(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                    this.zzd.zzdd();
                    return;
                }
                return;
            }
            zzbpq zzbpqVar = this.zzm;
            if (zzbpqVar != null && !zzbpqVar.zzv()) {
                this.zzm.zzq(ObjectWrapper.wrap(view));
                this.zzc.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
                    this.zzd.zzdd();
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzc(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzA(View view, @Nullable Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbpt zzbptVar = this.zza;
            if (zzbptVar != null) {
                zzbptVar.zzz(wrap);
                return;
            }
            zzbpp zzbppVar = this.zzl;
            if (zzbppVar != null) {
                zzbppVar.zzw(wrap);
                return;
            }
            zzbpq zzbpqVar = this.zzm;
            if (zzbpqVar != null) {
                zzbpqVar.zzu(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call untrackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzB() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzC() {
        return this.zzf.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzD(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    @Nullable
    public final JSONObject zze(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    @Nullable
    public final JSONObject zzf(View view, Map map, Map map2, @Nullable ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzh() {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzk(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzl(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType) {
        if (this.zzj && this.zzf.zzL) {
            return;
        }
        zzb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzp(View view, View view2, Map map, Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i) {
        if (!this.zzj) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzf.zzL) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzb(view2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzr(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        try {
            if (!this.zzi) {
                this.zzi = com.google.android.gms.ads.internal.zzv.zzt().zzn(this.zze, this.zzg.afmaVersion, this.zzf.zzC.toString(), this.zzh.zzf);
            }
            if (this.zzk) {
                zzbpt zzbptVar = this.zza;
                if (zzbptVar != null && !zzbptVar.zzB()) {
                    this.zza.zzx();
                    this.zzb.zza();
                    return;
                }
                zzbpp zzbppVar = this.zzl;
                if (zzbppVar != null && !zzbppVar.zzy()) {
                    this.zzl.zzt();
                    this.zzb.zza();
                    return;
                }
                zzbpq zzbpqVar = this.zzm;
                if (zzbpqVar != null && !zzbpqVar.zzw()) {
                    this.zzm.zzr();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call recordImpression", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzw() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzx(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzz(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Map map3;
        Map map4;
        Object obj;
        IObjectWrapper zzn;
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            JSONObject jSONObject = this.zzf.zzaj;
            boolean z = true;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbF)).booleanValue() && jSONObject.length() != 0) {
                if (map == null) {
                    map3 = new HashMap();
                } else {
                    map3 = map;
                }
                if (map2 == null) {
                    map4 = new HashMap();
                } else {
                    map4 = map2;
                }
                HashMap hashMap = new HashMap();
                hashMap.putAll(map3);
                hashMap.putAll(map4);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbG)).booleanValue() && next.equals("3010")) {
                                zzbpt zzbptVar = this.zza;
                                Object obj2 = null;
                                if (zzbptVar != null) {
                                    try {
                                        zzn = zzbptVar.zzn();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    zzbpp zzbppVar = this.zzl;
                                    if (zzbppVar != null) {
                                        zzn = zzbppVar.zzk();
                                    } else {
                                        zzbpq zzbpqVar = this.zzm;
                                        if (zzbpqVar != null) {
                                            zzn = zzbpqVar.zzj();
                                        } else {
                                            zzn = null;
                                        }
                                    }
                                }
                                if (zzn != null) {
                                    obj2 = ObjectWrapper.unwrap(zzn);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList<String> arrayList = new ArrayList();
                                com.google.android.gms.ads.internal.util.zzbs.zzc(optJSONArray, arrayList);
                                com.google.android.gms.ads.internal.zzv.zzq();
                                ClassLoader classLoader = this.zze.getClassLoader();
                                for (String str : arrayList) {
                                    if (Class.forName(str, false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            this.zzk = z;
            HashMap zzc = zzc(map);
            HashMap zzc2 = zzc(map2);
            zzbpt zzbptVar2 = this.zza;
            if (zzbptVar2 != null) {
                zzbptVar2.zzy(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                return;
            }
            zzbpp zzbppVar2 = this.zzl;
            if (zzbppVar2 != null) {
                zzbppVar2.zzv(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzl.zzu(wrap);
                return;
            }
            zzbpq zzbpqVar2 = this.zzm;
            if (zzbpqVar2 != null) {
                zzbpqVar2.zzt(wrap, ObjectWrapper.wrap(zzc), ObjectWrapper.wrap(zzc2));
                this.zzm.zzs(wrap);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to call trackView", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzs() {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzm(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzn(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzu(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzv(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzy(zzbhq zzbhqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzt(View view, MotionEvent motionEvent, @Nullable View view2) {
    }
}
