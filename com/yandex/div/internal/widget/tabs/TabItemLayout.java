package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1072z8.C45190f;

/* compiled from: TabItemLayout.kt */
@Metadata
/* loaded from: classes8.dex */
public final class TabItemLayout extends LinearLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabItemLayout(@NotNull Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabItemLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setId(C45190f.div_tabbed_tab_title_item);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(0);
    }

    public /* synthetic */ TabItemLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
