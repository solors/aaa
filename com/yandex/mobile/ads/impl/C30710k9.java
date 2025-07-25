package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.k9 */
/* loaded from: classes8.dex */
public final class C30710k9 {

    /* renamed from: c */
    private static final ExecutorService f81337c;
    @NotNull

    /* renamed from: a */
    private C30359g3 f81338a;
    @NotNull

    /* renamed from: b */
    private final Context f81339b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.k9$a */
    /* loaded from: classes8.dex */
    public static final class RunnableC30711a implements Runnable {
        @NotNull

        /* renamed from: b */
        private final String f81340b;
        @NotNull

        /* renamed from: c */
        private final o32 f81341c;

        public RunnableC30711a(@NotNull String url, @NotNull o32 tracker) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(tracker, "tracker");
            this.f81340b = url;
            this.f81341c = tracker;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f81340b.length() > 0) {
                this.f81341c.mo31187a(this.f81340b);
            }
        }
    }

    static {
        String str;
        str = y01.f87978b;
        f81337c = Executors.newCachedThreadPool(new y01(str));
    }

    public C30710k9(@NotNull Context context, @NotNull C30359g3 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f81338a = adConfiguration;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f81339b = applicationContext;
    }

    /* renamed from: a */
    public final void m32624a(@Nullable String str, @NotNull C30149d8 adResponse, @NotNull C30897n1 handler) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(handler, "handler");
        m32623a(str, handler, new C32002zn(this.f81339b, adResponse, this.f81338a, null));
    }

    /* renamed from: a */
    public final void m32623a(@Nullable String str, @NotNull gz1 handler, @NotNull kl1 reporter) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Context context = this.f81339b;
        dg1 dg1Var = new dg1(context, reporter, handler, new m32(context));
        if (str == null || str.length() <= 0) {
            return;
        }
        f81337c.execute(new RunnableC30711a(str, dg1Var));
    }

    /* renamed from: a */
    public final void m32625a(@Nullable String str) {
        md1 md1Var = new md1(this.f81339b);
        if (str == null || str.length() <= 0) {
            return;
        }
        f81337c.execute(new RunnableC30711a(str, md1Var));
    }
}
