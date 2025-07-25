package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.Nullable;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class x40 implements py1 {

    /* renamed from: a */
    private final C31924yt f87541a = new C31924yt();

    /* renamed from: b */
    private final sy1 f87542b = new sy1();

    /* renamed from: c */
    private final ArrayDeque f87543c = new ArrayDeque();

    /* renamed from: d */
    private int f87544d;

    /* renamed from: e */
    private boolean f87545e;

    /* renamed from: com.yandex.mobile.ads.impl.x40$a */
    /* loaded from: classes8.dex */
    final class C31793a extends ty1 {
        C31793a() {
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30511hx
        /* renamed from: h */
        public final void mo27665h() {
            x40.this.m27667a(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.x40$b */
    /* loaded from: classes8.dex */
    private static final class C31794b implements oy1 {

        /* renamed from: b */
        private final long f87547b;

        /* renamed from: c */
        private final oh0<C31840xt> f87548c;

        public C31794b(long j, oh0<C31840xt> oh0Var) {
            this.f87547b = j;
            this.f87548c = oh0Var;
        }

        @Override // com.yandex.mobile.ads.impl.oy1
        /* renamed from: a */
        public final int mo26264a() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.oy1
        /* renamed from: b */
        public final List<C31840xt> mo26261b(long j) {
            if (j >= this.f87547b) {
                return this.f87548c;
            }
            return oh0.m31009h();
        }

        @Override // com.yandex.mobile.ads.impl.oy1
        /* renamed from: a */
        public final long mo26263a(int i) {
            if (i == 0) {
                return this.f87547b;
            }
            throw new IllegalArgumentException();
        }

        @Override // com.yandex.mobile.ads.impl.oy1
        /* renamed from: a */
        public final int mo26262a(long j) {
            return this.f87547b > j ? 0 : -1;
        }
    }

    public x40() {
        for (int i = 0; i < 2; i++) {
            this.f87543c.addFirst(new C31793a());
        }
        this.f87544d = 0;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    @Nullable
    /* renamed from: b */
    public final sy1 mo25997b() throws C30342fx {
        if (!this.f87545e) {
            if (this.f87544d != 0) {
                return null;
            }
            this.f87544d = 1;
            return this.f87542b;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    public final void flush() {
        if (!this.f87545e) {
            this.f87542b.mo28933b();
            this.f87544d = 0;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    public final void release() {
        this.f87545e = true;
    }

    @Override // com.yandex.mobile.ads.impl.py1
    /* renamed from: a */
    public final void mo27668a(long j) {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    @Nullable
    /* renamed from: a */
    public final ty1 mo26002a() throws C30342fx {
        if (!this.f87545e) {
            if (this.f87544d != 2 || this.f87543c.isEmpty()) {
                return null;
            }
            ty1 ty1Var = (ty1) this.f87543c.removeFirst();
            if (this.f87542b.m34134f()) {
                ty1Var.m34140b(4);
            } else {
                sy1 sy1Var = this.f87542b;
                long j = sy1Var.f79795f;
                C31924yt c31924yt = this.f87541a;
                ByteBuffer byteBuffer = sy1Var.f79793d;
                byteBuffer.getClass();
                byte[] array = byteBuffer.array();
                c31924yt.getClass();
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(array, 0, array.length);
                obtain.setDataPosition(0);
                Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
                obtain.recycle();
                ArrayList parcelableArrayList = readBundle.getParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
                parcelableArrayList.getClass();
                ty1Var.m28934a(this.f87542b.f79795f, new C31794b(j, C30734kl.m32506a(C31840xt.f87806t, parcelableArrayList)), 0L);
            }
            this.f87542b.mo28933b();
            this.f87544d = 0;
            return ty1Var;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    /* renamed from: a */
    public final void mo25999a(sy1 sy1Var) throws C30342fx {
        if (!this.f87545e) {
            if (this.f87544d == 1) {
                if (this.f87542b == sy1Var) {
                    this.f87544d = 2;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m27667a(ty1 ty1Var) {
        if (this.f87543c.size() < 2) {
            if (!this.f87543c.contains(ty1Var)) {
                ty1Var.mo28933b();
                this.f87543c.addFirst(ty1Var);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalStateException();
    }
}
