package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbpe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzl extends RemoteCreator {
    public zzl() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        if (queryLocalInterface instanceof zzcj) {
            return (zzcj) queryLocalInterface;
        }
        return new zzcj(iBinder);
    }

    public final zzci zza(Context context, zzbpe zzbpeVar) {
        zzci zzcgVar;
        try {
            IBinder zze = ((zzcj) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzbpeVar, 244410000);
            if (zze == null) {
                zzcgVar = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                if (queryLocalInterface instanceof zzci) {
                    zzcgVar = (zzci) queryLocalInterface;
                } else {
                    zzcgVar = new zzcg(zze);
                }
            }
            zzcgVar.zzh(zzbpeVar);
            return zzcgVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }
}
