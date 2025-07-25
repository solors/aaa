package com.moloco.sdk.internal.publisher.nativead.parser;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.InterfaceC24576c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.publisher.nativead.parser.b */
/* loaded from: classes7.dex */
public final class C24181b extends Exception {

    /* renamed from: b */
    public final int f62643b;
    @NotNull

    /* renamed from: c */
    public final InterfaceC24576c f62644c;

    public C24181b(int i, @NotNull InterfaceC24576c errorSubType) {
        Intrinsics.checkNotNullParameter(errorSubType, "errorSubType");
        this.f62643b = i;
        this.f62644c = errorSubType;
    }

    /* renamed from: a */
    public final int m46814a() {
        return this.f62643b;
    }

    @NotNull
    /* renamed from: b */
    public final InterfaceC24576c m46813b() {
        return this.f62644c;
    }
}
