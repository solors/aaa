package com.yandex.div.core.view2.divs.pager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import com.yandex.div.core.widget.C29788l;
import com.yandex.div.internal.widget.FrameContainerLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p879s9.C39636q;

/* compiled from: DivPagerPageLayout.kt */
@Metadata
@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class DivPagerPageLayout extends FrameContainerLayout {
    @NotNull

    /* renamed from: p */
    private final Functions<Integer> f75477p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivPagerPageLayout(@NotNull Context context, @NotNull Functions<Integer> orientationProvider) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(orientationProvider, "orientationProvider");
        this.f75477p = orientationProvider;
        C39636q.m12012g(this);
    }

    /* renamed from: p */
    private final int m37088p(int i, int i2, boolean z) {
        if (!z && i != -1 && i != -3) {
            return C29788l.m36497i();
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        ViewGroup.LayoutParams layoutParams = getChildAt(0).getLayoutParams();
        if (this.f75477p.invoke().intValue() == 0) {
            z = true;
        }
        super.onMeasure(m37088p(layoutParams.width, i, z), m37088p(layoutParams.height, i2, !z));
    }
}
