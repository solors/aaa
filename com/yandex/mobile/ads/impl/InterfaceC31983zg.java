package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.yandex.mobile.ads.impl.zg */
/* loaded from: classes8.dex */
public interface InterfaceC31983zg {

    /* renamed from: a */
    public static final ByteBuffer f88850a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.yandex.mobile.ads.impl.zg$a */
    /* loaded from: classes8.dex */
    public static final class C31984a {

        /* renamed from: e */
        public static final C31984a f88851e = new C31984a(-1, -1, -1);

        /* renamed from: a */
        public final int f88852a;

        /* renamed from: b */
        public final int f88853b;

        /* renamed from: c */
        public final int f88854c;

        /* renamed from: d */
        public final int f88855d;

        public C31984a(int i, int i2, int i3) {
            int i4;
            this.f88852a = i;
            this.f88853b = i2;
            this.f88854c = i3;
            if (y32.m27047e(i3)) {
                i4 = y32.m27062b(i3, i2);
            } else {
                i4 = -1;
            }
            this.f88855d = i4;
        }

        public final String toString() {
            return "AudioFormat[sampleRate=" + this.f88852a + ", channelCount=" + this.f88853b + ", encoding=" + this.f88854c + ']';
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zg$b */
    /* loaded from: classes8.dex */
    public static final class C31985b extends Exception {
        public C31985b(C31984a c31984a) {
            super("Unhandled format: " + c31984a);
        }
    }

    /* renamed from: a */
    C31984a mo26238a(C31984a c31984a) throws C31985b;

    /* renamed from: a */
    void mo26237a(ByteBuffer byteBuffer);

    /* renamed from: a */
    boolean mo26239a();

    /* renamed from: b */
    void mo26236b();

    /* renamed from: c */
    ByteBuffer mo26235c();

    /* renamed from: d */
    void mo26234d();

    void flush();

    boolean isActive();
}
