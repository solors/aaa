package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class FMODAudioDevice implements Runnable {

    /* renamed from: a */
    private volatile Thread f103041a = null;

    /* renamed from: b */
    private volatile boolean f103042b = false;

    /* renamed from: c */
    private AudioTrack f103043c = null;

    /* renamed from: d */
    private boolean f103044d = false;

    /* renamed from: e */
    private ByteBuffer f103045e = null;

    /* renamed from: f */
    private byte[] f103046f = null;

    /* renamed from: g */
    private volatile RunnableC39240a f103047g;

    private native int fmodGetInfo(int i);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        AudioTrack audioTrack = this.f103043c;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.f103043c.stop();
            }
            this.f103043c.release();
            this.f103043c = null;
        }
        this.f103045e = null;
        this.f103046f = null;
        this.f103044d = false;
    }

    public synchronized void close() {
        stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public native int fmodProcessMicData(ByteBuffer byteBuffer, int i);

    public boolean isRunning() {
        if (this.f103041a != null && this.f103041a.isAlive()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        int i2;
        boolean z;
        int i3 = 3;
        while (this.f103042b) {
            if (!this.f103044d && i3 > 0) {
                releaseAudioTrack();
                int fmodGetInfo = fmodGetInfo(0);
                if (fmodGetInfo(4) == 1) {
                    i = 4;
                } else {
                    i = 12;
                }
                int minBufferSize = AudioTrack.getMinBufferSize(fmodGetInfo, i, 2);
                int fmodGetInfo2 = fmodGetInfo(4) * 2;
                int round = Math.round(minBufferSize * 1.1f) & (~(fmodGetInfo2 - 1));
                int fmodGetInfo3 = fmodGetInfo(1);
                int fmodGetInfo4 = fmodGetInfo(2) * fmodGetInfo3 * fmodGetInfo2;
                if (fmodGetInfo4 > round) {
                    i2 = fmodGetInfo4;
                } else {
                    i2 = round;
                }
                AudioTrack audioTrack = new AudioTrack(3, fmodGetInfo, i, 2, i2, 1);
                this.f103043c = audioTrack;
                if (audioTrack.getState() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f103044d = z;
                if (z) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fmodGetInfo3 * fmodGetInfo2);
                    this.f103045e = allocateDirect;
                    this.f103046f = new byte[allocateDirect.capacity()];
                    this.f103043c.play();
                    i3 = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.f103043c.getState() + ")");
                    releaseAudioTrack();
                    i3 += -1;
                }
            }
            if (this.f103044d) {
                if (fmodGetInfo(3) == 1) {
                    fmodProcess(this.f103045e);
                    ByteBuffer byteBuffer = this.f103045e;
                    byteBuffer.get(this.f103046f, 0, byteBuffer.capacity());
                    this.f103043c.write(this.f103046f, 0, this.f103045e.capacity());
                    this.f103045e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.f103041a != null) {
            stop();
        }
        this.f103041a = new Thread(this, "FMODAudioDevice");
        this.f103041a.setPriority(10);
        this.f103042b = true;
        this.f103041a.start();
        if (this.f103047g != null) {
            this.f103047g.m13382c();
        }
    }

    public synchronized int startAudioRecord(int i, int i2, int i3) {
        if (this.f103047g == null) {
            this.f103047g = new RunnableC39240a(this, i, i2, 2);
            this.f103047g.m13382c();
        }
        return this.f103047g.m13384a();
    }

    public synchronized void stop() {
        while (this.f103041a != null) {
            this.f103042b = false;
            try {
                this.f103041a.join();
                this.f103041a = null;
            } catch (InterruptedException unused) {
            }
        }
        if (this.f103047g != null) {
            this.f103047g.m13381d();
        }
    }

    public synchronized void stopAudioRecord() {
        if (this.f103047g != null) {
            this.f103047g.m13381d();
            this.f103047g = null;
        }
    }
}
