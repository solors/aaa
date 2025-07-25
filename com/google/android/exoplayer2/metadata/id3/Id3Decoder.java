package com.google.android.exoplayer2.metadata.id3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class Id3Decoder extends SimpleMetadataDecoder {
    public static final int ID3_HEADER_LENGTH = 10;
    public static final int ID3_TAG = 4801587;
    public static final FramePredicate NO_FRAMES_PREDICATE = new FramePredicate() { // from class: com.google.android.exoplayer2.metadata.id3.a
        @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            boolean m74064y;
            m74064y = Id3Decoder.m74064y(i, i2, i3, i4, i5);
            return m74064y;
        }
    };
    @Nullable

    /* renamed from: a */
    private final FramePredicate f33925a;

    /* loaded from: classes4.dex */
    public interface FramePredicate {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    /* loaded from: classes4.dex */
    public static final class Id3Header {

        /* renamed from: a */
        private final int f33926a;

        /* renamed from: b */
        private final boolean f33927b;

        /* renamed from: c */
        private final int f33928c;

        public Id3Header(int i, boolean z, int i2) {
            this.f33926a = i;
            this.f33927b = z;
            this.f33928c = i2;
        }
    }

    public Id3Decoder() {
        this(null);
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
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m74088A(com.google.android.exoplayer2.util.ParsableByteArray r18, int r19, int r20, boolean r21) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.m74088A(com.google.android.exoplayer2.util.ParsableByteArray, int, int, boolean):boolean");
    }

    /* renamed from: c */
    private static byte[] m74086c(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return Util.EMPTY_BYTE_ARRAY;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: d */
    private static ApicFrame m74085d(ParsableByteArray parsableByteArray, int i, int i2) {
        int m74065x;
        String str;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset m74068u = m74068u(readUnsignedByte);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, Charsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            m74065x = 2;
        } else {
            m74065x = m74065x(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, m74065x, Charsets.ISO_8859_1));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i4 = m74065x + 2;
        int m74066w = m74066w(bArr, i4, readUnsignedByte);
        return new ApicFrame(str, new String(bArr, i4, m74066w - i4, m74068u), bArr[m74065x + 1] & 255, m74086c(bArr, m74066w + m74069t(readUnsignedByte), i3));
    }

    /* renamed from: e */
    private static BinaryFrame m74084e(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    /* renamed from: f */
    private static ChapterFrame m74083f(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, @Nullable FramePredicate framePredicate) {
        long j;
        long j2;
        int position = parsableByteArray.getPosition();
        int m74065x = m74065x(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, m74065x - position, Charsets.ISO_8859_1);
        parsableByteArray.setPosition(m74065x + 1);
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
            Id3Frame m74080i = m74080i(i2, parsableByteArray, z, i3, framePredicate);
            if (m74080i != null) {
                arrayList.add(m74080i);
            }
        }
        return new ChapterFrame(str, readInt, readInt2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: g */
    private static ChapterTocFrame m74082g(ParsableByteArray parsableByteArray, int i, int i2, boolean z, int i3, @Nullable FramePredicate framePredicate) {
        boolean z2;
        boolean z3;
        int position = parsableByteArray.getPosition();
        int m74065x = m74065x(parsableByteArray.getData(), position);
        String str = new String(parsableByteArray.getData(), position, m74065x - position, Charsets.ISO_8859_1);
        parsableByteArray.setPosition(m74065x + 1);
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
            int m74065x2 = m74065x(parsableByteArray.getData(), position2);
            strArr[i4] = new String(parsableByteArray.getData(), position2, m74065x2 - position2, Charsets.ISO_8859_1);
            parsableByteArray.setPosition(m74065x2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = position + i;
        while (parsableByteArray.getPosition() < i5) {
            Id3Frame m74080i = m74080i(i2, parsableByteArray, z, i3, framePredicate);
            if (m74080i != null) {
                arrayList.add(m74080i);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    @Nullable
    /* renamed from: h */
    private static CommentFrame m74081h(ParsableByteArray parsableByteArray, int i) {
        if (i < 4) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset m74068u = m74068u(readUnsignedByte);
        byte[] bArr = new byte[3];
        parsableByteArray.readBytes(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        parsableByteArray.readBytes(bArr2, 0, i2);
        int m74066w = m74066w(bArr2, 0, readUnsignedByte);
        String str2 = new String(bArr2, 0, m74066w, m74068u);
        int m74069t = m74066w + m74069t(readUnsignedByte);
        return new CommentFrame(str, str2, m74075n(bArr2, m74069t, m74066w(bArr2, m74069t, readUnsignedByte), m74068u));
    }

    /* JADX WARN: Code restructure failed: missing block: B:299:0x0190, code lost:
        if (r13 == 67) goto L98;
     */
    @androidx.annotation.Nullable
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.metadata.id3.Id3Frame m74080i(int r19, com.google.android.exoplayer2.util.ParsableByteArray r20, boolean r21, int r22, @androidx.annotation.Nullable com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate r23) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.id3.Id3Decoder.m74080i(int, com.google.android.exoplayer2.util.ParsableByteArray, boolean, int, com.google.android.exoplayer2.metadata.id3.Id3Decoder$FramePredicate):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* renamed from: j */
    private static GeobFrame m74079j(ParsableByteArray parsableByteArray, int i) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        Charset m74068u = m74068u(readUnsignedByte);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int m74065x = m74065x(bArr, 0);
        String str = new String(bArr, 0, m74065x, Charsets.ISO_8859_1);
        int i3 = m74065x + 1;
        int m74066w = m74066w(bArr, i3, readUnsignedByte);
        String m74075n = m74075n(bArr, i3, m74066w, m74068u);
        int m74069t = m74066w + m74069t(readUnsignedByte);
        int m74066w2 = m74066w(bArr, m74069t, readUnsignedByte);
        return new GeobFrame(str, m74075n, m74075n(bArr, m74069t, m74066w2, m74068u), m74086c(bArr, m74066w2 + m74069t(readUnsignedByte), i2));
    }

    @Nullable
    /* renamed from: k */
    private static Id3Header m74078k(ParsableByteArray parsableByteArray) {
        int readUnsignedInt24;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (parsableByteArray.bytesLeft() < 10) {
            Log.m72602w("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        boolean z5 = false;
        if (parsableByteArray.readUnsignedInt24() != 4801587) {
            Log.m72602w("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(readUnsignedInt24)));
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
                Log.m72602w("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
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
            Log.m72602w("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + readUnsignedByte);
            return null;
        }
        if (readUnsignedByte < 4 && (readUnsignedByte2 & 128) != 0) {
            z5 = true;
        }
        return new Id3Header(readUnsignedByte, z5, readSynchSafeInt);
    }

    /* renamed from: l */
    private static MlltFrame m74077l(ParsableByteArray parsableByteArray, int i) {
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

    /* renamed from: m */
    private static PrivFrame m74076m(ParsableByteArray parsableByteArray, int i) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        int m74065x = m74065x(bArr, 0);
        return new PrivFrame(new String(bArr, 0, m74065x, Charsets.ISO_8859_1), m74086c(bArr, m74065x + 1, i));
    }

    /* renamed from: n */
    private static String m74075n(byte[] bArr, int i, int i2, Charset charset) {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, charset);
        }
        return "";
    }

    @Nullable
    /* renamed from: o */
    private static TextInformationFrame m74074o(ParsableByteArray parsableByteArray, int i, String str) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        return new TextInformationFrame(str, (String) null, m74073p(bArr, readUnsignedByte, 0));
    }

    /* renamed from: p */
    private static ImmutableList<String> m74073p(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return ImmutableList.m69423of("");
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int m74066w = m74066w(bArr, i2, i);
        while (i2 < m74066w) {
            builder.add((ImmutableList.Builder) new String(bArr, i2, m74066w - i2, m74068u(i)));
            i2 = m74069t(i) + m74066w;
            m74066w = m74066w(bArr, i2, i);
        }
        ImmutableList<String> build = builder.build();
        if (build.isEmpty()) {
            return ImmutableList.m69423of("");
        }
        return build;
    }

    @Nullable
    /* renamed from: q */
    private static TextInformationFrame m74072q(ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int m74066w = m74066w(bArr, 0, readUnsignedByte);
        return new TextInformationFrame("TXXX", new String(bArr, 0, m74066w, m74068u(readUnsignedByte)), m74073p(bArr, readUnsignedByte, m74066w + m74069t(readUnsignedByte)));
    }

    /* renamed from: r */
    private static UrlLinkFrame m74071r(ParsableByteArray parsableByteArray, int i, String str) {
        byte[] bArr = new byte[i];
        parsableByteArray.readBytes(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, m74065x(bArr, 0), Charsets.ISO_8859_1));
    }

    @Nullable
    /* renamed from: s */
    private static UrlLinkFrame m74070s(ParsableByteArray parsableByteArray, int i) {
        if (i < 1) {
            return null;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        parsableByteArray.readBytes(bArr, 0, i2);
        int m74066w = m74066w(bArr, 0, readUnsignedByte);
        String str = new String(bArr, 0, m74066w, m74068u(readUnsignedByte));
        int m74069t = m74066w + m74069t(readUnsignedByte);
        return new UrlLinkFrame("WXXX", str, m74075n(bArr, m74069t, m74065x(bArr, m74069t), Charsets.ISO_8859_1));
    }

    /* renamed from: t */
    private static int m74069t(int i) {
        if (i != 0 && i != 3) {
            return 2;
        }
        return 1;
    }

    /* renamed from: u */
    private static Charset m74068u(int i) {
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

    /* renamed from: v */
    private static String m74067v(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: w */
    private static int m74066w(byte[] bArr, int i, int i2) {
        int m74065x = m74065x(bArr, i);
        if (i2 != 0 && i2 != 3) {
            while (m74065x < bArr.length - 1) {
                if ((m74065x - i) % 2 == 0 && bArr[m74065x + 1] == 0) {
                    return m74065x;
                }
                m74065x = m74065x(bArr, m74065x + 1);
            }
            return bArr.length;
        }
        return m74065x;
    }

    /* renamed from: x */
    private static int m74065x(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: y */
    public static /* synthetic */ boolean m74064y(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* renamed from: z */
    private static int m74063z(ParsableByteArray parsableByteArray, int i) {
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

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    @Nullable
    /* renamed from: a */
    protected Metadata mo74054a(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        return decode(byteBuffer.array(), byteBuffer.limit());
    }

    @Nullable
    public Metadata decode(byte[] bArr, int i) {
        int i2;
        ArrayList arrayList = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        Id3Header m74078k = m74078k(parsableByteArray);
        if (m74078k == null) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        if (m74078k.f33926a == 2) {
            i2 = 6;
        } else {
            i2 = 10;
        }
        int i3 = m74078k.f33928c;
        if (m74078k.f33927b) {
            i3 = m74063z(parsableByteArray, m74078k.f33928c);
        }
        parsableByteArray.setLimit(position + i3);
        boolean z = false;
        if (!m74088A(parsableByteArray, m74078k.f33926a, i2, false)) {
            if (m74078k.f33926a == 4 && m74088A(parsableByteArray, 4, i2, true)) {
                z = true;
            } else {
                Log.m72602w("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m74078k.f33926a);
                return null;
            }
        }
        while (parsableByteArray.bytesLeft() >= i2) {
            Id3Frame m74080i = m74080i(m74078k.f33926a, parsableByteArray, z, i2, this.f33925a);
            if (m74080i != null) {
                arrayList.add(m74080i);
            }
        }
        return new Metadata(arrayList);
    }

    public Id3Decoder(@Nullable FramePredicate framePredicate) {
        this.f33925a = framePredicate;
    }
}
