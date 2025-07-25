package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.C31571ud;
import com.yandex.mobile.ads.impl.C31646vd;
import com.yandex.mobile.ads.impl.bu1;
import com.yandex.mobile.ads.impl.tr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class ExtendedTextView extends TextView {
    @NotNull

    /* renamed from: a */
    private tr0 f66439a;
    @Nullable

    /* renamed from: b */
    private final C31571ud f66440b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context) {
        this(context, null, 0, null, null, 30, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C31571ud c31571ud;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT < 27 && (c31571ud = this.f66440b) != null) {
            c31571ud.m28822a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        tr0.C31476a mo27438a = this.f66439a.mo27438a(i, i2);
        super.onMeasure(mo27438a.f85812a, mo27438a.f85813b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(@NotNull CharSequence text, int i, int i2, int i3) {
        C31571ud c31571ud;
        Intrinsics.checkNotNullParameter(text, "text");
        super.onTextChanged(text, i, i2, i3);
        if (Build.VERSION.SDK_INT < 27 && (c31571ud = this.f66440b) != null) {
            c31571ud.m28819b();
        }
    }

    public final void setAutoSizeTextType(int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C31571ud c31571ud = this.f66440b;
        if (c31571ud != null) {
            c31571ud.m28821a(i);
        }
    }

    public final void setMeasureSpecProvider(@NotNull tr0 measureSpecProvider) {
        Intrinsics.checkNotNullParameter(measureSpecProvider, "measureSpecProvider");
        this.f66439a = measureSpecProvider;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        if (Build.VERSION.SDK_INT >= 27) {
            super.setTextSize(i, f);
            return;
        }
        C31571ud c31571ud = this.f66440b;
        if (c31571ud != null) {
            c31571ud.m28820a(i, f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, null, 24, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @NotNull tr0 measureSpecProvider) {
        this(context, attributeSet, i, measureSpecProvider, null, 16, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(measureSpecProvider, "measureSpecProvider");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public ExtendedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, @NotNull tr0 measureSpecProvider, @NotNull C31646vd appCompatAutoSizeControllerFactory) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(measureSpecProvider, "measureSpecProvider");
        Intrinsics.checkNotNullParameter(appCompatAutoSizeControllerFactory, "appCompatAutoSizeControllerFactory");
        this.f66439a = measureSpecProvider;
        appCompatAutoSizeControllerFactory.getClass();
        this.f66440b = C31646vd.m28366a(this);
    }

    public /* synthetic */ ExtendedTextView(Context context, AttributeSet attributeSet, int i, tr0 tr0Var, C31646vd c31646vd, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? new bu1() : tr0Var, (i2 & 16) != 0 ? new C31646vd() : c31646vd);
    }
}
