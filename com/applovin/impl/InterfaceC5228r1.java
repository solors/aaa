package com.applovin.impl;

import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.r1 */
/* loaded from: classes2.dex */
public interface InterfaceC5228r1 {

    /* renamed from: com.applovin.impl.r1$b */
    /* loaded from: classes2.dex */
    public static final class C5230b extends Exception {

        /* renamed from: a */
        public final int f9287a;

        /* renamed from: b */
        public final boolean f9288b;

        /* renamed from: c */
        public final C4310e9 f9289c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C5230b(int r3, int r4, int r5, int r6, com.applovin.impl.C4310e9 r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L32
                java.lang.String r4 = " (recoverable)"
                goto L34
            L32:
                java.lang.String r4 = ""
            L34:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.f9287a = r3
                r2.f9288b = r8
                r2.f9289c = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.InterfaceC5228r1.C5230b.<init>(int, int, int, int, com.applovin.impl.e9, boolean, java.lang.Exception):void");
        }
    }

    /* renamed from: com.applovin.impl.r1$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC5231c {
        /* renamed from: a */
        void mo96041a();

        /* renamed from: a */
        void mo96040a(int i, long j, long j2);

        /* renamed from: a */
        void mo96039a(long j);

        /* renamed from: a */
        void mo96038a(Exception exc);

        /* renamed from: a */
        void mo96037a(boolean z);

        /* renamed from: b */
        void mo96036b();

        /* renamed from: b */
        void mo96035b(long j);
    }

    /* renamed from: com.applovin.impl.r1$d */
    /* loaded from: classes2.dex */
    public static final class C5232d extends Exception {

        /* renamed from: a */
        public final long f9290a;

        /* renamed from: b */
        public final long f9291b;

        public C5232d(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.f9290a = j;
            this.f9291b = j2;
        }
    }

    /* renamed from: com.applovin.impl.r1$e */
    /* loaded from: classes2.dex */
    public static final class C5233e extends Exception {

        /* renamed from: a */
        public final int f9292a;

        /* renamed from: b */
        public final boolean f9293b;

        /* renamed from: c */
        public final C4310e9 f9294c;

        public C5233e(int i, C4310e9 c4310e9, boolean z) {
            super("AudioTrack write failed: " + i);
            this.f9293b = z;
            this.f9292a = i;
            this.f9294c = c4310e9;
        }
    }

    /* renamed from: a */
    long mo96004a(boolean z);

    /* renamed from: a */
    C5123ph mo96028a();

    /* renamed from: a */
    void mo96027a(float f);

    /* renamed from: a */
    void mo96026a(int i);

    /* renamed from: a */
    void mo96015a(C4310e9 c4310e9, int i, int[] iArr);

    /* renamed from: a */
    void mo96012a(C4743l1 c4743l1);

    /* renamed from: a */
    void mo96011a(C5123ph c5123ph);

    /* renamed from: a */
    void mo96009a(InterfaceC5231c interfaceC5231c);

    /* renamed from: a */
    void mo96007a(C5671v1 c5671v1);

    /* renamed from: a */
    boolean mo96016a(C4310e9 c4310e9);

    /* renamed from: a */
    boolean mo96005a(ByteBuffer byteBuffer, long j, int i);

    /* renamed from: b */
    int mo95997b(C4310e9 c4310e9);

    /* renamed from: b */
    void mo96003b();

    /* renamed from: b */
    void mo95993b(boolean z);

    /* renamed from: c */
    boolean mo95992c();

    /* renamed from: d */
    void mo95988d();

    /* renamed from: e */
    void mo95984e();

    /* renamed from: f */
    void mo95981f();

    /* renamed from: g */
    boolean mo95978g();

    /* renamed from: h */
    void mo95976h();

    /* renamed from: i */
    void mo95975i();

    /* renamed from: j */
    void mo95974j();

    void pause();

    void reset();

    /* renamed from: com.applovin.impl.r1$a */
    /* loaded from: classes2.dex */
    public static final class C5229a extends Exception {

        /* renamed from: a */
        public final C4310e9 f9286a;

        public C5229a(String str, C4310e9 c4310e9) {
            super(str);
            this.f9286a = c4310e9;
        }

        public C5229a(Throwable th, C4310e9 c4310e9) {
            super(th);
            this.f9286a = c4310e9;
        }
    }
}
