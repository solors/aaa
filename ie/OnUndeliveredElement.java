package ie;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ie.s0 */
/* loaded from: classes8.dex */
public final class OnUndeliveredElement extends RuntimeException {
    public OnUndeliveredElement(@NotNull String str, @NotNull Throwable th) {
        super(str, th);
    }
}
