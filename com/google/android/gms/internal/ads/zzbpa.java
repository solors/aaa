package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbpa extends zzbpd {
    @Override // com.google.android.gms.internal.ads.zzbpe
    public final zzbph zzb(String str) throws RemoteException {
        zzbqf zzbqfVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbpa.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbqf((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbqf((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
                throw new RemoteException();
            }
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbqfVar = new zzbqf(new AdMobAdapter());
            } else {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    zzbqfVar = new zzbqf(new CustomEventAdapter());
                }
                throw new RemoteException();
            }
            return zzbqfVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final zzbrd zzc(String str) throws RemoteException {
        return new zzbrq((RtbAdapter) Class.forName(str, false, zzbrh.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final boolean zzd(String str) throws RemoteException {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbpa.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final boolean zze(String str) throws RemoteException {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbpa.class.getClassLoader()));
        } catch (Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
