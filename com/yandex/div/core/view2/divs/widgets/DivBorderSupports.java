package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p671fb.ExpressionResolver;
import sb.DivBorder;

@Metadata
/* renamed from: com.yandex.div.core.view2.divs.widgets.e */
/* loaded from: classes8.dex */
public interface DivBorderSupports {
    @Nullable
    DivBorderDrawer getDivBorderDrawer();

    boolean getNeedClipping();

    boolean isDrawing();

    default void onBoundsChanged(int i, int i2) {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.m36999r(i, i2);
        }
    }

    default void releaseBorderDrawer() {
        DivBorderDrawer divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.release();
        }
    }

    void setBorder(@Nullable DivBorder divBorder, @NotNull View view, @NotNull ExpressionResolver expressionResolver);

    void setDrawing(boolean z);

    void setNeedClipping(boolean z);
}
