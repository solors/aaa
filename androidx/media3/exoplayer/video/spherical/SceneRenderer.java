package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {
    private static final String TAG = "SceneRenderer";
    @Nullable
    private byte[] lastProjectionData;
    private SurfaceTexture surfaceTexture;
    private int textureId;
    private final AtomicBoolean frameAvailable = new AtomicBoolean();
    private final AtomicBoolean resetRotationAtNextFrame = new AtomicBoolean(true);
    private final ProjectionRenderer projectionRenderer = new ProjectionRenderer();
    private final FrameRotationQueue frameRotationQueue = new FrameRotationQueue();
    private final TimedValueQueue<Long> sampleTimestampQueue = new TimedValueQueue<>();
    private final TimedValueQueue<Projection> projectionQueue = new TimedValueQueue<>();
    private final float[] rotationMatrix = new float[16];
    private final float[] tempMatrix = new float[16];
    private volatile int defaultStereoMode = 0;
    private int lastStereoMode = -1;

    public /* synthetic */ void lambda$init$0(SurfaceTexture surfaceTexture) {
        this.frameAvailable.set(true);
    }

    private void setProjection(@Nullable byte[] bArr, int i, long j) {
        Projection projection;
        byte[] bArr2 = this.lastProjectionData;
        int i2 = this.lastStereoMode;
        this.lastProjectionData = bArr;
        if (i == -1) {
            i = this.defaultStereoMode;
        }
        this.lastStereoMode = i;
        if (i2 == i && Arrays.equals(bArr2, this.lastProjectionData)) {
            return;
        }
        byte[] bArr3 = this.lastProjectionData;
        if (bArr3 != null) {
            projection = ProjectionDecoder.decode(bArr3, this.lastStereoMode);
        } else {
            projection = null;
        }
        if (projection == null || !ProjectionRenderer.isSupported(projection)) {
            projection = Projection.createEquirectangular(this.lastStereoMode);
        }
        this.projectionQueue.add(j, projection);
    }

    public void drawFrame(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e) {
            Log.m104567e(TAG, "Failed to draw a frame", e);
        }
        if (this.frameAvailable.compareAndSet(true, false)) {
            ((SurfaceTexture) Assertions.checkNotNull(this.surfaceTexture)).updateTexImage();
            try {
                GlUtil.checkGlError();
            } catch (GlUtil.GlException e2) {
                Log.m104567e(TAG, "Failed to draw a frame", e2);
            }
            if (this.resetRotationAtNextFrame.compareAndSet(true, false)) {
                GlUtil.setToIdentity(this.rotationMatrix);
            }
            long timestamp = this.surfaceTexture.getTimestamp();
            Long poll = this.sampleTimestampQueue.poll(timestamp);
            if (poll != null) {
                this.frameRotationQueue.pollRotationMatrix(this.rotationMatrix, poll.longValue());
            }
            Projection pollFloor = this.projectionQueue.pollFloor(timestamp);
            if (pollFloor != null) {
                this.projectionRenderer.setProjection(pollFloor);
            }
        }
        Matrix.multiplyMM(this.tempMatrix, 0, fArr, 0, this.rotationMatrix, 0);
        this.projectionRenderer.draw(this.textureId, this.tempMatrix, z);
    }

    public SurfaceTexture init() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.checkGlError();
            this.projectionRenderer.init();
            GlUtil.checkGlError();
            this.textureId = GlUtil.createExternalTexture();
        } catch (GlUtil.GlException e) {
            Log.m104567e(TAG, "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.textureId);
        this.surfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.a
            {
                SceneRenderer.this = this;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                SceneRenderer.this.lambda$init$0(surfaceTexture2);
            }
        });
        return this.surfaceTexture;
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void onCameraMotion(long j, float[] fArr) {
        this.frameRotationQueue.setRotation(j, fArr);
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
        this.sampleTimestampQueue.clear();
        this.frameRotationQueue.reset();
        this.resetRotationAtNextFrame.set(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long j, long j2, Format format, @Nullable MediaFormat mediaFormat) {
        this.sampleTimestampQueue.add(j2, Long.valueOf(j));
        setProjection(format.projectionData, format.stereoMode, j2);
    }

    public void setDefaultStereoMode(int i) {
        this.defaultStereoMode = i;
    }

    public void shutdown() {
        this.projectionRenderer.shutdown();
    }
}
