package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes4.dex */
public final class ExoPlaybackException extends PlaybackException {
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;

    /* renamed from: h */
    final boolean f31435h;
    @Nullable
    public final MediaPeriodId mediaPeriodId;
    @Nullable
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    @Nullable
    public final String rendererName;
    public final int type;
    public static final Bundleable.Creator<ExoPlaybackException> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.d
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return ExoPlaybackException.m76073d(bundle);
        }
    };

    /* renamed from: i */
    private static final String f31429i = Util.intToStringMaxRadix(1001);

    /* renamed from: j */
    private static final String f31430j = Util.intToStringMaxRadix(1002);

    /* renamed from: k */
    private static final String f31431k = Util.intToStringMaxRadix(1003);

    /* renamed from: l */
    private static final String f31432l = Util.intToStringMaxRadix(1004);

    /* renamed from: m */
    private static final String f31433m = Util.intToStringMaxRadix(1005);

    /* renamed from: n */
    private static final String f31434n = Util.intToStringMaxRadix(1006);

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Type {
    }

    private ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, @Nullable Format format, int i2, boolean z, int i3) {
        int i4;
        if (format == null) {
            i4 = 4;
        } else {
            i4 = i2;
        }
        return new ExoPlaybackException(1, th, null, i3, str, i, format, i4, z);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i) {
        return new ExoPlaybackException(0, iOException, i);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    /* renamed from: d */
    public static /* synthetic */ ExoPlaybackException m76073d(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    /* renamed from: f */
    private static String m76071f(int i, @Nullable String str, @Nullable String str2, int i2, @Nullable Format format, int i3) {
        String str3;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    str3 = "Unexpected runtime error";
                } else {
                    str3 = "Remote error";
                }
            } else {
                str3 = str2 + " error, index=" + i2 + ", format=" + format + ", format_supported=" + Util.getFormatSupportString(i3);
            }
        } else {
            str3 = "Source error";
        }
        if (!TextUtils.isEmpty(str)) {
            return str3 + ": " + str;
        }
        return str3;
    }

    @CheckResult
    /* renamed from: e */
    public ExoPlaybackException m76072e(@Nullable MediaPeriodId mediaPeriodId) {
        return new ExoPlaybackException((String) Util.castNonNull(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, mediaPeriodId, this.timestampMs, this.f31435h);
    }

    @Override // com.google.android.exoplayer2.PlaybackException
    public boolean errorInfoEquals(@Nullable PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) Util.castNonNull(playbackException);
        if (this.type != exoPlaybackException.type || !Util.areEqual(this.rendererName, exoPlaybackException.rendererName) || this.rendererIndex != exoPlaybackException.rendererIndex || !Util.areEqual(this.rendererFormat, exoPlaybackException.rendererFormat) || this.rendererFormatSupport != exoPlaybackException.rendererFormatSupport || !Util.areEqual(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) || this.f31435h != exoPlaybackException.f31435h) {
            return false;
        }
        return true;
    }

    public Exception getRendererException() {
        boolean z = true;
        if (this.type != 1) {
            z = false;
        }
        Assertions.checkState(z);
        return (Exception) Assertions.checkNotNull(getCause());
    }

    public IOException getSourceException() {
        boolean z;
        if (this.type == 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        return (IOException) Assertions.checkNotNull(getCause());
    }

    public RuntimeException getUnexpectedException() {
        boolean z;
        if (this.type == 2) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        return (RuntimeException) Assertions.checkNotNull(getCause());
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(f31429i, this.type);
        bundle.putString(f31430j, this.rendererName);
        bundle.putInt(f31431k, this.rendererIndex);
        Format format = this.rendererFormat;
        if (format != null) {
            bundle.putBundle(f31432l, format.toBundle());
        }
        bundle.putInt(f31433m, this.rendererFormatSupport);
        bundle.putBoolean(f31434n, this.f31435h);
        return bundle;
    }

    private ExoPlaybackException(int i, @Nullable Throwable th, @Nullable String str, int i2, @Nullable String str2, int i3, @Nullable Format format, int i4, boolean z) {
        this(m76071f(i, str, str2, i3, format, i4), th, i2, i, str2, i3, format, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i) {
        return new ExoPlaybackException(2, runtimeException, i);
    }

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(f31429i, 2);
        this.rendererName = bundle.getString(f31430j);
        this.rendererIndex = bundle.getInt(f31431k, -1);
        Bundle bundle2 = bundle.getBundle(f31432l);
        this.rendererFormat = bundle2 == null ? null : Format.CREATOR.fromBundle(bundle2);
        this.rendererFormatSupport = bundle.getInt(f31433m, 4);
        this.f31435h = bundle.getBoolean(f31434n, false);
        this.mediaPeriodId = null;
    }

    private ExoPlaybackException(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable Format format, int i4, @Nullable MediaPeriodId mediaPeriodId, long j, boolean z) {
        super(str, th, i, j);
        boolean z2 = false;
        Assertions.checkArgument(!z || i2 == 1);
        Assertions.checkArgument((th != null || i2 == 3) ? true : z2);
        this.type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = format;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = mediaPeriodId;
        this.f31435h = z;
    }
}
