package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.graphics.Rect;
import android.view.View;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.cc2iiooocc2 */
/* loaded from: classes8.dex */
public class C32450cc2iiooocc2 {
    private static final String coo2iico = "ViewUtils";

    private C32450cc2iiooocc2() {
    }

    public static boolean coo2iico(View view, float f) {
        boolean z;
        if (view == null || view.getWindowVisibility() != 0 || !view.isAttachedToWindow()) {
            return false;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        double measuredWidth = view.getMeasuredWidth() * view.getMeasuredHeight();
        double width = rect.width() * rect.height();
        if (MLog.isDebugOn()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("【heightFactor == ");
            sb2.append(f);
            sb2.append("】【totalArea == ");
            sb2.append(measuredWidth);
            sb2.append("】【visibleArea == ");
            sb2.append(width);
            sb2.append("】>=【totalArea * heightFactor == ");
            sb2.append((((int) measuredWidth) * ((int) (f * 1000.0f))) / 1000.0f);
            sb2.append("】:");
            if (width >= f * measuredWidth) {
                z = true;
            } else {
                z = false;
            }
            sb2.append(z);
            MLog.m25892d(coo2iico, sb2.toString());
        }
        if (f > 0.0f && f <= 1.0f) {
            if (measuredWidth <= 0.0d || width < measuredWidth * f) {
                return false;
            }
            return true;
        } else if (measuredWidth <= 0.0d || width <= 0.0d) {
            return false;
        } else {
            return true;
        }
    }
}
