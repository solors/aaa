package p677g0;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.BufferedSource;
import okio.C39200e;
import okio.C39208h;
import okio.Options;

/* compiled from: JsonReader.java */
/* renamed from: g0.c */
/* loaded from: classes2.dex */
public abstract class AbstractC33178c implements Closeable {

    /* renamed from: i */
    private static final String[] f90639i = new String[128];

    /* renamed from: b */
    int f90640b;

    /* renamed from: c */
    int[] f90641c = new int[32];

    /* renamed from: d */
    String[] f90642d = new String[32];

    /* renamed from: f */
    int[] f90643f = new int[32];

    /* renamed from: g */
    boolean f90644g;

    /* renamed from: h */
    boolean f90645h;

    /* compiled from: JsonReader.java */
    /* renamed from: g0.c$a */
    /* loaded from: classes2.dex */
    public static final class C33179a {

        /* renamed from: a */
        final String[] f90646a;

        /* renamed from: b */
        final Options f90647b;

        private C33179a(String[] strArr, Options options) {
            this.f90646a = strArr;
            this.f90647b = options;
        }

        /* renamed from: a */
        public static C33179a m24520a(String... strArr) {
            try {
                C39208h[] c39208hArr = new C39208h[strArr.length];
                C39200e c39200e = new C39200e();
                for (int i = 0; i < strArr.length; i++) {
                    AbstractC33178c.m24521y(c39200e, strArr[i]);
                    c39200e.readByte();
                    c39208hArr[i] = c39200e.readByteString();
                }
                return new C33179a((String[]) strArr.clone(), Options.m13477i(c39208hArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* compiled from: JsonReader.java */
    /* renamed from: g0.c$b */
    /* loaded from: classes2.dex */
    public enum EnumC33180b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f90639i[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f90639i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: s */
    public static AbstractC33178c m24523s(BufferedSource bufferedSource) {
        return new JsonUtf8Reader(bufferedSource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m24521y(okio.BufferedSink r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = p677g0.AbstractC33178c.f90639i
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.writeUtf8(r8, r4, r3)
        L2e:
            r7.writeUtf8(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.writeUtf8(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p677g0.AbstractC33178c.m24521y(okio.f, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final JsonEncodingException m24525I(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    /* renamed from: b */
    public abstract void mo24504b() throws IOException;

    /* renamed from: e */
    public abstract void mo24503e() throws IOException;

    /* renamed from: f */
    public abstract void mo24502f() throws IOException;

    public final String getPath() {
        return JsonScope.m24519a(this.f90640b, this.f90641c, this.f90642d, this.f90643f);
    }

    /* renamed from: h */
    public abstract void mo24501h() throws IOException;

    /* renamed from: i */
    public abstract boolean mo24500i() throws IOException;

    /* renamed from: k */
    public abstract boolean mo24499k() throws IOException;

    /* renamed from: l */
    public abstract double mo24498l() throws IOException;

    /* renamed from: m */
    public abstract int mo24497m() throws IOException;

    /* renamed from: n */
    public abstract String mo24496n() throws IOException;

    /* renamed from: r */
    public abstract String mo24495r() throws IOException;

    /* renamed from: t */
    public abstract EnumC33180b mo24494t() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final void m24522u(int i) {
        int i2 = this.f90640b;
        int[] iArr = this.f90641c;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f90641c = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f90642d;
                this.f90642d = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f90643f;
                this.f90643f = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f90641c;
        int i3 = this.f90640b;
        this.f90640b = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: v */
    public abstract int mo24493v(C33179a c33179a) throws IOException;

    /* renamed from: w */
    public abstract void mo24492w() throws IOException;

    /* renamed from: x */
    public abstract void mo24491x() throws IOException;
}
