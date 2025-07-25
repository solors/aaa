package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes8.dex */
public class ze0 extends C30748ku {

    /* renamed from: d */
    public final int f88835d;

    public ze0(int i) {
        super(m26251a(i, 1));
        this.f88835d = 1;
    }

    /* renamed from: a */
    private static int m26251a(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    /* renamed from: a */
    public static ze0 m26250a(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !C30784lf.m32278b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        if (i2 == 2007) {
            return new ye0(iOException);
        }
        return new ze0(iOException, i2, i);
    }

    public ze0(IOException iOException, int i, int i2) {
        super(iOException, m26251a(i, i2));
        this.f88835d = i2;
    }

    public ze0(String str, int i) {
        super(m26251a(i, 1), str);
        this.f88835d = 1;
    }

    public ze0(String str, @Nullable IOException iOException, int i) {
        super(m26251a(i, 1), str, iOException);
        this.f88835d = 1;
    }
}
