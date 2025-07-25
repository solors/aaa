package io.bidmachine.media3.exoplayer.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.drm.DrmSession;
import io.bidmachine.media3.exoplayer.drm.DrmSessionEventListener;
import io.bidmachine.media3.exoplayer.drm.DrmSessionManager;

@UnstableApi
/* loaded from: classes9.dex */
public interface DrmSessionManager {
    public static final DrmSessionManager DRM_UNSUPPORTED;
    @Deprecated
    public static final DrmSessionManager DUMMY;

    static {
        C36160a c36160a = new C36160a();
        DRM_UNSUPPORTED = c36160a;
        DUMMY = c36160a;
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

    /* loaded from: classes9.dex */
    public interface DrmSessionReference {
        public static final DrmSessionReference EMPTY = new DrmSessionReference() { // from class: io.bidmachine.media3.exoplayer.drm.p
            @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
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

    /* renamed from: io.bidmachine.media3.exoplayer.drm.DrmSessionManager$a */
    /* loaded from: classes9.dex */
    class C36160a implements DrmSessionManager {
        C36160a() {
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManager
        @Nullable
        public DrmSession acquireSession(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
            if (format.drmInitData == null) {
                return null;
            }
            return new ErrorStateDrmSession(new DrmSession.DrmSessionException(new UnsupportedDrmException(1), 6001));
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManager
        public int getCryptoType(Format format) {
            if (format.drmInitData != null) {
                return 1;
            }
            return 0;
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManager
        public /* bridge */ /* synthetic */ DrmSessionReference preacquireSession(@Nullable DrmSessionEventListener.EventDispatcher eventDispatcher, Format format) {
            return super.preacquireSession(eventDispatcher, format);
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManager
        public /* bridge */ /* synthetic */ void prepare() {
            super.prepare();
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManager
        public /* bridge */ /* synthetic */ void release() {
            super.release();
        }

        @Override // io.bidmachine.media3.exoplayer.drm.DrmSessionManager
        public void setPlayer(Looper looper, PlayerId playerId) {
        }
    }
}
