package com.google.android.exoplayer2.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {

    /* renamed from: k */
    private int f36432k;

    /* renamed from: l */
    private SurfaceTexture f36433l;
    @Nullable

    /* renamed from: o */
    private byte[] f36436o;

    /* renamed from: b */
    private final AtomicBoolean f36424b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f36425c = new AtomicBoolean(true);

    /* renamed from: d */
    private final ProjectionRenderer f36426d = new ProjectionRenderer();

    /* renamed from: f */
    private final FrameRotationQueue f36427f = new FrameRotationQueue();

    /* renamed from: g */
    private final TimedValueQueue<Long> f36428g = new TimedValueQueue<>();

    /* renamed from: h */
    private final TimedValueQueue<Projection> f36429h = new TimedValueQueue<>();

    /* renamed from: i */
    private final float[] f36430i = new float[16];

    /* renamed from: j */
    private final float[] f36431j = new float[16];

    /* renamed from: m */
    private volatile int f36434m = 0;

    /* renamed from: n */
    private int f36435n = -1;

    /* renamed from: b */
    public /* synthetic */ void m72345b(SurfaceTexture surfaceTexture) {
        this.f36424b.set(true);
    }

    /* renamed from: c */
    private void m72344c(@Nullable byte[] bArr, int i, long j) {
        Projection projection;
        byte[] bArr2 = this.f36436o;
        int i2 = this.f36435n;
        this.f36436o = bArr;
        if (i == -1) {
            i = this.f36434m;
        }
        this.f36435n = i;
        if (i2 == i && Arrays.equals(bArr2, this.f36436o)) {
            return;
        }
        byte[] bArr3 = this.f36436o;
        if (bArr3 != null) {
            projection = ProjectionDecoder.decode(bArr3, this.f36435n);
        } else {
            projection = null;
        }
        if (projection == null || !ProjectionRenderer.isSupported(projection)) {
            projection = Projection.createEquirectangular(this.f36435n);
        }
        this.f36429h.add(j, projection);
    }

    public void drawFrame(float[] fArr, boolean z) {
        GLES20.glClear(16384);
        try {
            GlUtil.checkGlError();
        } catch (GlUtil.GlException e) {
            Log.m72605e("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.f36424b.compareAndSet(true, false)) {
            ((SurfaceTexture) Assertions.checkNotNull(this.f36433l)).updateTexImage();
            try {
                GlUtil.checkGlError();
            } catch (GlUtil.GlException e2) {
                Log.m72605e("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.f36425c.compareAndSet(true, false)) {
                GlUtil.setToIdentity(this.f36430i);
            }
            long timestamp = this.f36433l.getTimestamp();
            Long poll = this.f36428g.poll(timestamp);
            if (poll != null) {
                this.f36427f.pollRotationMatrix(this.f36430i, poll.longValue());
            }
            Projection pollFloor = this.f36429h.pollFloor(timestamp);
            if (pollFloor != null) {
                this.f36426d.setProjection(pollFloor);
            }
        }
        Matrix.multiplyMM(this.f36431j, 0, fArr, 0, this.f36430i, 0);
        this.f36426d.draw(this.f36432k, this.f36431j, z);
    }

    public SurfaceTexture init() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.checkGlError();
            this.f36426d.init();
            GlUtil.checkGlError();
            this.f36432k = GlUtil.createExternalTexture();
        } catch (GlUtil.GlException e) {
            Log.m72605e("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f36432k);
        this.f36433l = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.google.android.exoplayer2.video.spherical.a
            {
                SceneRenderer.this = this;
            }

            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                SceneRenderer.this.m72345b(surfaceTexture2);
            }
        });
        return this.f36433l;
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotion(long j, float[] fArr) {
        this.f36427f.setRotation(j, fArr);
    }

    @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
        this.f36428g.clear();
        this.f36427f.reset();
        this.f36425c.set(true);
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long j, long j2, Format format, @Nullable MediaFormat mediaFormat) {
        this.f36428g.add(j2, Long.valueOf(j));
        m72344c(format.projectionData, format.stereoMode, j2);
    }

    public void setDefaultStereoMode(int i) {
        this.f36434m = i;
    }

    public void shutdown() {
        this.f36426d.shutdown();
    }
}
