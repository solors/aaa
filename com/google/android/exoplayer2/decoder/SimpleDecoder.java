package com.google.android.exoplayer2.decoder;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {

    /* renamed from: a */
    private final Thread f32690a;

    /* renamed from: b */
    private final Object f32691b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f32692c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f32693d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f32694e;

    /* renamed from: f */
    private final O[] f32695f;

    /* renamed from: g */
    private int f32696g;

    /* renamed from: h */
    private int f32697h;
    @Nullable

    /* renamed from: i */
    private I f32698i;
    @Nullable

    /* renamed from: j */
    private E f32699j;

    /* renamed from: k */
    private boolean f32700k;

    /* renamed from: l */
    private boolean f32701l;

    /* renamed from: m */
    private int f32702m;

    /* JADX INFO: Access modifiers changed from: protected */
    public SimpleDecoder(I[] iArr, O[] oArr) {
        this.f32694e = iArr;
        this.f32696g = iArr.length;
        for (int i = 0; i < this.f32696g; i++) {
            this.f32694e[i] = mo73573c();
        }
        this.f32695f = oArr;
        this.f32697h = oArr.length;
        for (int i2 = 0; i2 < this.f32697h; i2++) {
            this.f32695f[i2] = mo73572d();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: com.google.android.exoplayer2.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SimpleDecoder.this.m74879m();
            }
        };
        this.f32690a = thread;
        thread.start();
    }

    /* renamed from: b */
    private boolean m74886b() {
        if (!this.f32692c.isEmpty() && this.f32697h > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m74885g() throws InterruptedException {
        E mo73571e;
        synchronized (this.f32691b) {
            while (!this.f32701l && !m74886b()) {
                this.f32691b.wait();
            }
            if (this.f32701l) {
                return false;
            }
            I removeFirst = this.f32692c.removeFirst();
            O[] oArr = this.f32695f;
            int i = this.f32697h - 1;
            this.f32697h = i;
            O o = oArr[i];
            boolean z = this.f32700k;
            this.f32700k = false;
            if (removeFirst.isEndOfStream()) {
                o.addFlag(4);
            } else {
                if (removeFirst.isDecodeOnly()) {
                    o.addFlag(Integer.MIN_VALUE);
                }
                if (removeFirst.isFirstSample()) {
                    o.addFlag(134217728);
                }
                try {
                    mo73571e = mo73570f(removeFirst, o, z);
                } catch (OutOfMemoryError e) {
                    mo73571e = mo73571e(e);
                } catch (RuntimeException e2) {
                    mo73571e = mo73571e(e2);
                }
                if (mo73571e != null) {
                    synchronized (this.f32691b) {
                        this.f32699j = mo73571e;
                    }
                    return false;
                }
            }
            synchronized (this.f32691b) {
                if (this.f32700k) {
                    o.release();
                } else if (o.isDecodeOnly()) {
                    this.f32702m++;
                    o.release();
                } else {
                    o.skippedOutputBufferCount = this.f32702m;
                    this.f32702m = 0;
                    this.f32693d.addLast(o);
                }
                m74882j(removeFirst);
            }
            return true;
        }
    }

    /* renamed from: h */
    private void m74884h() {
        if (m74886b()) {
            this.f32691b.notify();
        }
    }

    /* renamed from: i */
    private void m74883i() throws DecoderException {
        E e = this.f32699j;
        if (e == null) {
            return;
        }
        throw e;
    }

    /* renamed from: j */
    private void m74882j(I i) {
        i.clear();
        I[] iArr = this.f32694e;
        int i2 = this.f32696g;
        this.f32696g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: l */
    private void m74880l(O o) {
        o.clear();
        O[] oArr = this.f32695f;
        int i = this.f32697h;
        this.f32697h = i + 1;
        oArr[i] = o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m74879m() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m74885g());
    }

    /* renamed from: c */
    protected abstract I mo73573c();

    /* renamed from: d */
    protected abstract O mo73572d();

    /* renamed from: e */
    protected abstract E mo73571e(Throwable th);

    @Nullable
    /* renamed from: f */
    protected abstract E mo73570f(I i, O o, boolean z);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
        synchronized (this.f32691b) {
            this.f32700k = true;
            this.f32702m = 0;
            I i = this.f32698i;
            if (i != null) {
                m74882j(i);
                this.f32698i = null;
            }
            while (!this.f32692c.isEmpty()) {
                m74882j(this.f32692c.removeFirst());
            }
            while (!this.f32693d.isEmpty()) {
                this.f32693d.removeFirst().release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @CallSuper
    /* renamed from: k */
    public void m74881k(O o) {
        synchronized (this.f32691b) {
            m74880l(o);
            m74884h();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public final void m74878n(int i) {
        boolean z;
        if (this.f32696g == this.f32694e.length) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        for (I i2 : this.f32694e) {
            i2.ensureSpaceForWrite(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(Object obj) throws DecoderException {
        queueInputBuffer((SimpleDecoder<I, O, E>) ((DecoderInputBuffer) obj));
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @CallSuper
    public void release() {
        synchronized (this.f32691b) {
            this.f32701l = true;
            this.f32691b.notify();
        }
        try {
            this.f32690a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public final I dequeueInputBuffer() throws DecoderException {
        I i;
        synchronized (this.f32691b) {
            m74883i();
            Assertions.checkState(this.f32698i == null);
            int i2 = this.f32696g;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.f32694e;
                int i3 = i2 - 1;
                this.f32696g = i3;
                i = iArr[i3];
            }
            this.f32698i = i;
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public final O dequeueOutputBuffer() throws DecoderException {
        synchronized (this.f32691b) {
            m74883i();
            if (this.f32693d.isEmpty()) {
                return null;
            }
            return this.f32693d.removeFirst();
        }
    }

    public final void queueInputBuffer(I i) throws DecoderException {
        synchronized (this.f32691b) {
            m74883i();
            Assertions.checkArgument(i == this.f32698i);
            this.f32692c.addLast(i);
            m74884h();
            this.f32698i = null;
        }
    }
}
