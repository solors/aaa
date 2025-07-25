package p792n;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p837q.C39310n;

@Metadata
/* renamed from: n.a */
/* loaded from: classes2.dex */
public final class ByteArrayMapper implements Mapper<byte[], ByteBuffer> {
    @Override // p792n.Mapper
    @NotNull
    /* renamed from: b */
    public ByteBuffer mo15106a(@NotNull byte[] bArr, @NotNull C39310n c39310n) {
        return ByteBuffer.wrap(bArr);
    }
}
