package p823p;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p1077ze.C45292c0;

@Metadata
/* renamed from: p.d */
/* loaded from: classes2.dex */
public final class HttpException extends RuntimeException {
    @NotNull

    /* renamed from: b */
    private final C45292c0 f103092b;

    public HttpException(@NotNull C45292c0 c45292c0) {
        super("HTTP " + c45292c0.m415h() + ": " + c45292c0.m407t());
        this.f103092b = c45292c0;
    }
}
