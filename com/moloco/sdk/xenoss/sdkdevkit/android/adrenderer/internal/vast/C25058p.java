package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.service_locator.C24447a;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p */
/* loaded from: classes7.dex */
public final class C25058p {
    @NotNull

    /* renamed from: a */
    public static final InterfaceC38501j f65026a;
    @NotNull

    /* renamed from: b */
    public static final Regex f65027b;
    @NotNull

    /* renamed from: c */
    public static final Regex f65028c;
    @NotNull

    /* renamed from: d */
    public static final Regex f65029d;
    @NotNull

    /* renamed from: e */
    public static final Regex f65030e;
    @NotNull

    /* renamed from: f */
    public static final Regex f65031f;
    @NotNull

    /* renamed from: g */
    public static final Regex f65032g;
    @NotNull

    /* renamed from: h */
    public static final Regex f65033h;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.p$a */
    /* loaded from: classes7.dex */
    public static final class C25059a extends Lambda implements Functions<C25056o> {

        /* renamed from: g */
        public static final C25059a f65034g = new C25059a();

        public C25059a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final C25056o invoke() {
            return new C25056o(C24447a.C24479i.f63219a.m46353c());
        }
    }

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C25059a.f65034g);
        f65026a = m14554a;
        f65027b = new Regex("\\[ERRORCODE]");
        f65028c = new Regex("\\[CONTENTPLAYHEAD]");
        f65029d = new Regex("\\[CACHEBUSTING]");
        f65030e = new Regex("\\[ASSETURI]");
        f65031f = new Regex("\\[[^]]*]");
        f65032g = new Regex("\\[MEDIAPLAYHEAD]");
        f65033h = new Regex("\\[ADPLAYHEAD]");
    }

    @NotNull
    /* renamed from: a */
    public static final InterfaceC25054n m45199a() {
        return m45190j();
    }

    /* renamed from: b */
    public static final String m45198b(int i) {
        return m45194f(i);
    }

    /* renamed from: c */
    public static final String m45197c(String str) {
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(encode, "{\n        URLEncoder.encode(this, \"UTF-8\")\n    }");
            return encode;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: f */
    public static final String m45194f(int i) {
        long j = i;
        C37612s0 c37612s0 = C37612s0.f99333a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String format = String.format("%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j)), Long.valueOf(timeUnit.toMinutes(j) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j % 1000)}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    /* renamed from: g */
    public static final String m45193g(String str, Integer num, Integer num2, String str2, String str3) {
        if (num != null) {
            num.intValue();
            str = f65027b.replace(str, num.toString());
        }
        if (num2 != null) {
            num2.intValue();
            str = f65032g.replace(f65033h.replace(f65028c.replace(str, m45194f(num2.intValue())), m45198b(num2.intValue())), m45191i(num2.intValue()));
        }
        if (str2 != null) {
            str = f65030e.replace(str, m45197c(str2));
        }
        if (str3 != null) {
            str = f65029d.replace(str, str3);
        }
        return f65031f.replace(str, "");
    }

    /* renamed from: h */
    public static final String m45192h() {
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format("%08d", Arrays.copyOf(new Object[]{Integer.valueOf(Random.f99344b.mo16979e(1, 99999999))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    /* renamed from: i */
    public static final String m45191i(int i) {
        return "-1";
    }

    /* renamed from: j */
    public static final C25056o m45190j() {
        return (C25056o) f65026a.getValue();
    }
}
