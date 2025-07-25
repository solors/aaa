package com.facebook.ads.redexgen.p370X;

import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.9b */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC114409b {
    public static String[] A00 = {"TWeWJHtD68oI4yFXIilydMW", "7OXwSvrW4RtScAf8Z9lZWDI5S", "DcZbB64kSbo8f5VZBIC0", "vll5a2o0qWuXIFFWzt9Y9A9nrgE8UKFv", "dILdImg4xIVzqO9ozsJ57TrdeNizDAED", "XHg5TBVpct8AEYnDVgEX0lIhyoWixNuU", "EMKjBd49nl1RVQWP7azj", "v"};
    public static final int A01;
    public static final UUID A02;
    public static final UUID A03;
    public static final UUID A04;
    public static final UUID A05;
    public static final UUID A06;

    static {
        int i;
        if (AbstractC11953IK.A02 < 23) {
            i = 1020;
        } else {
            i = 6396;
        }
        A01 = i;
        A05 = new UUID(0L, 0L);
        A03 = new UUID(1186680826959645954L, -5988876978535335093L);
        A02 = new UUID(-2129748144642739255L, 8654423357094679310L);
        A06 = new UUID(-1301668207276963122L, -6645017420763422227L);
        A04 = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long A00(long j) {
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            return j;
        }
        if (A00[5].charAt(6) != 'p') {
            A00[5] = "waSOeyTrnAwHOvUgKCthiNoRbzSAR0SV";
            return j * 1000;
        }
        throw new RuntimeException();
    }

    public static long A01(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }
}
