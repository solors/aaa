package com.mbridge.msdk.playercommon.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public final class ExoPlaybackException extends Exception {
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    public final int rendererIndex;
    public final int type;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Type {
    }

    private ExoPlaybackException(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.type = i;
        this.rendererIndex = i2;
    }

    public static ExoPlaybackException createForRenderer(Exception exc, int i) {
        return new ExoPlaybackException(1, null, exc, i);
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, null, iOException, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, null, runtimeException, -1);
    }

    public final Exception getRendererException() {
        boolean z = true;
        if (this.type != 1) {
            z = false;
        }
        Assertions.checkState(z);
        return (Exception) getCause();
    }

    public final IOException getSourceException() {
        boolean z;
        if (this.type == 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        return (IOException) getCause();
    }

    public final RuntimeException getUnexpectedException() {
        boolean z;
        if (this.type == 2) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        return (RuntimeException) getCause();
    }
}
