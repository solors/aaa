package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: se.g0 */
/* loaded from: classes8.dex */
public final class JsonExceptions extends C42707j0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonExceptions(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
