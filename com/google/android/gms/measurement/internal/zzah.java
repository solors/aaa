package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzin;
import java.util.EnumMap;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
final class zzah {
    private final EnumMap<zzin.zza, zzak> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzah() {
        this.zza = new EnumMap<>(zzin.zza.class);
    }

    public final String toString() {
        char c;
        StringBuilder sb2 = new StringBuilder("1");
        for (zzin.zza zzaVar : zzin.zza.values()) {
            zzak zzakVar = this.zza.get(zzaVar);
            if (zzakVar == null) {
                zzakVar = zzak.UNSET;
            }
            c = zzakVar.zzl;
            sb2.append(c);
        }
        return sb2.toString();
    }

    public final zzak zza(zzin.zza zzaVar) {
        zzak zzakVar = this.zza.get(zzaVar);
        return zzakVar == null ? zzak.UNSET : zzakVar;
    }

    private zzah(EnumMap<zzin.zza, zzak> enumMap) {
        EnumMap<zzin.zza, zzak> enumMap2 = new EnumMap<>(zzin.zza.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public static zzah zza(String str) {
        EnumMap enumMap = new EnumMap(zzin.zza.class);
        if (str.length() >= zzin.zza.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                zzin.zza[] values = zzin.zza.values();
                int length = values.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put((EnumMap) values[i], (zzin.zza) zzak.zza(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new zzah(enumMap);
            }
        }
        return new zzah();
    }

    public final void zza(zzin.zza zzaVar, int i) {
        zzak zzakVar = zzak.UNSET;
        if (i != -30) {
            if (i != -20) {
                if (i == -10) {
                    zzakVar = zzak.MANIFEST;
                } else if (i != 0) {
                    if (i == 30) {
                        zzakVar = zzak.INITIALIZATION;
                    }
                }
            }
            zzakVar = zzak.API;
        } else {
            zzakVar = zzak.TCF;
        }
        this.zza.put((EnumMap<zzin.zza, zzak>) zzaVar, (zzin.zza) zzakVar);
    }

    public final void zza(zzin.zza zzaVar, zzak zzakVar) {
        this.zza.put((EnumMap<zzin.zza, zzak>) zzaVar, (zzin.zza) zzakVar);
    }
}
