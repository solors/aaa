package vc;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tc.C44400d;

@Metadata
/* renamed from: vc.e */
/* loaded from: classes9.dex */
public final class BufferPrimitivesJvm {
    /* renamed from: a */
    public static final void m2485a(@NotNull C44557a c44557a, @NotNull ByteBuffer source) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        ByteBuffer m2510g = c44557a.m2510g();
        int m2507j = c44557a.m2507j();
        int m2511f = c44557a.m2511f() - m2507j;
        if (m2511f >= remaining) {
            C44400d.m3115c(source, m2510g, m2507j);
            c44557a.m2516a(remaining);
            return;
        }
        throw new C44564o("buffer content", remaining, m2511f);
    }
}
