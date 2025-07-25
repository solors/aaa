package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
public class DefaultLoadErrorHandlingPolicy implements LoadErrorHandlingPolicy {
    public static final long DEFAULT_LOCATION_EXCLUSION_MS = 300000;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT = 3;
    public static final int DEFAULT_MIN_LOADABLE_RETRY_COUNT_PROGRESSIVE_LIVE = 6;
    @Deprecated
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    public static final long DEFAULT_TRACK_EXCLUSION_MS = 60000;

    /* renamed from: a */
    private final int f35843a;

    public DefaultLoadErrorHandlingPolicy() {
        this(-1);
    }

    /* renamed from: a */
    protected boolean m72771a(IOException iOException) {
        if (!(iOException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    @Nullable
    public LoadErrorHandlingPolicy.FallbackSelection getFallbackSelectionFor(LoadErrorHandlingPolicy.FallbackOptions fallbackOptions, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        if (!m72771a(loadErrorInfo.exception)) {
            return null;
        }
        if (fallbackOptions.isFallbackAvailable(1)) {
            return new LoadErrorHandlingPolicy.FallbackSelection(1, 300000L);
        }
        if (!fallbackOptions.isFallbackAvailable(2)) {
            return null;
        }
        return new LoadErrorHandlingPolicy.FallbackSelection(2, 60000L);
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public int getMinimumLoadableRetryCount(int i) {
        int i2 = this.f35843a;
        if (i2 == -1) {
            if (i == 7) {
                return 6;
            }
            return 3;
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public long getRetryDelayMsFor(LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo) {
        IOException iOException = loadErrorInfo.exception;
        if (!(iOException instanceof ParserException) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof HttpDataSource.CleartextNotPermittedException) && !(iOException instanceof Loader.UnexpectedLoaderException) && !DataSourceException.isCausedByPositionOutOfRange(iOException)) {
            return Math.min((loadErrorInfo.errorCount - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public DefaultLoadErrorHandlingPolicy(int i) {
        this.f35843a = i;
    }
}
