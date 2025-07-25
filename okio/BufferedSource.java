package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: okio.g */
/* loaded from: classes10.dex */
public interface BufferedSource extends Source, ReadableByteChannel {
    @NotNull
    C39200e buffer();

    /* renamed from: c */
    long mo13424c(@NotNull C39208h c39208h) throws IOException;

    /* renamed from: d */
    long mo13423d(@NotNull C39208h c39208h) throws IOException;

    boolean exhausted() throws IOException;

    @NotNull
    InputStream inputStream();

    /* renamed from: j */
    boolean mo13421j(long j, @NotNull C39208h c39208h) throws IOException;

    /* renamed from: o */
    long mo13420o(@NotNull Sink sink) throws IOException;

    @NotNull
    BufferedSource peek();

    /* renamed from: q */
    int mo13419q(@NotNull Options options) throws IOException;

    byte readByte() throws IOException;

    @NotNull
    byte[] readByteArray() throws IOException;

    @NotNull
    byte[] readByteArray(long j) throws IOException;

    @NotNull
    C39208h readByteString() throws IOException;

    @NotNull
    C39208h readByteString(long j) throws IOException;

    long readDecimalLong() throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    long readLongLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    @NotNull
    String readString(@NotNull Charset charset) throws IOException;

    @NotNull
    String readUtf8(long j) throws IOException;

    @NotNull
    String readUtf8LineStrict() throws IOException;

    @NotNull
    String readUtf8LineStrict(long j) throws IOException;

    boolean request(long j) throws IOException;

    void require(long j) throws IOException;

    void skip(long j) throws IOException;

    @NotNull
    /* renamed from: z */
    C39200e mo13418z();
}
