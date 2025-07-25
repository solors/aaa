package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.network.toolbox.AbstractC22916a;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.mbridge.msdk.foundation.same.report.l */
/* loaded from: classes6.dex */
public final class SocketStack extends AbstractC22916a {

    /* renamed from: a */
    private static final AtomicInteger f56824a = new AtomicInteger(1);

    /* renamed from: b */
    private final byte f56825b;

    public SocketStack(byte b) {
        this.f56825b = b;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080 A[Catch: all -> 0x013c, TryCatch #4 {all -> 0x013c, blocks: (B:11:0x004d, B:13:0x005e, B:16:0x0062, B:18:0x006a, B:20:0x0077, B:23:0x007b, B:30:0x0099, B:32:0x00b1, B:29:0x0098, B:26:0x0080, B:31:0x00a7, B:17:0x0067), top: B:81:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098 A[Catch: all -> 0x013c, TryCatch #4 {all -> 0x013c, blocks: (B:11:0x004d, B:13:0x005e, B:16:0x0062, B:18:0x006a, B:20:0x0077, B:23:0x007b, B:30:0x0099, B:32:0x00b1, B:29:0x0098, B:26:0x0080, B:31:0x00a7, B:17:0x0067), top: B:81:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100 A[Catch: all -> 0x0137, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0137, blocks: (B:33:0x00c1, B:37:0x00d1, B:40:0x00e3, B:45:0x0100, B:48:0x0117, B:53:0x011f, B:54:0x012c), top: B:78:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0117 A[Catch: all -> 0x0137, TRY_ENTER, TryCatch #2 {all -> 0x0137, blocks: (B:33:0x00c1, B:37:0x00d1, B:40:0x00e3, B:45:0x0100, B:48:0x0117, B:53:0x011f, B:54:0x012c), top: B:78:0x00c1 }] */
    @Override // com.mbridge.msdk.tracker.network.toolbox.AbstractC22916a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.tracker.network.toolbox.C22922g mo49427a(com.mbridge.msdk.tracker.network.AbstractC22930u<?> r12, java.util.Map<java.lang.String, java.lang.String> r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.SocketStack.mo49427a(com.mbridge.msdk.tracker.network.u, java.util.Map):com.mbridge.msdk.tracker.network.toolbox.g");
    }

    /* renamed from: a */
    private static void m51941a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m51940a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m51939a(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            try {
                byteBuffer.clear();
            } catch (Exception unused) {
            }
        }
    }
}
