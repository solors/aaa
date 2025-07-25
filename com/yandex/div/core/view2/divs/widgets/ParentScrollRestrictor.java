package com.yandex.div.core.view2.divs.widgets;

import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.yandex.div.core.view2.divs.widgets.p */
/* loaded from: classes8.dex */
public final class ParentScrollRestrictor implements OnInterceptTouchEventListener {
    @NotNull

    /* renamed from: a */
    public static final ParentScrollRestrictor f75683a = new ParentScrollRestrictor();

    private ParentScrollRestrictor() {
    }

    @Override // com.yandex.div.internal.widget.OnInterceptTouchEventListener
    /* renamed from: a */
    public boolean mo36356a(@NotNull ViewGroup target, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(event, "event");
        ViewParent parent = target.getParent();
        if (parent == null) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        } else {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }
}
