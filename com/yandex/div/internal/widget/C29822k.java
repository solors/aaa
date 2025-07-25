package com.yandex.div.internal.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TransientView.kt */
@Metadata
/* renamed from: com.yandex.div.internal.widget.k */
/* loaded from: classes8.dex */
public final class C29822k {
    /* renamed from: a */
    public static final boolean m36283a(@NotNull View view) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (!(view instanceof TransientView)) {
            return false;
        }
        if (((TransientView) view).isTransient()) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return false;
        }
        return m36283a(viewGroup);
    }

    /* renamed from: b */
    public static final boolean m36282b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if ((view instanceof TransientView) && ((TransientView) view).isTransient()) {
            return true;
        }
        return false;
    }
}
