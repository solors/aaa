package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcex;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@VisibleForTesting
/* loaded from: classes4.dex */
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(zzcex zzcexVar) throws zzg {
        this.zzb = zzcexVar.getLayoutParams();
        ViewParent parent = zzcexVar.getParent();
        this.zzd = zzcexVar.zzE();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.zzc = viewGroup;
            this.zza = viewGroup.indexOfChild(zzcexVar.zzF());
            viewGroup.removeView(zzcexVar.zzF());
            zzcexVar.zzaq(true);
            return;
        }
        throw new zzg("Could not get the parent of the WebView for an overlay.");
    }
}
