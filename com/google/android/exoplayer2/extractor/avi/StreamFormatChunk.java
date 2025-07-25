package com.google.android.exoplayer2.extractor.avi;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;

/* loaded from: classes4.dex */
final class StreamFormatChunk implements AviChunk {
    public final Format format;

    public StreamFormatChunk(Format format) {
        this.format = format;
    }

    @Nullable
    /* renamed from: a */
    private static String m74672a(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    @Nullable
    /* renamed from: b */
    private static String m74671b(int i) {
        if (i != 1) {
            if (i != 85) {
                if (i != 255) {
                    if (i != 8192) {
                        if (i != 8193) {
                            return null;
                        }
                        return "audio/vnd.dts";
                    }
                    return "audio/ac3";
                }
                return "audio/mp4a-latm";
            }
            return "audio/mpeg";
        }
        return "audio/raw";
    }

    @Nullable
    /* renamed from: c */
    private static AviChunk m74670c(ParsableByteArray parsableByteArray) {
        parsableByteArray.skipBytes(4);
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        int readLittleEndianInt2 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int readLittleEndianInt3 = parsableByteArray.readLittleEndianInt();
        String m74672a = m74672a(readLittleEndianInt3);
        if (m74672a == null) {
            Log.m72602w("StreamFormatChunk", "Ignoring track with unsupported compression " + readLittleEndianInt3);
            return null;
        }
        Format.Builder builder = new Format.Builder();
        builder.setWidth(readLittleEndianInt).setHeight(readLittleEndianInt2).setSampleMimeType(m74672a);
        return new StreamFormatChunk(builder.build());
    }

    @Nullable
    /* renamed from: d */
    private static AviChunk m74669d(ParsableByteArray parsableByteArray) {
        int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        String m74671b = m74671b(readLittleEndianUnsignedShort);
        if (m74671b == null) {
            Log.m72602w("StreamFormatChunk", "Ignoring track with unsupported format tag " + readLittleEndianUnsignedShort);
            return null;
        }
        int readLittleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(6);
        int pcmEncoding = Util.getPcmEncoding(parsableByteArray.readUnsignedShort());
        int readLittleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        byte[] bArr = new byte[readLittleEndianUnsignedShort3];
        parsableByteArray.readBytes(bArr, 0, readLittleEndianUnsignedShort3);
        Format.Builder builder = new Format.Builder();
        builder.setSampleMimeType(m74671b).setChannelCount(readLittleEndianUnsignedShort2).setSampleRate(readLittleEndianInt);
        if ("audio/raw".equals(m74671b) && pcmEncoding != 0) {
            builder.setPcmEncoding(pcmEncoding);
        }
        if ("audio/mp4a-latm".equals(m74671b) && readLittleEndianUnsignedShort3 > 0) {
            builder.setInitializationData(ImmutableList.m69423of(bArr));
        }
        return new StreamFormatChunk(builder.build());
    }

    @Nullable
    public static AviChunk parseFrom(int i, ParsableByteArray parsableByteArray) {
        if (i == 2) {
            return m74670c(parsableByteArray);
        }
        if (i == 1) {
            return m74669d(parsableByteArray);
        }
        Log.m72602w("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + Util.getTrackTypeString(i));
        return null;
    }

    @Override // com.google.android.exoplayer2.extractor.avi.AviChunk
    public int getType() {
        return 1718776947;
    }
}
