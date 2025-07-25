package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewPagerFixedSizeLayout.kt */
@Metadata
/* loaded from: classes8.dex */
public final class ViewPagerFixedSizeLayout extends FrameLayout {
    @Nullable

    /* renamed from: b */
    private InterfaceC29854a f76386b;

    /* renamed from: c */
    private int f76387c;
    @Nullable

    /* renamed from: d */
    private Rect f76388d;

    /* renamed from: f */
    private boolean f76389f;
    @Nullable

    /* renamed from: g */
    private Integer f76390g;

    /* compiled from: ViewPagerFixedSizeLayout.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC29854a {
        /* renamed from: a */
        int mo36072a(int i, int i2);

        /* renamed from: b */
        void mo36115b();

        /* renamed from: c */
        boolean mo36070c(int i, float f);

        /* renamed from: d */
        void mo36114d(int i, float f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewPagerFixedSizeLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean getAnimateOnScroll() {
        return this.f76389f;
    }

    public final int getCollapsiblePaddingBottom() {
        return this.f76387c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        this.f76390g = Integer.valueOf(i2);
        InterfaceC29854a interfaceC29854a = this.f76386b;
        if (interfaceC29854a != null) {
            Intrinsics.m17074g(interfaceC29854a);
            i2 = View.MeasureSpec.makeMeasureSpec(interfaceC29854a.mo36072a(i, i2), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void setAnimateOnScroll(boolean z) {
        this.f76389f = z;
    }

    public final void setCollapsiblePaddingBottom(int i) {
        if (this.f76387c != i) {
            this.f76387c = i;
        }
    }

    public final void setHeightCalculator(@Nullable InterfaceC29854a interfaceC29854a) {
        this.f76386b = interfaceC29854a;
    }

    public final boolean shouldRequestLayoutOnScroll(int i, float f) {
        InterfaceC29854a interfaceC29854a;
        int makeMeasureSpec;
        boolean z;
        if (!this.f76389f || (interfaceC29854a = this.f76386b) == null || !interfaceC29854a.mo36070c(i, f)) {
            return false;
        }
        Rect rect = this.f76388d;
        if (rect == null) {
            rect = new Rect();
            this.f76388d = rect;
        }
        getLocalVisibleRect(rect);
        if (rect.height() == getHeight()) {
            return true;
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
        Integer num = this.f76390g;
        if (num != null) {
            makeMeasureSpec = num.intValue();
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        int mo36072a = interfaceC29854a.mo36072a(makeMeasureSpec2, makeMeasureSpec);
        if (mo36072a == getHeight()) {
            return false;
        }
        int i2 = rect.top;
        if (mo36072a <= rect.bottom && i2 <= mo36072a) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewPagerFixedSizeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ViewPagerFixedSizeLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerFixedSizeLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f76389f = true;
    }
}
