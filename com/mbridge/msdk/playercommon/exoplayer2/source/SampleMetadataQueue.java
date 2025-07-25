package com.mbridge.msdk.playercommon.exoplayer2.source;

import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.FormatHolder;
import com.mbridge.msdk.playercommon.exoplayer2.decoder.DecoderInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SampleMetadataQueue {
    private static final int SAMPLE_CAPACITY_INCREMENT = 1000;
    private int absoluteFirstIndex;
    private int length;
    private int readPosition;
    private int relativeFirstIndex;
    private Format upstreamFormat;
    private int upstreamSourceId;
    private int capacity = 1000;
    private int[] sourceIds = new int[1000];
    private long[] offsets = new long[1000];
    private long[] timesUs = new long[1000];
    private int[] flags = new int[1000];
    private int[] sizes = new int[1000];
    private TrackOutput.CryptoData[] cryptoDatas = new TrackOutput.CryptoData[1000];
    private Format[] formats = new Format[1000];
    private long largestDiscardedTimestampUs = Long.MIN_VALUE;
    private long largestQueuedTimestampUs = Long.MIN_VALUE;
    private boolean upstreamFormatRequired = true;
    private boolean upstreamKeyframeRequired = true;

    /* loaded from: classes6.dex */
    public static final class SampleExtrasHolder {
        public TrackOutput.CryptoData cryptoData;
        public long offset;
        public int size;
    }

    private long discardSamples(int i) {
        int i2;
        this.largestDiscardedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i));
        int i3 = this.length - i;
        this.length = i3;
        this.absoluteFirstIndex += i;
        int i4 = this.relativeFirstIndex + i;
        this.relativeFirstIndex = i4;
        int i5 = this.capacity;
        if (i4 >= i5) {
            this.relativeFirstIndex = i4 - i5;
        }
        int i6 = this.readPosition - i;
        this.readPosition = i6;
        if (i6 < 0) {
            this.readPosition = 0;
        }
        if (i3 == 0) {
            int i7 = this.relativeFirstIndex;
            if (i7 != 0) {
                i5 = i7;
            }
            return this.offsets[i5 - 1] + this.sizes[i2];
        }
        return this.offsets[this.relativeFirstIndex];
    }

    private int findSampleBefore(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2 && this.timesUs[i] <= j; i4++) {
            if (!z || (this.flags[i] & 1) != 0) {
                i3 = i4;
            }
            i++;
            if (i == this.capacity) {
                i = 0;
            }
        }
        return i3;
    }

    private long getLargestTimestamp(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int relativeIndex = getRelativeIndex(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.timesUs[relativeIndex]);
            if ((this.flags[relativeIndex] & 1) != 0) {
                break;
            }
            relativeIndex--;
            if (relativeIndex == -1) {
                relativeIndex = this.capacity - 1;
            }
        }
        return j;
    }

    private int getRelativeIndex(int i) {
        int i2 = this.relativeFirstIndex + i;
        int i3 = this.capacity;
        if (i2 >= i3) {
            return i2 - i3;
        }
        return i2;
    }

    public final synchronized int advanceTo(long j, boolean z, boolean z2) {
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample() && j >= this.timesUs[relativeIndex] && (j <= this.largestQueuedTimestampUs || z2)) {
            int findSampleBefore = findSampleBefore(relativeIndex, this.length - this.readPosition, j, z);
            if (findSampleBefore == -1) {
                return -1;
            }
            this.readPosition += findSampleBefore;
            return findSampleBefore;
        }
        return -1;
    }

    public final synchronized int advanceToEnd() {
        int i;
        int i2 = this.length;
        i = i2 - this.readPosition;
        this.readPosition = i2;
        return i;
    }

    public final synchronized boolean attemptSplice(long j) {
        boolean z = false;
        if (this.length == 0) {
            if (j > this.largestDiscardedTimestampUs) {
                z = true;
            }
            return z;
        } else if (Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(this.readPosition)) >= j) {
            return false;
        } else {
            int i = this.length;
            int relativeIndex = getRelativeIndex(i - 1);
            while (i > this.readPosition && this.timesUs[relativeIndex] >= j) {
                i--;
                relativeIndex--;
                if (relativeIndex == -1) {
                    relativeIndex = this.capacity - 1;
                }
            }
            discardUpstreamSamples(this.absoluteFirstIndex + i);
            return true;
        }
    }

    public final synchronized void commitSample(long j, int i, long j2, int i2, TrackOutput.CryptoData cryptoData) {
        boolean z;
        if (this.upstreamKeyframeRequired) {
            if ((i & 1) == 0) {
                return;
            }
            this.upstreamKeyframeRequired = false;
        }
        if (!this.upstreamFormatRequired) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        commitSampleTimestamp(j);
        int relativeIndex = getRelativeIndex(this.length);
        this.timesUs[relativeIndex] = j;
        long[] jArr = this.offsets;
        jArr[relativeIndex] = j2;
        this.sizes[relativeIndex] = i2;
        this.flags[relativeIndex] = i;
        this.cryptoDatas[relativeIndex] = cryptoData;
        this.formats[relativeIndex] = this.upstreamFormat;
        this.sourceIds[relativeIndex] = this.upstreamSourceId;
        int i3 = this.length + 1;
        this.length = i3;
        int i4 = this.capacity;
        if (i3 == i4) {
            int i5 = i4 + 1000;
            int[] iArr = new int[i5];
            long[] jArr2 = new long[i5];
            long[] jArr3 = new long[i5];
            int[] iArr2 = new int[i5];
            int[] iArr3 = new int[i5];
            TrackOutput.CryptoData[] cryptoDataArr = new TrackOutput.CryptoData[i5];
            Format[] formatArr = new Format[i5];
            int i6 = this.relativeFirstIndex;
            int i7 = i4 - i6;
            System.arraycopy(jArr, i6, jArr2, 0, i7);
            System.arraycopy(this.timesUs, this.relativeFirstIndex, jArr3, 0, i7);
            System.arraycopy(this.flags, this.relativeFirstIndex, iArr2, 0, i7);
            System.arraycopy(this.sizes, this.relativeFirstIndex, iArr3, 0, i7);
            System.arraycopy(this.cryptoDatas, this.relativeFirstIndex, cryptoDataArr, 0, i7);
            System.arraycopy(this.formats, this.relativeFirstIndex, formatArr, 0, i7);
            System.arraycopy(this.sourceIds, this.relativeFirstIndex, iArr, 0, i7);
            int i8 = this.relativeFirstIndex;
            System.arraycopy(this.offsets, 0, jArr2, i7, i8);
            System.arraycopy(this.timesUs, 0, jArr3, i7, i8);
            System.arraycopy(this.flags, 0, iArr2, i7, i8);
            System.arraycopy(this.sizes, 0, iArr3, i7, i8);
            System.arraycopy(this.cryptoDatas, 0, cryptoDataArr, i7, i8);
            System.arraycopy(this.formats, 0, formatArr, i7, i8);
            System.arraycopy(this.sourceIds, 0, iArr, i7, i8);
            this.offsets = jArr2;
            this.timesUs = jArr3;
            this.flags = iArr2;
            this.sizes = iArr3;
            this.cryptoDatas = cryptoDataArr;
            this.formats = formatArr;
            this.sourceIds = iArr;
            this.relativeFirstIndex = 0;
            this.length = this.capacity;
            this.capacity = i5;
        }
    }

    public final synchronized void commitSampleTimestamp(long j) {
        this.largestQueuedTimestampUs = Math.max(this.largestQueuedTimestampUs, j);
    }

    public final synchronized long discardTo(long j, boolean z, boolean z2) {
        int i;
        int i2 = this.length;
        if (i2 != 0) {
            long[] jArr = this.timesUs;
            int i3 = this.relativeFirstIndex;
            if (j >= jArr[i3]) {
                if (z2 && (i = this.readPosition) != i2) {
                    i2 = i + 1;
                }
                int findSampleBefore = findSampleBefore(i3, i2, j, z);
                if (findSampleBefore == -1) {
                    return -1L;
                }
                return discardSamples(findSampleBefore);
            }
        }
        return -1L;
    }

    public final synchronized long discardToEnd() {
        int i = this.length;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    public final synchronized long discardToRead() {
        int i = this.readPosition;
        if (i == 0) {
            return -1L;
        }
        return discardSamples(i);
    }

    public final long discardUpstreamSamples(int i) {
        boolean z;
        int relativeIndex;
        int writeIndex = getWriteIndex() - i;
        if (writeIndex >= 0 && writeIndex <= this.length - this.readPosition) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        int i2 = this.length - writeIndex;
        this.length = i2;
        this.largestQueuedTimestampUs = Math.max(this.largestDiscardedTimestampUs, getLargestTimestamp(i2));
        int i3 = this.length;
        if (i3 == 0) {
            return 0L;
        }
        return this.offsets[getRelativeIndex(i3 - 1)] + this.sizes[relativeIndex];
    }

    public final synchronized boolean format(Format format) {
        if (format == null) {
            this.upstreamFormatRequired = true;
            return false;
        }
        this.upstreamFormatRequired = false;
        if (Util.areEqual(format, this.upstreamFormat)) {
            return false;
        }
        this.upstreamFormat = format;
        return true;
    }

    public final int getFirstIndex() {
        return this.absoluteFirstIndex;
    }

    public final synchronized long getFirstTimestampUs() {
        long j;
        if (this.length == 0) {
            j = Long.MIN_VALUE;
        } else {
            j = this.timesUs[this.relativeFirstIndex];
        }
        return j;
    }

    public final synchronized long getLargestQueuedTimestampUs() {
        return this.largestQueuedTimestampUs;
    }

    public final int getReadIndex() {
        return this.absoluteFirstIndex + this.readPosition;
    }

    public final synchronized Format getUpstreamFormat() {
        Format format;
        if (this.upstreamFormatRequired) {
            format = null;
        } else {
            format = this.upstreamFormat;
        }
        return format;
    }

    public final int getWriteIndex() {
        return this.absoluteFirstIndex + this.length;
    }

    public final synchronized boolean hasNextSample() {
        boolean z;
        if (this.readPosition != this.length) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final int peekSourceId() {
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (hasNextSample()) {
            return this.sourceIds[relativeIndex];
        }
        return this.upstreamSourceId;
    }

    public final synchronized int read(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z, boolean z2, Format format, SampleExtrasHolder sampleExtrasHolder) {
        if (!hasNextSample()) {
            if (z2) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            Format format2 = this.upstreamFormat;
            if (format2 == null || (!z && format2 == format)) {
                return -3;
            }
            formatHolder.format = format2;
            return -5;
        }
        int relativeIndex = getRelativeIndex(this.readPosition);
        if (!z && this.formats[relativeIndex] == format) {
            if (decoderInputBuffer.isFlagsOnly()) {
                return -3;
            }
            decoderInputBuffer.timeUs = this.timesUs[relativeIndex];
            decoderInputBuffer.setFlags(this.flags[relativeIndex]);
            sampleExtrasHolder.size = this.sizes[relativeIndex];
            sampleExtrasHolder.offset = this.offsets[relativeIndex];
            sampleExtrasHolder.cryptoData = this.cryptoDatas[relativeIndex];
            this.readPosition++;
            return -4;
        }
        formatHolder.format = this.formats[relativeIndex];
        return -5;
    }

    public final void reset(boolean z) {
        this.length = 0;
        this.absoluteFirstIndex = 0;
        this.relativeFirstIndex = 0;
        this.readPosition = 0;
        this.upstreamKeyframeRequired = true;
        this.largestDiscardedTimestampUs = Long.MIN_VALUE;
        this.largestQueuedTimestampUs = Long.MIN_VALUE;
        if (z) {
            this.upstreamFormat = null;
            this.upstreamFormatRequired = true;
        }
    }

    public final synchronized void rewind() {
        this.readPosition = 0;
    }

    public final synchronized boolean setReadPosition(int i) {
        int i2 = this.absoluteFirstIndex;
        if (i2 <= i && i <= this.length + i2) {
            this.readPosition = i - i2;
            return true;
        }
        return false;
    }

    public final void sourceId(int i) {
        this.upstreamSourceId = i;
    }
}
