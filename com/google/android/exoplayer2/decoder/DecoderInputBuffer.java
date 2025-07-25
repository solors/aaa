package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class DecoderInputBuffer extends Buffer {
    public static final int BUFFER_REPLACEMENT_MODE_DIRECT = 2;
    public static final int BUFFER_REPLACEMENT_MODE_DISABLED = 0;
    public static final int BUFFER_REPLACEMENT_MODE_NORMAL = 1;

    /* renamed from: c */
    private final int f32688c;
    public final CryptoInfo cryptoInfo;

    /* renamed from: d */
    private final int f32689d;
    @Nullable
    public ByteBuffer data;
    @Nullable
    public Format format;
    @Nullable
    public ByteBuffer supplementalData;
    public long timeUs;
    public boolean waitingForKeys;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface BufferReplacementMode {
    }

    /* loaded from: classes4.dex */
    public static final class InsufficientCapacityException extends IllegalStateException {
        public final int currentCapacity;
        public final int requiredCapacity;

        public InsufficientCapacityException(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.currentCapacity = i;
            this.requiredCapacity = i2;
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i) {
        this(i, 0);
    }

    /* renamed from: c */
    private ByteBuffer m74888c(int i) {
        int capacity;
        int i2 = this.f32688c;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new InsufficientCapacityException(capacity, i);
    }

    public static DecoderInputBuffer newNoDataInstance() {
        return new DecoderInputBuffer(0);
    }

    @Override // com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.waitingForKeys = false;
    }

    public void ensureSpaceForWrite(int i) {
        int i2 = i + this.f32689d;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null) {
            this.data = m74888c(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.data = byteBuffer;
            return;
        }
        ByteBuffer m74888c = m74888c(i3);
        m74888c.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m74888c.put(byteBuffer);
        }
        this.data = m74888c;
    }

    public final void flip() {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.supplementalData;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean isEncrypted() {
        return m74892b(1073741824);
    }

    public void resetSupplementalData(int i) {
        ByteBuffer byteBuffer = this.supplementalData;
        if (byteBuffer != null && byteBuffer.capacity() >= i) {
            this.supplementalData.clear();
        } else {
            this.supplementalData = ByteBuffer.allocate(i);
        }
    }

    public DecoderInputBuffer(int i, int i2) {
        this.cryptoInfo = new CryptoInfo();
        this.f32688c = i;
        this.f32689d = i2;
    }
}
