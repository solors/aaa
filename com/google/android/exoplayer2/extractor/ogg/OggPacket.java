package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class OggPacket {

    /* renamed from: a */
    private final OggPageHeader f33288a = new OggPageHeader();

    /* renamed from: b */
    private final ParsableByteArray f33289b = new ParsableByteArray(new byte[65025], 0);

    /* renamed from: c */
    private int f33290c = -1;

    /* renamed from: d */
    private int f33291d;

    /* renamed from: e */
    private boolean f33292e;

    /* renamed from: a */
    private int m74418a(int i) {
        int i2;
        int i3 = 0;
        this.f33291d = 0;
        do {
            int i4 = this.f33291d;
            int i5 = i + i4;
            OggPageHeader oggPageHeader = this.f33288a;
            if (i5 >= oggPageHeader.pageSegmentCount) {
                break;
            }
            int[] iArr = oggPageHeader.laces;
            this.f33291d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public OggPageHeader getPageHeader() {
        return this.f33288a;
    }

    public ParsableByteArray getPayload() {
        return this.f33289b;
    }

    public boolean populate(ExtractorInput extractorInput) throws IOException {
        boolean z;
        boolean z2;
        int i;
        if (extractorInput != null) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        if (this.f33292e) {
            this.f33292e = false;
            this.f33289b.reset(0);
        }
        while (!this.f33292e) {
            if (this.f33290c < 0) {
                if (!this.f33288a.skipToNextPage(extractorInput) || !this.f33288a.populate(extractorInput, true)) {
                    return false;
                }
                OggPageHeader oggPageHeader = this.f33288a;
                int i2 = oggPageHeader.headerSize;
                if ((oggPageHeader.type & 1) == 1 && this.f33289b.limit() == 0) {
                    i2 += m74418a(0);
                    i = this.f33291d + 0;
                } else {
                    i = 0;
                }
                if (!ExtractorUtil.skipFullyQuietly(extractorInput, i2)) {
                    return false;
                }
                this.f33290c = i;
            }
            int m74418a = m74418a(this.f33290c);
            int i3 = this.f33290c + this.f33291d;
            if (m74418a > 0) {
                ParsableByteArray parsableByteArray = this.f33289b;
                parsableByteArray.ensureCapacity(parsableByteArray.limit() + m74418a);
                if (!ExtractorUtil.readFullyQuietly(extractorInput, this.f33289b.getData(), this.f33289b.limit(), m74418a)) {
                    return false;
                }
                ParsableByteArray parsableByteArray2 = this.f33289b;
                parsableByteArray2.setLimit(parsableByteArray2.limit() + m74418a);
                if (this.f33288a.laces[i3 - 1] != 255) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f33292e = z2;
            }
            if (i3 == this.f33288a.pageSegmentCount) {
                i3 = -1;
            }
            this.f33290c = i3;
        }
        return true;
    }

    public void reset() {
        this.f33288a.reset();
        this.f33289b.reset(0);
        this.f33290c = -1;
        this.f33292e = false;
    }

    public void trimPayload() {
        if (this.f33289b.getData().length == 65025) {
            return;
        }
        ParsableByteArray parsableByteArray = this.f33289b;
        parsableByteArray.reset(Arrays.copyOf(parsableByteArray.getData(), Math.max(65025, this.f33289b.limit())), this.f33289b.limit());
    }
}
