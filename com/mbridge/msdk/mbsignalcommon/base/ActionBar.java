package com.mbridge.msdk.mbsignalcommon.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* loaded from: classes6.dex */
public class ActionBar extends LinearLayout implements View.OnClickListener {

    /* renamed from: a */
    private WebView f57621a;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.base.ActionBar$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22201a {
        /* renamed from: a */
        View m51170a();

        /* renamed from: a */
        void m51169a(View view, WebView webView);
    }

    public ActionBar(Context context) {
        super(context);
    }

    public void addAction(InterfaceC22201a interfaceC22201a) {
        addAction(interfaceC22201a, getChildCount());
    }

    public int getActionCount() {
        return getChildCount();
    }

    public WebView getWebView() {
        return this.f57621a;
    }

    public View newActionItem() {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        View frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        frameLayout.setLayoutParams(layoutParams2);
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof InterfaceC22201a) {
            ((InterfaceC22201a) tag).m51169a(view, this.f57621a);
        }
    }

    public boolean removeAction(InterfaceC22201a interfaceC22201a) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if ((tag instanceof InterfaceC22201a) && tag.equals(interfaceC22201a)) {
                    removeView(childAt);
                    return true;
                }
            }
        }
        return false;
    }

    public void removeActionAt(int i) {
        if (i >= 0 && i < getChildCount()) {
            removeViewAt(i);
        }
    }

    public void removeAllActions() {
        removeAllViews();
    }

    public void setWebView(WebView webView) {
        this.f57621a = webView;
    }

    public ActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void addAction(InterfaceC22201a interfaceC22201a, int i) {
        View view;
        View m51170a = interfaceC22201a.m51170a();
        if (m51170a != null) {
            view = newActionItem();
            ((ViewGroup) ((ViewGroup) view).getChildAt(0)).addView(m51170a);
            m51170a.setTag(interfaceC22201a);
            m51170a.setOnClickListener(this);
        } else {
            view = null;
        }
        addView(view, i);
    }
}
