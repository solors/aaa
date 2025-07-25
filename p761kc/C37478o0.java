package p761kc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpHeaders.kt */
@Metadata
/* renamed from: kc.o0 */
/* loaded from: classes9.dex */
public final class C37478o0 extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37478o0(@NotNull String header) {
        super("Header(s) " + header + " are controlled by the engine and cannot be set explicitly");
        Intrinsics.checkNotNullParameter(header, "header");
    }
}
