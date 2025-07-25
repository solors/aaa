package com.applovin.impl;

import android.util.Pair;
import java.util.Map;

/* renamed from: com.applovin.impl.bs */
/* loaded from: classes2.dex */
public abstract class AbstractC4147bs {
    /* renamed from: a */
    private static long m100301a(Map map, String str) {
        if (map != null) {
            try {
                String str2 = (String) map.get(str);
                if (str2 != null) {
                    return Long.parseLong(str2);
                }
                return -9223372036854775807L;
            } catch (NumberFormatException unused) {
                return -9223372036854775807L;
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public static Pair m100302a(InterfaceC5897y6 interfaceC5897y6) {
        Map mo92810d = interfaceC5897y6.mo92810d();
        if (mo92810d == null) {
            return null;
        }
        return new Pair(Long.valueOf(m100301a(mo92810d, "LicenseDurationRemaining")), Long.valueOf(m100301a(mo92810d, "PlaybackDurationRemaining")));
    }
}
