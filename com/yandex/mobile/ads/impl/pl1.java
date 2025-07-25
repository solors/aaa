package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class pl1 extends ql1 {

    /* renamed from: a */
    final /* synthetic */ cu0 f84008a;

    /* renamed from: b */
    final /* synthetic */ int f84009b;

    /* renamed from: c */
    final /* synthetic */ byte[] f84010c;

    /* renamed from: d */
    final /* synthetic */ int f84011d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pl1(cu0 cu0Var, byte[] bArr, int i, int i2) {
        this.f84008a = cu0Var;
        this.f84009b = i;
        this.f84010c = bArr;
        this.f84011d = i2;
    }

    @Override // com.yandex.mobile.ads.impl.ql1
    /* renamed from: a */
    public final long mo30278a() {
        return this.f84009b;
    }

    @Override // com.yandex.mobile.ads.impl.ql1
    @Nullable
    /* renamed from: b */
    public final cu0 mo30275b() {
        return this.f84008a;
    }

    @Override // com.yandex.mobile.ads.impl.ql1
    /* renamed from: a */
    public final void mo30277a(@NotNull BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        sink.write(this.f84010c, this.f84011d, this.f84009b);
    }
}
