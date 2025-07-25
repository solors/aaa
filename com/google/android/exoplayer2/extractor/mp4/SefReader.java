package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.SlowMotionData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.base.Splitter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
final class SefReader {

    /* renamed from: d */
    private static final Splitter f33257d = Splitter.m70013on(':');

    /* renamed from: e */
    private static final Splitter f33258e = Splitter.m70013on('*');

    /* renamed from: a */
    private final List<DataReference> f33259a = new ArrayList();

    /* renamed from: b */
    private int f33260b = 0;

    /* renamed from: c */
    private int f33261c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class DataReference {
        public final int dataType;
        public final int size;
        public final long startOffset;

        public DataReference(int i, long j, int i2) {
            this.dataType = i;
            this.startOffset = j;
            this.size = i2;
        }
    }

    /* renamed from: a */
    private void m74439a(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        extractorInput.readFully(parsableByteArray.getData(), 0, 8);
        this.f33261c = parsableByteArray.readLittleEndianInt() + 8;
        if (parsableByteArray.readInt() != 1397048916) {
            positionHolder.position = 0L;
            return;
        }
        positionHolder.position = extractorInput.getPosition() - (this.f33261c - 12);
        this.f33260b = 2;
    }

    /* renamed from: b */
    private static int m74438b(String str) throws ParserException {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1711564334:
                if (str.equals("SlowMotion_Data")) {
                    c = 0;
                    break;
                }
                break;
            case -1332107749:
                if (str.equals("Super_SlowMotion_Edit_Data")) {
                    c = 1;
                    break;
                }
                break;
            case -1251387154:
                if (str.equals("Super_SlowMotion_Data")) {
                    c = 2;
                    break;
                }
                break;
            case -830665521:
                if (str.equals("Super_SlowMotion_Deflickering_On")) {
                    c = 3;
                    break;
                }
                break;
            case 1760745220:
                if (str.equals("Super_SlowMotion_BGM")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2192;
            case 1:
                return 2819;
            case 2:
                return 2816;
            case 3:
                return 2820;
            case 4:
                return 2817;
            default:
                throw ParserException.createForMalformedContainer("Invalid SEF name", null);
        }
    }

    /* renamed from: c */
    private void m74437c(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long length = extractorInput.getLength();
        int i = (this.f33261c - 12) - 8;
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        extractorInput.readFully(parsableByteArray.getData(), 0, i);
        for (int i2 = 0; i2 < i / 12; i2++) {
            parsableByteArray.skipBytes(2);
            short readLittleEndianShort = parsableByteArray.readLittleEndianShort();
            if (readLittleEndianShort != 2192 && readLittleEndianShort != 2816 && readLittleEndianShort != 2817 && readLittleEndianShort != 2819 && readLittleEndianShort != 2820) {
                parsableByteArray.skipBytes(8);
            } else {
                this.f33259a.add(new DataReference(readLittleEndianShort, (length - this.f33261c) - parsableByteArray.readLittleEndianInt(), parsableByteArray.readLittleEndianInt()));
            }
        }
        if (this.f33259a.isEmpty()) {
            positionHolder.position = 0L;
            return;
        }
        this.f33260b = 3;
        positionHolder.position = this.f33259a.get(0).startOffset;
    }

    /* renamed from: d */
    private void m74436d(ExtractorInput extractorInput, List<Metadata.Entry> list) throws IOException {
        long position = extractorInput.getPosition();
        int length = (int) ((extractorInput.getLength() - extractorInput.getPosition()) - this.f33261c);
        ParsableByteArray parsableByteArray = new ParsableByteArray(length);
        extractorInput.readFully(parsableByteArray.getData(), 0, length);
        for (int i = 0; i < this.f33259a.size(); i++) {
            DataReference dataReference = this.f33259a.get(i);
            parsableByteArray.setPosition((int) (dataReference.startOffset - position));
            parsableByteArray.skipBytes(4);
            int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
            int m74438b = m74438b(parsableByteArray.readString(readLittleEndianInt));
            int i2 = dataReference.size - (readLittleEndianInt + 8);
            if (m74438b != 2192) {
                if (m74438b != 2816 && m74438b != 2817 && m74438b != 2819 && m74438b != 2820) {
                    throw new IllegalStateException();
                }
            } else {
                list.add(m74435e(parsableByteArray, i2));
            }
        }
    }

    /* renamed from: e */
    private static SlowMotionData m74435e(ParsableByteArray parsableByteArray, int i) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List<String> splitToList = f33258e.splitToList(parsableByteArray.readString(i));
        for (int i2 = 0; i2 < splitToList.size(); i2++) {
            List<String> splitToList2 = f33257d.splitToList(splitToList.get(i2));
            if (splitToList2.size() == 3) {
                try {
                    arrayList.add(new SlowMotionData.Segment(Long.parseLong(splitToList2.get(0)), Long.parseLong(splitToList2.get(1)), 1 << (Integer.parseInt(splitToList2.get(2)) - 1)));
                } catch (NumberFormatException e) {
                    throw ParserException.createForMalformedContainer(null, e);
                }
            } else {
                throw ParserException.createForMalformedContainer(null, null);
            }
        }
        return new SlowMotionData(arrayList);
    }

    public int read(ExtractorInput extractorInput, PositionHolder positionHolder, List<Metadata.Entry> list) throws IOException {
        int i = this.f33260b;
        long j = 0;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        m74436d(extractorInput, list);
                        positionHolder.position = 0L;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    m74437c(extractorInput, positionHolder);
                }
            } else {
                m74439a(extractorInput, positionHolder);
            }
        } else {
            long length = extractorInput.getLength();
            if (length != -1 && length >= 8) {
                j = length - 8;
            }
            positionHolder.position = j;
            this.f33260b = 1;
        }
        return 1;
    }

    public void reset() {
        this.f33259a.clear();
        this.f33260b = 0;
    }
}
