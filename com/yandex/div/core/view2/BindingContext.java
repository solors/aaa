package com.yandex.div.core.view2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p671fb.ExpressionResolver;

@Metadata
/* renamed from: com.yandex.div.core.view2.e */
/* loaded from: classes8.dex */
public final class BindingContext {
    @NotNull

    /* renamed from: c */
    public static final C29691a f75689c = new C29691a(null);
    @NotNull

    /* renamed from: a */
    private final Div2View f75690a;
    @NotNull

    /* renamed from: b */
    private final ExpressionResolver f75691b;

    /* compiled from: BindingContext.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.view2.e$a */
    /* loaded from: classes8.dex */
    public static final class C29691a {
        private C29691a() {
        }

        public /* synthetic */ C29691a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final BindingContext m36950a(@NotNull Div2View divView) {
            Intrinsics.checkNotNullParameter(divView, "divView");
            return new BindingContext(divView, ExpressionResolver.f90406b, null);
        }
    }

    public /* synthetic */ BindingContext(Div2View div2View, ExpressionResolver expressionResolver, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2View, expressionResolver);
    }

    @NotNull
    /* renamed from: a */
    public final Div2View m36953a() {
        return this.f75690a;
    }

    @NotNull
    /* renamed from: b */
    public final ExpressionResolver m36952b() {
        return this.f75691b;
    }

    @NotNull
    /* renamed from: c */
    public final BindingContext m36951c(@NotNull ExpressionResolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        if (Intrinsics.m17075f(this.f75691b, resolver)) {
            return this;
        }
        return new BindingContext(this.f75690a, resolver);
    }

    private BindingContext(Div2View div2View, ExpressionResolver expressionResolver) {
        this.f75690a = div2View;
        this.f75691b = expressionResolver;
    }
}
