package androidx.media3.common.util;

import androidx.annotation.Nullable;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Chars;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};

    /* renamed from: LF */
    private static final char[] f829LF = {'\n'};
    private static final ImmutableSet<Charset> SUPPORTED_CHARSETS_FOR_READLINE = ImmutableSet.m69326of(Charsets.US_ASCII, Charsets.UTF_8, Charsets.UTF_16, Charsets.UTF_16BE, Charsets.UTF_16LE);
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = Util.EMPTY_BYTE_ARRAY;
    }

    private int findNextLineTerminator(Charset charset) {
        int i;
        if (!charset.equals(Charsets.UTF_8) && !charset.equals(Charsets.US_ASCII)) {
            if (!charset.equals(Charsets.UTF_16) && !charset.equals(Charsets.UTF_16LE) && !charset.equals(Charsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        } else {
            i = 1;
        }
        int i2 = this.position;
        while (true) {
            int i3 = this.limit;
            if (i2 < i3 - (i - 1)) {
                if ((charset.equals(Charsets.UTF_8) || charset.equals(Charsets.US_ASCII)) && Util.isLinebreak(this.data[i2])) {
                    return i2;
                }
                if (charset.equals(Charsets.UTF_16) || charset.equals(Charsets.UTF_16BE)) {
                    byte[] bArr = this.data;
                    if (bArr[i2] == 0 && Util.isLinebreak(bArr[i2 + 1])) {
                        return i2;
                    }
                }
                if (charset.equals(Charsets.UTF_16LE)) {
                    byte[] bArr2 = this.data;
                    if (bArr2[i2 + 1] == 0 && Util.isLinebreak(bArr2[i2])) {
                        return i2;
                    }
                }
                i2 += i;
            } else {
                return i3;
            }
        }
    }

    private int peekCharacterAndSize(Charset charset) {
        byte checkedCast;
        char fromBytes;
        int i = 1;
        if ((charset.equals(Charsets.UTF_8) || charset.equals(Charsets.US_ASCII)) && bytesLeft() >= 1) {
            checkedCast = (byte) Chars.checkedCast(UnsignedBytes.toInt(this.data[this.position]));
        } else {
            if ((charset.equals(Charsets.UTF_16) || charset.equals(Charsets.UTF_16BE)) && bytesLeft() >= 2) {
                byte[] bArr = this.data;
                int i2 = this.position;
                fromBytes = Chars.fromBytes(bArr[i2], bArr[i2 + 1]);
            } else if (charset.equals(Charsets.UTF_16LE) && bytesLeft() >= 2) {
                byte[] bArr2 = this.data;
                int i3 = this.position;
                fromBytes = Chars.fromBytes(bArr2[i3 + 1], bArr2[i3]);
            } else {
                return 0;
            }
            checkedCast = (byte) fromBytes;
            i = 2;
        }
        return (Chars.checkedCast(checkedCast) << 16) + i;
    }

    private char readCharacterIfInList(Charset charset, char[] cArr) {
        int peekCharacterAndSize = peekCharacterAndSize(charset);
        if (peekCharacterAndSize != 0) {
            char c = (char) (peekCharacterAndSize >> 16);
            if (Chars.contains(cArr, c)) {
                this.position += peekCharacterAndSize & 65535;
                return c;
            }
            return (char) 0;
        }
        return (char) 0;
    }

    private void skipLineTerminator(Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, f829LF);
        }
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int capacity() {
        return this.data.length;
    }

    public void ensureCapacity(int i) {
        if (i > capacity()) {
            this.data = Arrays.copyOf(this.data, i);
        }
    }

    public byte[] getData() {
        return this.data;
    }

    public int getPosition() {
        return this.position;
    }

    public int limit() {
        return this.limit;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i = this.position;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public void readBytes(ParsableBitArray parsableBitArray, int i) {
        readBytes(parsableBitArray.data, 0, i);
        parsableBitArray.setPosition(0);
    }

    @Nullable
    public String readDelimiterTerminatedString(char c) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != c) {
            i++;
        }
        byte[] bArr = this.data;
        int i2 = this.position;
        String fromUtf8Bytes = Util.fromUtf8Bytes(bArr, i2, i - i2);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return fromUtf8Bytes;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.position = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.position = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    @Nullable
    public String readLine() {
        return readLine(Charsets.UTF_8);
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        this.position = i5 + 1;
        return ((bArr[i5] & 255) << 24) | i6;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        this.position = i3 + 1;
        return ((bArr[i3] & 255) << 16) | i4;
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.position = i8 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 40) | ((bArr[i7] & 255) << 48) | ((bArr[i8] & 255) << 56);
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.position = i4 + 1;
        return (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 24);
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        this.position = i3 + 1;
        return ((bArr[i3] & 255) << 16) | i4;
    }

    public int readLittleEndianUnsignedIntToInt() {
        int readLittleEndianInt = readLittleEndianInt();
        if (readLittleEndianInt >= 0) {
            return readLittleEndianInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readLittleEndianInt);
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.position = i8 + 1;
        return ((bArr[i] & 255) << 56) | ((bArr[i2] & 255) << 48) | ((bArr[i3] & 255) << 40) | ((bArr[i4] & 255) << 32) | ((bArr[i5] & 255) << 24) | ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
    }

    public String readNullTerminatedString(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.position;
        int i3 = (i2 + i) - 1;
        String fromUtf8Bytes = Util.fromUtf8Bytes(this.data, i2, (i3 >= this.limit || this.data[i3] != 0) ? i : i - 1);
        this.position += i;
        return fromUtf8Bytes;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public String readString(int i) {
        return readString(i, Charsets.UTF_8);
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.position = i2 + 1 + 2;
        return i3;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.position = i4 + 1;
        return ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8) | (bArr[i4] & 255);
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.position = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    public int readUnsignedIntToInt() {
        int readInt = readInt();
        if (readInt >= 0) {
            return readInt;
        }
        throw new IllegalStateException("Top bit not zero: " + readInt);
    }

    public long readUnsignedLongToLong() {
        long readLong = readLong();
        if (readLong >= 0) {
            return readLong;
        }
        throw new IllegalStateException("Top bit not zero: " + readLong);
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        this.position = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public long readUtf8EncodedLong() {
        int i;
        int i2;
        byte b;
        int i3;
        long j = this.data[this.position];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (((1 << i4) & j) != 0) {
                i4--;
            } else if (i4 < 6) {
                j &= i3 - 1;
                i2 = 7 - i4;
            } else if (i4 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            for (i = 1; i < i2; i++) {
                if ((this.data[this.position + i] & 192) == 128) {
                    j = (j << 6) | (b & 63);
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.position += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    @Nullable
    public Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i = this.position;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.position = i + 3;
                return Charsets.UTF_8;
            }
        }
        if (bytesLeft() >= 2) {
            byte[] bArr2 = this.data;
            int i2 = this.position;
            byte b = bArr2[i2];
            if (b == -2 && bArr2[i2 + 1] == -1) {
                this.position = i2 + 2;
                return Charsets.UTF_16BE;
            } else if (b == -1 && bArr2[i2 + 1] == -2) {
                this.position = i2 + 2;
                return Charsets.UTF_16LE;
            } else {
                return null;
            }
        }
        return null;
    }

    public void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.data, i);
    }

    public void setLimit(int i) {
        boolean z;
        if (i >= 0 && i <= this.data.length) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.limit = i;
    }

    public void setPosition(int i) {
        boolean z;
        if (i >= 0 && i <= this.limit) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.position = i;
    }

    public void skipBytes(int i) {
        setPosition(this.position + i);
    }

    public char peekChar(Charset charset) {
        boolean contains = SUPPORTED_CHARSETS_FOR_READLINE.contains(charset);
        Assertions.checkArgument(contains, "Unsupported charset: " + charset);
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    @Nullable
    public String readLine(Charset charset) {
        boolean contains = SUPPORTED_CHARSETS_FOR_READLINE.contains(charset);
        Assertions.checkArgument(contains, "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(Charsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        String readString = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return readString;
        }
        skipLineTerminator(charset);
        return readString;
    }

    public String readString(int i, Charset charset) {
        String str = new String(this.data, this.position, i, charset);
        this.position += i;
        return str;
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public void readBytes(ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.data, this.position, i);
        this.position += i;
    }

    @Nullable
    public String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }
}
