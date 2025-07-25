package vc;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tc.C44400d;

@Metadata
/* renamed from: vc.g */
/* loaded from: classes9.dex */
public final class BufferUtilsJvm {
    /* renamed from: a */
    public static final void m2480a(@NotNull C44557a c44557a, @NotNull ByteBuffer dst, int i) {
        Intrinsics.checkNotNullParameter(c44557a, "<this>");
        Intrinsics.checkNotNullParameter(dst, "dst");
        ByteBuffer m2510g = c44557a.m2510g();
        int m2509h = c44557a.m2509h();
        if (c44557a.m2507j() - m2509h >= i) {
            int limit = dst.limit();
            try {
                dst.limit(dst.position() + i);
                C44400d.m3117a(m2510g, dst, m2509h);
                dst.limit(limit);
                Unit unit = Unit.f99208a;
                c44557a.m2514c(i);
                return;
            } catch (Throwable th) {
                dst.limit(limit);
                throw th;
            }
        }
        throw new EOFException("Not enough bytes to read a buffer content of size " + i + '.');
    }
}
