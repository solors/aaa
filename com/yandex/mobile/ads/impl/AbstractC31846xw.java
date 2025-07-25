package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* renamed from: com.yandex.mobile.ads.impl.xw */
/* loaded from: classes8.dex */
public abstract class AbstractC31846xw {

    /* renamed from: com.yandex.mobile.ads.impl.xw$a */
    /* loaded from: classes8.dex */
    public static final class C31847a extends AbstractC31846xw {
        @NotNull

        /* renamed from: a */
        private final String f87862a;
        @NotNull

        /* renamed from: b */
        private final String f87863b;
        @NotNull

        /* renamed from: c */
        private final String f87864c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31847a(@NotNull String name, @NotNull String format, @NotNull String id2) {
            super(0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f87862a = name;
            this.f87863b = format;
            this.f87864c = id2;
        }

        @NotNull
        /* renamed from: a */
        public final String m27205a() {
            return this.f87863b;
        }

        @NotNull
        /* renamed from: b */
        public final String m27204b() {
            return this.f87864c;
        }

        @NotNull
        /* renamed from: c */
        public final String m27203c() {
            return this.f87862a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31847a)) {
                return false;
            }
            C31847a c31847a = (C31847a) obj;
            if (Intrinsics.m17075f(this.f87862a, c31847a.f87862a) && Intrinsics.m17075f(this.f87863b, c31847a.f87863b) && Intrinsics.m17075f(this.f87864c, c31847a.f87864c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f87864c.hashCode() + C31014o3.m31189a(this.f87863b, this.f87862a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            String str = this.f87862a;
            String str2 = this.f87863b;
            String str3 = this.f87864c;
            return "AdUnit(name=" + str + ", format=" + str2 + ", id=" + str3 + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xw$b */
    /* loaded from: classes8.dex */
    public static final class C31848b extends AbstractC31846xw {
        @NotNull

        /* renamed from: a */
        public static final C31848b f87865a = new C31848b();

        private C31848b() {
            super(0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xw$c */
    /* loaded from: classes8.dex */
    public static final class C31849c extends AbstractC31846xw {
        @NotNull

        /* renamed from: a */
        private final String f87866a;
        @NotNull

        /* renamed from: b */
        private final EnumC31850a f87867b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.yandex.mobile.ads.impl.xw$c$a */
        /* loaded from: classes8.dex */
        public static final class EnumC31850a {

            /* renamed from: b */
            public static final EnumC31850a f87868b;

            /* renamed from: c */
            private static final /* synthetic */ EnumC31850a[] f87869c;

            static {
                EnumC31850a enumC31850a = new EnumC31850a();
                f87868b = enumC31850a;
                EnumC31850a[] enumC31850aArr = {enumC31850a};
                f87869c = enumC31850aArr;
                C44401b.m3113a(enumC31850aArr);
            }

            private EnumC31850a() {
            }

            public static EnumC31850a valueOf(String str) {
                return (EnumC31850a) Enum.valueOf(EnumC31850a.class, str);
            }

            public static EnumC31850a[] values() {
                return (EnumC31850a[]) f87869c.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31849c() {
            super(0);
            EnumC31850a actionType = EnumC31850a.f87868b;
            Intrinsics.checkNotNullParameter("Enable Test mode", "text");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            this.f87866a = "Enable Test mode";
            this.f87867b = actionType;
        }

        @NotNull
        /* renamed from: a */
        public final EnumC31850a m27202a() {
            return this.f87867b;
        }

        @NotNull
        /* renamed from: b */
        public final String m27201b() {
            return this.f87866a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31849c)) {
                return false;
            }
            C31849c c31849c = (C31849c) obj;
            if (Intrinsics.m17075f(this.f87866a, c31849c.f87866a) && this.f87867b == c31849c.f87867b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f87867b.hashCode() + (this.f87866a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            String str = this.f87866a;
            EnumC31850a enumC31850a = this.f87867b;
            return "Button(text=" + str + ", actionType=" + enumC31850a + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xw$d */
    /* loaded from: classes8.dex */
    public static final class C31851d extends AbstractC31846xw {
        @NotNull

        /* renamed from: a */
        public static final C31851d f87870a = new C31851d();

        private C31851d() {
            super(0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xw$e */
    /* loaded from: classes8.dex */
    public static final class C31852e extends AbstractC31846xw {
        @NotNull

        /* renamed from: a */
        private final String f87871a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31852e(@NotNull String text) {
            super(0);
            Intrinsics.checkNotNullParameter(text, "text");
            this.f87871a = text;
        }

        @NotNull
        /* renamed from: a */
        public final String m27200a() {
            return this.f87871a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C31852e) && Intrinsics.m17075f(this.f87871a, ((C31852e) obj).f87871a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f87871a.hashCode();
        }

        @NotNull
        public final String toString() {
            String str = this.f87871a;
            return "Header(text=" + str + ")";
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xw$f */
    /* loaded from: classes8.dex */
    public static final class C31853f extends AbstractC31846xw {
        @Nullable

        /* renamed from: a */
        private final String f87872a;
        @Nullable

        /* renamed from: b */
        private final C31315rw f87873b;
        @Nullable

        /* renamed from: c */
        private final C31155pv f87874c;

        public /* synthetic */ C31853f(String str, C31315rw c31315rw) {
            this(str, c31315rw, null);
        }

        @Nullable
        /* renamed from: a */
        public final String m27199a() {
            return this.f87872a;
        }

        @Nullable
        /* renamed from: b */
        public final C31315rw m27198b() {
            return this.f87873b;
        }

        @Nullable
        /* renamed from: c */
        public final C31155pv m27197c() {
            return this.f87874c;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31853f)) {
                return false;
            }
            C31853f c31853f = (C31853f) obj;
            if (Intrinsics.m17075f(this.f87872a, c31853f.f87872a) && Intrinsics.m17075f(this.f87873b, c31853f.f87873b) && Intrinsics.m17075f(this.f87874c, c31853f.f87874c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.f87872a;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            C31315rw c31315rw = this.f87873b;
            if (c31315rw == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = c31315rw.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            C31155pv c31155pv = this.f87874c;
            if (c31155pv != null) {
                i = c31155pv.hashCode();
            }
            return i3 + i;
        }

        @NotNull
        public final String toString() {
            String str = this.f87872a;
            C31315rw c31315rw = this.f87873b;
            C31155pv c31155pv = this.f87874c;
            return "KeyValue(title=" + str + ", subtitle=" + c31315rw + ", text=" + c31155pv + ")";
        }

        public C31853f(@Nullable String str, @Nullable C31315rw c31315rw, @Nullable C31155pv c31155pv) {
            super(0);
            this.f87872a = str;
            this.f87873b = c31315rw;
            this.f87874c = c31155pv;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C31853f(@NotNull String title, @NotNull String text) {
            this(title, new C31315rw(text, 0, null, 0, 14));
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.xw$h */
    /* loaded from: classes8.dex */
    public static final class C31855h extends AbstractC31846xw {
        @NotNull

        /* renamed from: a */
        private final String f87886a;
        @NotNull

        /* renamed from: b */
        private final EnumC31856a f87887b;

        /* renamed from: c */
        private final boolean f87888c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.yandex.mobile.ads.impl.xw$h$a */
        /* loaded from: classes8.dex */
        public static final class EnumC31856a {

            /* renamed from: b */
            public static final EnumC31856a f87889b;

            /* renamed from: c */
            private static final /* synthetic */ EnumC31856a[] f87890c;

            static {
                EnumC31856a enumC31856a = new EnumC31856a();
                f87889b = enumC31856a;
                EnumC31856a[] enumC31856aArr = {enumC31856a};
                f87890c = enumC31856aArr;
                C44401b.m3113a(enumC31856aArr);
            }

            private EnumC31856a() {
            }

            public static EnumC31856a valueOf(String str) {
                return (EnumC31856a) Enum.valueOf(EnumC31856a.class, str);
            }

            public static EnumC31856a[] values() {
                return (EnumC31856a[]) f87890c.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31855h(boolean z) {
            super(0);
            EnumC31856a switchType = EnumC31856a.f87889b;
            Intrinsics.checkNotNullParameter("Debug Error Indicator", "text");
            Intrinsics.checkNotNullParameter(switchType, "switchType");
            this.f87886a = "Debug Error Indicator";
            this.f87887b = switchType;
            this.f87888c = z;
        }

        /* renamed from: a */
        public final boolean m27186a() {
            return this.f87888c;
        }

        @NotNull
        /* renamed from: b */
        public final EnumC31856a m27184b() {
            return this.f87887b;
        }

        @NotNull
        /* renamed from: c */
        public final String m27183c() {
            return this.f87886a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31855h)) {
                return false;
            }
            C31855h c31855h = (C31855h) obj;
            if (Intrinsics.m17075f(this.f87886a, c31855h.f87886a) && this.f87887b == c31855h.f87887b && this.f87888c == c31855h.f87888c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f87887b.hashCode();
            return Boolean.hashCode(this.f87888c) + ((hashCode + (this.f87886a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            String str = this.f87886a;
            EnumC31856a enumC31856a = this.f87887b;
            boolean z = this.f87888c;
            return "Switch(text=" + str + ", switchType=" + enumC31856a + ", initialState=" + z + ")";
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC31846xw
        /* renamed from: a */
        public final boolean mo27185a(@Nullable Object obj) {
            if (obj instanceof C31855h) {
                C31855h c31855h = (C31855h) obj;
                if (Intrinsics.m17075f(this.f87886a, c31855h.f87886a) && this.f87887b == c31855h.f87887b) {
                    return true;
                }
            }
            return false;
        }
    }

    private AbstractC31846xw() {
    }

    /* renamed from: a */
    public boolean mo27185a(@Nullable Object obj) {
        return equals(obj);
    }

    public /* synthetic */ AbstractC31846xw(int i) {
        this();
    }

    /* renamed from: com.yandex.mobile.ads.impl.xw$g */
    /* loaded from: classes8.dex */
    public static final class C31854g extends AbstractC31846xw {
        @NotNull

        /* renamed from: a */
        private final String f87875a;
        @Nullable

        /* renamed from: b */
        private final String f87876b;
        @Nullable

        /* renamed from: c */
        private final C31315rw f87877c;
        @NotNull

        /* renamed from: d */
        private final C31155pv f87878d;
        @Nullable

        /* renamed from: e */
        private final String f87879e;
        @Nullable

        /* renamed from: f */
        private final String f87880f;
        @Nullable

        /* renamed from: g */
        private final String f87881g;
        @Nullable

        /* renamed from: h */
        private final List<C30341fw> f87882h;
        @Nullable

        /* renamed from: i */
        private final List<C29967ax> f87883i;
        @NotNull

        /* renamed from: j */
        private final EnumC30581iv f87884j;
        @Nullable

        /* renamed from: k */
        private final String f87885k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31854g(@NotNull String name, @Nullable String str, @Nullable C31315rw c31315rw, @NotNull C31155pv infoSecond, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<C30341fw> list, @Nullable List<C29967ax> list2, @NotNull EnumC30581iv type, @Nullable String str5) {
            super(0);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(infoSecond, "infoSecond");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f87875a = name;
            this.f87876b = str;
            this.f87877c = c31315rw;
            this.f87878d = infoSecond;
            this.f87879e = str2;
            this.f87880f = str3;
            this.f87881g = str4;
            this.f87882h = list;
            this.f87883i = list2;
            this.f87884j = type;
            this.f87885k = str5;
        }

        @Nullable
        /* renamed from: a */
        public final String m27196a() {
            return this.f87880f;
        }

        @Nullable
        /* renamed from: b */
        public final List<C29967ax> m27195b() {
            return this.f87883i;
        }

        @Nullable
        /* renamed from: c */
        public final C31315rw m27194c() {
            return this.f87877c;
        }

        @NotNull
        /* renamed from: d */
        public final C31155pv m27193d() {
            return this.f87878d;
        }

        @Nullable
        /* renamed from: e */
        public final String m27192e() {
            return this.f87876b;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C31854g)) {
                return false;
            }
            C31854g c31854g = (C31854g) obj;
            if (Intrinsics.m17075f(this.f87875a, c31854g.f87875a) && Intrinsics.m17075f(this.f87876b, c31854g.f87876b) && Intrinsics.m17075f(this.f87877c, c31854g.f87877c) && Intrinsics.m17075f(this.f87878d, c31854g.f87878d) && Intrinsics.m17075f(this.f87879e, c31854g.f87879e) && Intrinsics.m17075f(this.f87880f, c31854g.f87880f) && Intrinsics.m17075f(this.f87881g, c31854g.f87881g) && Intrinsics.m17075f(this.f87882h, c31854g.f87882h) && Intrinsics.m17075f(this.f87883i, c31854g.f87883i) && this.f87884j == c31854g.f87884j && Intrinsics.m17075f(this.f87885k, c31854g.f87885k)) {
                return true;
            }
            return false;
        }

        @NotNull
        /* renamed from: f */
        public final String m27191f() {
            return this.f87875a;
        }

        @Nullable
        /* renamed from: g */
        public final String m27190g() {
            return this.f87881g;
        }

        @Nullable
        /* renamed from: h */
        public final List<C30341fw> m27189h() {
            return this.f87882h;
        }

        public final int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8 = this.f87875a.hashCode() * 31;
            String str = this.f87876b;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode8 + hashCode) * 31;
            C31315rw c31315rw = this.f87877c;
            if (c31315rw == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = c31315rw.hashCode();
            }
            int hashCode9 = (this.f87878d.hashCode() + ((i2 + hashCode2) * 31)) * 31;
            String str2 = this.f87879e;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i3 = (hashCode9 + hashCode3) * 31;
            String str3 = this.f87880f;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i4 = (i3 + hashCode4) * 31;
            String str4 = this.f87881g;
            if (str4 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str4.hashCode();
            }
            int i5 = (i4 + hashCode5) * 31;
            List<C30341fw> list = this.f87882h;
            if (list == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = list.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            List<C29967ax> list2 = this.f87883i;
            if (list2 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = list2.hashCode();
            }
            int hashCode10 = (this.f87884j.hashCode() + ((i6 + hashCode7) * 31)) * 31;
            String str5 = this.f87885k;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode10 + i;
        }

        @NotNull
        /* renamed from: i */
        public final EnumC30581iv m27188i() {
            return this.f87884j;
        }

        @Nullable
        /* renamed from: j */
        public final String m27187j() {
            return this.f87879e;
        }

        @NotNull
        public final String toString() {
            String str = this.f87875a;
            String str2 = this.f87876b;
            C31315rw c31315rw = this.f87877c;
            C31155pv c31155pv = this.f87878d;
            String str3 = this.f87879e;
            String str4 = this.f87880f;
            String str5 = this.f87881g;
            List<C30341fw> list = this.f87882h;
            List<C29967ax> list2 = this.f87883i;
            EnumC30581iv enumC30581iv = this.f87884j;
            String str6 = this.f87885k;
            return "MediationAdapter(name=" + str + ", logoUrl=" + str2 + ", infoFirst=" + c31315rw + ", infoSecond=" + c31155pv + ", waringMessage=" + str3 + ", adUnitId=" + str4 + ", networkAdUnitIdName=" + str5 + ", parameters=" + list + ", cpmFloors=" + list2 + ", type=" + enumC30581iv + ", sdk=" + str6 + ")";
        }

        public /* synthetic */ C31854g(String str, String str2, C31315rw c31315rw, C31155pv c31155pv, String str3, String str4, String str5, List list, List list2, EnumC30581iv enumC30581iv, String str6, int i) {
            this(str, str2, c31315rw, c31155pv, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? EnumC30581iv.f80638e : enumC30581iv, (i & 1024) != 0 ? null : str6);
        }
    }
}
