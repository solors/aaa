package va;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: va.a */
/* loaded from: classes8.dex */
public final class JsonTopologicalSorting extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTopologicalSorting(@NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
