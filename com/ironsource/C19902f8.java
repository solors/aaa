package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.f8 */
/* loaded from: classes6.dex */
public final class C19902f8 {

    /* renamed from: a */
    private final boolean f50048a;
    @Nullable

    /* renamed from: b */
    private final EnumC20037h8 f50049b;

    @Metadata
    /* renamed from: com.ironsource.f8$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C19903a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50050a;

        static {
            int[] iArr = new int[EnumC20037h8.values().length];
            try {
                iArr[EnumC20037h8.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC20037h8.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC20037h8.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f50050a = iArr;
        }
    }

    public C19902f8(boolean z, @Nullable EnumC20037h8 enumC20037h8) {
        this.f50048a = z;
        this.f50049b = enumC20037h8;
    }

    /* renamed from: a */
    public static /* synthetic */ C19902f8 m58615a(C19902f8 c19902f8, boolean z, EnumC20037h8 enumC20037h8, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c19902f8.f50048a;
        }
        if ((i & 2) != 0) {
            enumC20037h8 = c19902f8.f50049b;
        }
        return c19902f8.m58614a(z, enumC20037h8);
    }

    @Nullable
    /* renamed from: b */
    public final EnumC20037h8 m58613b() {
        return this.f50049b;
    }

    @Nullable
    /* renamed from: c */
    public final EnumC20037h8 m58612c() {
        return this.f50049b;
    }

    /* renamed from: d */
    public final boolean m58611d() {
        return this.f50048a;
    }

    @Nullable
    /* renamed from: e */
    public final String m58610e() {
        int i;
        EnumC20037h8 enumC20037h8 = this.f50049b;
        if (enumC20037h8 == null) {
            i = -1;
        } else {
            i = C19903a.f50050a[enumC20037h8.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return "Max ad cap reached";
            }
            return "In pacing mode";
        }
        return "Placement delivery is false";
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19902f8)) {
            return false;
        }
        C19902f8 c19902f8 = (C19902f8) obj;
        if (this.f50048a == c19902f8.f50048a && this.f50049b == c19902f8.f50049b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        int hashCode;
        boolean z = this.f50048a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        EnumC20037h8 enumC20037h8 = this.f50049b;
        if (enumC20037h8 == null) {
            hashCode = 0;
        } else {
            hashCode = enumC20037h8.hashCode();
        }
        return i + hashCode;
    }

    @NotNull
    public String toString() {
        return "CappingStatus(isCapped=" + this.f50048a + " reason=" + this.f50049b + ')';
    }

    public /* synthetic */ C19902f8(boolean z, EnumC20037h8 enumC20037h8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : enumC20037h8);
    }

    @NotNull
    /* renamed from: a */
    public final C19902f8 m58614a(boolean z, @Nullable EnumC20037h8 enumC20037h8) {
        return new C19902f8(z, enumC20037h8);
    }

    /* renamed from: a */
    public final boolean m58616a() {
        return this.f50048a;
    }
}
