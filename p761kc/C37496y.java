package p761kc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpHeaders.kt */
@Metadata
/* renamed from: kc.y */
/* loaded from: classes9.dex */
public final class C37496y extends IllegalArgumentException {
    @NotNull

    /* renamed from: b */
    private final String f99109b;

    /* renamed from: c */
    private final int f99110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37496y(@NotNull String headerValue, int i) {
        super("Header value '" + headerValue + "' contains illegal character '" + headerValue.charAt(i) + "' (code " + (headerValue.charAt(i) & 255) + ')');
        Intrinsics.checkNotNullParameter(headerValue, "headerValue");
        this.f99109b = headerValue;
        this.f99110c = i;
    }
}
