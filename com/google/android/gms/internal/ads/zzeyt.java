package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeyt {
    public static void zza(AtomicReference atomicReference, zzeys zzeysVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzeysVar.zza(obj);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
