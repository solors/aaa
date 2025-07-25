package androidx.compose.p015ui.text.caches;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.text.caches.ContainerHelpersKt */
/* loaded from: classes.dex */
public final class ContainerHelpers {
    @NotNull
    public static final int[] EMPTY_INTS = new int[0];
    @NotNull
    public static final Object[] EMPTY_OBJECTS = new Object[0];

    public static final int binarySearchInternal(@NotNull int[] iArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 > i2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }
}
