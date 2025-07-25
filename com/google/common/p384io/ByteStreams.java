package com.google.common.p384io;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.ByteStreams */
/* loaded from: classes4.dex */
public final class ByteStreams {

    /* renamed from: a */
    private static final OutputStream f41261a = new OutputStream() { // from class: com.google.common.io.ByteStreams.1
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            Preconditions.checkNotNull(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            Preconditions.checkNotNull(bArr);
            Preconditions.checkPositionIndexes(i, i2 + i, bArr.length);
        }
    };

    private ByteStreams() {
    }

    /* renamed from: a */
    private static byte[] m68248a(Queue<byte[]> queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i) {
            return remove;
        }
        int length = i - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static byte[] m68247b() {
        return new byte[8192];
    }

    /* renamed from: c */
    private static long m68246c(InputStream inputStream, long j) throws IOException {
        int available = inputStream.available();
        if (available == 0) {
            return 0L;
        }
        return inputStream.skip(Math.min(available, j));
    }

    @CanIgnoreReturnValue
    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(outputStream);
        byte[] m68247b = m68247b();
        long j = 0;
        while (true) {
            int read = inputStream.read(m68247b);
            if (read == -1) {
                return j;
            }
            outputStream.write(m68247b, 0, read);
            j += read;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static long m68245d(InputStream inputStream, long j) throws IOException {
        byte[] bArr = null;
        long j2 = 0;
        while (j2 < j) {
            long j3 = j - j2;
            long m68246c = m68246c(inputStream, j3);
            if (m68246c == 0) {
                int min = (int) Math.min(j3, 8192L);
                if (bArr == null) {
                    bArr = new byte[min];
                }
                m68246c = inputStream.read(bArr, 0, min);
                if (m68246c == -1) {
                    break;
                }
            }
            j2 += m68246c;
        }
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static byte[] m68244e(InputStream inputStream, long j) throws IOException {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "expectedSize (%s) must be non-negative", j);
        if (j <= 2147483639) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = i;
            while (i2 > 0) {
                int i3 = i - i2;
                int read = inputStream.read(bArr, i3, i2);
                if (read == -1) {
                    return Arrays.copyOf(bArr, i3);
                }
                i2 -= read;
            }
            int read2 = inputStream.read();
            if (read2 == -1) {
                return bArr;
            }
            ArrayDeque arrayDeque = new ArrayDeque(22);
            arrayDeque.add(bArr);
            arrayDeque.add(new byte[]{(byte) read2});
            return m68243f(inputStream, arrayDeque, i + 1);
        }
        StringBuilder sb2 = new StringBuilder(62);
        sb2.append(j);
        sb2.append(" bytes is too large to fit in a byte array");
        throw new OutOfMemoryError(sb2.toString());
    }

    @CanIgnoreReturnValue
    @Beta
    public static long exhaust(InputStream inputStream) throws IOException {
        byte[] m68247b = m68247b();
        long j = 0;
        while (true) {
            long read = inputStream.read(m68247b);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    /* renamed from: f */
    private static byte[] m68243f(InputStream inputStream, Queue<byte[]> queue, int i) throws IOException {
        int i2;
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return m68248a(queue, i);
                }
                i3 += read;
                i += read;
            }
            if (min < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            min = IntMath.saturatedMultiply(min, i2);
        }
        if (inputStream.read() == -1) {
            return m68248a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    @Beta
    public static InputStream limit(InputStream inputStream, long j) {
        return new LimitedInputStream(inputStream, j);
    }

    @Beta
    public static ByteArrayDataInput newDataInput(byte[] bArr) {
        return newDataInput(new ByteArrayInputStream(bArr));
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput() {
        return newDataOutput(new ByteArrayOutputStream());
    }

    @Beta
    public static OutputStream nullOutputStream() {
        return f41261a;
    }

    @CanIgnoreReturnValue
    @Beta
    public static int read(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(bArr);
        int i3 = 0;
        if (i2 >= 0) {
            Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            return i3;
        }
        throw new IndexOutOfBoundsException(String.format("len (%s) cannot be negative", Integer.valueOf(i2)));
    }

    @Beta
    @CanIgnoreReturnValue
    @ParametricNullness
    public static <T> T readBytes(InputStream inputStream, ByteProcessor<T> byteProcessor) throws IOException {
        int read;
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(byteProcessor);
        byte[] m68247b = m68247b();
        do {
            read = inputStream.read(m68247b);
            if (read == -1) {
                break;
            }
        } while (byteProcessor.processBytes(m68247b, 0, read));
        return byteProcessor.getResult();
    }

    @Beta
    public static void readFully(InputStream inputStream, byte[] bArr) throws IOException {
        readFully(inputStream, bArr, 0, bArr.length);
    }

    @Beta
    public static void skipFully(InputStream inputStream, long j) throws IOException {
        long m68245d = m68245d(inputStream, j);
        if (m68245d >= j) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("reached end of stream after skipping ");
        sb2.append(m68245d);
        sb2.append(" bytes; ");
        sb2.append(j);
        sb2.append(" bytes expected");
        throw new EOFException(sb2.toString());
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        return m68243f(inputStream, new ArrayDeque(20), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.io.ByteStreams$ByteArrayDataInputStream */
    /* loaded from: classes4.dex */
    public static class ByteArrayDataInputStream implements ByteArrayDataInput {

        /* renamed from: b */
        final DataInput f41262b;

        ByteArrayDataInputStream(ByteArrayInputStream byteArrayInputStream) {
            this.f41262b = new DataInputStream(byteArrayInputStream);
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public boolean readBoolean() {
            try {
                return this.f41262b.readBoolean();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public byte readByte() {
            try {
                return this.f41262b.readByte();
            } catch (EOFException e) {
                throw new IllegalStateException(e);
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public char readChar() {
            try {
                return this.f41262b.readChar();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public double readDouble() {
            try {
                return this.f41262b.readDouble();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public float readFloat() {
            try {
                return this.f41262b.readFloat();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr) {
            try {
                this.f41262b.readFully(bArr);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public int readInt() {
            try {
                return this.f41262b.readInt();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public String readLine() {
            try {
                return this.f41262b.readLine();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public long readLong() {
            try {
                return this.f41262b.readLong();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public short readShort() {
            try {
                return this.f41262b.readShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public String readUTF() {
            try {
                return this.f41262b.readUTF();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedByte() {
            try {
                return this.f41262b.readUnsignedByte();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public int readUnsignedShort() {
            try {
                return this.f41262b.readUnsignedShort();
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public int skipBytes(int i) {
            try {
                return this.f41262b.skipBytes(i);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataInput, java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) {
            try {
                this.f41262b.readFully(bArr, i, i2);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.io.ByteStreams$ByteArrayDataOutputStream */
    /* loaded from: classes4.dex */
    public static class ByteArrayDataOutputStream implements ByteArrayDataOutput {

        /* renamed from: b */
        final DataOutput f41263b;

        /* renamed from: c */
        final ByteArrayOutputStream f41264c;

        ByteArrayDataOutputStream(ByteArrayOutputStream byteArrayOutputStream) {
            this.f41264c = byteArrayOutputStream;
            this.f41263b = new DataOutputStream(byteArrayOutputStream);
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput
        public byte[] toByteArray() {
            return this.f41264c.toByteArray();
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void write(int i) {
            try {
                this.f41263b.write(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBoolean(boolean z) {
            try {
                this.f41263b.writeBoolean(z);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void writeByte(int i) {
            try {
                this.f41263b.writeByte(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void writeBytes(String str) {
            try {
                this.f41263b.writeBytes(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChar(int i) {
            try {
                this.f41263b.writeChar(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void writeChars(String str) {
            try {
                this.f41263b.writeChars(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void writeDouble(double d) {
            try {
                this.f41263b.writeDouble(d);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void writeFloat(float f) {
            try {
                this.f41263b.writeFloat(f);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void writeInt(int i) {
            try {
                this.f41263b.writeInt(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void writeLong(long j) {
            try {
                this.f41263b.writeLong(j);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void writeShort(int i) {
            try {
                this.f41263b.writeShort(i);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void writeUTF(String str) {
            try {
                this.f41263b.writeUTF(str);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr) {
            try {
                this.f41263b.write(bArr);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.common.p384io.ByteArrayDataOutput, java.io.DataOutput
        public void write(byte[] bArr, int i, int i2) {
            try {
                this.f41263b.write(bArr, i, i2);
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    @Beta
    public static ByteArrayDataInput newDataInput(byte[] bArr, int i) {
        Preconditions.checkPositionIndex(i, bArr.length);
        return newDataInput(new ByteArrayInputStream(bArr, i, bArr.length - i));
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput(int i) {
        if (i >= 0) {
            return newDataOutput(new ByteArrayOutputStream(i));
        }
        throw new IllegalArgumentException(String.format("Invalid size: %s", Integer.valueOf(i)));
    }

    @Beta
    public static void readFully(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        int read = read(inputStream, bArr, i, i2);
        if (read == i2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(81);
        sb2.append("reached end of stream after reading ");
        sb2.append(read);
        sb2.append(" bytes; ");
        sb2.append(i2);
        sb2.append(" bytes expected");
        throw new EOFException(sb2.toString());
    }

    /* renamed from: com.google.common.io.ByteStreams$LimitedInputStream */
    /* loaded from: classes4.dex */
    private static final class LimitedInputStream extends FilterInputStream {

        /* renamed from: b */
        private long f41265b;

        /* renamed from: c */
        private long f41266c;

        LimitedInputStream(InputStream inputStream, long j) {
            super(inputStream);
            boolean z;
            this.f41266c = -1L;
            Preconditions.checkNotNull(inputStream);
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "limit must be non-negative");
            this.f41265b = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() throws IOException {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f41265b);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.f41266c = this.f41265b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            if (this.f41265b == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f41265b--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f41266c != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f41265b = this.f41266c;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f41265b));
            this.f41265b -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            long j = this.f41265b;
            if (j == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
            if (read != -1) {
                this.f41265b -= read;
            }
            return read;
        }
    }

    @Beta
    public static ByteArrayDataInput newDataInput(ByteArrayInputStream byteArrayInputStream) {
        return new ByteArrayDataInputStream((ByteArrayInputStream) Preconditions.checkNotNull(byteArrayInputStream));
    }

    @Beta
    public static ByteArrayDataOutput newDataOutput(ByteArrayOutputStream byteArrayOutputStream) {
        return new ByteArrayDataOutputStream((ByteArrayOutputStream) Preconditions.checkNotNull(byteArrayOutputStream));
    }

    @CanIgnoreReturnValue
    public static long copy(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
        Preconditions.checkNotNull(readableByteChannel);
        Preconditions.checkNotNull(writableByteChannel);
        long j = 0;
        if (readableByteChannel instanceof FileChannel) {
            FileChannel fileChannel = (FileChannel) readableByteChannel;
            long position = fileChannel.position();
            long j2 = position;
            while (true) {
                long transferTo = fileChannel.transferTo(j2, 524288L, writableByteChannel);
                j2 += transferTo;
                fileChannel.position(j2);
                if (transferTo <= 0 && j2 >= fileChannel.size()) {
                    return j2 - position;
                }
            }
        } else {
            ByteBuffer wrap = ByteBuffer.wrap(m68247b());
            while (readableByteChannel.read(wrap) != -1) {
                Java8Compatibility.m68220b(wrap);
                while (wrap.hasRemaining()) {
                    j += writableByteChannel.write(wrap);
                }
                Java8Compatibility.m68221a(wrap);
            }
            return j;
        }
    }
}
