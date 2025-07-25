package androidx.compose.foundation.text;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextLayoutResultProxy.kt */
@Metadata
/* loaded from: classes.dex */
public final class TextLayoutResultProxy {
    @Nullable
    private LayoutCoordinates decorationBoxCoordinates;
    @Nullable
    private LayoutCoordinates innerTextFieldCoordinates;
    @NotNull
    private final TextLayoutResult value;

    public TextLayoutResultProxy(@NotNull TextLayoutResult value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r2 == null) goto L13;
     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m106665coercedInVisibleBoundsOfInputTextMKHz9U(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.innerTextFieldCoordinates
            if (r0 == 0) goto L1e
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L16
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.decorationBoxCoordinates
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.p015ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p015ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p015ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L24:
            long r6 = androidx.compose.foundation.text.TextLayoutResultProxyKt.m106670access$coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLayoutResultProxy.m106665coercedInVisibleBoundsOfInputTextMKHz9U(long):long");
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResultProxy.getLineEnd(i, z);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default  reason: not valid java name */
    public static /* synthetic */ int m106666getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return textLayoutResultProxy.m106668getOffsetForPosition3MmeM6k(j, z);
    }

    /* renamed from: relativeToInputText-MK-Hz9U  reason: not valid java name */
    private final long m106667relativeToInputTextMKHz9U(long j) {
        Offset offset;
        long j2;
        LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        if (layoutCoordinates != null) {
            LayoutCoordinates layoutCoordinates2 = this.decorationBoxCoordinates;
            if (layoutCoordinates2 != null) {
                if (layoutCoordinates.isAttached() && layoutCoordinates2.isAttached()) {
                    j2 = layoutCoordinates.mo109023localPositionOfR5De75A(layoutCoordinates2, j);
                } else {
                    j2 = j;
                }
                offset = Offset.m107280boximpl(j2);
            } else {
                offset = null;
            }
            if (offset != null) {
                return offset.m107301unboximpl();
            }
            return j;
        }
        return j;
    }

    @Nullable
    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    @Nullable
    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int getLineEnd(int i, boolean z) {
        return this.value.getLineEnd(i, z);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.value.getLineForVerticalPosition(Offset.m107292getYimpl(m106667relativeToInputTextMKHz9U(m106665coercedInVisibleBoundsOfInputTextMKHz9U(OffsetKt.Offset(0.0f, f)))));
    }

    /* renamed from: getOffsetForPosition-3MmeM6k  reason: not valid java name */
    public final int m106668getOffsetForPosition3MmeM6k(long j, boolean z) {
        if (z) {
            j = m106665coercedInVisibleBoundsOfInputTextMKHz9U(j);
        }
        return this.value.m109367getOffsetForPositionk4lQ0M(m106667relativeToInputTextMKHz9U(j));
    }

    @NotNull
    public final TextLayoutResult getValue() {
        return this.value;
    }

    /* renamed from: isPositionOnText-k-4lQ0M  reason: not valid java name */
    public final boolean m106669isPositionOnTextk4lQ0M(long j) {
        long m106667relativeToInputTextMKHz9U = m106667relativeToInputTextMKHz9U(m106665coercedInVisibleBoundsOfInputTextMKHz9U(j));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Offset.m107292getYimpl(m106667relativeToInputTextMKHz9U));
        if (Offset.m107291getXimpl(m106667relativeToInputTextMKHz9U) >= this.value.getLineLeft(lineForVerticalPosition) && Offset.m107291getXimpl(m106667relativeToInputTextMKHz9U) <= this.value.getLineRight(lineForVerticalPosition)) {
            return true;
        }
        return false;
    }

    public final void setDecorationBoxCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }
}
