package com.yandex.mobile.ads.impl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import td.C44401b;

/* loaded from: classes8.dex */
public final class tf0 {
    @Nullable

    /* renamed from: a */
    private final String f85636a;

    /* renamed from: com.yandex.mobile.ads.impl.tf0$a */
    /* loaded from: classes8.dex */
    public static final class C31443a {
        @Nullable

        /* renamed from: a */
        private String f85637a;

        @NotNull
        /* renamed from: a */
        public final C31443a m29195a(@Nullable String str) {
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C31443a m29194b(@Nullable String str) {
            i82.m33346a(str);
            return this;
        }

        @NotNull
        /* renamed from: c */
        public final C31443a m29193c(@Nullable String str) {
            i82.m33345b(str);
            return this;
        }

        @NotNull
        /* renamed from: d */
        public final C31443a m29192d(@Nullable String str) {
            EnumC31444b enumC31444b;
            EnumC31444b[] values = EnumC31444b.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    enumC31444b = values[i];
                    if (Intrinsics.m17075f(enumC31444b.m29185a(), str)) {
                        break;
                    }
                    i++;
                } else {
                    enumC31444b = null;
                    break;
                }
            }
            if (enumC31444b == null) {
                enumC31444b = EnumC31444b.f85638c;
            }
            if (enumC31444b == EnumC31444b.f85638c) {
                i82.m33345b(str);
            }
            return this;
        }

        @NotNull
        /* renamed from: e */
        public final C31443a m29191e(@Nullable String str) {
            i82.m33346a(str);
            return this;
        }

        @NotNull
        /* renamed from: f */
        public final C31443a m29190f(@Nullable String str) {
            this.f85637a = str;
            return this;
        }

        @NotNull
        /* renamed from: g */
        public final C31443a m29189g(@Nullable String str) {
            EnumC31445c[] values = EnumC31445c.values();
            int length = values.length;
            for (int i = 0; i < length && !Intrinsics.m17075f(values[i].m29184a(), str); i++) {
            }
            return this;
        }

        @NotNull
        /* renamed from: i */
        public final C31443a m29187i(@Nullable String str) {
            EnumC31447d enumC31447d;
            EnumC31447d[] values = EnumC31447d.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    enumC31447d = values[i];
                    if (Intrinsics.m17075f(enumC31447d.m29183a(), str)) {
                        break;
                    }
                    i++;
                } else {
                    enumC31447d = null;
                    break;
                }
            }
            if (enumC31447d == null) {
                enumC31447d = EnumC31447d.f85644c;
            }
            if (enumC31447d == EnumC31447d.f85644c) {
                i82.m33345b(str);
            }
            return this;
        }

        @NotNull
        /* renamed from: j */
        public final C31443a m29186j(@Nullable String str) {
            i82.m33345b(str);
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final tf0 m29196a() {
            return new tf0(this.f85637a, 0);
        }

        @NotNull
        /* renamed from: h */
        public final void m29188h(@Nullable String str) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.tf0$b */
    /* loaded from: classes8.dex */
    public static final class EnumC31444b {

        /* renamed from: c */
        public static final EnumC31444b f85638c;

        /* renamed from: d */
        private static final /* synthetic */ EnumC31444b[] f85639d;
        @NotNull

        /* renamed from: b */
        private final String f85640b;

        static {
            EnumC31444b enumC31444b = new EnumC31444b(0, "ICON_HORIZONTAL_POSITION_LEFT", "left");
            EnumC31444b enumC31444b2 = new EnumC31444b(1, "ICON_HORIZONTAL_POSITION_RIGHT", "right");
            EnumC31444b enumC31444b3 = new EnumC31444b(2, "ICON_HORIZONTAL_POSITION_LEFT_OFFSET", "leftOffset");
            f85638c = enumC31444b3;
            EnumC31444b[] enumC31444bArr = {enumC31444b, enumC31444b2, enumC31444b3};
            f85639d = enumC31444bArr;
            C44401b.m3113a(enumC31444bArr);
        }

        private EnumC31444b(int i, String str, String str2) {
            this.f85640b = str2;
        }

        public static EnumC31444b valueOf(String str) {
            return (EnumC31444b) Enum.valueOf(EnumC31444b.class, str);
        }

        public static EnumC31444b[] values() {
            return (EnumC31444b[]) f85639d.clone();
        }

        @NotNull
        /* renamed from: a */
        public final String m29185a() {
            return this.f85640b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.tf0$c */
    /* loaded from: classes8.dex */
    public static final class EnumC31445c {
        @NotNull

        /* renamed from: c */
        public static final C31446a f85641c;

        /* renamed from: d */
        private static final /* synthetic */ EnumC31445c[] f85642d;
        @NotNull

        /* renamed from: b */
        private final String f85643b;

        /* renamed from: com.yandex.mobile.ads.impl.tf0$c$a */
        /* loaded from: classes8.dex */
        public static final class C31446a {
            private C31446a() {
            }

            public /* synthetic */ C31446a(int i) {
                this();
            }
        }

        static {
            EnumC31445c[] enumC31445cArr = {new EnumC31445c(0, "STATIC_RESOURCE", "StaticResource"), new EnumC31445c(1, "IFRAME_RESOURCE", "IFrameResource"), new EnumC31445c(2, "HTML_RESOURCE", "HTMLResource")};
            f85642d = enumC31445cArr;
            C44401b.m3113a(enumC31445cArr);
            f85641c = new C31446a(0);
        }

        private EnumC31445c(int i, String str, String str2) {
            this.f85643b = str2;
        }

        public static EnumC31445c valueOf(String str) {
            return (EnumC31445c) Enum.valueOf(EnumC31445c.class, str);
        }

        public static EnumC31445c[] values() {
            return (EnumC31445c[]) f85642d.clone();
        }

        @NotNull
        /* renamed from: a */
        public final String m29184a() {
            return this.f85643b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.tf0$d */
    /* loaded from: classes8.dex */
    public static final class EnumC31447d {

        /* renamed from: c */
        public static final EnumC31447d f85644c;

        /* renamed from: d */
        private static final /* synthetic */ EnumC31447d[] f85645d;
        @NotNull

        /* renamed from: b */
        private final String f85646b;

        static {
            EnumC31447d enumC31447d = new EnumC31447d(0, "ICON_VERTICAL_POSITION_TOP", ViewHierarchyConstants.DIMENSION_TOP_KEY);
            EnumC31447d enumC31447d2 = new EnumC31447d(1, "ICON_VERTICAL_POSITION_BOTTOM", "bottom");
            EnumC31447d enumC31447d3 = new EnumC31447d(2, "ICON_VERTICAL_POSITION_TOP_OFFSET", "topOffset");
            f85644c = enumC31447d3;
            EnumC31447d[] enumC31447dArr = {enumC31447d, enumC31447d2, enumC31447d3};
            f85645d = enumC31447dArr;
            C44401b.m3113a(enumC31447dArr);
        }

        private EnumC31447d(int i, String str, String str2) {
            this.f85646b = str2;
        }

        public static EnumC31447d valueOf(String str) {
            return (EnumC31447d) Enum.valueOf(EnumC31447d.class, str);
        }

        public static EnumC31447d[] values() {
            return (EnumC31447d[]) f85645d.clone();
        }

        @NotNull
        /* renamed from: a */
        public final String m29183a() {
            return this.f85646b;
        }
    }

    private tf0(String str) {
        this.f85636a = str;
    }

    @Nullable
    /* renamed from: a */
    public final String m29197a() {
        return this.f85636a;
    }

    public /* synthetic */ tf0(String str, int i) {
        this(str);
    }
}
