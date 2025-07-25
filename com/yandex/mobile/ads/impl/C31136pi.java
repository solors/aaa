package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.pi */
/* loaded from: classes8.dex */
public final class C31136pi<T extends ViewGroup> {
    @NotNull

    /* renamed from: a */
    private final Context f83980a;
    @NotNull

    /* renamed from: b */
    private final ViewGroup f83981b;
    @NotNull

    /* renamed from: c */
    private final lo0<T> f83982c;
    @NotNull

    /* renamed from: d */
    private final jo0<T> f83983d;
    @NotNull

    /* renamed from: e */
    private final C31043oi<T> f83984e;

    public /* synthetic */ C31136pi(Context context, ViewGroup viewGroup, List list, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this(context, viewGroup, list, onPreDrawListener, new lo0(list), new jo0(), new C31043oi(onPreDrawListener));
    }

    /* renamed from: a */
    public final boolean m30654a(@Nullable qu1 qu1Var) {
        T m32830a;
        ho0<T> m32222a = this.f83982c.m32222a(this.f83980a);
        if (m32222a == null || (m32830a = this.f83983d.m32830a(this.f83981b, m32222a)) == null) {
            return false;
        }
        this.f83984e.m30999a(this.f83981b, m32830a, m32222a, qu1Var);
        return true;
    }

    /* renamed from: a */
    public final void m30655a() {
        this.f83984e.m31000a();
    }

    public C31136pi(@NotNull Context context, @NotNull ViewGroup container, @NotNull List<ho0<T>> designs, @NotNull ViewTreeObserver.OnPreDrawListener preDrawListener, @NotNull lo0<T> layoutDesignProvider, @NotNull jo0<T> layoutDesignCreator, @NotNull C31043oi<T> layoutDesignBinder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(designs, "designs");
        Intrinsics.checkNotNullParameter(preDrawListener, "preDrawListener");
        Intrinsics.checkNotNullParameter(layoutDesignProvider, "layoutDesignProvider");
        Intrinsics.checkNotNullParameter(layoutDesignCreator, "layoutDesignCreator");
        Intrinsics.checkNotNullParameter(layoutDesignBinder, "layoutDesignBinder");
        this.f83980a = context;
        this.f83981b = container;
        this.f83982c = layoutDesignProvider;
        this.f83983d = layoutDesignCreator;
        this.f83984e = layoutDesignBinder;
    }
}
