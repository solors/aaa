package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class em0 extends RuntimeException {
    @NotNull

    /* renamed from: b */
    private final String f78708b;
    @NotNull

    /* renamed from: c */
    private final String f78709c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em0(@NotNull String message, @NotNull String displayMessage) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
        this.f78708b = message;
        this.f78709c = displayMessage;
    }

    @NotNull
    /* renamed from: a */
    public final String m34491a() {
        return this.f78709c;
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String getMessage() {
        return this.f78708b;
    }
}
