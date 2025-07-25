package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;

/* renamed from: com.applovin.impl.rc */
/* loaded from: classes2.dex */
public abstract class AbstractC5261rc {
    /* renamed from: a */
    public static int m95911a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m95910a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: a */
    public static long m95909a(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }
}
