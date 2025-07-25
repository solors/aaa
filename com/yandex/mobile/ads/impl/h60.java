package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h60 {
    @NotNull

    /* renamed from: a */
    private final kq0 f79963a;

    public h60(@NotNull kq0 mainThreadHandler) {
        Intrinsics.checkNotNullParameter(mainThreadHandler, "mainThreadHandler");
        this.f79963a = mainThreadHandler;
    }

    /* renamed from: b */
    public static /* synthetic */ void m33608b(long j, Functions functions) {
        m33610a(j, functions);
    }

    /* renamed from: a */
    public final void m33609a(@NotNull final Functions<Unit> successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "successCallback");
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f79963a.m32464a(new Runnable() { // from class: com.yandex.mobile.ads.impl.wp2
            @Override // java.lang.Runnable
            public final void run() {
                h60.m33608b(elapsedRealtime, successCallback);
            }
        });
    }

    /* renamed from: a */
    public static final void m33610a(long j, Functions successCallback) {
        Intrinsics.checkNotNullParameter(successCallback, "$successCallback");
        if (SystemClock.elapsedRealtime() - j <= 5000) {
            successCallback.invoke();
        }
    }
}
