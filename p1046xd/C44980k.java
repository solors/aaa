package p1046xd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileReadWrite.kt */
@Metadata
/* renamed from: xd.k */
/* loaded from: classes7.dex */
public class C44980k extends FilePathComponents {

    /* compiled from: FileReadWrite.kt */
    @Metadata
    /* renamed from: xd.k$a */
    /* loaded from: classes7.dex */
    public static final class C44981a extends Lambda implements Function1<String, Unit> {

        /* renamed from: g */
        final /* synthetic */ ArrayList<String> f118337g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44981a(ArrayList<String> arrayList) {
            super(1);
            this.f118337g = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f99208a;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f118337g.add(it);
        }
    }

    /* renamed from: c */
    public static void m1190c(@NotNull File file, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.f99208a;
            Closeable.m1220a(fileOutputStream, null);
        } finally {
        }
    }

    /* renamed from: d */
    public static final void m1189d(@NotNull File file, @NotNull Charset charset, @NotNull Function1<? super String, Unit> action) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        C44986p.m1167c(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    @NotNull
    /* renamed from: e */
    public static byte[] m1188e(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                    Intrinsics.checkNotNullExpressionValue(bArr, "copyOf(...)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        FileReadWrite fileReadWrite = new FileReadWrite(8193);
                        fileReadWrite.write(read2);
                        IOStreams.m1222b(fileInputStream, fileReadWrite, 0, 2, null);
                        int size = fileReadWrite.size() + i;
                        if (size >= 0) {
                            byte[] m1217a = fileReadWrite.m1217a();
                            byte[] copyOf = Arrays.copyOf(bArr, size);
                            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                            bArr = _ArraysJvm.m17398g(m1217a, copyOf, i, 0, fileReadWrite.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                Closeable.m1220a(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Closeable.m1220a(fileInputStream, th);
                throw th2;
            }
        }
    }

    @NotNull
    /* renamed from: f */
    public static final List<String> m1187f(@NotNull File file, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        ArrayList arrayList = new ArrayList();
        m1189d(file, charset, new C44981a(arrayList));
        return arrayList;
    }

    /* renamed from: g */
    public static /* synthetic */ List m1186g(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        return m1187f(file, charset);
    }

    @NotNull
    /* renamed from: h */
    public static String m1185h(@NotNull File file, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String m1163g = C44986p.m1163g(inputStreamReader);
            Closeable.m1220a(inputStreamReader, null);
            return m1163g;
        } finally {
        }
    }

    /* renamed from: i */
    public static /* synthetic */ String m1184i(File file, Charset charset, int i, Object obj) {
        String m1185h;
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        m1185h = m1185h(file, charset);
        return m1185h;
    }

    /* renamed from: j */
    public static void m1183j(@NotNull File file, @NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.f99208a;
            Closeable.m1220a(fileOutputStream, null);
        } finally {
        }
    }

    /* renamed from: k */
    public static void m1182k(@NotNull File file, @NotNull String text, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        m1183j(file, bytes);
    }

    /* renamed from: l */
    public static /* synthetic */ void m1181l(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        m1182k(file, str, charset);
    }
}
