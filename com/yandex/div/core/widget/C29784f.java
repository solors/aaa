package com.yandex.div.core.widget;

import android.view.ViewGroup;
import com.yandex.div.internal.widget.DivLayoutParams;
import kotlin.Metadata;

/* compiled from: DivViewWrapper.kt */
@Metadata
/* renamed from: com.yandex.div.core.widget.f */
/* loaded from: classes8.dex */
public final class C29784f {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final ViewGroup.LayoutParams m36525b(ViewGroup.LayoutParams layoutParams, ViewGroup.LayoutParams layoutParams2) {
        if (layoutParams2 == null) {
            return layoutParams;
        }
        layoutParams.width = layoutParams2.width;
        layoutParams.height = layoutParams2.height;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
            marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
            marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
            marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
            if (marginLayoutParams2.isMarginRelative()) {
                marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
                marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
            }
        }
        if ((layoutParams instanceof DivLayoutParams) && (layoutParams2 instanceof DivLayoutParams)) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            DivLayoutParams divLayoutParams2 = (DivLayoutParams) layoutParams2;
            divLayoutParams.m36359p(divLayoutParams2.m36369f());
            divLayoutParams.m36360o(divLayoutParams2.m36370e());
        }
        return layoutParams;
    }
}
