package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
final class zzmz {
    private String zza;
    private Map<String, String> zzb;
    @NonNull
    private int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmz(String str, int i) {
        this.zza = str;
        this.zzc = i;
    }

    public final int zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final Map<String, String> zzc() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Integer;)V */
    public zzmz(String str, Map map, int i) {
        this.zza = str;
        this.zzb = map;
        this.zzc = i;
    }
}
