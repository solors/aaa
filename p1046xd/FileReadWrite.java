package p1046xd;

import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: xd.e */
/* loaded from: classes7.dex */
final class FileReadWrite extends ByteArrayOutputStream {
    public FileReadWrite(int i) {
        super(i);
    }

    @NotNull
    /* renamed from: a */
    public final byte[] m1217a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
