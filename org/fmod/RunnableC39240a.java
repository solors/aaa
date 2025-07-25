package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.fmod.a */
/* loaded from: classes10.dex */
public class RunnableC39240a implements Runnable {

    /* renamed from: a */
    private final FMODAudioDevice f103048a;

    /* renamed from: b */
    private final ByteBuffer f103049b;

    /* renamed from: c */
    private final int f103050c;

    /* renamed from: d */
    private final int f103051d;

    /* renamed from: e */
    private volatile Thread f103052e;

    /* renamed from: f */
    private volatile boolean f103053f;

    /* renamed from: g */
    private AudioRecord f103054g;

    /* renamed from: h */
    private boolean f103055h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC39240a(FMODAudioDevice fMODAudioDevice, int i, int i2, int i3) {
        this.f103048a = fMODAudioDevice;
        this.f103050c = i;
        this.f103051d = i2;
        this.f103049b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i, i2, i3));
    }

    /* renamed from: b */
    private void m13383b() {
        AudioRecord audioRecord = this.f103054g;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                this.f103054g.stop();
            }
            this.f103054g.release();
            this.f103054g = null;
        }
        this.f103049b.position(0);
        this.f103055h = false;
    }

    /* renamed from: a */
    public int m13384a() {
        return this.f103049b.capacity();
    }

    /* renamed from: c */
    public void m13382c() {
        if (this.f103052e != null) {
            m13381d();
        }
        this.f103053f = true;
        this.f103052e = new Thread(this);
        this.f103052e.start();
    }

    /* renamed from: d */
    public void m13381d() {
        while (this.f103052e != null) {
            this.f103053f = false;
            try {
                this.f103052e.join();
                this.f103052e = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 3;
        while (this.f103053f) {
            if (!this.f103055h && i > 0) {
                m13383b();
                AudioRecord audioRecord = new AudioRecord(1, this.f103050c, this.f103051d, 2, this.f103049b.capacity());
                this.f103054g = audioRecord;
                boolean z = true;
                if (audioRecord.getState() != 1) {
                    z = false;
                }
                this.f103055h = z;
                if (z) {
                    this.f103049b.position(0);
                    this.f103054g.startRecording();
                    i = 3;
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.f103054g.getState() + ")");
                    i += -1;
                    m13383b();
                }
            }
            if (this.f103055h && this.f103054g.getRecordingState() == 3) {
                AudioRecord audioRecord2 = this.f103054g;
                ByteBuffer byteBuffer = this.f103049b;
                this.f103048a.fmodProcessMicData(this.f103049b, audioRecord2.read(byteBuffer, byteBuffer.capacity()));
                this.f103049b.position(0);
            }
        }
        m13383b();
    }
}
