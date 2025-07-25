package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class ud0 extends AbstractC31994zi<String> implements InterfaceC30599j3 {
    @NotNull

    /* renamed from: d */
    private final C30537i8 f86211d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ud0(@NotNull Context context, @NotNull C30149d8<String> adResponse) {
        this(context, adResponse, new C30537i8());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31994zi
    /* renamed from: b */
    public synchronized void mo26158b() {
        this.f86211d.m33353a(null);
    }

    @NotNull
    /* renamed from: i */
    public final C30537i8 m28818i() {
        return this.f86211d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud0(@NotNull Context context, @NotNull C30149d8<String> adResponse, @NotNull C30537i8 adResultReceiver) {
        super(context, adResponse);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
        this.f86211d = adResultReceiver;
        adResultReceiver.m33353a(this);
    }
}
