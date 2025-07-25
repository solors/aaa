package okio;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: okio.f */
/* loaded from: classes10.dex */
public interface BufferedSink extends Sink, WritableByteChannel {
    @NotNull
    /* renamed from: E */
    BufferedSink mo13441E(@NotNull C39208h c39208h) throws IOException;

    /* renamed from: H */
    long mo13440H(@NotNull Source source) throws IOException;

    @NotNull
    C39200e buffer();

    @NotNull
    BufferedSink emit() throws IOException;

    @NotNull
    BufferedSink emitCompleteSegments() throws IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    BufferedSink write(@NotNull byte[] bArr) throws IOException;

    @NotNull
    BufferedSink write(@NotNull byte[] bArr, int i, int i2) throws IOException;

    @NotNull
    BufferedSink writeByte(int i) throws IOException;

    @NotNull
    BufferedSink writeDecimalLong(long j) throws IOException;

    @NotNull
    BufferedSink writeHexadecimalUnsignedLong(long j) throws IOException;

    @NotNull
    BufferedSink writeInt(int i) throws IOException;

    @NotNull
    BufferedSink writeShort(int i) throws IOException;

    @NotNull
    BufferedSink writeUtf8(@NotNull String str) throws IOException;

    @NotNull
    BufferedSink writeUtf8(@NotNull String str, int i, int i2) throws IOException;

    @NotNull
    /* renamed from: z */
    C39200e mo13418z();
}
