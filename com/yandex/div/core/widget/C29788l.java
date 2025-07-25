package com.yandex.div.core.widget;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.properties.InterfaceC37618e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Views.kt */
@Metadata
/* renamed from: com.yandex.div.core.widget.l */
/* loaded from: classes8.dex */
public final class C29788l {
    @NotNull
    /* renamed from: a */
    public static final <T> InterfaceC37618e<View, T> m36505a(T t, @Nullable Function1<? super T, ? extends T> function1) {
        return new C29780b(t, function1);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC37618e m36504b(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return m36505a(obj, function1);
    }

    @NotNull
    /* renamed from: c */
    public static final <T> InterfaceC37618e<View, T> m36503c(T t, @Nullable Function1<? super T, ? extends T> function1) {
        return new C29783d(t, function1);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC37618e m36502d(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        return m36503c(obj, function1);
    }

    /* renamed from: e */
    public static final boolean m36501e(int i) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m36500f(int i) {
        if (View.MeasureSpec.getMode(i) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static final int m36499g(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
    }

    /* renamed from: h */
    public static final int m36498h(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    /* renamed from: i */
    public static final int m36497i() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
