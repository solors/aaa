package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* loaded from: classes6.dex */
public class ObservableScrollView extends HorizontalScrollView {

    /* renamed from: a */
    private ScrollViewListener f60468a;

    public ObservableScrollView(Context context) {
        super(context);
        this.f60468a = null;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        super.fling(i / 4);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ScrollViewListener scrollViewListener = this.f60468a;
        if (scrollViewListener != null) {
            scrollViewListener.m48846a(this, i, i2, i3, i4);
        }
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f60468a = null;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60468a = null;
    }
}
