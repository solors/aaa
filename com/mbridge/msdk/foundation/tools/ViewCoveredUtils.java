package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* renamed from: com.mbridge.msdk.foundation.tools.as */
/* loaded from: classes6.dex */
public final class ViewCoveredUtils {

    /* renamed from: a */
    private static boolean f56950a = false;

    /* renamed from: a */
    private static int m51674a(View view, ViewGroup viewGroup) {
        int i = 0;
        while (i < viewGroup.getChildCount() && viewGroup.getChildAt(i) != view) {
            i++;
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m51675a(View view, View view2, int i) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        if (Rect.intersects(rect, rect2)) {
            int min = Math.min(rect.right, rect2.right) - Math.max(rect.left, rect2.left);
            int min2 = Math.min(rect.bottom, rect2.bottom) - Math.max(rect.top, rect2.top);
            return (i != 1 && (min * min2) * 2 >= view.getMeasuredHeight() * view.getMeasuredWidth()) || (i == 1 && min * min2 >= view.getMeasuredHeight() * view.getMeasuredWidth());
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m51673a(View view, ViewGroup viewGroup, int i) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            SameLogTool.m51824b("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0 && m51675a(view, childAt, i)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    SameLogTool.m51824b("ViewUtils", "View Judge : View Covered by WebView.");
                    f56950a = true;
                }
                if (m51677a(childAt)) {
                    SameLogTool.m51824b("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f56950a = true;
                }
                if (f56950a) {
                    break;
                } else if (childAt instanceof ViewGroup) {
                    m51673a(view, (ViewGroup) childAt, i);
                }
            }
        }
        return f56950a;
    }

    /* renamed from: a */
    public static boolean m51676a(View view, int i) {
        if (view == null) {
            return true;
        }
        if (view.getVisibility() != 0) {
            SameLogTool.m51824b("ViewUtils", "Banner Judge : Banner's not visible.");
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            SameLogTool.m51824b("ViewUtils", "Banner Judge : Banner's alpha must set up 50%.");
            return true;
        } else if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            SameLogTool.m51824b("ViewUtils", "View Judge : View's container is not visible.");
            return true;
        } else {
            Rect rect = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
            boolean z = ((float) ((rect.bottom - rect.top) * (rect.right - rect.left))) > ((float) (view.getMeasuredHeight() * view.getMeasuredWidth())) * (i == 1 ? 0.0f : 0.5f);
            boolean z2 = globalVisibleRect && z;
            SameLogTool.m51824b("ViewUtils", "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("View Judge : totalViewVisible is ");
            sb2.append(z2);
            SameLogTool.m51824b("ViewUtils", sb2.toString());
            if (z2) {
                ViewGroup viewGroup = view;
                while (viewGroup.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                    for (int m51674a = m51674a(viewGroup, viewGroup2) + 1; m51674a < viewGroup2.getChildCount(); m51674a++) {
                        View childAt = viewGroup2.getChildAt(m51674a);
                        if (childAt.getVisibility() == 0 && m51675a(view, childAt, i)) {
                            if (childAt instanceof ViewGroup) {
                                ViewGroup viewGroup3 = (ViewGroup) childAt;
                                if (viewGroup3.getChildCount() > 0) {
                                    SameLogTool.m51824b("ViewUtils", "View Judge : Covered by ViewGroup.");
                                    boolean m51673a = m51673a(view, viewGroup3, i);
                                    f56950a = false;
                                    if (m51673a) {
                                        return true;
                                    }
                                }
                            }
                            if (m51677a(childAt)) {
                                SameLogTool.m51824b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                                return true;
                            }
                        }
                    }
                    viewGroup = viewGroup2;
                }
                SameLogTool.m51824b("ViewUtils", "View Judge : Well done, View is not covered.");
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m51677a(View view) {
        return !(view != null && (view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) && view.getBackground() != null && view.getBackground().getAlpha() > 127 && view.getAlpha() > 0.5f;
    }
}
