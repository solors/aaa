package com.mobilefuse.sdk.p542ad.rendering.omniad.service;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.mobilefuse.sdk.utils.DimConversions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OmniAdAnchorService.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdAnchorServiceKt */
/* loaded from: classes7.dex */
public final class OmniAdAnchorServiceKt {
    @NotNull
    public static final Point getAnchorPosition(@NotNull OmniAdAnchorService anchorPosition) {
        Intrinsics.checkNotNullParameter(anchorPosition, "$this$anchorPosition");
        Point point = new Point(0, 0);
        Window window = anchorPosition.getPropertyService().getActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "propertyService.activity.window");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "propertyService.activity.window.decorView");
        View findViewById = decorView.getRootView().findViewById(16908290);
        if (findViewById != null) {
            ViewGroup viewGroup = (ViewGroup) findViewById;
            Rect rect = new Rect();
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            viewGroup.getGlobalVisibleRect(rect, new Point(iArr[0], iArr[1]));
            int i = anchorPosition.getPropertyService().getSizePx().x;
            int i2 = anchorPosition.getPropertyService().getSizePx().y;
            int dpToPx = DimConversions.dpToPx(anchorPosition.getMarginDp(), (Context) anchorPosition.getPropertyService().getActivity());
            if (anchorPosition.getAnchor() != 0 && anchorPosition.getAnchor() != 2) {
                if (anchorPosition.getAnchor() == 1 || anchorPosition.getAnchor() == 3) {
                    point.x = ((rect.left + rect.width()) - i) - dpToPx;
                }
            } else {
                point.x = rect.left + dpToPx;
            }
            if (anchorPosition.getAnchor() != 0 && anchorPosition.getAnchor() != 1) {
                if (anchorPosition.getAnchor() == 2 || anchorPosition.getAnchor() == 3) {
                    point.y = ((rect.top + rect.height()) - i2) - dpToPx;
                }
            } else {
                point.y = rect.top + dpToPx;
            }
            return point;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
