package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public interface oc1 {

    /* renamed from: a */
    public static final /* synthetic */ int f83452a = 0;

    /* renamed from: com.yandex.mobile.ads.impl.oc1$a */
    /* loaded from: classes8.dex */
    public static final class C31031a {

        /* renamed from: a */
        static final /* synthetic */ C31031a f83453a = new C31031a();

        private C31031a() {
        }

        /* renamed from: a */
        public static oc1 m31055a(boolean z) {
            Handler handler = new Handler(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new pc1(z, handler);
        }
    }

    /* renamed from: a */
    void mo30764a(long j, @Nullable qc1 qc1Var);

    /* renamed from: a */
    void mo30763a(@Nullable k02 k02Var);

    void invalidate();

    void pause();

    void resume();

    void stop();
}
