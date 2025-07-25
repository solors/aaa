package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public abstract class by0 {

    /* renamed from: com.yandex.mobile.ads.impl.by0$a */
    /* loaded from: classes8.dex */
    static final class C30058a extends Lambda implements Function1<em0, Unit> {

        /* renamed from: b */
        public static final C30058a f77439b = new C30058a();

        C30058a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(em0 em0Var) {
            em0 it = em0Var;
            Intrinsics.checkNotNullParameter(it, "it");
            throw it;
        }
    }

    /* renamed from: a */
    public final void m35419a() {
        mo28604a(C30058a.f77439b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28604a(@NotNull Function1<? super em0, Unit> function1);
}
