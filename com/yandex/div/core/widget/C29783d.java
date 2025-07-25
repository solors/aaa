package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.InterfaceC37618e;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Views.kt */
@Metadata
/* renamed from: com.yandex.div.core.widget.d */
/* loaded from: classes8.dex */
final class C29783d<T> implements InterfaceC37618e<View, T> {

    /* renamed from: a */
    private T f76012a;
    @Nullable

    /* renamed from: b */
    private final Function1<T, T> f76013b;

    /* JADX WARN: Multi-variable type inference failed */
    public C29783d(T t, @Nullable Function1<? super T, ? extends T> function1) {
        this.f76012a = t;
        this.f76013b = function1;
    }

    @Override // kotlin.properties.InterfaceC37618e, kotlin.properties.Interfaces
    /* renamed from: a */
    public T getValue(@NotNull View thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f76012a;
    }

    @Override // kotlin.properties.InterfaceC37618e
    /* renamed from: b */
    public void setValue(@NotNull View thisRef, @NotNull KProperty<?> property, T t) {
        T invoke;
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Function1<T, T> function1 = this.f76013b;
        if (function1 != null && (invoke = function1.invoke(t)) != null) {
            t = invoke;
        }
        if (!Intrinsics.m17075f(this.f76012a, t)) {
            this.f76012a = t;
            thisRef.requestLayout();
        }
    }
}
