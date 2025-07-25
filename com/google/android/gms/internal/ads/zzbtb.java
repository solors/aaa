package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbtb extends RemoteCreator {
    public zzbtb() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbth) {
            return (zzbth) queryLocalInterface;
        }
        return new zzbtf(iBinder);
    }

    @Nullable
    public final zzbte zza(Activity activity) {
        zzbte zzbtcVar;
        try {
            IBinder zze = ((zzbth) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzbte) {
                zzbtcVar = (zzbte) queryLocalInterface;
            } else {
                zzbtcVar = new zzbtc(zze);
            }
            return zzbtcVar;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
