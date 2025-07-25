package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public abstract class zzcq {
    private static zzcq zza = new zzcp();

    public static synchronized zzcq zza() {
        zzcq zzcqVar;
        synchronized (zzcq.class) {
            zzcqVar = zza;
        }
        return zzcqVar;
    }

    public abstract URLConnection zza(URL url, String str) throws IOException;
}
