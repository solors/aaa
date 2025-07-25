package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes4.dex */
public final class CeaUtil {
    public static final int USER_DATA_IDENTIFIER_GA94 = 1195456820;
    public static final int USER_DATA_TYPE_CODE_MPEG_CC = 3;

    private CeaUtil() {
    }

    /* renamed from: a */
    private static int m74737a(ParsableByteArray parsableByteArray) {
        int i = 0;
        while (parsableByteArray.bytesLeft() != 0) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            i += readUnsignedByte;
            if (readUnsignedByte != 255) {
                return i;
            }
        }
        return -1;
    }

    public static void consume(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int i;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (parsableByteArray.bytesLeft() > 1) {
                int m74737a = m74737a(parsableByteArray);
                int m74737a2 = m74737a(parsableByteArray);
                int position = parsableByteArray.getPosition() + m74737a2;
                if (m74737a2 != -1 && m74737a2 <= parsableByteArray.bytesLeft()) {
                    if (m74737a == 4 && m74737a2 >= 8) {
                        int readUnsignedByte = parsableByteArray.readUnsignedByte();
                        int readUnsignedShort = parsableByteArray.readUnsignedShort();
                        if (readUnsignedShort == 49) {
                            i = parsableByteArray.readInt();
                        } else {
                            i = 0;
                        }
                        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                        if (readUnsignedShort == 47) {
                            parsableByteArray.skipBytes(1);
                        }
                        if (readUnsignedByte == 181 && ((readUnsignedShort == 49 || readUnsignedShort == 47) && readUnsignedByte2 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (readUnsignedShort == 49) {
                            if (i != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            consumeCcData(j, parsableByteArray, trackOutputArr);
                        }
                    }
                } else {
                    Log.m72602w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    position = parsableByteArray.limit();
                }
                parsableByteArray.setPosition(position);
            } else {
                return;
            }
        }
    }

    public static void consumeCcData(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        boolean z;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        parsableByteArray.skipBytes(1);
        int i = (readUnsignedByte & 31) * 3;
        int position = parsableByteArray.getPosition();
        for (TrackOutput trackOutput : trackOutputArr) {
            parsableByteArray.setPosition(position);
            trackOutput.sampleData(parsableByteArray, i);
            if (j != -9223372036854775807L) {
                trackOutput.sampleMetadata(j, 1, i, 0, null);
            }
        }
    }
}
