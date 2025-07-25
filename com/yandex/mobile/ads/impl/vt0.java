package com.yandex.mobile.ads.impl;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.monetization.ads.exo.drm.InterfaceC25488f;
import java.io.IOException;

/* loaded from: classes8.dex */
public interface vt0 {

    /* renamed from: com.yandex.mobile.ads.impl.vt0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31681a {
    }

    /* renamed from: com.yandex.mobile.ads.impl.vt0$b */
    /* loaded from: classes8.dex */
    public static final class C31682b extends rt0 {
        public C31682b(int i, long j, Object obj) {
            super(i, j, obj);
        }

        public C31682b(rt0 rt0Var) {
            super(rt0Var);
        }

        public C31682b(Object obj) {
            super(obj);
        }

        public C31682b(Object obj, int i, int i2, long j) {
            super(obj, i, i2, j);
        }

        public C31682b(Object obj, long j) {
            super(obj, j);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.vt0$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC31683c {
        /* renamed from: a */
        void mo28219a(vt0 vt0Var, g02 g02Var);
    }

    /* renamed from: a */
    pt0 mo28225a(C31682b c31682b, InterfaceC31192qc interfaceC31192qc, long j);

    /* renamed from: a */
    void mo28229a(Handler handler, InterfaceC25488f interfaceC25488f);

    /* renamed from: a */
    void mo28228a(Handler handler, wt0 wt0Var);

    /* renamed from: a */
    void mo28227a(InterfaceC25488f interfaceC25488f);

    /* renamed from: a */
    void mo28226a(pt0 pt0Var);

    /* renamed from: a */
    void mo28224a(InterfaceC31683c interfaceC31683c);

    /* renamed from: a */
    void mo28223a(InterfaceC31683c interfaceC31683c, @Nullable y12 y12Var, le1 le1Var);

    /* renamed from: a */
    void mo28222a(wt0 wt0Var);

    /* renamed from: b */
    void mo28221b(InterfaceC31683c interfaceC31683c);

    /* renamed from: c */
    void mo28220c(InterfaceC31683c interfaceC31683c);

    jt0 getMediaItem();

    void maybeThrowSourceInfoRefreshError() throws IOException;
}
