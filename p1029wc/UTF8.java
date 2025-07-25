package p1029wc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: wc.d */
/* loaded from: classes9.dex */
public final class UTF8 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UTF8(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
