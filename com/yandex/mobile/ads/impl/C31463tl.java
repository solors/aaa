package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.tl */
/* loaded from: classes8.dex */
public final class C31463tl {

    /* renamed from: n */
    public static final /* synthetic */ int f85739n = 0;

    /* renamed from: a */
    private final boolean f85740a;

    /* renamed from: b */
    private final boolean f85741b;

    /* renamed from: c */
    private final int f85742c;

    /* renamed from: d */
    private final int f85743d;

    /* renamed from: e */
    private final boolean f85744e;

    /* renamed from: f */
    private final boolean f85745f;

    /* renamed from: g */
    private final boolean f85746g;

    /* renamed from: h */
    private final int f85747h;

    /* renamed from: i */
    private final int f85748i;

    /* renamed from: j */
    private final boolean f85749j;

    /* renamed from: k */
    private final boolean f85750k;

    /* renamed from: l */
    private final boolean f85751l;
    @Nullable

    /* renamed from: m */
    private String f85752m;

    /* renamed from: com.yandex.mobile.ads.impl.tl$a */
    /* loaded from: classes8.dex */
    public static final class C31464a {
        @NotNull
        /* renamed from: a */
        public final C31464a m29112a() {
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31464a m29111a(@NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            timeUnit.toSeconds(Integer.MAX_VALUE);
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C31464a m29110b() {
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tl$b */
    /* loaded from: classes8.dex */
    public static final class C31465b {
        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        @org.jetbrains.annotations.NotNull
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static com.yandex.mobile.ads.impl.C31463tl m29109a(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.zc0 r31) {
            /*
                Method dump skipped, instructions count: 555
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31463tl.C31465b.m29109a(com.yandex.mobile.ads.impl.zc0):com.yandex.mobile.ads.impl.tl");
        }
    }

    static {
        new C31464a().m29112a();
        new C31464a().m29110b().m29111a(TimeUnit.SECONDS);
    }

    private C31463tl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f85740a = z;
        this.f85741b = z2;
        this.f85742c = i;
        this.f85743d = i2;
        this.f85744e = z3;
        this.f85745f = z4;
        this.f85746g = z5;
        this.f85747h = i3;
        this.f85748i = i4;
        this.f85749j = z6;
        this.f85750k = z7;
        this.f85751l = z8;
        this.f85752m = str;
    }

    /* renamed from: a */
    public final boolean m29113a() {
        return this.f85749j;
    }

    @NotNull
    public final String toString() {
        String str = this.f85752m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f85740a) {
                sb2.append("no-cache, ");
            }
            if (this.f85741b) {
                sb2.append("no-store, ");
            }
            if (this.f85742c != -1) {
                sb2.append("max-age=");
                sb2.append(this.f85742c);
                sb2.append(", ");
            }
            if (this.f85743d != -1) {
                sb2.append("s-maxage=");
                sb2.append(this.f85743d);
                sb2.append(", ");
            }
            if (this.f85744e) {
                sb2.append("private, ");
            }
            if (this.f85745f) {
                sb2.append("public, ");
            }
            if (this.f85746g) {
                sb2.append("must-revalidate, ");
            }
            if (this.f85747h != -1) {
                sb2.append("max-stale=");
                sb2.append(this.f85747h);
                sb2.append(", ");
            }
            if (this.f85748i != -1) {
                sb2.append("min-fresh=");
                sb2.append(this.f85748i);
                sb2.append(", ");
            }
            if (this.f85749j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f85750k) {
                sb2.append("no-transform, ");
            }
            if (this.f85751l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            this.f85752m = sb3;
            return sb3;
        }
        return str;
    }

    public /* synthetic */ C31463tl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, int i5) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
