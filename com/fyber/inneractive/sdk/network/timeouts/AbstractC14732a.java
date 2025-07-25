package com.fyber.inneractive.sdk.network.timeouts;

import com.fyber.inneractive.sdk.network.timeouts.content.C14733a;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.network.timeouts.a */
/* loaded from: classes4.dex */
public abstract class AbstractC14732a {

    /* renamed from: a */
    public int f27906a = 0;

    /* renamed from: b */
    public int f27907b = 0;

    /* renamed from: c */
    public int f27908c = 0;

    /* renamed from: d */
    public int f27909d = 0;

    /* renamed from: e */
    public int f27910e = 0;

    /* renamed from: f */
    public int f27911f = 0;

    /* renamed from: g */
    public boolean f27912g = false;

    /* renamed from: a */
    public final int m77669a() {
        int max;
        int i = this.f27908c;
        int i2 = this.f27909d;
        if (i2 <= 0) {
            IAlog.m76524f("%s Unable resolve retries because of invalid ILAT: %d, will set retries to 0", IAlog.m76532a(C14733a.class), Integer.valueOf(i2));
            max = 0;
        } else {
            int i3 = i / i2;
            int i4 = i3 - 1;
            if (i4 > 3) {
                i4 = i3 - 2;
            }
            max = Math.max(i4, 0);
        }
        int i5 = this.f27908c;
        int i6 = this.f27909d;
        int i7 = this.f27910e;
        int i8 = this.f27911f;
        int max2 = Math.max(0, i5);
        int max3 = Math.max(0, i6);
        int max4 = Math.max(0, max);
        int max5 = Math.max(0, (max2 - (Math.max(0, i7) * max4)) - (Math.max(0, i8) * max4));
        int max6 = Math.max(0, max3);
        if (max4 > 0) {
            max5 %= max6;
        }
        int max7 = Math.max(max5, 0);
        if (max7 == 0 && max > 2) {
            max--;
            max7 = this.f27909d;
        }
        int i9 = max + 1;
        int max8 = Math.max(0, max7);
        if (i9 > 0) {
            max8 /= i9;
        }
        this.f27907b = max8;
        return Math.max(0, m77668a(this.f27908c, this.f27909d, max8, 0) - 1);
    }

    /* renamed from: a */
    public static int m77668a(int i, int i2, int i3, int i4) {
        int max = Math.max(0, i);
        if (i2 <= 0) {
            i2 = max;
        }
        int max2 = Math.max(0, i3);
        int max3 = Math.max(0, i4);
        int i5 = max3 + 1;
        int i6 = max - ((max2 * max3) + i2);
        if (i6 < 0) {
            return Math.max(max3, 0);
        }
        if (i6 == 0) {
            return Math.max(i5, 0);
        }
        return m77668a(i6, i2, max2, i5);
    }
}
