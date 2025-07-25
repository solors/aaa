package com.google.android.gms.internal.play_billing;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C21114v8;

/* compiled from: com.android.billingclient:billing@@6.1.0 */
/* loaded from: classes5.dex */
public class zzba {
    private final String zza;
    private final Class zzb;
    private final boolean zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzba(String str, Class cls, boolean z) {
        this(str, cls, z, true);
    }

    public static zzba zza(String str, Class cls) {
        return new zzba(str, cls, false, false);
    }

    public final String toString() {
        Class cls = this.zzb;
        String name = getClass().getName();
        String name2 = cls.getName();
        return name + RemoteSettings.FORWARD_SLASH_STRING + this.zza + C21114v8.C21123i.f54137d + name2 + C21114v8.C21123i.f54139e;
    }

    public final boolean zzb() {
        return this.zzc;
    }

    private zzba(String str, Class cls, boolean z, boolean z2) {
        zzda.zzb(str);
        this.zza = str;
        this.zzb = cls;
        this.zzc = z;
        System.identityHashCode(this);
        for (int i = 0; i < 5; i++) {
        }
    }
}
