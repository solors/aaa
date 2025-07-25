package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes4.dex */
final class Sniffer {

    /* renamed from: a */
    private final ParsableByteArray f33125a = new ParsableByteArray(8);

    /* renamed from: b */
    private int f33126b;

    /* renamed from: a */
    private long m74568a(ExtractorInput extractorInput) throws IOException {
        int i = 0;
        extractorInput.peekFully(this.f33125a.getData(), 0, 1);
        int i2 = this.f33125a.getData()[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        extractorInput.peekFully(this.f33125a.getData(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f33125a.getData()[i] & 255) + (i5 << 8);
        }
        this.f33126b += i4 + 1;
        return i5;
    }

    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        long m74568a;
        int i;
        long length = extractorInput.getLength();
        int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && length <= 1024) {
            j = length;
        }
        int i3 = (int) j;
        extractorInput.peekFully(this.f33125a.getData(), 0, 4);
        long readUnsignedInt = this.f33125a.readUnsignedInt();
        this.f33126b = 4;
        while (readUnsignedInt != 440786851) {
            int i4 = this.f33126b + 1;
            this.f33126b = i4;
            if (i4 == i3) {
                return false;
            }
            extractorInput.peekFully(this.f33125a.getData(), 0, 1);
            readUnsignedInt = ((readUnsignedInt << 8) & (-256)) | (this.f33125a.getData()[0] & 255);
        }
        long m74568a2 = m74568a(extractorInput);
        long j2 = this.f33126b;
        if (m74568a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + m74568a2 >= length) {
            return false;
        }
        while (true) {
            int i5 = this.f33126b;
            long j3 = j2 + m74568a2;
            if (i5 < j3) {
                if (m74568a(extractorInput) != Long.MIN_VALUE && (m74568a(extractorInput)) >= 0 && m74568a <= 2147483647L) {
                    if (i != 0) {
                        int i6 = (int) m74568a;
                        extractorInput.advancePeekPosition(i6);
                        this.f33126b += i6;
                    }
                }
            } else if (i5 != j3) {
                return false;
            } else {
                return true;
            }
        }
    }
}
