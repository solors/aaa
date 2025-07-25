package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.customview.widget.ViewDragHelper;
import androidx.viewpager.widget.ViewPager;
import com.yandex.div.internal.widget.OnInterceptTouchEventListener;
import java.util.Set;
import p1059ya.NestedHorizontalScrollCompanion;

/* loaded from: classes8.dex */
public class ScrollableViewPager extends RtlViewPager {

    /* renamed from: c */
    private final NestedHorizontalScrollCompanion f76351c;
    @Nullable

    /* renamed from: d */
    private ViewDragHelper f76352d;

    /* renamed from: f */
    private boolean f76353f;

    /* renamed from: g */
    private boolean f76354g;

    /* renamed from: h */
    private boolean f76355h;

    /* renamed from: i */
    private boolean f76356i;
    @Nullable

    /* renamed from: j */
    private Set<Integer> f76357j;
    @Nullable

    /* renamed from: k */
    private OnInterceptTouchEventListener f76358k;

    /* renamed from: com.yandex.div.internal.widget.tabs.ScrollableViewPager$a */
    /* loaded from: classes8.dex */
    class C29848a extends ViewDragHelper.Callback {
        C29848a() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int i, int i2) {
            super.onEdgeDragStarted(i, i2);
            ScrollableViewPager scrollableViewPager = ScrollableViewPager.this;
            boolean z = true;
            if ((i & 2) == 0 && (i & 1) == 0) {
                z = false;
            }
            scrollableViewPager.f76355h = z;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View view, int i) {
            return false;
        }
    }

    public ScrollableViewPager(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private boolean m36134b(@NonNull MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.f76354g && this.f76352d != null) {
            if ((motionEvent.getAction() & 255) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f76355h = false;
            }
            this.f76352d.processTouchEvent(motionEvent);
        }
        Set<Integer> set = this.f76357j;
        if (set != null) {
            if (this.f76353f && set.contains(Integer.valueOf(getCurrentItem()))) {
                z = true;
            } else {
                z = false;
            }
            this.f76356i = z;
        }
        if (!this.f76355h && !this.f76356i && this.f76353f) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f76351c.m993c(motionEvent);
        return dispatchTouchEvent;
    }

    @Nullable
    public OnInterceptTouchEventListener getOnInterceptTouchEventListener() {
        return this.f76358k;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        OnInterceptTouchEventListener onInterceptTouchEventListener = this.f76358k;
        if (onInterceptTouchEventListener != null) {
            z = onInterceptTouchEventListener.mo36356a(this, motionEvent);
        } else {
            z = false;
        }
        if (!z && (!m36134b(motionEvent) || !super.onInterceptTouchEvent(motionEvent))) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f76351c.m994b();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (m36134b(motionEvent) && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setDisabledScrollPages(@Nullable Set<Integer> set) {
        this.f76357j = set;
    }

    public void setEdgeScrollEnabled(boolean z) {
        this.f76354g = z;
        if (!z) {
            ViewDragHelper create = ViewDragHelper.create(this, new C29848a());
            this.f76352d = create;
            create.setEdgeTrackingEnabled(3);
        }
    }

    public void setOnInterceptTouchEventListener(@Nullable OnInterceptTouchEventListener onInterceptTouchEventListener) {
        this.f76358k = onInterceptTouchEventListener;
    }

    public void setScrollEnabled(boolean z) {
        this.f76353f = z;
    }

    public ScrollableViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f76351c = new NestedHorizontalScrollCompanion((ViewPager) this);
        this.f76353f = true;
        this.f76354g = true;
        this.f76355h = false;
        this.f76356i = false;
    }
}
