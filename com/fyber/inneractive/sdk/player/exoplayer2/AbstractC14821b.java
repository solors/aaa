package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.b */
/* loaded from: classes4.dex */
public abstract class AbstractC14821b {

    /* renamed from: a */
    public static final int f28247a;

    /* renamed from: b */
    public static final UUID f28248b;

    static {
        int i;
        if (AbstractC15133z.f29832a < 23) {
            i = 1020;
        } else {
            i = 6396;
        }
        f28247a = i;
        f28248b = new UUID(0L, 0L);
        new UUID(1186680826959645954L, -5988876978535335093L);
        new UUID(-1301668207276963122L, -6645017420763422227L);
        new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    /* renamed from: a */
    public static long m77531a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }
}
