package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

@Metadata
/* renamed from: com.yandex.div.core.view2.divs.widgets.b */
/* loaded from: classes8.dex */
public interface DivAnimator {
    default void startDivAnimation() {
        ViewGroup viewGroup;
        int childCount;
        DivAnimator divAnimator;
        if ((this instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) this).getChildCount()) >= 0) {
            int i = 0;
            while (true) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof DivAnimator) {
                    divAnimator = (DivAnimator) childAt;
                } else {
                    divAnimator = null;
                }
                if (divAnimator != null) {
                    divAnimator.startDivAnimation();
                }
                if (i != childCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    default void stopDivAnimation() {
        ViewGroup viewGroup;
        int childCount;
        DivAnimator divAnimator;
        if ((this instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) this).getChildCount()) >= 0) {
            int i = 0;
            while (true) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof DivAnimator) {
                    divAnimator = (DivAnimator) childAt;
                } else {
                    divAnimator = null;
                }
                if (divAnimator != null) {
                    divAnimator.stopDivAnimation();
                }
                if (i != childCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
