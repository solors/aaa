package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;
    public final int bitdepthChroma;
    public final int bitdepthLuma;
    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private HevcConfig(List<byte[]> list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i;
        this.width = i2;
        this.height = i3;
        this.bitdepthLuma = i4;
        this.bitdepthChroma = i5;
        this.colorSpace = i6;
        this.colorRange = i7;
        this.colorTransfer = i8;
        this.pixelWidthHeightRatio = f;
        this.codecs = str;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        List singletonList;
        int i;
        int i2;
        try {
            parsableByteArray.skipBytes(21);
            int readUnsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < readUnsignedByte2; i5++) {
                parsableByteArray.skipBytes(1);
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                for (int i6 = 0; i6 < readUnsignedShort; i6++) {
                    int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                    i4 += readUnsignedShort2 + 4;
                    parsableByteArray.skipBytes(readUnsignedShort2);
                }
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i4];
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            float f = 1.0f;
            String str = null;
            int i14 = 0;
            int i15 = 0;
            while (i14 < readUnsignedByte2) {
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                int i16 = i3;
                while (i16 < readUnsignedShort3) {
                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i17 = readUnsignedByte2;
                    System.arraycopy(bArr2, i3, bArr, i15, bArr2.length);
                    int length = i15 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, readUnsignedShort4);
                    if (readUnsignedByte3 == 33 && i16 == 0) {
                        NalUnitUtil.H265SpsData parseH265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + readUnsignedShort4);
                        int i18 = parseH265SpsNalUnit.width;
                        i8 = parseH265SpsNalUnit.height;
                        i9 = parseH265SpsNalUnit.bitDepthLumaMinus8 + 8;
                        i10 = parseH265SpsNalUnit.bitDepthChromaMinus8 + 8;
                        int i19 = parseH265SpsNalUnit.colorSpace;
                        int i20 = parseH265SpsNalUnit.colorRange;
                        int i21 = parseH265SpsNalUnit.colorTransfer;
                        float f2 = parseH265SpsNalUnit.pixelWidthHeightRatio;
                        i = readUnsignedByte3;
                        i2 = readUnsignedShort3;
                        i7 = i18;
                        str = CodecSpecificDataUtil.buildHevcCodecString(parseH265SpsNalUnit.generalProfileSpace, parseH265SpsNalUnit.generalTierFlag, parseH265SpsNalUnit.generalProfileIdc, parseH265SpsNalUnit.generalProfileCompatibilityFlags, parseH265SpsNalUnit.constraintBytes, parseH265SpsNalUnit.generalLevelIdc);
                        i12 = i20;
                        i11 = i19;
                        f = f2;
                        i13 = i21;
                    } else {
                        i = readUnsignedByte3;
                        i2 = readUnsignedShort3;
                    }
                    i15 = length + readUnsignedShort4;
                    parsableByteArray.skipBytes(readUnsignedShort4);
                    i16++;
                    readUnsignedByte2 = i17;
                    readUnsignedByte3 = i;
                    readUnsignedShort3 = i2;
                    i3 = 0;
                }
                i14++;
                i3 = 0;
            }
            if (i4 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new HevcConfig(singletonList, readUnsignedByte + 1, i7, i8, i9, i10, i11, i12, i13, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e);
        }
    }
}
