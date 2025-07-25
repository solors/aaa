package p1046xd;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReadWrite.kt */
@Metadata
/* renamed from: xd.p */
/* loaded from: classes7.dex */
public final class C44986p {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReadWrite.kt */
    @Metadata
    /* renamed from: xd.p$a */
    /* loaded from: classes7.dex */
    public static final class C44987a extends Lambda implements Function1<String, Unit> {

        /* renamed from: g */
        final /* synthetic */ ArrayList<String> f118342g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C44987a(ArrayList<String> arrayList) {
            super(1);
            this.f118342g = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.f99208a;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f118342g.add(it);
        }
    }

    /* renamed from: a */
    public static final long m1169a(@NotNull Reader reader, @NotNull Writer out, int i) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m1168b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m1169a(reader, writer, i);
    }

    /* renamed from: c */
    public static final void m1167c(@NotNull Reader reader, @NotNull Function1<? super String, Unit> action) {
        BufferedReader bufferedReader;
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (reader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) reader;
        } else {
            bufferedReader = new BufferedReader(reader, 8192);
        }
        try {
            for (String str : m1166d(bufferedReader)) {
                action.invoke(str);
            }
            Unit unit = Unit.f99208a;
            Closeable.m1220a(bufferedReader, null);
        } finally {
        }
    }

    @NotNull
    /* renamed from: d */
    public static final Sequence<String> m1166d(@NotNull BufferedReader bufferedReader) {
        Sequence<String> m16840d;
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        m16840d = C37653n.m16840d(new ReadWrite(bufferedReader));
        return m16840d;
    }

    @NotNull
    /* renamed from: e */
    public static final byte[] m1165e(@NotNull URL url) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        InputStream openStream = url.openStream();
        try {
            Intrinsics.m17074g(openStream);
            byte[] m1221c = IOStreams.m1221c(openStream);
            Closeable.m1220a(openStream, null);
            return m1221c;
        } finally {
        }
    }

    @NotNull
    /* renamed from: f */
    public static final List<String> m1164f(@NotNull Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        m1167c(reader, new C44987a(arrayList));
        return arrayList;
    }

    @NotNull
    /* renamed from: g */
    public static final String m1163g(@NotNull Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m1168b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
