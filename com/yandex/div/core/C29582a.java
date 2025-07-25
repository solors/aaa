package com.yandex.div.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositeDisposable.kt */
@Metadata
/* renamed from: com.yandex.div.core.a */
/* loaded from: classes8.dex */
public final class C29582a implements InterfaceC29586d {
    @NotNull

    /* renamed from: b */
    private final List<InterfaceC29586d> f75150b = new ArrayList();

    /* renamed from: c */
    private boolean f75151c;

    /* renamed from: a */
    public final void m37443a(@NotNull InterfaceC29586d disposable) {
        Intrinsics.checkNotNullParameter(disposable, "disposable");
        if (!this.f75151c) {
            if (disposable != InterfaceC29586d.f75159W7) {
                this.f75150b.add(disposable);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("close() method was called".toString());
    }

    @Override // com.yandex.div.core.InterfaceC29586d, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        for (InterfaceC29586d interfaceC29586d : this.f75150b) {
            interfaceC29586d.close();
        }
        this.f75150b.clear();
        this.f75151c = true;
    }
}
