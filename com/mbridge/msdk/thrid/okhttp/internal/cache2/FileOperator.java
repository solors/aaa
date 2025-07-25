package com.mbridge.msdk.thrid.okhttp.internal.cache2;

import com.mbridge.msdk.thrid.okio.Buffer;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes6.dex */
final class FileOperator {
    private final FileChannel fileChannel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public void read(long j, Buffer buffer, long j2) throws IOException {
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, buffer);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public void write(long j, Buffer buffer, long j2) throws IOException {
        if (j2 >= 0 && j2 <= buffer.size()) {
            while (j2 > 0) {
                long transferFrom = this.fileChannel.transferFrom(buffer, j, j2);
                j += transferFrom;
                j2 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
