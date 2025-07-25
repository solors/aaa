package p761kc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kc.j0 */
/* loaded from: classes9.dex */
public final class URLParser extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLParser(@NotNull String urlString, @NotNull Throwable cause) {
        super("Fail to parse url: " + urlString, cause);
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
