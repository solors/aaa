package p761kc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kc.a */
/* loaded from: classes9.dex */
public final class ContentTypes extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentTypes(@NotNull String value) {
        super("Bad Content-Type format: " + value);
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
