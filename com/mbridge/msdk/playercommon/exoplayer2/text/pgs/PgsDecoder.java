package com.mbridge.msdk.playercommon.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.text.Subtitle;
import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes6.dex */
public final class PgsDecoder extends SimpleSubtitleDecoder {
    private static final byte INFLATE_HEADER = 120;
    private static final int SECTION_TYPE_BITMAP_PICTURE = 21;
    private static final int SECTION_TYPE_END = 128;
    private static final int SECTION_TYPE_IDENTIFIER = 22;
    private static final int SECTION_TYPE_PALETTE = 20;
    private final ParsableByteArray buffer;
    private final CueBuilder cueBuilder;
    private byte[] inflatedData;
    private int inflatedDataSize;
    private Inflater inflater;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class CueBuilder {
        private int bitmapHeight;
        private int bitmapWidth;
        private int bitmapX;
        private int bitmapY;
        private boolean colorsSet;
        private int planeHeight;
        private int planeWidth;
        private final ParsableByteArray bitmapData = new ParsableByteArray();
        private final int[] colors = new int[256];

        /* JADX INFO: Access modifiers changed from: private */
        public void parseBitmapSection(ParsableByteArray parsableByteArray, int i) {
            boolean z;
            int readUnsignedInt24;
            if (i < 4) {
                return;
            }
            parsableByteArray.skipBytes(3);
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = i - 4;
            if (z) {
                if (i2 < 7 || (readUnsignedInt24 = parsableByteArray.readUnsignedInt24()) < 4) {
                    return;
                }
                this.bitmapWidth = parsableByteArray.readUnsignedShort();
                this.bitmapHeight = parsableByteArray.readUnsignedShort();
                this.bitmapData.reset(readUnsignedInt24 - 4);
                i2 -= 7;
            }
            int position = this.bitmapData.getPosition();
            int limit = this.bitmapData.limit();
            if (position < limit && i2 > 0) {
                int min = Math.min(i2, limit - position);
                parsableByteArray.readBytes(this.bitmapData.data, position, min);
                this.bitmapData.setPosition(position + min);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parseIdentifierSection(ParsableByteArray parsableByteArray, int i) {
            if (i < 19) {
                return;
            }
            this.planeWidth = parsableByteArray.readUnsignedShort();
            this.planeHeight = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(11);
            this.bitmapX = parsableByteArray.readUnsignedShort();
            this.bitmapY = parsableByteArray.readUnsignedShort();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parsePaletteSection(ParsableByteArray parsableByteArray, int i) {
            if (i % 5 != 2) {
                return;
            }
            parsableByteArray.skipBytes(2);
            Arrays.fill(this.colors, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                double d = readUnsignedByte2;
                double d2 = readUnsignedByte3 - 128;
                double d3 = readUnsignedByte4 - 128;
                this.colors[readUnsignedByte] = (Util.constrainValue((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (parsableByteArray.readUnsignedByte() << 24) | (Util.constrainValue((int) ((1.402d * d2) + d), 0, 255) << 16) | Util.constrainValue((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.colorsSet = true;
        }

        public final Cue build() {
            int i;
            int readUnsignedByte;
            int i2;
            if (this.planeWidth != 0 && this.planeHeight != 0 && this.bitmapWidth != 0 && this.bitmapHeight != 0 && this.bitmapData.limit() != 0 && this.bitmapData.getPosition() == this.bitmapData.limit() && this.colorsSet) {
                this.bitmapData.setPosition(0);
                int i3 = this.bitmapWidth * this.bitmapHeight;
                int[] iArr = new int[i3];
                int i4 = 0;
                while (i4 < i3) {
                    int readUnsignedByte2 = this.bitmapData.readUnsignedByte();
                    if (readUnsignedByte2 != 0) {
                        i = i4 + 1;
                        iArr[i4] = this.colors[readUnsignedByte2];
                    } else {
                        int readUnsignedByte3 = this.bitmapData.readUnsignedByte();
                        if (readUnsignedByte3 != 0) {
                            if ((readUnsignedByte3 & 64) == 0) {
                                readUnsignedByte = readUnsignedByte3 & 63;
                            } else {
                                readUnsignedByte = ((readUnsignedByte3 & 63) << 8) | this.bitmapData.readUnsignedByte();
                            }
                            if ((readUnsignedByte3 & 128) == 0) {
                                i2 = 0;
                            } else {
                                i2 = this.colors[this.bitmapData.readUnsignedByte()];
                            }
                            i = readUnsignedByte + i4;
                            Arrays.fill(iArr, i4, i, i2);
                        }
                    }
                    i4 = i;
                }
                Bitmap createBitmap = Bitmap.createBitmap(iArr, this.bitmapWidth, this.bitmapHeight, Bitmap.Config.ARGB_8888);
                int i5 = this.planeWidth;
                float f = this.bitmapX / i5;
                int i6 = this.planeHeight;
                return new Cue(createBitmap, f, 0, this.bitmapY / i6, 0, this.bitmapWidth / i5, this.bitmapHeight / i6);
            }
            return null;
        }

        public final void reset() {
            this.planeWidth = 0;
            this.planeHeight = 0;
            this.bitmapX = 0;
            this.bitmapY = 0;
            this.bitmapWidth = 0;
            this.bitmapHeight = 0;
            this.bitmapData.reset(0);
            this.colorsSet = false;
        }
    }

    public PgsDecoder() {
        super("PgsDecoder");
        this.buffer = new ParsableByteArray();
        this.cueBuilder = new CueBuilder();
    }

    private boolean maybeInflateData(byte[] bArr, int i) {
        if (i != 0 && bArr[0] == 120) {
            if (this.inflater == null) {
                this.inflater = new Inflater();
                this.inflatedData = new byte[i];
            }
            this.inflatedDataSize = 0;
            this.inflater.setInput(bArr, 0, i);
            while (!this.inflater.finished() && !this.inflater.needsDictionary() && !this.inflater.needsInput()) {
                try {
                    int i2 = this.inflatedDataSize;
                    byte[] bArr2 = this.inflatedData;
                    if (i2 == bArr2.length) {
                        this.inflatedData = Arrays.copyOf(bArr2, bArr2.length * 2);
                    }
                    int i3 = this.inflatedDataSize;
                    Inflater inflater = this.inflater;
                    byte[] bArr3 = this.inflatedData;
                    this.inflatedDataSize = i3 + inflater.inflate(bArr3, i3, bArr3.length - i3);
                } catch (DataFormatException unused) {
                } finally {
                    this.inflater.reset();
                }
            }
            return this.inflater.finished();
        }
        return false;
    }

    private static Cue readNextSection(ParsableByteArray parsableByteArray, CueBuilder cueBuilder) {
        int limit = parsableByteArray.limit();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition() + readUnsignedShort;
        Cue cue = null;
        if (position > limit) {
            parsableByteArray.setPosition(limit);
            return null;
        }
        if (readUnsignedByte != 128) {
            switch (readUnsignedByte) {
                case 20:
                    cueBuilder.parsePaletteSection(parsableByteArray, readUnsignedShort);
                    break;
                case 21:
                    cueBuilder.parseBitmapSection(parsableByteArray, readUnsignedShort);
                    break;
                case 22:
                    cueBuilder.parseIdentifierSection(parsableByteArray, readUnsignedShort);
                    break;
            }
        } else {
            cue = cueBuilder.build();
            cueBuilder.reset();
        }
        parsableByteArray.setPosition(position);
        return cue;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.text.SimpleSubtitleDecoder
    protected final Subtitle decode(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        if (maybeInflateData(bArr, i)) {
            this.buffer.reset(this.inflatedData, this.inflatedDataSize);
        } else {
            this.buffer.reset(bArr, i);
        }
        this.cueBuilder.reset();
        ArrayList arrayList = new ArrayList();
        while (this.buffer.bytesLeft() >= 3) {
            Cue readNextSection = readNextSection(this.buffer, this.cueBuilder);
            if (readNextSection != null) {
                arrayList.add(readNextSection);
            }
        }
        return new PgsSubtitle(Collections.unmodifiableList(arrayList));
    }
}
