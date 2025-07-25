package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: okio.a1 */
/* loaded from: classes10.dex */
public final class JvmOkio extends AsyncTimeout {
    @NotNull

    /* renamed from: b */
    private final Socket f102930b;

    public JvmOkio(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f102930b = socket;
    }

    @Override // okio.AsyncTimeout
    @NotNull
    protected IOException newTimeoutException(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    protected void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.f102930b.close();
        } catch (AssertionError e) {
            if (C39217m0.m13506e(e)) {
                logger2 = C39218n0.f102980a;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.f102930b, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = C39218n0.f102980a;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.f102930b, (Throwable) e2);
        }
    }
}
