package com.p551my.tracker.obfuscated;

import android.location.Location;
import com.maticoo.sdk.utils.request.network.Headers;
import com.p551my.tracker.MyTracker;
import com.p551my.tracker.obfuscated.AbstractC26465z;
import com.p551my.tracker.obfuscated.C26319f;
import com.p552ot.pubsub.p553a.C26484a;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.tracker.obfuscated.s0 */
/* loaded from: classes7.dex */
public final class C26405s0 implements AbstractC26465z.InterfaceC26466a {

    /* renamed from: a */
    final C26406a f68843a;

    /* renamed from: b */
    final C26425r f68844b;

    /* renamed from: c */
    final C26417k f68845c;

    /* renamed from: d */
    final C26420m f68846d;

    /* renamed from: e */
    final C26421n f68847e;

    /* renamed from: f */
    final C26424q f68848f;

    /* renamed from: g */
    final C26419l f68849g;

    /* renamed from: h */
    final List<AbstractC26423p> f68850h;

    /* renamed from: i */
    final ByteArrayOutputStream f68851i;

    /* renamed from: j */
    final ByteArrayOutputStream f68852j;

    /* renamed from: k */
    String f68853k;

    /* renamed from: l */
    byte[] f68854l;

    /* renamed from: m */
    Map<String, String> f68855m;

    /* renamed from: n */
    long f68856n;

    /* renamed from: o */
    long f68857o;

    /* renamed from: p */
    int f68858p;

    /* renamed from: com.my.tracker.obfuscated.s0$a */
    /* loaded from: classes7.dex */
    static final class C26406a extends AbstractC26423p {

        /* renamed from: b */
        final C26407a f68859b;

        /* renamed from: c */
        String f68860c;

        /* renamed from: d */
        String f68861d;

        /* renamed from: e */
        String f68862e;

        /* renamed from: f */
        String f68863f;

        /* renamed from: com.my.tracker.obfuscated.s0$a$a */
        /* loaded from: classes7.dex */
        static final class C26407a {

            /* renamed from: a */
            String f68864a;

            /* renamed from: b */
            long f68865b = -1;

            C26407a() {
            }

            /* renamed from: a */
            void m41638a(ByteArrayOutputStream byteArrayOutputStream) {
                C26439u0.m41595a(1, this.f68864a, byteArrayOutputStream);
                long j = this.f68865b;
                if (j != -1) {
                    C26439u0.m41598a(2, j, (OutputStream) byteArrayOutputStream);
                }
            }
        }

        C26406a() {
            super(21);
            this.f68859b = new C26407a();
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            this.f68859b.m41638a(byteArrayOutputStream2);
            if (byteArrayOutputStream2.size() > 0) {
                C26439u0.m41597a(31, byteArrayOutputStream2, byteArrayOutputStream);
            }
            C26439u0.m41595a(1, this.f68860c, byteArrayOutputStream);
            C26439u0.m41595a(2, this.f68861d, byteArrayOutputStream);
            C26439u0.m41595a(3, this.f68862e, byteArrayOutputStream);
            C26439u0.m41595a(4, this.f68863f, byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$b */
    /* loaded from: classes7.dex */
    public static final class C26408b extends AbstractC26415i {

        /* renamed from: b */
        final int f68866b;

        /* renamed from: c */
        final int f68867c;

        /* renamed from: d */
        final int f68868d;

        /* renamed from: e */
        final int f68869e;

        /* renamed from: f */
        final int f68870f;

        /* renamed from: g */
        final int f68871g;

        /* renamed from: h */
        final int f68872h;

        /* renamed from: i */
        final int f68873i;

        /* renamed from: j */
        final int f68874j;

        /* renamed from: k */
        final int f68875k;

        /* renamed from: l */
        final int f68876l;

        /* renamed from: m */
        final int f68877m;

        C26408b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
            super(32);
            this.f68866b = i;
            this.f68867c = i2;
            this.f68868d = i3;
            this.f68869e = i4;
            this.f68870f = i5;
            this.f68871g = i6;
            this.f68872h = i7;
            this.f68873i = i8;
            this.f68874j = i9;
            this.f68875k = i10;
            this.f68876l = i11;
            this.f68877m = i12;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            AbstractC26415i.m41637a(1, this.f68866b, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(2, this.f68867c, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(3, this.f68868d, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(4, this.f68869e, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(5, this.f68870f, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(6, this.f68871g, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(7, this.f68872h, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(8, this.f68873i, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(9, this.f68874j, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(10, this.f68875k, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(11, this.f68876l, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(12, this.f68877m, (OutputStream) byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$c */
    /* loaded from: classes7.dex */
    public static final class C26409c extends AbstractC26411e {

        /* renamed from: g */
        final int f68878g;

        /* renamed from: h */
        final int f68879h;

        /* renamed from: i */
        final int f68880i;

        /* renamed from: j */
        final int f68881j;

        /* renamed from: k */
        final int f68882k;

        C26409c(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            super(33, str, str2, i5, i6, i7);
            this.f68878g = i;
            this.f68879h = i2;
            this.f68880i = i3;
            this.f68881j = i4;
            this.f68882k = i8;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26411e, com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo41633a(byteArrayOutputStream, byteArrayOutputStream2);
            AbstractC26415i.m41637a(3, this.f68878g, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(4, this.f68879h, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(5, this.f68880i, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(6, this.f68881j, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(10, this.f68882k, (OutputStream) byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$d */
    /* loaded from: classes7.dex */
    public static final class C26410d extends AbstractC26411e {

        /* renamed from: g */
        final int f68883g;

        /* renamed from: h */
        final int f68884h;

        /* renamed from: i */
        final int f68885i;

        /* renamed from: j */
        final int f68886j;

        /* renamed from: k */
        final int f68887k;

        C26410d(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            super(34, str, str2, i5, i6, i7);
            this.f68883g = i;
            this.f68884h = i2;
            this.f68885i = i3;
            this.f68886j = i4;
            this.f68887k = i8;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26411e, com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo41633a(byteArrayOutputStream, byteArrayOutputStream2);
            AbstractC26415i.m41637a(3, this.f68883g, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(4, this.f68884h, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(5, this.f68885i, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(6, this.f68886j, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(10, this.f68887k, (OutputStream) byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.s0$e */
    /* loaded from: classes7.dex */
    static abstract class AbstractC26411e extends AbstractC26415i {

        /* renamed from: b */
        final String f68888b;

        /* renamed from: c */
        final String f68889c;

        /* renamed from: d */
        final int f68890d;

        /* renamed from: e */
        final int f68891e;

        /* renamed from: f */
        final int f68892f;

        protected AbstractC26411e(int i, String str, String str2, int i2, int i3, int i4) {
            super(i);
            this.f68888b = str;
            this.f68889c = str2;
            this.f68890d = i2;
            this.f68891e = i3;
            this.f68892f = i4;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C26439u0.m41595a(1, this.f68888b, byteArrayOutputStream);
            C26439u0.m41595a(2, this.f68889c, byteArrayOutputStream);
            AbstractC26415i.m41637a(7, this.f68890d, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(8, this.f68891e, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(9, this.f68892f, (OutputStream) byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$f */
    /* loaded from: classes7.dex */
    public static final class C26412f extends AbstractC26411e {

        /* renamed from: g */
        final long f68893g;

        /* renamed from: h */
        final int f68894h;

        /* renamed from: i */
        final int f68895i;

        /* renamed from: j */
        final int f68896j;

        C26412f(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6) {
            super(37, str, str2, i4, i5, i6);
            this.f68893g = j;
            this.f68894h = i;
            this.f68895i = i2;
            this.f68896j = i3;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26411e, com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo41633a(byteArrayOutputStream, byteArrayOutputStream2);
            AbstractC26415i.m41636a(3, this.f68893g, byteArrayOutputStream);
            AbstractC26415i.m41637a(4, this.f68894h, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(5, this.f68895i, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(6, this.f68896j, (OutputStream) byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$g */
    /* loaded from: classes7.dex */
    public static final class C26413g extends AbstractC26411e {

        /* renamed from: g */
        final int f68897g;

        /* renamed from: h */
        final int f68898h;

        /* renamed from: i */
        final int f68899i;

        /* renamed from: j */
        final int f68900j;

        C26413g(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            super(36, str, str2, i5, i6, i7);
            this.f68897g = i;
            this.f68898h = i2;
            this.f68899i = i3;
            this.f68900j = i4;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26411e, com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo41633a(byteArrayOutputStream, byteArrayOutputStream2);
            AbstractC26415i.m41637a(3, this.f68897g, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(4, this.f68898h, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(5, this.f68899i, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(6, this.f68900j, (OutputStream) byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$h */
    /* loaded from: classes7.dex */
    public static final class C26414h extends AbstractC26411e {

        /* renamed from: g */
        final int f68901g;

        /* renamed from: h */
        final int f68902h;

        /* renamed from: i */
        final int f68903i;

        /* renamed from: j */
        final int f68904j;

        C26414h(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            super(35, str, str2, i5, i6, i7);
            this.f68901g = i;
            this.f68902h = i2;
            this.f68903i = i3;
            this.f68904j = i4;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26411e, com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            super.mo41633a(byteArrayOutputStream, byteArrayOutputStream2);
            AbstractC26415i.m41637a(3, this.f68901g, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(4, this.f68902h, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(5, this.f68903i, (OutputStream) byteArrayOutputStream);
            AbstractC26415i.m41637a(6, this.f68904j, (OutputStream) byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$i */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC26415i extends AbstractC26423p {
        protected AbstractC26415i(int i) {
            super(i);
        }

        /* renamed from: a */
        protected static void m41637a(int i, int i2, OutputStream outputStream) {
            if (C26377o.m41918a(i2)) {
                C26439u0.m41588b(i, i2, outputStream);
            }
        }

        /* renamed from: a */
        protected static void m41636a(int i, long j, OutputStream outputStream) {
            if (C26377o.m41917a(j)) {
                C26439u0.m41598a(i, j, outputStream);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$j */
    /* loaded from: classes7.dex */
    public static final class C26416j extends AbstractC26423p {

        /* renamed from: b */
        final String f68905b;

        /* renamed from: c */
        final String f68906c;

        /* renamed from: d */
        final int f68907d;

        /* renamed from: e */
        final int f68908e;

        /* renamed from: f */
        final int f68909f;

        C26416j(String str, String str2, int i, int i2, int i3) {
            super(28);
            this.f68905b = str;
            this.f68906c = str2;
            this.f68907d = i;
            this.f68908e = i2;
            this.f68909f = i3;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C26439u0.m41595a(1, this.f68906c, byteArrayOutputStream);
            C26439u0.m41595a(2, this.f68905b, byteArrayOutputStream);
            C26439u0.m41588b(3, this.f68907d, byteArrayOutputStream);
            C26439u0.m41588b(5, this.f68908e, byteArrayOutputStream);
            C26439u0.m41588b(6, this.f68909f, byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$k */
    /* loaded from: classes7.dex */
    public static final class C26417k extends AbstractC26423p {

        /* renamed from: b */
        final C26418a f68910b;

        /* renamed from: c */
        int f68911c;

        /* renamed from: d */
        String f68912d;

        /* renamed from: e */
        String f68913e;

        /* renamed from: f */
        String f68914f;

        /* renamed from: g */
        String f68915g;

        /* renamed from: h */
        String f68916h;

        /* renamed from: i */
        String f68917i;

        /* renamed from: j */
        String f68918j;

        /* renamed from: k */
        int f68919k;

        /* renamed from: l */
        int f68920l;

        /* renamed from: m */
        int f68921m;

        /* renamed from: n */
        int f68922n;

        /* renamed from: o */
        float f68923o;

        /* renamed from: p */
        float f68924p;

        /* renamed from: q */
        float f68925q;

        /* renamed from: r */
        String f68926r;

        /* renamed from: s */
        int f68927s;

        /* renamed from: t */
        int f68928t;

        /* renamed from: u */
        long f68929u;

        /* renamed from: v */
        long f68930v;

        /* renamed from: w */
        int f68931w;

        /* renamed from: x */
        int f68932x;

        /* renamed from: y */
        String f68933y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.my.tracker.obfuscated.s0$k$a */
        /* loaded from: classes7.dex */
        public static final class C26418a {

            /* renamed from: a */
            String f68934a;

            /* renamed from: b */
            String f68935b;

            /* renamed from: d */
            String f68937d;

            /* renamed from: c */
            int f68936c = -1;

            /* renamed from: e */
            int f68938e = -1;

            C26418a() {
            }

            /* renamed from: a */
            void m41635a(ByteArrayOutputStream byteArrayOutputStream) {
                C26439u0.m41595a(1, this.f68934a, byteArrayOutputStream);
                C26439u0.m41595a(2, this.f68935b, byteArrayOutputStream);
                int i = this.f68936c;
                if (i != -1) {
                    C26439u0.m41588b(3, i, byteArrayOutputStream);
                }
                C26439u0.m41595a(4, this.f68937d, byteArrayOutputStream);
                int i2 = this.f68938e;
                if (i2 != -1) {
                    C26439u0.m41588b(5, i2, byteArrayOutputStream);
                }
            }
        }

        C26417k() {
            super(23);
            this.f68910b = new C26418a();
            this.f68911c = -1;
            this.f68919k = -1;
            this.f68920l = -1;
            this.f68921m = -1;
            this.f68922n = -1;
            this.f68923o = Float.NaN;
            this.f68924p = Float.NaN;
            this.f68925q = Float.NaN;
            this.f68927s = -1;
            this.f68928t = -1;
            this.f68929u = -1L;
            this.f68930v = -1L;
            this.f68931w = -1;
            this.f68932x = -1;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            this.f68910b.m41635a(byteArrayOutputStream2);
            if (byteArrayOutputStream2.size() > 0) {
                C26439u0.m41597a(31, byteArrayOutputStream2, byteArrayOutputStream);
            }
            int i = this.f68911c;
            if (i != -1) {
                C26439u0.m41588b(1, i, byteArrayOutputStream);
            }
            C26439u0.m41595a(2, this.f68912d, byteArrayOutputStream);
            C26439u0.m41595a(3, this.f68913e, byteArrayOutputStream);
            C26439u0.m41595a(4, this.f68914f, byteArrayOutputStream);
            C26439u0.m41595a(5, this.f68915g, byteArrayOutputStream);
            C26439u0.m41595a(6, this.f68916h, byteArrayOutputStream);
            C26439u0.m41595a(7, this.f68917i, byteArrayOutputStream);
            C26439u0.m41595a(8, this.f68918j, byteArrayOutputStream);
            int i2 = this.f68919k;
            if (i2 != -1) {
                C26439u0.m41588b(9, i2, byteArrayOutputStream);
            }
            int i3 = this.f68920l;
            if (i3 > -1) {
                C26439u0.m41588b(10, i3, byteArrayOutputStream);
            }
            int i4 = this.f68921m;
            if (i4 > -1) {
                C26439u0.m41588b(11, i4, byteArrayOutputStream);
            }
            int i5 = this.f68922n;
            if (i5 > -1) {
                C26439u0.m41588b(12, i5, byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f68923o)) {
                C26439u0.m41600a(13, this.f68923o, (OutputStream) byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f68924p)) {
                C26439u0.m41600a(14, this.f68924p, (OutputStream) byteArrayOutputStream);
            }
            if (!Float.isNaN(this.f68925q)) {
                C26439u0.m41600a(15, this.f68925q, (OutputStream) byteArrayOutputStream);
            }
            C26439u0.m41595a(16, this.f68926r, byteArrayOutputStream);
            int i6 = this.f68927s;
            if (i6 > -1) {
                C26439u0.m41588b(17, i6, byteArrayOutputStream);
            }
            int i7 = this.f68928t;
            if (i7 > -1) {
                C26439u0.m41588b(18, i7, byteArrayOutputStream);
            }
            long j = this.f68929u;
            if (j > -1) {
                C26439u0.m41598a(19, j, (OutputStream) byteArrayOutputStream);
            }
            long j2 = this.f68930v;
            if (j2 > -1) {
                C26439u0.m41598a(20, j2, (OutputStream) byteArrayOutputStream);
            }
            int i8 = this.f68931w;
            if (i8 != -1) {
                C26439u0.m41588b(23, i8, byteArrayOutputStream);
            }
            int i9 = this.f68932x;
            if (i9 > -1) {
                C26439u0.m41588b(24, i9, byteArrayOutputStream);
            }
            C26439u0.m41595a(25, this.f68933y, byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.s0$l */
    /* loaded from: classes7.dex */
    static final class C26419l extends AbstractC26423p {

        /* renamed from: b */
        int f68939b;

        /* renamed from: c */
        double f68940c;

        /* renamed from: d */
        double f68941d;

        /* renamed from: e */
        double f68942e;

        /* renamed from: f */
        double f68943f;

        /* renamed from: g */
        long f68944g;

        C26419l() {
            super(26);
            this.f68939b = -1;
            this.f68940c = Double.NaN;
            this.f68941d = Double.NaN;
            this.f68942e = Double.NaN;
            this.f68943f = Double.NaN;
            this.f68944g = -1L;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            if (!Double.isNaN(this.f68940c)) {
                C26439u0.m41601a(1, this.f68940c, byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f68941d)) {
                C26439u0.m41601a(2, this.f68941d, byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f68942e)) {
                C26439u0.m41601a(3, this.f68942e, byteArrayOutputStream);
            }
            if (!Double.isNaN(this.f68943f)) {
                C26439u0.m41601a(4, this.f68943f, byteArrayOutputStream);
            }
            long j = this.f68944g;
            if (j > -1) {
                C26439u0.m41598a(5, j, (OutputStream) byteArrayOutputStream);
            }
            int i = this.f68939b;
            if (i != -1) {
                C26439u0.m41588b(6, i, byteArrayOutputStream);
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.s0$m */
    /* loaded from: classes7.dex */
    static final class C26420m extends AbstractC26423p {

        /* renamed from: b */
        String f68945b;

        /* renamed from: c */
        String f68946c;

        /* renamed from: d */
        String f68947d;

        C26420m() {
            super(24);
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C26439u0.m41595a(1, this.f68945b, byteArrayOutputStream);
            C26439u0.m41595a(2, this.f68946c, byteArrayOutputStream);
            C26439u0.m41595a(3, this.f68947d, byteArrayOutputStream);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.s0$n */
    /* loaded from: classes7.dex */
    static final class C26421n extends AbstractC26423p {

        /* renamed from: b */
        int f68948b;

        /* renamed from: c */
        int f68949c;

        /* renamed from: d */
        String f68950d;

        /* renamed from: e */
        String f68951e;

        /* renamed from: f */
        String f68952f;

        /* renamed from: g */
        String f68953g;

        /* renamed from: h */
        String f68954h;

        /* renamed from: i */
        byte[] f68955i;

        C26421n() {
            super(25);
            this.f68948b = -1;
            this.f68949c = -1;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i = this.f68948b;
            if (i != -1) {
                C26439u0.m41588b(1, i, byteArrayOutputStream);
            }
            int i2 = this.f68949c;
            if (i2 != -1) {
                C26439u0.m41588b(7, i2, byteArrayOutputStream);
            }
            C26439u0.m41595a(2, this.f68950d, byteArrayOutputStream);
            C26439u0.m41595a(3, this.f68951e, byteArrayOutputStream);
            C26439u0.m41595a(4, this.f68952f, byteArrayOutputStream);
            C26439u0.m41595a(5, this.f68953g, byteArrayOutputStream);
            C26439u0.m41595a(6, this.f68954h, byteArrayOutputStream);
            C26439u0.m41594a(8, this.f68955i, byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$o */
    /* loaded from: classes7.dex */
    public static final class C26422o extends AbstractC26423p {

        /* renamed from: b */
        final C26319f.C26320a f68956b;

        C26422o(C26319f.C26320a c26320a) {
            super(31);
            this.f68956b = c26320a;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C26439u0.m41595a(1, this.f68956b.f68574a, byteArrayOutputStream);
            C26439u0.m41598a(2, this.f68956b.f68575b, (OutputStream) byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$p */
    /* loaded from: classes7.dex */
    public static abstract class AbstractC26423p {

        /* renamed from: a */
        final int f68957a;

        protected AbstractC26423p(int i) {
            this.f68957a = i;
        }

        /* renamed from: a */
        abstract void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2);

        /* renamed from: a */
        final void m41634a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2, OutputStream outputStream) {
            mo41633a(byteArrayOutputStream, byteArrayOutputStream2);
            if (byteArrayOutputStream.size() <= 0) {
                return;
            }
            C26439u0.m41597a(this.f68957a, byteArrayOutputStream, outputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$q */
    /* loaded from: classes7.dex */
    public static final class C26424q extends AbstractC26423p {

        /* renamed from: b */
        int f68958b;

        /* renamed from: c */
        int f68959c;

        /* renamed from: d */
        int f68960d;

        /* renamed from: e */
        int f68961e;

        /* renamed from: f */
        int f68962f;

        /* renamed from: g */
        int f68963g;

        /* renamed from: h */
        int f68964h;

        /* renamed from: i */
        int f68965i;

        /* renamed from: j */
        int f68966j;

        /* renamed from: k */
        int f68967k;

        /* renamed from: l */
        int f68968l;

        /* renamed from: m */
        int f68969m;

        /* renamed from: n */
        int f68970n;

        /* renamed from: o */
        int f68971o;

        C26424q() {
            super(27);
            this.f68958b = -1;
            this.f68959c = -1;
            this.f68960d = -1;
            this.f68961e = -1;
            this.f68962f = -1;
            this.f68963g = -1;
            this.f68964h = -1;
            this.f68965i = -1;
            this.f68966j = -1;
            this.f68967k = -1;
            this.f68968l = -1;
            this.f68969m = -1;
            this.f68970n = -1;
            this.f68971o = -1;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i = this.f68958b;
            if (i > -1) {
                C26439u0.m41588b(1, i, byteArrayOutputStream);
            }
            int i2 = this.f68959c;
            if (i2 != -1) {
                C26439u0.m41588b(2, i2, byteArrayOutputStream);
            }
            int i3 = this.f68960d;
            if (i3 != -1) {
                C26439u0.m41588b(3, i3, byteArrayOutputStream);
            }
            int i4 = this.f68961e;
            if (i4 != -1) {
                C26439u0.m41588b(4, i4, byteArrayOutputStream);
            }
            int i5 = this.f68962f;
            if (i5 > -1) {
                C26439u0.m41588b(5, i5, byteArrayOutputStream);
            }
            int i6 = this.f68963g;
            if (i6 > -1) {
                C26439u0.m41588b(6, i6, byteArrayOutputStream);
            }
            int i7 = this.f68964h;
            if (i7 != -1) {
                C26439u0.m41588b(7, i7, byteArrayOutputStream);
            }
            int i8 = this.f68965i;
            if (i8 != -1) {
                C26439u0.m41588b(8, i8, byteArrayOutputStream);
            }
            int i9 = this.f68966j;
            if (i9 != -1) {
                C26439u0.m41588b(9, i9, byteArrayOutputStream);
            }
            int i10 = this.f68967k;
            if (i10 != -1) {
                C26439u0.m41588b(11, i10, byteArrayOutputStream);
            }
            int i11 = this.f68968l;
            if (i11 != -1) {
                C26439u0.m41588b(12, i11, byteArrayOutputStream);
            }
            int i12 = this.f68969m;
            if (i12 != -1) {
                C26439u0.m41588b(13, i12, byteArrayOutputStream);
            }
            int i13 = this.f68970n;
            if (i13 != -1) {
                C26439u0.m41588b(14, i13, byteArrayOutputStream);
            }
            int i14 = this.f68971o;
            if (i14 != -1) {
                C26439u0.m41588b(15, i14, byteArrayOutputStream);
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.s0$r */
    /* loaded from: classes7.dex */
    static final class C26425r extends AbstractC26423p {

        /* renamed from: b */
        int f68972b;

        /* renamed from: c */
        int f68973c;

        /* renamed from: d */
        String[] f68974d;

        /* renamed from: e */
        String[] f68975e;

        /* renamed from: f */
        String[] f68976f;

        /* renamed from: g */
        String[] f68977g;

        /* renamed from: h */
        String[] f68978h;

        /* renamed from: i */
        String[] f68979i;

        /* renamed from: j */
        String[] f68980j;

        C26425r() {
            super(22);
            this.f68972b = -1;
            this.f68973c = -1;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            int i = this.f68972b;
            if (i != -1) {
                C26439u0.m41588b(1, i, byteArrayOutputStream);
            }
            int i2 = this.f68973c;
            if (i2 > -1) {
                C26439u0.m41588b(2, i2, byteArrayOutputStream);
            }
            C26439u0.m41593a(3, this.f68974d, byteArrayOutputStream);
            C26439u0.m41593a(4, this.f68975e, byteArrayOutputStream);
            C26439u0.m41593a(5, this.f68976f, byteArrayOutputStream);
            C26439u0.m41593a(6, this.f68977g, byteArrayOutputStream);
            C26439u0.m41593a(7, this.f68978h, byteArrayOutputStream);
            C26439u0.m41593a(8, this.f68979i, byteArrayOutputStream);
            C26439u0.m41593a(9, this.f68980j, byteArrayOutputStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.s0$s */
    /* loaded from: classes7.dex */
    public static final class C26426s extends AbstractC26423p {

        /* renamed from: b */
        final String f68981b;

        /* renamed from: c */
        final String f68982c;

        /* renamed from: d */
        final int f68983d;

        C26426s(String str, String str2, int i) {
            super(29);
            this.f68981b = str;
            this.f68982c = str2;
            this.f68983d = i;
        }

        @Override // com.p551my.tracker.obfuscated.C26405s0.AbstractC26423p
        /* renamed from: a */
        void mo41633a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
            C26439u0.m41595a(1, this.f68982c, byteArrayOutputStream);
            C26439u0.m41595a(2, this.f68981b, byteArrayOutputStream);
            C26439u0.m41588b(3, this.f68983d, byteArrayOutputStream);
        }
    }

    private C26405s0(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        C26406a c26406a = new C26406a();
        this.f68843a = c26406a;
        C26425r c26425r = new C26425r();
        this.f68844b = c26425r;
        C26417k c26417k = new C26417k();
        this.f68845c = c26417k;
        C26420m c26420m = new C26420m();
        this.f68846d = c26420m;
        C26421n c26421n = new C26421n();
        this.f68847e = c26421n;
        C26424q c26424q = new C26424q();
        this.f68848f = c26424q;
        C26419l c26419l = new C26419l();
        this.f68849g = c26419l;
        this.f68850h = C26351j.m41976a(c26406a, c26425r, c26417k, c26420m, c26421n, c26424q, c26419l);
        this.f68856n = -1L;
        this.f68857o = -1L;
        this.f68858p = -1;
        this.f68851i = byteArrayOutputStream;
        this.f68852j = byteArrayOutputStream2;
    }

    /* renamed from: a */
    public static C26405s0 m41713a(ByteArrayOutputStream byteArrayOutputStream, ByteArrayOutputStream byteArrayOutputStream2) {
        return new C26405s0(byteArrayOutputStream, byteArrayOutputStream2);
    }

    /* renamed from: b */
    public void m41700b() {
        this.f68848f.f68964h = 0;
    }

    /* renamed from: c */
    public void m41690c() {
        this.f68848f.f68969m = 0;
    }

    /* renamed from: d */
    public void m41684d() {
        this.f68848f.f68967k = 0;
    }

    /* renamed from: e */
    public void m41679e() {
        this.f68848f.f68968l = 0;
    }

    /* renamed from: f */
    public void m41675f() {
        this.f68848f.f68965i = 0;
    }

    /* renamed from: g */
    public void m41671g() {
        this.f68848f.f68966j = 0;
    }

    /* renamed from: h */
    public void m41667h() {
        this.f68848f.f68970n = 0;
    }

    /* renamed from: i */
    public void m41664i() {
        this.f68848f.f68971o = 0;
    }

    /* renamed from: j */
    public void m41661j() {
        this.f68848f.f68960d = 0;
    }

    /* renamed from: k */
    public void m41658k() {
        this.f68848f.f68961e = 0;
    }

    /* renamed from: l */
    public void m41655l() {
        this.f68848f.f68959c = 0;
    }

    /* renamed from: m */
    public void m41652m(int i) {
        if (i == 1) {
            this.f68845c.f68919k = i;
        }
    }

    /* renamed from: n */
    public void m41650n(int i) {
        this.f68845c.f68931w = i;
    }

    /* renamed from: o */
    public void m41648o(int i) {
        this.f68845c.f68932x = i;
    }

    /* renamed from: p */
    public void m41646p(int i) {
        this.f68845c.f68920l = i;
    }

    /* renamed from: q */
    public void m41644q(String str) {
        this.f68845c.f68912d = str;
    }

    /* renamed from: r */
    public void m41643r(String str) {
        this.f68847e.f68952f = str;
    }

    /* renamed from: s */
    public void m41642s(String str) {
        this.f68847e.f68953g = str;
    }

    /* renamed from: t */
    public void m41641t(String str) {
        this.f68847e.f68951e = str;
    }

    /* renamed from: u */
    public void m41640u(String str) {
        this.f68847e.f68954h = str;
    }

    /* renamed from: v */
    public void m41639v(String str) {
        this.f68845c.f68914f = str;
    }

    @Override // com.p551my.tracker.obfuscated.AbstractC26465z.InterfaceC26466a
    /* renamed from: a */
    public String mo41493a() {
        return Headers.VALUE_APPLICATION_STREAM;
    }

    /* renamed from: b */
    public void m41699b(float f) {
        this.f68845c.f68923o = f;
    }

    /* renamed from: c */
    public void m41689c(float f) {
        this.f68845c.f68924p = f;
    }

    /* renamed from: d */
    public void m41683d(int i) {
        this.f68844b.f68973c = i;
    }

    /* renamed from: e */
    public void m41678e(int i) {
        this.f68845c.f68928t = i;
    }

    /* renamed from: f */
    public void m41674f(int i) {
        this.f68845c.f68927s = i;
    }

    /* renamed from: g */
    public void m41670g(int i) {
        this.f68847e.f68949c = i;
    }

    /* renamed from: h */
    public void m41666h(int i) {
        this.f68858p = i;
    }

    /* renamed from: i */
    public void m41663i(int i) {
        this.f68845c.f68922n = i;
    }

    /* renamed from: j */
    public void m41660j(int i) {
        this.f68844b.f68972b = i;
    }

    /* renamed from: k */
    public void m41657k(int i) {
        this.f68845c.f68921m = i;
    }

    /* renamed from: l */
    public void m41654l(int i) {
        this.f68845c.f68911c = i;
    }

    /* renamed from: m */
    public void m41651m(String str) {
        this.f68846d.f68945b = str;
    }

    /* renamed from: n */
    public void m41649n(String str) {
        this.f68846d.f68946c = str;
    }

    /* renamed from: o */
    public void m41647o(String str) {
        this.f68846d.f68947d = str;
    }

    /* renamed from: p */
    public void m41645p(String str) {
        this.f68845c.f68913e = str;
    }

    /* renamed from: a */
    public void m41719a(float f) {
        this.f68845c.f68925q = f;
    }

    /* renamed from: b */
    public void m41698b(int i) {
        this.f68848f.f68963g = i;
    }

    /* renamed from: c */
    public void m41688c(int i) {
        this.f68848f.f68958b = i;
    }

    /* renamed from: d */
    public void m41682d(long j) {
        this.f68857o = j;
    }

    /* renamed from: e */
    public void m41677e(String str) {
        this.f68843a.f68863f = str;
    }

    /* renamed from: f */
    public void m41673f(String str) {
        this.f68843a.f68860c = str;
    }

    /* renamed from: g */
    public void m41669g(String str) {
        this.f68845c.f68916h = str;
    }

    /* renamed from: h */
    public void m41665h(String str) {
        this.f68845c.f68917i = str;
    }

    /* renamed from: i */
    public void m41662i(String str) {
        this.f68845c.f68933y = str;
    }

    /* renamed from: j */
    public void m41659j(String str) {
        this.f68845c.f68915g = str;
    }

    /* renamed from: k */
    public void m41656k(String str) {
        this.f68845c.f68926r = str;
    }

    /* renamed from: l */
    public void m41653l(String str) {
        this.f68845c.f68918j = str;
    }

    /* renamed from: a */
    public void m41718a(int i) {
        this.f68848f.f68962f = i;
    }

    /* renamed from: b */
    public void m41697b(long j) {
        this.f68845c.f68929u = j;
    }

    /* renamed from: c */
    public void m41687c(long j) {
        this.f68856n = j;
    }

    /* renamed from: d */
    public void m41681d(String str) {
        this.f68843a.f68862e = str;
    }

    /* renamed from: e */
    public void m41676e(String[] strArr) {
        this.f68844b.f68979i = strArr;
    }

    /* renamed from: f */
    public void m41672f(String[] strArr) {
        this.f68844b.f68980j = strArr;
    }

    /* renamed from: g */
    public void m41668g(String[] strArr) {
        this.f68844b.f68975e = strArr;
    }

    /* renamed from: a */
    public void m41717a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.f68850h.add(new C26408b(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12));
    }

    /* renamed from: b */
    public void m41696b(String str) {
        this.f68843a.f68861d = str;
    }

    /* renamed from: c */
    public void m41686c(String str) {
        this.f68853k = str;
    }

    /* renamed from: d */
    public void m41680d(String[] strArr) {
        this.f68844b.f68974d = strArr;
    }

    /* renamed from: a */
    public void m41716a(int i, String str) {
        C26421n c26421n = this.f68847e;
        c26421n.f68948b = i;
        c26421n.f68950d = str;
    }

    /* renamed from: b */
    public void m41695b(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f68850h.add(new C26414h(str, str2, i, i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: c */
    public void m41685c(String[] strArr) {
        this.f68844b.f68977g = strArr;
    }

    /* renamed from: a */
    public void m41715a(long j) {
        this.f68845c.f68930v = j;
    }

    /* renamed from: b */
    public void m41694b(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f68850h.add(new C26410d(str, str2, i, i2, i3, i4, i5, i6, i7, i8));
    }

    /* renamed from: a */
    public void m41714a(Location location, int i) {
        this.f68849g.f68941d = location.getLongitude();
        this.f68849g.f68940c = location.getLatitude();
        this.f68849g.f68943f = location.getAccuracy();
        this.f68849g.f68942e = location.getSpeed();
        this.f68849g.f68944g = C26461y0.m41538b(location.getTime());
        this.f68849g.f68939b = i;
    }

    /* renamed from: b */
    public void m41693b(String str, boolean z) {
        C26417k.C26418a c26418a = this.f68845c.f68910b;
        c26418a.f68937d = str;
        c26418a.f68938e = z ? 1 : 0;
    }

    @Override // com.p551my.tracker.obfuscated.AbstractC26465z.InterfaceC26466a
    /* renamed from: a */
    public void mo41492a(OutputStream outputStream) {
        C26439u0.m41595a(1, MyTracker.VERSION, outputStream);
        C26439u0.m41595a(2, this.f68853k, outputStream);
        long j = this.f68856n;
        if (j > -1) {
            C26439u0.m41598a(3, j, outputStream);
        }
        long j2 = this.f68857o;
        if (j2 > -1) {
            C26439u0.m41598a(4, j2, outputStream);
        }
        int i = this.f68858p;
        if (i > -1) {
            C26439u0.m41588b(5, i, outputStream);
        }
        byte[] bArr = this.f68854l;
        if (bArr != null) {
            outputStream.write(bArr);
        }
        Map<String, String> map = this.f68855m;
        if (map != null && !map.isEmpty()) {
            String str = this.f68855m.get(C26484a.f69184A);
            if (str != null) {
                m41712a(str);
            }
            String str2 = this.f68855m.get(C26484a.f69185B);
            if (str2 != null) {
                m41656k(str2);
            }
            C26315e0.m42084a(43, this.f68855m, this.f68851i, outputStream);
        }
        for (AbstractC26423p abstractC26423p : this.f68850h) {
            this.f68851i.reset();
            this.f68852j.reset();
            abstractC26423p.m41634a(this.f68851i, this.f68852j, outputStream);
        }
    }

    /* renamed from: b */
    public void m41692b(byte[] bArr) {
        this.f68847e.f68955i = bArr;
    }

    /* renamed from: a */
    public void m41712a(String str) {
        this.f68845c.f68910b.f68934a = str;
    }

    /* renamed from: b */
    public void m41691b(String[] strArr) {
        this.f68844b.f68976f = strArr;
    }

    /* renamed from: a */
    public void m41711a(String str, int i) {
        C26406a.C26407a c26407a = this.f68843a.f68859b;
        c26407a.f68864a = str;
        c26407a.f68865b = i;
    }

    /* renamed from: a */
    public void m41710a(String str, String str2, int i) {
        this.f68850h.add(new C26426s(str, str2, i));
    }

    /* renamed from: a */
    public void m41709a(String str, String str2, int i, int i2, int i3) {
        this.f68850h.add(new C26416j(str, str2, i, i2, i3));
    }

    /* renamed from: a */
    public void m41708a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f68850h.add(new C26413g(str, str2, i, i2, i3, i4, i5, i6, i7));
    }

    /* renamed from: a */
    public void m41707a(String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f68850h.add(new C26409c(str, str2, i, i2, i3, i4, i5, i6, i7, i8));
    }

    /* renamed from: a */
    public void m41706a(String str, String str2, long j, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f68850h.add(new C26412f(str, str2, j, i, i2, i3, i4, i5, i6));
    }

    /* renamed from: a */
    public void m41705a(String str, boolean z) {
        C26417k.C26418a c26418a = this.f68845c.f68910b;
        c26418a.f68935b = str;
        c26418a.f68936c = z ? 1 : 0;
    }

    /* renamed from: a */
    public void m41704a(List<C26319f.C26320a> list) {
        for (C26319f.C26320a c26320a : list) {
            this.f68850h.add(new C26422o(c26320a));
        }
    }

    /* renamed from: a */
    public void m41703a(Map<String, String> map) {
        this.f68855m = map;
    }

    /* renamed from: a */
    public void m41702a(byte[] bArr) {
        this.f68854l = bArr;
    }

    /* renamed from: a */
    public void m41701a(String[] strArr) {
        this.f68844b.f68978h = strArr;
    }
}
