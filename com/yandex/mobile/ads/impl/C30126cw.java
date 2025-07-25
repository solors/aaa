package com.yandex.mobile.ads.impl;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.cw */
/* loaded from: classes8.dex */
public final class C30126cw extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        Resources resources = view.getResources();
        if (view.getId() == C29880R.C29884id.item_divider) {
            if (parent.getChildAdapterPosition(view) != 0) {
                outRect.top = resources.getDimensionPixelSize(C29880R.dimen.debug_panel_space_medium_large);
                return;
            }
            return;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(C29880R.dimen.debug_panel_space_small);
        outRect.bottom = dimensionPixelSize;
        outRect.top = dimensionPixelSize;
    }
}
