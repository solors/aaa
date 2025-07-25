package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivViewGroup.kt */
@Metadata
/* loaded from: classes8.dex */
public abstract class DivViewGroup extends ViewGroup {
    @NotNull
    public static final C29795a Companion = new C29795a(null);

    /* renamed from: b */
    private int f76065b;

    /* compiled from: DivViewGroup.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.DivViewGroup$a */
    /* loaded from: classes8.dex */
    public static final class C29795a {
        private C29795a() {
        }

        public /* synthetic */ C29795a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
            if (r13 == Integer.MAX_VALUE) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
            if (r13 == Integer.MAX_VALUE) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0069, code lost:
            if (r13 == Integer.MAX_VALUE) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x006c, code lost:
            r11 = r13;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int m36434a(int r9, int r10, int r11, int r12, int r13) {
            /*
                r8 = this;
                int r0 = android.view.View.MeasureSpec.getMode(r9)
                int r9 = android.view.View.MeasureSpec.getSize(r9)
                int r9 = r9 - r10
                r10 = 0
                int r9 = java.lang.Math.max(r10, r9)
                r1 = -3
                r2 = -2
                r3 = -1
                r4 = 1
                r5 = 1073741824(0x40000000, float:2.0)
                r6 = 2147483647(0x7fffffff, float:NaN)
                r7 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r7) goto L58
                if (r0 == 0) goto L3e
                if (r0 == r5) goto L21
                goto L79
            L21:
                if (r11 < 0) goto L26
                if (r11 > r6) goto L26
                goto L27
            L26:
                r4 = r10
            L27:
                if (r4 == 0) goto L2a
                goto L60
            L2a:
                if (r11 != r3) goto L2e
                r11 = r9
                goto L60
            L2e:
                if (r11 != r2) goto L33
                if (r13 != r6) goto L6c
                goto L4a
            L33:
                if (r11 != r1) goto L79
                int r9 = java.lang.Math.max(r9, r12)
                int r11 = java.lang.Math.min(r9, r13)
                goto L65
            L3e:
                if (r11 < 0) goto L44
                if (r11 > r6) goto L44
                r12 = r4
                goto L45
            L44:
                r12 = r10
            L45:
                if (r12 == 0) goto L48
                goto L60
            L48:
                if (r11 != r3) goto L4c
            L4a:
                r11 = r9
                goto L7a
            L4c:
                if (r11 != r2) goto L4f
                goto L53
            L4f:
                if (r11 != r1) goto L52
                goto L53
            L52:
                r4 = r10
            L53:
                if (r4 == 0) goto L79
                if (r13 != r6) goto L6c
                goto L4a
            L58:
                if (r11 < 0) goto L5d
                if (r11 > r6) goto L5d
                goto L5e
            L5d:
                r4 = r10
            L5e:
                if (r4 == 0) goto L62
            L60:
                r10 = r5
                goto L7a
            L62:
                if (r11 != r3) goto L67
                r11 = r9
            L65:
                r10 = r7
                goto L7a
            L67:
                if (r11 != r2) goto L6e
                if (r13 != r6) goto L6c
                goto L4a
            L6c:
                r11 = r13
                goto L65
            L6e:
                if (r11 != r1) goto L79
                int r9 = java.lang.Math.max(r9, r12)
                int r11 = java.lang.Math.min(r9, r13)
                goto L65
            L79:
                r11 = r10
            L7a:
                int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r10)
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.DivViewGroup.C29795a.m36434a(int, int, int, int, int):int");
        }

        /* renamed from: b */
        public final float m36433b(float f, int i) {
            return f / (i * 2);
        }

        /* renamed from: c */
        public final float m36432c(float f, int i) {
            if (i == 1) {
                return 0.0f;
            }
            return f / (i - 1);
        }

        /* renamed from: d */
        public final float m36431d(float f, int i) {
            return f / (i + 1);
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: e */
        public final int m36430e(int i) {
            return i & 125829127;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: f */
        public final int m36429f(int i) {
            return i & 1879048304;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DivViewGroup(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivLayoutParams;
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable AttributeSet attributeSet) {
        return new DivLayoutParams(getContext(), attributeSet);
    }

    public final int getGravity() {
        return this.f76065b;
    }

    public final int getHorizontalGravity$div_release() {
        return Companion.m36430e(this.f76065b);
    }

    public final int getHorizontalPaddings$div_release() {
        return getPaddingLeft() + getPaddingRight();
    }

    public final int getVerticalGravity$div_release() {
        return Companion.m36429f(this.f76065b);
    }

    public final int getVerticalPaddings$div_release() {
        return getPaddingTop() + getPaddingBottom();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(@NotNull View child, int i, int i2) {
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.m17073h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        C29795a c29795a = Companion;
        child.measure(c29795a.m36434a(i, getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.m36369f()), c29795a.m36434a(i2, getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.m36370e()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public void measureChildWithMargins(@NotNull View child, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.m17073h(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        C29795a c29795a = Companion;
        child.measure(c29795a.m36434a(i, getHorizontalPaddings$div_release() + divLayoutParams.m36372c() + i2, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.m36369f()), c29795a.m36434a(i3, getVerticalPaddings$div_release() + divLayoutParams.m36367h() + i4, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.m36370e()));
    }

    public final void setGravity(int i) {
        if (this.f76065b == i) {
            return;
        }
        C29795a c29795a = Companion;
        if (c29795a.m36430e(i) == 0) {
            i |= GravityCompat.START;
        }
        if (c29795a.m36429f(i) == 0) {
            i |= 48;
        }
        this.f76065b = i;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DivViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    @NotNull
    public ViewGroup.LayoutParams generateLayoutParams(@Nullable ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivLayoutParams ? new DivLayoutParams((DivLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new DivLayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new DivLayoutParams(layoutParams);
    }

    public /* synthetic */ DivViewGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* compiled from: DivViewGroup.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.DivViewGroup$b */
    /* loaded from: classes8.dex */
    public final class C29796b {

        /* renamed from: a */
        private float f76066a;

        /* renamed from: b */
        private float f76067b;

        /* renamed from: c */
        private int f76068c;

        public C29796b(float f, float f2, int i) {
            this.f76066a = f;
            this.f76067b = f2;
            this.f76068c = i;
        }

        /* renamed from: a */
        public final int m36428a() {
            return this.f76068c;
        }

        /* renamed from: b */
        public final float m36427b() {
            return this.f76066a;
        }

        /* renamed from: c */
        public final float m36426c() {
            return this.f76067b;
        }

        /* renamed from: d */
        public final void m36425d(float f, int i, int i2) {
            this.f76066a = 0.0f;
            this.f76067b = 0.0f;
            this.f76068c = 0;
            switch (i) {
                case 1:
                case 16:
                    this.f76066a = f / 2;
                    return;
                case 3:
                case 48:
                    return;
                case 5:
                case 80:
                    this.f76066a = f;
                    return;
                case 16777216:
                case 268435456:
                    float m36433b = DivViewGroup.Companion.m36433b(f, i2);
                    this.f76066a = m36433b;
                    float f2 = 2;
                    this.f76067b = m36433b * f2;
                    this.f76068c = (int) (m36433b / f2);
                    return;
                case 33554432:
                case 536870912:
                    this.f76067b = DivViewGroup.Companion.m36432c(f, i2);
                    return;
                case 67108864:
                case 1073741824:
                    float m36431d = DivViewGroup.Companion.m36431d(f, i2);
                    this.f76066a = m36431d;
                    this.f76067b = m36431d;
                    this.f76068c = (int) (m36431d / 2);
                    return;
                default:
                    throw new IllegalStateException("Invalid gravity is set: " + i);
            }
        }

        public /* synthetic */ C29796b(DivViewGroup divViewGroup, float f, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0 : i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f76065b = 8388659;
        setClipToPadding(false);
    }

    public static /* synthetic */ void getGravity$annotations() {
    }
}
