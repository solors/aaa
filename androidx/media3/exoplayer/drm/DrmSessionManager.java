package androidx.media3.exoplayer.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.drm.DrmSessionManager;

@UnstableApi
/* loaded from: classes2.dex */
public interface DrmSessionManager {
    public static final DrmSessionManager DRM_UNSUPPORTED;
    @Deprecated
    public static final DrmSessionManager DUMMY;

    static {
        DrmSessionManager drmSessionManager = new DrmSessionManager() { // from class: androidx.media3.exoplayer.drm.DrmSessionManager.1
            @Override // androidx.media3.exoplayer.drm.DrmSessionManager
            @Nullable
            public DrmSession acquireSession(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
                if (format.drmInitData == null) {
                    return null;
                }
                return new ErrorStateDrmSession(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionManager
            public int getCryptoType(Format format) {
                if (format.drmInitData != null) {
                    return 1;
                }
                return 0;
            }

            @Override // androidx.media3.exoplayer.drm.DrmSessionManager
            public void setPlayer(Looper looper, PlayerId playerId) {
            }
        };
        DRM_UNSUPPORTED = drmSessionManager;
        DUMMY = drmSessionManager;
    }

    @Deprecated
    static DrmSessionManager getDummyDrmSessionManager() {
        return DRM_UNSUPPORTED;
    }

    @Nullable
    DrmSession acquireSession(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format);

    int getCryptoType(Format format);

    default DrmSessionReference preacquireSession(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
        return DrmSessionReference.EMPTY;
    }

    void setPlayer(Looper looper, PlayerId playerId);

    /* loaded from: classes2.dex */
    public interface DrmSessionReference {
        public static final DrmSessionReference EMPTY = new DrmSessionReference() { // from class: androidx.media3.exoplayer.drm.o
            @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
            public final void release() {
                DrmSessionManager.DrmSessionReference.lambda$static$0();
            }
        };

        void release();

        static /* synthetic */ void lambda$static$0() {
        }
    }

    default void prepare() {
    }

    default void release() {
    }
}
