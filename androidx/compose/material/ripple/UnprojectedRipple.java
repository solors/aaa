package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.graphics.ColorKt;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RippleHostView.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class UnprojectedRipple extends RippleDrawable {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static boolean setMaxRadiusFetched;
    @Nullable
    private static Method setMaxRadiusMethod;
    private final boolean bounded;
    private boolean projected;
    @Nullable
    private Color rippleColor;
    @Nullable
    private Integer rippleRadius;

    /* compiled from: RippleHostView.android.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RippleHostView.android.kt */
    @RequiresApi(23)
    @Metadata
    /* loaded from: classes.dex */
    public static final class MRadiusHelper {
        @NotNull
        public static final MRadiusHelper INSTANCE = new MRadiusHelper();

        private MRadiusHelper() {
        }

        @DoNotInline
        public final void setRadius(@NotNull RippleDrawable ripple, int i) {
            Intrinsics.checkNotNullParameter(ripple, "ripple");
            ripple.setRadius(i);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UnprojectedRipple(boolean r5) {
        /*
            r4 = this;
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1 = 0
            if (r5 == 0) goto L10
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            goto L11
        L10:
            r2 = r1
        L11:
            r4.<init>(r0, r1, r2)
            r4.bounded = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.UnprojectedRipple.<init>(boolean):void");
    }

    /* renamed from: calculateRippleColor-5vOe2sY  reason: not valid java name */
    private final long m107165calculateRippleColor5vOe2sY(long j, float f) {
        float m16913i;
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        m16913i = _Ranges.m16913i(f, 1.0f);
        return Color.m107526copywmQWz5c$default(j, m16913i, 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @NotNull
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        Intrinsics.checkNotNullExpressionValue(dirtyBounds, "super.getDirtyBounds()");
        this.projected = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    /* renamed from: setColor-DxMtmZc  reason: not valid java name */
    public final void m107166setColorDxMtmZc(long j, float f) {
        boolean m107528equalsimpl0;
        long m107165calculateRippleColor5vOe2sY = m107165calculateRippleColor5vOe2sY(j, f);
        Color color = this.rippleColor;
        if (color == null) {
            m107528equalsimpl0 = false;
        } else {
            m107528equalsimpl0 = Color.m107528equalsimpl0(color.m107537unboximpl(), m107165calculateRippleColor5vOe2sY);
        }
        if (!m107528equalsimpl0) {
            this.rippleColor = Color.m107517boximpl(m107165calculateRippleColor5vOe2sY);
            setColor(ColorStateList.valueOf(ColorKt.m107582toArgb8_81llA(m107165calculateRippleColor5vOe2sY)));
        }
    }

    public final void trySetRadius(int i) {
        Integer num = this.rippleRadius;
        if (num == null || num.intValue() != i) {
            this.rippleRadius = Integer.valueOf(i);
            MRadiusHelper.INSTANCE.setRadius(this, i);
        }
    }
}
