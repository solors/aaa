package com.inmobi.ads;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.inmobi.media.C18920F4;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class InMobiMovableRelativeLayout extends RelativeLayout {
    @NotNull
    public static final C18920F4 Companion = new C18920F4();

    /* renamed from: a */
    public WeakReference f47028a;

    /* renamed from: b */
    public ViewGroup.LayoutParams f47029b;

    /* renamed from: c */
    public boolean f47030c;

    /* renamed from: d */
    public float f47031d;

    /* renamed from: e */
    public float f47032e;

    public InMobiMovableRelativeLayout(@Nullable Context context) {
        super(context);
        this.f47028a = new WeakReference(null);
        this.f47030c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    private final void setParentView(ViewGroup viewGroup) {
        this.f47028a = new WeakReference(viewGroup);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        Intrinsics.m17073h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        setParentView((ViewGroup) parent);
        if (this.f47029b == null) {
            this.f47029b = getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setParentView(null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (this.f47030c) {
            float rawX = ev.getRawX();
            float rawY = ev.getRawY();
            int action = ev.getAction();
            if (action != 0) {
                if (action == 2 && (viewGroup = (ViewGroup) this.f47028a.get()) != null) {
                    int left = (int) (getLeft() + (rawX - this.f47031d));
                    int top = (int) (getTop() + (rawY - this.f47032e));
                    int paddingLeft = viewGroup.getPaddingLeft();
                    int paddingTop = viewGroup.getPaddingTop();
                    int width = viewGroup.getWidth() - viewGroup.getPaddingRight();
                    int height = viewGroup.getHeight() - viewGroup.getPaddingBottom();
                    int max = Math.max(paddingLeft, Math.min(left, width - getWidth()));
                    int max2 = Math.max(paddingTop, Math.min(top, height - getHeight()));
                    layout(max, max2, getWidth() + max, getHeight() + max2);
                    this.f47031d = rawX;
                    this.f47032e = rawY;
                }
            } else {
                this.f47031d = rawX;
                this.f47032e = rawY;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void resetPosition() {
        setLayoutParams(this.f47029b);
    }

    public final void setIsMovable(boolean z) {
        this.f47030c = z;
    }

    public InMobiMovableRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47028a = new WeakReference(null);
        this.f47030c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }

    public InMobiMovableRelativeLayout(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47028a = new WeakReference(null);
        this.f47030c = true;
        setBackgroundColor(Color.parseColor("#00000000"));
    }
}
