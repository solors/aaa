package com.ironsource;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ao */
/* loaded from: classes6.dex */
public final class C19593ao {

    /* renamed from: a */
    private boolean f49176a;
    @NotNull

    /* renamed from: b */
    private String f49177b;

    /* renamed from: c */
    private boolean f49178c;

    /* renamed from: d */
    private int f49179d;
    @Nullable

    /* renamed from: e */
    private int[] f49180e;
    @Nullable

    /* renamed from: f */
    private int[] f49181f;

    public C19593ao() {
        this(false, null, false, 0, null, null, 63, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C19593ao m59422a(C19593ao c19593ao, boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c19593ao.f49176a;
        }
        if ((i2 & 2) != 0) {
            str = c19593ao.f49177b;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            z2 = c19593ao.f49178c;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            i = c19593ao.f49179d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            iArr = c19593ao.f49180e;
        }
        int[] iArr3 = iArr;
        if ((i2 & 32) != 0) {
            iArr2 = c19593ao.f49181f;
        }
        return c19593ao.m59419a(z, str2, z3, i3, iArr3, iArr2);
    }

    @NotNull
    /* renamed from: b */
    public final String m59417b() {
        return this.f49177b;
    }

    /* renamed from: c */
    public final boolean m59414c() {
        return this.f49178c;
    }

    /* renamed from: d */
    public final int m59413d() {
        return this.f49179d;
    }

    @Nullable
    /* renamed from: e */
    public final int[] m59412e() {
        return this.f49180e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19593ao)) {
            return false;
        }
        C19593ao c19593ao = (C19593ao) obj;
        if (this.f49176a == c19593ao.f49176a && Intrinsics.m17075f(this.f49177b, c19593ao.f49177b) && this.f49178c == c19593ao.f49178c && this.f49179d == c19593ao.f49179d && Intrinsics.m17075f(this.f49180e, c19593ao.f49180e) && Intrinsics.m17075f(this.f49181f, c19593ao.f49181f)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final int[] m59411f() {
        return this.f49181f;
    }

    /* renamed from: g */
    public final boolean m59410g() {
        return this.f49178c;
    }

    /* renamed from: h */
    public final int m59409h() {
        return this.f49179d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public int hashCode() {
        int hashCode;
        boolean z = this.f49176a;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode2 = ((r0 * 31) + this.f49177b.hashCode()) * 31;
        boolean z2 = this.f49178c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int hashCode3 = (((hashCode2 + i) * 31) + Integer.hashCode(this.f49179d)) * 31;
        int[] iArr = this.f49180e;
        int i2 = 0;
        if (iArr == null) {
            hashCode = 0;
        } else {
            hashCode = Arrays.hashCode(iArr);
        }
        int i3 = (hashCode3 + hashCode) * 31;
        int[] iArr2 = this.f49181f;
        if (iArr2 != null) {
            i2 = Arrays.hashCode(iArr2);
        }
        return i3 + i2;
    }

    /* renamed from: i */
    public final boolean m59408i() {
        return this.f49176a;
    }

    @NotNull
    /* renamed from: j */
    public final String m59407j() {
        return this.f49177b;
    }

    @Nullable
    /* renamed from: k */
    public final int[] m59406k() {
        return this.f49181f;
    }

    @Nullable
    /* renamed from: l */
    public final int[] m59405l() {
        return this.f49180e;
    }

    @NotNull
    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.f49176a + ", pixelEventsUrl=" + this.f49177b + ", pixelEventsCompression=" + this.f49178c + ", pixelEventsCompressionLevel=" + this.f49179d + ", pixelOptOut=" + Arrays.toString(this.f49180e) + ", pixelOptIn=" + Arrays.toString(this.f49181f) + ')';
    }

    public C19593ao(boolean z, @NotNull String pixelEventsUrl, boolean z2, int i, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        this.f49176a = z;
        this.f49177b = pixelEventsUrl;
        this.f49178c = z2;
        this.f49179d = i;
        this.f49180e = iArr;
        this.f49181f = iArr2;
    }

    @NotNull
    /* renamed from: a */
    public final C19593ao m59419a(boolean z, @NotNull String pixelEventsUrl, boolean z2, int i, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(pixelEventsUrl, "pixelEventsUrl");
        return new C19593ao(z, pixelEventsUrl, z2, i, iArr, iArr2);
    }

    /* renamed from: b */
    public final void m59416b(boolean z) {
        this.f49176a = z;
    }

    public /* synthetic */ C19593ao(boolean z, String str, boolean z2, int i, int[] iArr, int[] iArr2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? C19652bo.f49319a : str, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? null : iArr, (i2 & 32) != 0 ? null : iArr2);
    }

    /* renamed from: a */
    public final void m59423a(int i) {
        this.f49179d = i;
    }

    /* renamed from: b */
    public final void m59415b(@Nullable int[] iArr) {
        this.f49180e = iArr;
    }

    /* renamed from: a */
    public final void m59421a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f49177b = str;
    }

    /* renamed from: a */
    public final void m59420a(boolean z) {
        this.f49178c = z;
    }

    /* renamed from: a */
    public final void m59418a(@Nullable int[] iArr) {
        this.f49181f = iArr;
    }

    /* renamed from: a */
    public final boolean m59424a() {
        return this.f49176a;
    }
}
