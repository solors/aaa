package com.yandex.div.core.widget;

import java.util.ConcurrentModificationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GridContainer.kt */
@Metadata
/* renamed from: com.yandex.div.core.widget.k */
/* loaded from: classes8.dex */
final class C29787k<T> {
    @NotNull

    /* renamed from: a */
    private final Functions<T> f76018a;
    @Nullable

    /* renamed from: b */
    private T f76019b;

    /* JADX WARN: Multi-variable type inference failed */
    public C29787k(@NotNull Functions<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f76018a = initializer;
    }

    /* renamed from: a */
    public final T m36508a() {
        if (this.f76019b == null) {
            this.f76019b = this.f76018a.invoke();
        }
        T t = this.f76019b;
        if (t != null) {
            return t;
        }
        throw new ConcurrentModificationException("Set to null by another thread");
    }

    /* renamed from: b */
    public final boolean m36507b() {
        if (this.f76019b != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void m36506c() {
        this.f76019b = null;
    }
}
