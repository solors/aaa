package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.J3 */
/* loaded from: classes9.dex */
public final class C33982J3 implements InterfaceC34177R7 {

    /* renamed from: a */
    public final Map f93049a;

    /* renamed from: b */
    public final EnumC34154Q7 f93050b;

    public C33982J3(@Nullable Map<String, String> map, @NotNull EnumC34154Q7 enumC34154Q7) {
        this.f93049a = map;
        this.f93050b = enumC34154Q7;
    }

    @NotNull
    /* renamed from: a */
    public final C33982J3 m22531a(@Nullable Map<String, String> map, @NotNull EnumC34154Q7 enumC34154Q7) {
        return new C33982J3(map, enumC34154Q7);
    }

    @Nullable
    /* renamed from: b */
    public final Map<String, String> m22530b() {
        return this.f93049a;
    }

    @NotNull
    /* renamed from: c */
    public final EnumC34154Q7 m22529c() {
        return this.f93050b;
    }

    @Nullable
    /* renamed from: d */
    public final Map<String, String> m22528d() {
        return this.f93049a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33982J3)) {
            return false;
        }
        C33982J3 c33982j3 = (C33982J3) obj;
        if (Intrinsics.m17075f(this.f93049a, c33982j3.f93049a) && this.f93050b == c33982j3.f93050b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Map map = this.f93049a;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        return this.f93050b.hashCode() + (hashCode * 31);
    }

    @NotNull
    public final String toString() {
        return "Candidate(clids=" + this.f93049a + ", source=" + this.f93050b + ')';
    }

    /* renamed from: a */
    public static C33982J3 m22532a(C33982J3 c33982j3, Map map, EnumC34154Q7 enumC34154Q7, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c33982j3.f93049a;
        }
        if ((i & 2) != 0) {
            enumC34154Q7 = c33982j3.f93050b;
        }
        c33982j3.getClass();
        return new C33982J3(map, enumC34154Q7);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34177R7
    @NotNull
    /* renamed from: a */
    public final EnumC34154Q7 mo22320a() {
        return this.f93050b;
    }
}
