package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfmn {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final HashSet zzh = new HashSet();
    private final Map zzi = new WeakHashMap();
    private boolean zzj;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfmm zzb(View view) {
        zzfmm zzfmmVar = (zzfmm) this.zzb.get(view);
        if (zzfmmVar != null) {
            this.zzb.remove(view);
        }
        return zzfmmVar;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final void zzh() {
        this.zzj = true;
    }

    public final void zzi() {
        String str;
        Activity activity;
        boolean z;
        Boolean bool;
        zzflk zza = zzflk.zza();
        if (zza != null) {
            for (zzfkt zzfktVar : zza.zzb()) {
                View zzf = zzfktVar.zzf();
                if (zzfktVar.zzj()) {
                    String zzh = zzfktVar.zzh();
                    if (zzf != null) {
                        Context context = zzf.getContext();
                        while (true) {
                            str = null;
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                activity = null;
                                break;
                            }
                        }
                        if (activity != null) {
                            z = activity.isInPictureInPictureMode();
                        } else {
                            z = false;
                        }
                        if (z) {
                            this.zzh.add(zzh);
                        }
                        if (!zzf.isAttachedToWindow()) {
                            str = "notAttached";
                        } else {
                            if (zzf.hasWindowFocus()) {
                                this.zzi.remove(zzf);
                                bool = Boolean.FALSE;
                            } else if (this.zzi.containsKey(zzf)) {
                                bool = (Boolean) this.zzi.get(zzf);
                            } else {
                                Map map = this.zzi;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(zzf, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue() && !z) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = zzf;
                                while (true) {
                                    if (view != null) {
                                        String zza2 = zzfml.zza(view);
                                        if (zza2 != null) {
                                            str = zza2;
                                            break;
                                        }
                                        hashSet.add(view);
                                        ViewParent parent = view.getParent();
                                        if (parent instanceof View) {
                                            view = (View) parent;
                                        } else {
                                            view = null;
                                        }
                                    } else {
                                        this.zzd.addAll(hashSet);
                                        break;
                                    }
                                }
                            }
                        }
                        if (str == null) {
                            this.zze.add(zzh);
                            this.zza.put(zzf, zzh);
                            for (zzfln zzflnVar : zzfktVar.zzi()) {
                                View view2 = (View) zzflnVar.zzb().get();
                                if (view2 != null) {
                                    zzfmm zzfmmVar = (zzfmm) this.zzb.get(view2);
                                    if (zzfmmVar != null) {
                                        zzfmmVar.zzc(zzfktVar.zzh());
                                    } else {
                                        this.zzb.put(view2, new zzfmm(zzflnVar, zzfktVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(zzh);
                            this.zzc.put(zzh, zzf);
                            this.zzg.put(zzh, str);
                        }
                    } else {
                        this.zzf.add(zzh);
                        this.zzg.put(zzh, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(String str) {
        return this.zzh.contains(str);
    }

    public final boolean zzk(View view) {
        if (this.zzi.containsKey(view)) {
            this.zzi.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    public final int zzl(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        if (this.zzj) {
            return 2;
        }
        return 3;
    }
}
