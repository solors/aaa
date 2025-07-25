package okio;

import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: okio.u */
/* loaded from: classes10.dex */
public final class JvmFileHandle extends FileHandle {
    @NotNull

    /* renamed from: g */
    private final RandomAccessFile f103012g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z, @NotNull RandomAccessFile randomAccessFile) {
        super(z);
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f103012g = randomAccessFile;
    }

    @Override // okio.FileHandle
    /* renamed from: i */
    protected synchronized void mo13444i() {
        this.f103012g.close();
    }

    @Override // okio.FileHandle
    /* renamed from: k */
    protected synchronized int mo13443k(long j, @NotNull byte[] array, int i, int i2) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f103012g.seek(j);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            int read = this.f103012g.read(array, i, i2 - i3);
            if (read == -1) {
                if (i3 == 0) {
                    return -1;
                }
            } else {
                i3 += read;
            }
        }
        return i3;
    }

    @Override // okio.FileHandle
    /* renamed from: l */
    protected synchronized long mo13442l() {
        return this.f103012g.length();
    }
}
