package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata
/* renamed from: androidx.compose.runtime.BitwiseOperatorsKt */
/* loaded from: classes.dex */
public final class BitwiseOperators {
    public static final int rol(int i, int i2) {
        return Integer.rotateLeft(i, i2);
    }

    public static final int ror(int i, int i2) {
        return Integer.rotateRight(i, i2);
    }
}
