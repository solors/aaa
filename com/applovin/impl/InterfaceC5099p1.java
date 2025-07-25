package com.applovin.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.applovin.impl.p1 */
/* loaded from: classes2.dex */
public interface InterfaceC5099p1 {

    /* renamed from: a */
    public static final ByteBuffer f8972a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.applovin.impl.p1$a */
    /* loaded from: classes2.dex */
    public static final class C5100a {

        /* renamed from: e */
        public static final C5100a f8973e = new C5100a(-1, -1, -1);

        /* renamed from: a */
        public final int f8974a;

        /* renamed from: b */
        public final int f8975b;

        /* renamed from: c */
        public final int f8976c;

        /* renamed from: d */
        public final int f8977d;

        public C5100a(int i, int i2, int i3) {
            int i4;
            this.f8974a = i;
            this.f8975b = i2;
            this.f8976c = i3;
            if (AbstractC5863xp.m92959g(i3)) {
                i4 = AbstractC5863xp.m92994b(i3, i2);
            } else {
                i4 = -1;
            }
            this.f8977d = i4;
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f8974a + ", channelCount=" + this.f8975b + ", encoding=" + this.f8976c + ']';
        }
    }

    /* renamed from: com.applovin.impl.p1$b */
    /* loaded from: classes2.dex */
    public static final class C5101b extends Exception {
        public C5101b(C5100a c5100a) {
            super("Unhandled format: " + c5100a);
        }
    }

    /* renamed from: a */
    C5100a mo92597a(C5100a c5100a);

    /* renamed from: a */
    void mo92336a(ByteBuffer byteBuffer);

    /* renamed from: b */
    void mo92596b();

    /* renamed from: c */
    boolean mo92334c();

    /* renamed from: d */
    ByteBuffer mo92333d();

    /* renamed from: e */
    void mo92595e();

    /* renamed from: f */
    boolean mo92594f();

    void reset();
}
