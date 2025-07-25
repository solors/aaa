package com.chartboost.sdk.impl;

import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: com.chartboost.sdk.impl.aa */
/* loaded from: classes3.dex */
public final class C9676aa {
    /* renamed from: a */
    public final RandomAccessFile m82103a(File file) {
        if (file != null) {
            return new RandomAccessFile(file, "rwd");
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m82101b(File file, String str) {
        if (file != null && str != null) {
            try {
                File m82102a = m82102a(file, str);
                if (m82102a == null) {
                    return false;
                }
                return m82102a.exists();
            } catch (Exception e) {
                C9763c7.m81922a(e.toString(), (Throwable) null, 2, (Object) null);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final File m82102a(File file, String str) {
        if (file == null || str == null) {
            return null;
        }
        return new File(file, str + ".tmp");
    }
}
