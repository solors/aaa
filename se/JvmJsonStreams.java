package se;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: se.e0 */
/* loaded from: classes8.dex */
public final class JvmJsonStreams implements JsonStreams {
    @NotNull

    /* renamed from: a */
    private final CharsetReader f111817a;

    public JvmJsonStreams(@NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        this.f111817a = new CharsetReader(stream, Charsets.UTF_8);
    }

    @Override // se.JsonStreams
    /* renamed from: a */
    public int mo6845a(@NotNull char[] buffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return this.f111817a.m6703d(buffer, i, i2);
    }

    /* renamed from: b */
    public final void m6844b() {
        this.f111817a.m6702e();
    }
}
