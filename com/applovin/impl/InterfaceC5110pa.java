package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.InterfaceC4509h5;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.pa */
/* loaded from: classes2.dex */
public interface InterfaceC5110pa extends InterfaceC4509h5 {

    /* renamed from: com.applovin.impl.pa$a */
    /* loaded from: classes2.dex */
    public static final class C5111a extends C5113c {
        public C5111a(IOException iOException, C4698k5 c4698k5) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, c4698k5, 2007, 1);
        }
    }

    /* renamed from: com.applovin.impl.pa$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC5112b extends InterfaceC4509h5.InterfaceC4510a {
        @Override // com.applovin.impl.InterfaceC4509h5.InterfaceC4510a
        /* renamed from: a */
        InterfaceC5110pa mo93968a();
    }

    /* renamed from: com.applovin.impl.pa$c */
    /* loaded from: classes2.dex */
    public static class C5113c extends C4567i5 {

        /* renamed from: b */
        public final C4698k5 f9001b;

        /* renamed from: c */
        public final int f9002c;

        public C5113c(C4698k5 c4698k5, int i, int i2) {
            super(m96574a(i, i2));
            this.f9001b = c4698k5;
            this.f9002c = i2;
        }

        /* renamed from: a */
        private static int m96574a(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        /* renamed from: a */
        public static C5113c m96573a(IOException iOException, C4698k5 c4698k5, int i) {
            int i2;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i2 = 1004;
            } else {
                i2 = (message == null || !Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i2 == 2007) {
                return new C5111a(iOException, c4698k5);
            }
            return new C5113c(iOException, c4698k5, i2, i);
        }

        public C5113c(IOException iOException, C4698k5 c4698k5, int i, int i2) {
            super(iOException, m96574a(i, i2));
            this.f9001b = c4698k5;
            this.f9002c = i2;
        }

        public C5113c(String str, C4698k5 c4698k5, int i, int i2) {
            super(str, m96574a(i, i2));
            this.f9001b = c4698k5;
            this.f9002c = i2;
        }

        public C5113c(String str, IOException iOException, C4698k5 c4698k5, int i, int i2) {
            super(str, iOException, m96574a(i, i2));
            this.f9001b = c4698k5;
            this.f9002c = i2;
        }
    }

    /* renamed from: com.applovin.impl.pa$d */
    /* loaded from: classes2.dex */
    public static final class C5114d extends C5113c {

        /* renamed from: d */
        public final String f9003d;

        public C5114d(String str, C4698k5 c4698k5) {
            super("Invalid content type: " + str, c4698k5, 2003, 1);
            this.f9003d = str;
        }
    }

    /* renamed from: com.applovin.impl.pa$e */
    /* loaded from: classes2.dex */
    public static final class C5115e extends C5113c {

        /* renamed from: d */
        public final int f9004d;

        /* renamed from: f */
        public final String f9005f;

        /* renamed from: g */
        public final Map f9006g;

        /* renamed from: h */
        public final byte[] f9007h;

        public C5115e(int i, String str, IOException iOException, Map map, C4698k5 c4698k5, byte[] bArr) {
            super("Response code: " + i, iOException, c4698k5, 2004, 1);
            this.f9004d = i;
            this.f9005f = str;
            this.f9006g = map;
            this.f9007h = bArr;
        }
    }

    /* renamed from: com.applovin.impl.pa$f */
    /* loaded from: classes2.dex */
    public static final class C5116f {

        /* renamed from: a */
        private final Map f9008a = new HashMap();

        /* renamed from: b */
        private Map f9009b;

        /* renamed from: a */
        public synchronized Map m96572a() {
            if (this.f9009b == null) {
                this.f9009b = Collections.unmodifiableMap(new HashMap(this.f9008a));
            }
            return this.f9009b;
        }
    }
}
