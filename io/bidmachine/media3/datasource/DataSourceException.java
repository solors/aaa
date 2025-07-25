package io.bidmachine.media3.datasource;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

/* loaded from: classes9.dex */
public class DataSourceException extends IOException {
    @UnstableApi
    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    @UnstableApi
    public DataSourceException(int i) {
        this.reason = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r2 = r2;
     */
    @io.bidmachine.media3.common.util.UnstableApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isCausedByPositionOutOfRange(java.io.IOException r2) {
        /*
        L0:
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof io.bidmachine.media3.datasource.DataSourceException
            if (r0 == 0) goto L11
            r0 = r2
            io.bidmachine.media3.datasource.DataSourceException r0 = (io.bidmachine.media3.datasource.DataSourceException) r0
            int r0 = r0.reason
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L11
            r2 = 1
            return r2
        L11:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        L16:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.datasource.DataSourceException.isCausedByPositionOutOfRange(java.io.IOException):boolean");
    }

    @UnstableApi
    public DataSourceException(@Nullable Throwable th, int i) {
        super(th);
        this.reason = i;
    }

    @UnstableApi
    public DataSourceException(@Nullable String str, int i) {
        super(str);
        this.reason = i;
    }

    @UnstableApi
    public DataSourceException(@Nullable String str, @Nullable Throwable th, int i) {
        super(str, th);
        this.reason = i;
    }
}
