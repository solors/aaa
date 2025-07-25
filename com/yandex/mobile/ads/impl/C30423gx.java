package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.gx */
/* loaded from: classes8.dex */
public class C30423gx extends AbstractC30321fl {

    /* renamed from: c */
    public final C31767wt f79792c;
    @Nullable

    /* renamed from: d */
    public ByteBuffer f79793d;

    /* renamed from: e */
    public boolean f79794e;

    /* renamed from: f */
    public long f79795f;
    @Nullable

    /* renamed from: g */
    public ByteBuffer f79796g;

    /* renamed from: h */
    private final int f79797h;

    /* renamed from: i */
    private final int f79798i;

    /* renamed from: com.yandex.mobile.ads.impl.gx$a */
    /* loaded from: classes8.dex */
    public static final class C30424a extends IllegalStateException {
        public C30424a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
        }
    }

    static {
        i40.m33371a("goog.exo.decoder");
    }

    public C30423gx(int i) {
        this(i, 0);
    }

    /* renamed from: j */
    public static C30423gx m33758j() {
        return new C30423gx(0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30321fl
    /* renamed from: b */
    public void mo28933b() {
        super.mo28933b();
        ByteBuffer byteBuffer = this.f79793d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f79796g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f79794e = false;
    }

    /* renamed from: e */
    public final void m33761e(int i) {
        ByteBuffer allocateDirect;
        ByteBuffer allocateDirect2;
        int i2 = i + this.f79798i;
        ByteBuffer byteBuffer = this.f79793d;
        int i3 = 0;
        if (byteBuffer == null) {
            int i4 = this.f79797h;
            if (i4 == 1) {
                allocateDirect2 = ByteBuffer.allocate(i2);
            } else if (i4 == 2) {
                allocateDirect2 = ByteBuffer.allocateDirect(i2);
            } else {
                if (byteBuffer != null) {
                    i3 = byteBuffer.capacity();
                }
                throw new C30424a(i3, i2);
            }
            this.f79793d = allocateDirect2;
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i5 = i2 + position;
        if (capacity >= i5) {
            this.f79793d = byteBuffer;
            return;
        }
        int i6 = this.f79797h;
        if (i6 == 1) {
            allocateDirect = ByteBuffer.allocate(i5);
        } else if (i6 == 2) {
            allocateDirect = ByteBuffer.allocateDirect(i5);
        } else {
            ByteBuffer byteBuffer2 = this.f79793d;
            if (byteBuffer2 != null) {
                i3 = byteBuffer2.capacity();
            }
            throw new C30424a(i3, i5);
        }
        allocateDirect.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            allocateDirect.put(byteBuffer);
        }
        this.f79793d = allocateDirect;
    }

    /* renamed from: h */
    public final void m33760h() {
        ByteBuffer byteBuffer = this.f79793d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f79796g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: i */
    public final boolean m33759i() {
        return m34138c(1073741824);
    }

    public C30423gx(int i, int i2) {
        this.f79792c = new C31767wt();
        this.f79797h = i;
        this.f79798i = 0;
    }
}
