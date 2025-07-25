package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ForEachOneBitKt */
/* loaded from: classes.dex */
public final class ForEachOneBit {
    public static final void forEachOneBit(int i, @NotNull Function2<? super Integer, ? super Integer, Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        int i2 = 0;
        while (i != 0) {
            int lowestOneBit = Integer.lowestOneBit(i);
            body.mo105910invoke(Integer.valueOf(lowestOneBit), Integer.valueOf(i2));
            i2++;
            i ^= lowestOneBit;
        }
    }
}
