package p761kc;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kc.g */
/* loaded from: classes9.dex */
public final class HttpHeaderValueParser {
    @NotNull

    /* renamed from: a */
    private final String f98877a;
    @NotNull

    /* renamed from: b */
    private final List<C37459h> f98878b;

    /* renamed from: c */
    private final double f98879c;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        r8 = kotlin.text.C37689o.m16643j(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HttpHeaderValueParser(@org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.util.List<p761kc.C37459h> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r7.<init>()
            r7.f98877a = r8
            r7.f98878b = r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r8 = r9.iterator()
        L17:
            boolean r9 = r8.hasNext()
            r0 = 0
            if (r9 == 0) goto L32
            java.lang.Object r9 = r8.next()
            r1 = r9
            kc.h r1 = (p761kc.C37459h) r1
            java.lang.String r1 = r1.m17974a()
            java.lang.String r2 = "q"
            boolean r1 = kotlin.jvm.internal.Intrinsics.m17075f(r1, r2)
            if (r1 == 0) goto L17
            goto L33
        L32:
            r9 = r0
        L33:
            kc.h r9 = (p761kc.C37459h) r9
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r9 == 0) goto L5e
            java.lang.String r8 = r9.m17973b()
            if (r8 == 0) goto L5e
            java.lang.Double r8 = kotlin.text.C37686h.m16680j(r8)
            if (r8 == 0) goto L5e
            double r3 = r8.doubleValue()
            r5 = 0
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r5 = 0
            if (r9 > 0) goto L55
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 > 0) goto L55
            r5 = 1
        L55:
            if (r5 == 0) goto L58
            r0 = r8
        L58:
            if (r0 == 0) goto L5e
            double r1 = r0.doubleValue()
        L5e:
            r7.f98879c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p761kc.HttpHeaderValueParser.<init>(java.lang.String, java.util.List):void");
    }

    @NotNull
    /* renamed from: a */
    public final List<C37459h> m17977a() {
        return this.f98878b;
    }

    @NotNull
    /* renamed from: b */
    public final String m17976b() {
        return this.f98877a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpHeaderValueParser)) {
            return false;
        }
        HttpHeaderValueParser httpHeaderValueParser = (HttpHeaderValueParser) obj;
        if (Intrinsics.m17075f(this.f98877a, httpHeaderValueParser.f98877a) && Intrinsics.m17075f(this.f98878b, httpHeaderValueParser.f98878b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f98877a.hashCode() * 31) + this.f98878b.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeaderValue(value=" + this.f98877a + ", params=" + this.f98878b + ')';
    }
}
