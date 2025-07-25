package io.bidmachine.media3.extractor.metadata.id3;

import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableBitArray;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.metadata.MetadataInputBuffer;
import io.bidmachine.media3.extractor.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

@UnstableApi
/* loaded from: classes9.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    private static final int FRAME_FLAG_V3_HAS_GROUP_IDENTIFIER = 32;
    private static final int FRAME_FLAG_V3_IS_COMPRESSED = 128;
    private static final int FRAME_FLAG_V3_IS_ENCRYPTED = 64;
    private static final int FRAME_FLAG_V4_HAS_DATA_LENGTH = 1;
    private static final int FRAME_FLAG_V4_HAS_GROUP_IDENTIFIER = 64;
    private static final int FRAME_FLAG_V4_IS_COMPRESSED = 8;
    private static final int FRAME_FLAG_V4_IS_ENCRYPTED = 4;
    private static final int FRAME_FLAG_V4_IS_UNSYNCHRONIZED = 2;
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    private static final int ID3_TEXT_ENCODING_ISO_8859_1 = 0;
    private static final int ID3_TEXT_ENCODING_UTF_16 = 1;
    private static final int ID3_TEXT_ENCODING_UTF_16BE = 2;
    private static final int ID3_TEXT_ENCODING_UTF_8 = 3;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: io.bidmachine.media3.extractor.metadata.id3.a
        @Override // io.bidmachine.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            boolean lambda$static$0;
            lambda$static$0 = Id3Decoder.lambda$static$0(i, i2, i3, i4, i5);
            return lambda$static$0;
        }
    };
    private static final String TAG = "Id3Decoder";
    @Nullable
    private final FramePredicate framePredicate;

    /* loaded from: classes9.dex */
    public interface FramePredicate {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: io.bidmachine.media3.extractor.metadata.id3.Id3Decoder$a */
    /* loaded from: classes9.dex */
    public static final class C36555a {
        private final int framesSize;
        private final boolean isUnsynchronized;
        private final int majorVersion;

        public C36555a(int i, boolean z, int i2) {
            this.majorVersion = i;
            this.isUnsynchronized = z;
            this.framesSize = i2;
        }
    }

    public Id3Decoder() {
        this(null);
    }

    private static byte[] copyOfRangeIfValid(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return Util.EMPTY_BYTE_ARRAY;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    private static ApicFrame decodeApicFrame(ParsableByteArray parsableByteArray, int i, int i2) {
        int indexOfZeroByte;
        String str;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, Charsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            indexOfZeroByte = 2;
        } else {
            indexOfZeroByte = indexOfZeroByte(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, indexOfZeroByte, Charsets.ISO_8859_1));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i4 = indexOfZeroByte + 2;
        int indexOfTerminator = indexOfTerminator(bArr, i4, readUnsignedByte);
        return new ApicFrame(str, new String(bArr, i4, indexOfTerminator - i4, charset), bArr[indexOfZeroByte + 1] & 255, copyOfRangeIfValid(bArr, indexOfTerminator + delimiterLength(readUnsignedByte), i3));
    }

    private static BinaryFrame decodeBinaryFrame(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    private static ChapterFrame decodeChapterFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, @Nullable FramePredicate framePredicate) {
        long j;
        long j2;
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, indexOfZeroByte - position, Charsets.ISO_8859_1);
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if (readUnsignedInt == 4294967295L) {
            j = -1;
        } else {
            j = readUnsignedInt;
        }
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        if (readUnsignedInt2 == 4294967295L) {
            j2 = -1;
        } else {
            j2 = readUnsignedInt2;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = position + i;
        while (parsableByteArray.getPosition() < i4) {
            Id3Frame decodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new ChapterFrame(str, readInt, readInt2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    private static ChapterTocFrame decodeChapterTOCFrame(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, @Nullable FramePredicate framePredicate) {
        boolean z2;
        boolean z3;
        int position = parsableByteArray.getPosition();
        int indexOfZeroByte = indexOfZeroByte(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, indexOfZeroByte - position, Charsets.ISO_8859_1);
        parsableByteArray.setPosition(indexOfZeroByte + 1);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((readUnsignedByte & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        String[] strArr = new String[readUnsignedByte2];
        for (int i4 = 0; i4 < readUnsignedByte2; i4++) {
            int position2 = parsableByteArray.getPosition();
            int indexOfZeroByte2 = indexOfZeroByte(parsableByteArray.getData(), position2);
            strArr[i4] = new String(parsableByteArray.getData(), position2, indexOfZeroByte2 - position2, Charsets.ISO_8859_1);
            parsableByteArray.setPosition(indexOfZeroByte2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = position + i;
        while (parsableByteArray.getPosition() < i5) {
            Id3Frame decodeFrame = decodeFrame(i2, parsableByteArray, z, i3, framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    private static CommentFrame decodeCommentFrame(ParsableByteArray parsableByteArray, int i) {
        if (i < 4) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.readBytes(bArr2, 0, i2);
        int indexOfTerminator = indexOfTerminator(bArr2, 0, readUnsignedByte);
        String str2 = new String(bArr2, 0, indexOfTerminator, charset);
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        return new CommentFrame(str, str2, decodeStringIfValid(bArr2, delimiterLength, indexOfTerminator(bArr2, delimiterLength, readUnsignedByte), charset));
    }

    /* JADX WARN: Code restructure failed: missing block: B:299:0x0190, code lost:
        if (r13 == 67) goto L98;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static io.bidmachine.media3.extractor.metadata.id3.Id3Frame decodeFrame(int r19, io.bidmachine.media3.common.util.ParsableByteArray r20, boolean r21, int r22, @androidx.annotation.Nullable io.bidmachine.media3.extractor.metadata.id3.Id3Decoder.FramePredicate r23) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.extractor.metadata.id3.Id3Decoder.decodeFrame(int, io.bidmachine.media3.common.util.ParsableByteArray, boolean, int, io.bidmachine.media3.extractor.metadata.id3.Id3Decoder$FramePredicate):io.bidmachine.media3.extractor.metadata.id3.Id3Frame");
    }

    private static GeobFrame decodeGeobFrame(ParsableByteArray parsableByteArray, int i) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset charset = getCharset(readUnsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        String str = new String(bArr, 0, indexOfZeroByte, Charsets.ISO_8859_1);
        int i3 = indexOfZeroByte + 1;
        int indexOfTerminator = indexOfTerminator(bArr, i3, readUnsignedByte);
        String decodeStringIfValid = decodeStringIfValid(bArr, i3, indexOfTerminator, charset);
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        int indexOfTerminator2 = indexOfTerminator(bArr, delimiterLength, readUnsignedByte);
        return new GeobFrame(str, decodeStringIfValid, decodeStringIfValid(bArr, delimiterLength, indexOfTerminator2, charset), copyOfRangeIfValid(bArr, indexOfTerminator2 + delimiterLength(readUnsignedByte), i2));
    }

    @Nullable
    private static C36555a decodeHeader(ParsableByteArray parsableByteArray) {
        int readUnsignedInt24;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (parsableByteArray.bytesLeft() < 10) {
            Log.m19945w(TAG, "Data too short to be an ID3 tag");
            return null;
        }
        boolean z5 = false;
        if (parsableByteArray.readUnsignedInt24() != 4801587) {
            Log.m19945w(TAG, "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(readUnsignedInt24)));
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
        if (readUnsignedByte == 2) {
            if ((readUnsignedByte2 & 64) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                Log.m19945w(TAG, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (readUnsignedByte == 3) {
            if ((readUnsignedByte2 & 64) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int readInt = parsableByteArray.readInt();
                parsableByteArray.skipBytes(readInt);
                readSynchSafeInt -= readInt + 4;
            }
        } else if (readUnsignedByte == 4) {
            if ((readUnsignedByte2 & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int readSynchSafeInt2 = parsableByteArray.readSynchSafeInt();
                parsableByteArray.skipBytes(readSynchSafeInt2 - 4);
                readSynchSafeInt -= readSynchSafeInt2;
            }
            if ((readUnsignedByte2 & 16) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                readSynchSafeInt -= 10;
            }
        } else {
            Log.m19945w(TAG, "Skipped ID3 tag with unsupported majorVersion=" + readUnsignedByte);
            return null;
        }
        if (readUnsignedByte < 4 && (readUnsignedByte2 & 128) != 0) {
            z5 = true;
        }
        return new C36555a(readUnsignedByte, z5, readSynchSafeInt);
    }

    private static MlltFrame decodeMlltFrame(ParsableByteArray parsableByteArray, int i) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
        int readUnsignedInt242 = parsableByteArray.readUnsignedInt24();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int i2 = ((i - 10) * 8) / (readUnsignedByte + readUnsignedByte2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int readBits = parsableBitArray.readBits(readUnsignedByte);
            int readBits2 = parsableBitArray.readBits(readUnsignedByte2);
            iArr[i3] = readBits;
            iArr2[i3] = readBits2;
        }
        return new MlltFrame(readUnsignedShort, readUnsignedInt24, readUnsignedInt242, iArr, iArr2);
    }

    private static PrivFrame decodePrivFrame(ParsableByteArray parsableByteArray, int i) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        int indexOfZeroByte = indexOfZeroByte(bArr, 0);
        return new PrivFrame(new String(bArr, 0, indexOfZeroByte, Charsets.ISO_8859_1), copyOfRangeIfValid(bArr, indexOfZeroByte + 1, i));
    }

    private static String decodeStringIfValid(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, charset);
        }
        return "";
    }

    @Nullable
    private static TextInformationFrame decodeTextInformationFrame(ParsableByteArray parsableByteArray, int i, String str) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new TextInformationFrame(str, (String) null, decodeTextInformationFrameValues(bArr, readUnsignedByte, 0));
    }

    private static ImmutableList<String> decodeTextInformationFrameValues(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.m69423of("");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int indexOfTerminator = indexOfTerminator(bArr, i2, i);
        while (i2 < indexOfTerminator) {
            builder.add((ImmutableList.Builder) new String(bArr, i2, indexOfTerminator - i2, getCharset(i)));
            i2 = delimiterLength(i) + indexOfTerminator;
            indexOfTerminator = indexOfTerminator(bArr, i2, i);
        }
        ImmutableList<String> build = builder.build();
        if (build.isEmpty()) {
            return ImmutableList.m69423of("");
        }
        return build;
    }

    @Nullable
    private static TextInformationFrame decodeTxxxFrame(ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int indexOfTerminator = indexOfTerminator(bArr, 0, readUnsignedByte);
        return new TextInformationFrame("TXXX", new String(bArr, 0, indexOfTerminator, getCharset(readUnsignedByte)), decodeTextInformationFrameValues(bArr, readUnsignedByte, indexOfTerminator + delimiterLength(readUnsignedByte)));
    }

    private static UrlLinkFrame decodeUrlLinkFrame(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, indexOfZeroByte(bArr, 0), Charsets.ISO_8859_1));
    }

    @Nullable
    private static UrlLinkFrame decodeWxxxFrame(ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int indexOfTerminator = indexOfTerminator(bArr, 0, readUnsignedByte);
        String str = new String(bArr, 0, indexOfTerminator, getCharset(readUnsignedByte));
        int delimiterLength = indexOfTerminator + delimiterLength(readUnsignedByte);
        return new UrlLinkFrame("WXXX", str, decodeStringIfValid(bArr, delimiterLength, indexOfZeroByte(bArr, delimiterLength), Charsets.ISO_8859_1));
    }

    private static int delimiterLength(int i) {
        if (i != 0 && i != 3) {
            return 2;
        }
        return 1;
    }

    private static Charset getCharset(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return Charsets.ISO_8859_1;
                }
                return Charsets.UTF_8;
            }
            return Charsets.UTF_16BE;
        }
        return Charsets.UTF_16;
    }

    private static String getFrameId(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int indexOfTerminator(byte[] bArr, int i, int i2) {
        int indexOfZeroByte = indexOfZeroByte(bArr, i);
        if (i2 != 0 && i2 != 3) {
            while (indexOfZeroByte < bArr.length - 1) {
                if ((indexOfZeroByte - i) % 2 == 0 && bArr[indexOfZeroByte + 1] == 0) {
                    return indexOfZeroByte;
                }
                indexOfZeroByte = indexOfZeroByte(bArr, indexOfZeroByte + 1);
            }
            return bArr.length;
        }
        return indexOfZeroByte;
    }

    private static int indexOfZeroByte(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static /* synthetic */ boolean lambda$static$0(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    private static int removeUnsynchronization(ParsableByteArray parsableByteArray, int i) {
        byte[] data = parsableByteArray.getData();
        int position = parsableByteArray.getPosition();
        int i2 = position;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < position + i) {
                if ((data[i2] & 255) == 255 && data[i3] == 0) {
                    System.arraycopy(data, i2 + 2, data, i3, (i - (i2 - position)) - 2);
                    i--;
                }
                i2 = i3;
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0076, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0079, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0086, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean validateFrames(io.bidmachine.media3.common.util.ParsableByteArray r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.getPosition()
        L8:
            int r3 = r18.bytesLeft()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.readInt()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.readUnsignedInt()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.readUnsignedShort()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.readUnsignedInt24()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.readUnsignedInt24()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.setPosition(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.setPosition(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.setPosition(r2)
            return r6
        L98:
            int r3 = r18.bytesLeft()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.setPosition(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.skipBytes(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.setPosition(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.setPosition(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.extractor.metadata.id3.Id3Decoder.validateFrames(io.bidmachine.media3.common.util.ParsableByteArray, int, int, boolean):boolean");
    }

    @Override // io.bidmachine.media3.extractor.metadata.SimpleMetadataDecoder
    @Nullable
    protected Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    public Id3Decoder(@Nullable FramePredicate framePredicate) {
        this.framePredicate = framePredicate;
    }

    @Nullable
    public Metadata decode(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        C36555a decodeHeader = decodeHeader(parsableByteArray);
        if (decodeHeader == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        int i2 = decodeHeader.majorVersion == 2 ? 6 : 10;
        int i3 = decodeHeader.framesSize;
        if (decodeHeader.isUnsynchronized) {
            i3 = removeUnsynchronization(parsableByteArray, decodeHeader.framesSize);
        }
        parsableByteArray.setLimit(position + i3);
        boolean z = false;
        if (!validateFrames(parsableByteArray, decodeHeader.majorVersion, i2, false)) {
            if (decodeHeader.majorVersion != 4 || !validateFrames(parsableByteArray, 4, i2, true)) {
                Log.m19945w(TAG, "Failed to validate ID3 tag with majorVersion=" + decodeHeader.majorVersion);
                return null;
            }
            z = true;
        }
        while (parsableByteArray.bytesLeft() >= i2) {
            Id3Frame decodeFrame = decodeFrame(decodeHeader.majorVersion, parsableByteArray, z, i2, this.framePredicate);
            if (decodeFrame != null) {
                arrayList.add(decodeFrame);
            }
        }
        return new Metadata(arrayList);
    }
}
