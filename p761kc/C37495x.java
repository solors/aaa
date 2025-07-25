package p761kc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpHeaders.kt */
@Metadata
/* renamed from: kc.x */
/* loaded from: classes9.dex */
public final class C37495x extends IllegalArgumentException {
    @NotNull

    /* renamed from: b */
    private final String f99107b;

    /* renamed from: c */
    private final int f99108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37495x(@NotNull String headerName, int i) {
        super("Header name '" + headerName + "' contains illegal character '" + headerName.charAt(i) + "' (code " + (headerName.charAt(i) & 255) + ')');
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        this.f99107b = headerName;
        this.f99108c = i;
    }
}
