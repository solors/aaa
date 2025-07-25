package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.chartboost.sdk.impl.lb */
/* loaded from: classes3.dex */
public abstract class AbstractC10027lb {
    /* renamed from: b */
    public static final C10293v8 m81146b(C9967ib c9967ib, C9676aa c9676aa, C9863g5 c9863g5) {
        File m81637a;
        RandomAccessFile randomAccessFile;
        if (c9863g5 != null) {
            try {
                m81637a = c9863g5.m81637a(c9863g5.m81634b(), c9967ib.m81365d());
            } catch (Exception e) {
                C9763c7.m81919b(e.toString(), null, 2, null);
            }
        } else {
            m81637a = null;
        }
        if (m81637a != null && m81637a.exists()) {
            randomAccessFile = c9676aa.m82103a(m81637a);
        } else {
            File m82102a = c9676aa.m82102a(c9967ib.m81367b(), c9967ib.m81365d());
            if (m82102a != null) {
                randomAccessFile = c9676aa.m82103a(m82102a);
            }
            randomAccessFile = null;
        }
        if (randomAccessFile == null) {
            return null;
        }
        return new C10293v8(randomAccessFile);
    }
}
