package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfpk {
    @VisibleForTesting
    final zzfpn zza;
    @VisibleForTesting
    final boolean zzb;

    private zzfpk(zzfpn zzfpnVar) {
        boolean z;
        this.zza = zzfpnVar;
        if (zzfpnVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.zzb = z;
    }

    public static zzfpk zzb(Context context, String str, String str2) {
        zzfpn zzfplVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfplVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof zzfpn) {
                            zzfplVar = (zzfpn) queryLocalInterface;
                        } else {
                            zzfplVar = new zzfpl(instantiate);
                        }
                    }
                    zzfplVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfpk(zzfplVar);
                } catch (Exception e) {
                    throw new zzfom(e);
                }
            } catch (Exception e2) {
                throw new zzfom(e2);
            }
        } catch (RemoteException | zzfom | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfpk(new zzfpo());
        }
    }

    public static zzfpk zzc() {
        zzfpo zzfpoVar = new zzfpo();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfpk(zzfpoVar);
    }

    public final zzfpi zza(byte[] bArr) {
        return new zzfpi(this, bArr, null);
    }
}
