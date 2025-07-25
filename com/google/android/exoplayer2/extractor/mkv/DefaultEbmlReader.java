package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes4.dex */
final class DefaultEbmlReader implements EbmlReader {

    /* renamed from: a */
    private final byte[] f33053a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<MasterElement> f33054b = new ArrayDeque<>();

    /* renamed from: c */
    private final VarintReader f33055c = new VarintReader();

    /* renamed from: d */
    private EbmlProcessor f33056d;

    /* renamed from: e */
    private int f33057e;

    /* renamed from: f */
    private int f33058f;

    /* renamed from: g */
    private long f33059g;

    /* loaded from: classes4.dex */
    private static final class MasterElement {

        /* renamed from: a */
        private final int f33060a;

        /* renamed from: b */
        private final long f33061b;

        private MasterElement(int i, long j) {
            this.f33060a = i;
            this.f33061b = j;
        }
    }

    /* renamed from: a */
    private long m74620a(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        while (true) {
            extractorInput.peekFully(this.f33053a, 0, 4);
            int parseUnsignedVarintLength = VarintReader.parseUnsignedVarintLength(this.f33053a[0]);
            if (parseUnsignedVarintLength != -1 && parseUnsignedVarintLength <= 4) {
                int assembleVarint = (int) VarintReader.assembleVarint(this.f33053a, parseUnsignedVarintLength, false);
                if (this.f33056d.isLevel1Element(assembleVarint)) {
                    extractorInput.skipFully(parseUnsignedVarintLength);
                    return assembleVarint;
                }
            }
            extractorInput.skipFully(1);
        }
    }

    /* renamed from: b */
    private double m74619b(ExtractorInput extractorInput, int i) throws IOException {
        long m74618c = m74618c(extractorInput, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) m74618c);
        }
        return Double.longBitsToDouble(m74618c);
    }

    /* renamed from: c */
    private long m74618c(ExtractorInput extractorInput, int i) throws IOException {
        extractorInput.readFully(this.f33053a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f33053a[i2] & 255);
        }
        return j;
    }

    /* renamed from: d */
    private static String m74617d(ExtractorInput extractorInput, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        extractorInput.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public void init(EbmlProcessor ebmlProcessor) {
        this.f33056d = ebmlProcessor;
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public boolean read(ExtractorInput extractorInput) throws IOException {
        Assertions.checkStateNotNull(this.f33056d);
        while (true) {
            MasterElement peek = this.f33054b.peek();
            if (peek != null && extractorInput.getPosition() >= peek.f33061b) {
                this.f33056d.endMasterElement(this.f33054b.pop().f33060a);
                return true;
            }
            if (this.f33057e == 0) {
                long readUnsignedVarint = this.f33055c.readUnsignedVarint(extractorInput, true, false, 4);
                if (readUnsignedVarint == -2) {
                    readUnsignedVarint = m74620a(extractorInput);
                }
                if (readUnsignedVarint == -1) {
                    return false;
                }
                this.f33058f = (int) readUnsignedVarint;
                this.f33057e = 1;
            }
            if (this.f33057e == 1) {
                this.f33059g = this.f33055c.readUnsignedVarint(extractorInput, false, true, 8);
                this.f33057e = 2;
            }
            int elementType = this.f33056d.getElementType(this.f33058f);
            if (elementType != 0) {
                if (elementType != 1) {
                    if (elementType != 2) {
                        if (elementType != 3) {
                            if (elementType != 4) {
                                if (elementType == 5) {
                                    long j = this.f33059g;
                                    if (j != 4 && j != 8) {
                                        throw ParserException.createForMalformedContainer("Invalid float size: " + this.f33059g, null);
                                    }
                                    this.f33056d.floatElement(this.f33058f, m74619b(extractorInput, (int) j));
                                    this.f33057e = 0;
                                    return true;
                                }
                                throw ParserException.createForMalformedContainer("Invalid element type " + elementType, null);
                            }
                            this.f33056d.binaryElement(this.f33058f, (int) this.f33059g, extractorInput);
                            this.f33057e = 0;
                            return true;
                        }
                        long j2 = this.f33059g;
                        if (j2 <= 2147483647L) {
                            this.f33056d.stringElement(this.f33058f, m74617d(extractorInput, (int) j2));
                            this.f33057e = 0;
                            return true;
                        }
                        throw ParserException.createForMalformedContainer("String element size: " + this.f33059g, null);
                    }
                    long j3 = this.f33059g;
                    if (j3 <= 8) {
                        this.f33056d.integerElement(this.f33058f, m74618c(extractorInput, (int) j3));
                        this.f33057e = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("Invalid integer size: " + this.f33059g, null);
                }
                long position = extractorInput.getPosition();
                this.f33054b.push(new MasterElement(this.f33058f, this.f33059g + position));
                this.f33056d.startMasterElement(this.f33058f, position, this.f33059g);
                this.f33057e = 0;
                return true;
            }
            extractorInput.skipFully((int) this.f33059g);
            this.f33057e = 0;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public void reset() {
        this.f33057e = 0;
        this.f33054b.clear();
        this.f33055c.reset();
    }
}
