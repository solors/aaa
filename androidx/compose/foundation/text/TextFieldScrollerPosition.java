package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.text.TextRange;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaver;
import androidx.compose.runtime.saveable.Saver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldScroll.kt */
@Stable
@Metadata
/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaver.listSaver(TextFieldScrollerPosition$Companion$Saver$1.INSTANCE, TextFieldScrollerPosition$Companion$Saver$2.INSTANCE);
    @NotNull
    private final SnapshotState maximum$delegate;
    @NotNull
    private final SnapshotState offset$delegate;
    @NotNull
    private final SnapshotState orientation$delegate;
    @NotNull
    private Rect previousCursorRect;
    private long previousSelection;

    /* compiled from: TextFieldScroll.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }
    }

    public TextFieldScrollerPosition(@NotNull Orientation initialOrientation, float f) {
        SnapshotState mutableStateOf$default;
        SnapshotState mutableStateOf$default2;
        Intrinsics.checkNotNullParameter(initialOrientation, "initialOrientation");
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), null, 2, null);
        this.offset$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
        this.maximum$delegate = mutableStateOf$default2;
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m109387getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(initialOrientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    private final void setMaximum(float f) {
        this.maximum$delegate.setValue(Float.valueOf(f));
    }

    public final void coerceOffset$foundation_release(float f, float f2, int i) {
        int i2;
        float f3;
        float offset = getOffset();
        float f4 = i;
        float f5 = offset + f4;
        if (f2 > f5 || (f < offset && f2 - f > f4)) {
            f3 = f2 - f5;
        } else if (i2 < 0 && f2 - f <= f4) {
            f3 = f - offset;
        } else {
            f3 = 0.0f;
        }
        setOffset(getOffset() + f3);
    }

    public final float getMaximum() {
        return ((Number) this.maximum$delegate.getValue()).floatValue();
    }

    public final float getOffset() {
        return ((Number) this.offset$delegate.getValue()).floatValue();
    }

    /* renamed from: getOffsetToFollow-5zc-tL8  reason: not valid java name */
    public final int m106655getOffsetToFollow5zctL8(long j) {
        if (TextRange.m109382getStartimpl(j) != TextRange.m109382getStartimpl(this.previousSelection)) {
            return TextRange.m109382getStartimpl(j);
        }
        if (TextRange.m109377getEndimpl(j) != TextRange.m109377getEndimpl(this.previousSelection)) {
            return TextRange.m109377getEndimpl(j);
        }
        return TextRange.m109380getMinimpl(j);
    }

    @NotNull
    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE  reason: not valid java name */
    public final long m106656getPreviousSelectiond9O1mEE() {
        return this.previousSelection;
    }

    public final void setOffset(float f) {
        this.offset$delegate.setValue(Float.valueOf(f));
    }

    public final void setOrientation(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<set-?>");
        this.orientation$delegate.setValue(orientation);
    }

    /* renamed from: setPreviousSelection-5zc-tL8  reason: not valid java name */
    public final void m106657setPreviousSelection5zctL8(long j) {
        this.previousSelection = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r0 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void update(@org.jetbrains.annotations.NotNull androidx.compose.foundation.gestures.Orientation r5, @org.jetbrains.annotations.NotNull androidx.compose.p015ui.geometry.Rect r6, int r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "cursorRect"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r8 = r8 - r7
            float r8 = (float) r8
            r4.setMaximum(r8)
            float r0 = r6.getLeft()
            androidx.compose.ui.geometry.Rect r1 = r4.previousCursorRect
            float r1 = r1.getLeft()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L21
            r0 = r1
            goto L22
        L21:
            r0 = r2
        L22:
            if (r0 == 0) goto L37
            float r0 = r6.getTop()
            androidx.compose.ui.geometry.Rect r3 = r4.previousCursorRect
            float r3 = r3.getTop()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = r1
            goto L35
        L34:
            r0 = r2
        L35:
            if (r0 != 0) goto L58
        L37:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r5 != r0) goto L3c
            goto L3d
        L3c:
            r1 = r2
        L3d:
            if (r1 == 0) goto L44
            float r5 = r6.getTop()
            goto L48
        L44:
            float r5 = r6.getLeft()
        L48:
            if (r1 == 0) goto L4f
            float r0 = r6.getBottom()
            goto L53
        L4f:
            float r0 = r6.getRight()
        L53:
            r4.coerceOffset$foundation_release(r5, r0, r7)
            r4.previousCursorRect = r6
        L58:
            float r5 = r4.getOffset()
            r6 = 0
            float r5 = kotlin.ranges.C37635g.m16931m(r5, r6, r8)
            r4.setOffset(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollerPosition.update(androidx.compose.foundation.gestures.Orientation, androidx.compose.ui.geometry.Rect, int, int):void");
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i & 2) != 0 ? 0.0f : f);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }
}
