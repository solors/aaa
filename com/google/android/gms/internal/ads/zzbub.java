package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbub {
    private final View zza;
    @Nullable
    private final Map zzb;
    @Nullable
    private final zzbyu zzc;

    public zzbub(zzbua zzbuaVar) {
        View view;
        Map map;
        View view2;
        view = zzbuaVar.zza;
        this.zza = view;
        map = zzbuaVar.zzb;
        this.zzb = map;
        view2 = zzbuaVar.zza;
        zzbyu zza = zzbtv.zza(view2.getContext());
        this.zzc = zza;
        if (zza != null && !map.isEmpty()) {
            try {
                zza.zzg(new zzbuc(ObjectWrapper.wrap(view).asBinder(), ObjectWrapper.wrap(map).asBinder()));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list) {
        if (list != null && !list.isEmpty()) {
            if (this.zzc == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get internal reporting info generator in recordClick.");
            }
            try {
                this.zzc.zzh(list, ObjectWrapper.wrap(this.zza), new zzbtz(this, list));
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException recording click: ".concat(e.toString()));
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("No click urls were passed to recordClick");
    }

    public final void zzb(List list) {
        if (list != null && !list.isEmpty()) {
            zzbyu zzbyuVar = this.zzc;
            if (zzbyuVar != null) {
                try {
                    zzbyuVar.zzi(list, ObjectWrapper.wrap(this.zza), new zzbty(this, list));
                    return;
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException recording impression urls: ".concat(e.toString()));
                    return;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbyu zzbyuVar = this.zzc;
        if (zzbyuVar != null) {
            try {
                zzbyuVar.zzk(ObjectWrapper.wrap(motionEvent));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to call remote method.");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get internal reporting info generator.");
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(new ArrayList(Arrays.asList(uri)), ObjectWrapper.wrap(this.zza), new zzbtx(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzm(list, ObjectWrapper.wrap(this.zza), new zzbtw(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
