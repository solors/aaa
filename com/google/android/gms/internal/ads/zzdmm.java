package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdmm extends zzbmb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbfi {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    private zzdia zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdmm(zzdia zzdiaVar, zzdif zzdifVar) {
        this.zza = zzdifVar.zzf();
        this.zzb = zzdifVar.zzj();
        this.zzc = zzdiaVar;
        if (zzdifVar.zzs() != null) {
            zzdifVar.zzs().zzap(this);
        }
    }

    private final void zzg() {
        View view;
        zzdia zzdiaVar = this.zzc;
        if (zzdiaVar != null && (view = this.zza) != null) {
            zzdiaVar.zzB(view, Collections.emptyMap(), Collections.emptyMap(), zzdia.zzY(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zza);
            }
        }
    }

    private static final void zzi(zzbmf zzbmfVar, int i) {
        try {
            zzbmfVar.zze(i);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeb zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    @Nullable
    public final zzbft zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdia zzdiaVar = this.zzc;
        if (zzdiaVar == null || zzdiaVar.zzc() == null) {
            return null;
        }
        return zzdiaVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdia zzdiaVar = this.zzc;
        if (zzdiaVar != null) {
            zzdiaVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdml(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbmc
    public final void zzf(IObjectWrapper iObjectWrapper, zzbmf zzbmfVar) throws RemoteException {
        String str;
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbmfVar, 2);
            return;
        }
        View view = this.zza;
        if (view != null && this.zzb != null) {
            if (this.zze) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Instream ad should not be used again.");
                zzi(zzbmfVar, 1);
                return;
            }
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzv.zzy();
            zzcaj.zza(this.zza, this);
            com.google.android.gms.ads.internal.zzv.zzy();
            zzcaj.zzb(this.zza, this);
            zzg();
            try {
                zzbmfVar.zzf();
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                return;
            }
        }
        if (view == null) {
            str = "can not get video view.";
        } else {
            str = "can not get video controller.";
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Instream internal error: ".concat(str));
        zzi(zzbmfVar, 0);
    }
}
