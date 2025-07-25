package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.yandex.mobile.ads.impl.as1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ub1 {
    @NotNull

    /* renamed from: a */
    private final wb1 f86196a;
    @NotNull

    /* renamed from: b */
    private final vb1 f86197b;
    @NotNull

    /* renamed from: c */
    private final tb1 f86198c;

    public /* synthetic */ ub1() {
        this(new wb1(), new vb1(), new tb1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /* renamed from: a */
    public final int m28827a(@NotNull View view, @NotNull Rect viewRect) {
        int m16917e;
        int m16912j;
        int m16917e2;
        int m16912j2;
        int m16917e3;
        int m16912j3;
        int m16917e4;
        int m16912j4;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        int i = as1.f76895l;
        as1 m35776a = as1.C29962a.m35776a();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        yp1 m35796a = m35776a.m35796a(context);
        if (m35796a == null || !m35796a.m26743n0()) {
            return 0;
        }
        this.f86196a.getClass();
        ArrayList overlappingViews = wb1.m27994a(view);
        this.f86197b.getClass();
        Intrinsics.checkNotNullParameter(viewRect, "viewRect");
        Intrinsics.checkNotNullParameter(overlappingViews, "overlappingViews");
        ArrayList arrayList = new ArrayList();
        Iterator it = overlappingViews.iterator();
        while (it.hasNext()) {
            Rect rect = new Rect();
            if (((View) it.next()).getGlobalVisibleRect(rect)) {
                arrayList.add(rect);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Rect rect2 = (Rect) it2.next();
            int i2 = rect2.left;
            int i3 = viewRect.left;
            int i4 = viewRect.right;
            m16917e = _Ranges.m16917e(i2, i3);
            m16912j = _Ranges.m16912j(m16917e, i4);
            rect2.left = m16912j;
            int i5 = rect2.top;
            int i6 = viewRect.top;
            int i7 = viewRect.bottom;
            m16917e2 = _Ranges.m16917e(i5, i6);
            m16912j2 = _Ranges.m16912j(m16917e2, i7);
            rect2.top = m16912j2;
            int i8 = rect2.right;
            int i9 = viewRect.left;
            int i10 = viewRect.right;
            m16917e3 = _Ranges.m16917e(i8, i9);
            m16912j3 = _Ranges.m16912j(m16917e3, i10);
            rect2.right = m16912j3;
            int i11 = rect2.bottom;
            int i12 = viewRect.top;
            int i13 = viewRect.bottom;
            m16917e4 = _Ranges.m16917e(i11, i12);
            m16912j4 = _Ranges.m16912j(m16917e4, i13);
            rect2.bottom = m16912j4;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            Rect rect3 = (Rect) next;
            if (rect3.width() > 0 && rect3.height() > 0) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        ArrayList arrayList3 = arrayList2;
        if (size > 100) {
            arrayList3 = arrayList2.subList(0, 100);
        }
        this.f86198c.getClass();
        return tb1.m29238a(viewRect, arrayList3);
    }

    public ub1(@NotNull wb1 overlappingViewsProvider, @NotNull vb1 overlappingRectsProvider, @NotNull tb1 overlappingAreaEvaluator) {
        Intrinsics.checkNotNullParameter(overlappingViewsProvider, "overlappingViewsProvider");
        Intrinsics.checkNotNullParameter(overlappingRectsProvider, "overlappingRectsProvider");
        Intrinsics.checkNotNullParameter(overlappingAreaEvaluator, "overlappingAreaEvaluator");
        this.f86196a = overlappingViewsProvider;
        this.f86197b = overlappingRectsProvider;
        this.f86198c = overlappingAreaEvaluator;
    }
}
