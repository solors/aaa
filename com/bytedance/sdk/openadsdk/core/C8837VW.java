package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.p314Kg.C8533Fy;
import com.bytedance.sdk.openadsdk.core.p334bX.C8881bX;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.core.VW */
/* loaded from: classes3.dex */
public class C8837VW {
    /* renamed from: IL */
    private static boolean m84750IL(View view) {
        return view != null && view.isShown();
    }

    /* renamed from: bX */
    private static int m84747bX(View view, int i) {
        if (i == 3) {
            return (int) (ZQc.m82538bX(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    /* renamed from: bg */
    private static boolean m84745bg(View view, int i) {
        float m84746bg = m84746bg(view);
        return m84746bg > 0.0f && m84746bg >= ((float) i) / 100.0f;
    }

    private static int eqN(View view, int i) {
        if (i == 3) {
            return ZQc.eqN(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    /* renamed from: IL */
    private static boolean m84749IL(View view, int i) {
        return view.getWidth() >= m84747bX(view, i) && view.getHeight() >= eqN(view, i);
    }

    /* renamed from: bg */
    public static float m84746bg(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        long height = rect.height() * rect.width();
                        long height2 = view.getHeight() * view.getWidth();
                        if (height2 <= 0) {
                            return -1.0f;
                        }
                        return ((float) height) / ((float) height2);
                    }
                    return -1.0f;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    /* renamed from: IL */
    private static int m84748IL(View view, int i, int i2) throws Throwable {
        if (view.getWindowVisibility() != 0) {
            return 4;
        }
        if (m84750IL(view)) {
            if (m84749IL(view, i2)) {
                return !m84745bg(view, i) ? 3 : 0;
            }
            return 6;
        }
        return 1;
    }

    /* renamed from: bg */
    public static boolean m84744bg(View view, int i, int i2) {
        if (i2 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() == 0) {
                        if ((view instanceof C8533Fy) || (view instanceof C8881bX)) {
                            break;
                        }
                        view = (View) view.getParent();
                    } else {
                        return false;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return m84748IL(view, i, i2) == 0;
    }
}
