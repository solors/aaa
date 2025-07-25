package com.maticoo.sdk.utils;

import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class IOUtil {
    private IOUtil() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                DeveloperLog.LogD("IOUtil", e);
                CrashUtil.getSingleton().reportSDKException(e);
            }
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    public static void flushQuietly(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception e) {
                DeveloperLog.LogD("IOUtil", e);
                CrashUtil.getSingleton().reportSDKException(e);
            }
        }
    }

    public static FileInputStream getFileInputStream(File file) throws FileNotFoundException {
        if (file != null && file.exists()) {
            return new FileInputStream(file);
        }
        return null;
    }

    public static List<String> readLines(InputStream inputStream, String str) throws IOException {
        return readLines(inputStream, Charset.forName(str));
    }

    public static BufferedInputStream toBufferedInputStream(InputStream inputStream) {
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream);
    }

    public static BufferedOutputStream toBufferedOutputStream(OutputStream outputStream) {
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream);
    }

    public static BufferedReader toBufferedReader(Reader reader) {
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader);
    }

    public static BufferedWriter toBufferedWriter(Writer writer) {
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer);
    }

    public static byte[] toByteArray(CharSequence charSequence) {
        return charSequence == null ? new byte[0] : charSequence.toString().getBytes(Charset.forName("UTF-8"));
    }

    public static char[] toCharArray(CharSequence charSequence) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        write(charArrayWriter, charSequence);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(CharSequence charSequence) {
        return new ByteArrayInputStream(charSequence.toString().getBytes(Charset.forName("UTF-8")));
    }

    public static InputStreamReader toInputStreamReader(InputStream inputStream) {
        return new InputStreamReader(inputStream, Charset.forName("UTF-8"));
    }

    public static String toString(InputStream inputStream) throws IOException {
        return new String(toByteArray(inputStream), Charset.forName("UTF-8"));
    }

    public static void write(OutputStream outputStream, byte[] bArr) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
            outputStream.flush();
        }
    }

    public static void writeToFile(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        copy(inputStream, fileOutputStream);
        closeQuietly(fileOutputStream);
    }

    public static List<String> readLines(InputStream inputStream, Charset charset) throws IOException {
        return readLines(new InputStreamReader(inputStream, charset));
    }

    public static byte[] toByteArray(CharSequence charSequence, String str) {
        return toByteArray(charSequence, Charset.forName(str));
    }

    public static InputStream toInputStream(CharSequence charSequence, String str) {
        return toInputStream(charSequence, Charset.forName(str));
    }

    public static InputStreamReader toInputStreamReader(InputStream inputStream, String str) throws UnsupportedEncodingException {
        return new InputStreamReader(inputStream, str);
    }

    public static String toString(InputStream inputStream, String str) throws IOException {
        return new String(toByteArray(inputStream), str);
    }

    public static byte[] toByteArray(CharSequence charSequence, Charset charset) {
        return charSequence == null ? new byte[0] : charSequence.toString().getBytes(charset);
    }

    public static InputStream toInputStream(CharSequence charSequence, Charset charset) {
        return new ByteArrayInputStream(charSequence.toString().getBytes(charset));
    }

    public static String toString(InputStream inputStream, Charset charset) throws IOException {
        return new String(toByteArray(inputStream), charset);
    }

    public static void write(Writer writer, byte[] bArr) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr, Charset.forName("UTF-8")));
            writer.flush();
        }
    }

    public static List<String> readLines(InputStream inputStream) throws IOException {
        return readLines(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        write(inputStream, byteArrayOutputStream);
        byteArrayOutputStream.close();
        inputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static char[] toCharArray(InputStream inputStream) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        write(inputStream, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static String toString(Reader reader) throws IOException {
        return new String(toByteArray(reader), Charset.forName("UTF-8"));
    }

    public static void writeToFile(byte[] bArr, File file) throws IOException {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                closeQuietly(fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    closeQuietly(fileOutputStream);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String toString(Reader reader, String str) throws IOException {
        return new String(toByteArray(reader), str);
    }

    public static void write(Writer writer, byte[] bArr, String str) throws IOException {
        write(writer, bArr, Charset.forName(str));
    }

    public static List<String> readLines(Reader reader) throws IOException {
        BufferedReader bufferedReader = toBufferedReader(reader);
        ArrayList arrayList = new ArrayList();
        for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
            arrayList.add(readLine);
        }
        return arrayList;
    }

    public static String toString(Reader reader, Charset charset) throws IOException {
        return new String(toByteArray(reader), charset);
    }

    public static void write(Writer writer, byte[] bArr, Charset charset) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr, charset));
            writer.flush();
        }
    }

    public static char[] toCharArray(InputStream inputStream, String str) throws IOException {
        return toCharArray(inputStream, Charset.forName(str));
    }

    public static String toString(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    public static char[] toCharArray(InputStream inputStream, Charset charset) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        write(inputStream, charArrayWriter, charset);
        return charArrayWriter.toCharArray();
    }

    public static String toString(byte[] bArr, String str) {
        return toString(bArr, Charset.forName(str));
    }

    public static void write(Writer writer, char[] cArr) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
            writer.flush();
        }
    }

    public static byte[] toByteArray(InputStream inputStream, int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Size must be equal or greater than zero: " + i);
        }
        int i2 = 0;
        if (i == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i];
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read == -1) {
                break;
            }
            i2 += read;
        }
        if (i2 == i) {
            return bArr;
        }
        throw new IOException("Unexpected byte count size. current: " + i2 + ", excepted: " + i);
    }

    public static String toString(byte[] bArr, Charset charset) {
        return new String(bArr, charset);
    }

    public static void write(OutputStream outputStream, char[] cArr) throws IOException {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes(Charset.forName("UTF-8")));
            outputStream.flush();
        }
    }

    public static char[] toCharArray(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        write(reader, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static void write(OutputStream outputStream, char[] cArr, String str) throws IOException {
        write(outputStream, cArr, Charset.forName(str));
    }

    public static byte[] toByteArray(Reader reader) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        write(reader, byteArrayOutputStream);
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static void write(OutputStream outputStream, char[] cArr, Charset charset) throws IOException {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes(charset));
            outputStream.flush();
        }
    }

    public static void write(Writer writer, CharSequence charSequence) throws IOException {
        if (charSequence != null) {
            writer.write(charSequence.toString());
            writer.flush();
        }
    }

    public static byte[] toByteArray(Reader reader, String str) throws IOException {
        return toByteArray(reader, Charset.forName(str));
    }

    public static void write(OutputStream outputStream, CharSequence charSequence) throws IOException {
        if (charSequence != null) {
            outputStream.write(charSequence.toString().getBytes(Charset.forName("UTF-8")));
            outputStream.flush();
        }
    }

    public static byte[] toByteArray(Reader reader, Charset charset) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        write(reader, byteArrayOutputStream, charset);
        byteArrayOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static void write(OutputStream outputStream, CharSequence charSequence, String str) throws IOException {
        write(outputStream, charSequence, Charset.forName(str));
    }

    public static void write(OutputStream outputStream, CharSequence charSequence, Charset charset) throws IOException {
        if (charSequence != null) {
            outputStream.write(charSequence.toString().getBytes(charset));
            outputStream.flush();
        }
    }

    public static void write(Reader reader, OutputStream outputStream) throws IOException {
        write(reader, new OutputStreamWriter(outputStream, Charset.forName("UTF-8")));
    }

    public static void write(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
            outputStream.flush();
        }
    }

    public static void write(InputStream inputStream, Writer writer) throws IOException {
        write(new InputStreamReader(inputStream, Charset.forName("UTF-8")), writer);
    }

    public static void write(Reader reader, OutputStream outputStream, String str) throws IOException {
        write(reader, outputStream, Charset.forName(str));
    }

    public static void write(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
        write(reader, new OutputStreamWriter(outputStream, charset));
    }

    public static void write(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        write(inputStream, outputStream, Charset.forName(str));
    }

    public static void write(InputStream inputStream, OutputStream outputStream, Charset charset) throws IOException {
        write(new InputStreamReader(inputStream, charset), outputStream);
    }

    public static void write(InputStream inputStream, Writer writer, String str) throws IOException {
        write(inputStream, writer, Charset.forName(str));
    }

    public static void write(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        write(new InputStreamReader(inputStream, charset), writer);
    }

    public static void write(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[4096];
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return;
            }
            writer.write(cArr, 0, read);
            writer.flush();
        }
    }
}
