package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC25045t;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f */
/* loaded from: classes7.dex */
public final class C25255f {
    @Nullable

    /* renamed from: a */
    public final AbstractC25045t f65571a;
    @NotNull

    /* renamed from: b */
    public final File f65572b;
    @Nullable

    /* renamed from: c */
    public final Integer f65573c;
    @NotNull

    /* renamed from: d */
    public final String f65574d;
    @Nullable

    /* renamed from: e */
    public final String f65575e;
    @NotNull

    /* renamed from: f */
    public final C25257h f65576f;
    @Nullable

    /* renamed from: g */
    public final C25254e f65577g;

    public C25255f(@Nullable AbstractC25045t abstractC25045t, @NotNull File localMediaResource, @Nullable Integer num, @NotNull String networkMediaResource, @Nullable String str, @NotNull C25257h tracking, @Nullable C25254e c25254e) {
        Intrinsics.checkNotNullParameter(localMediaResource, "localMediaResource");
        Intrinsics.checkNotNullParameter(networkMediaResource, "networkMediaResource");
        Intrinsics.checkNotNullParameter(tracking, "tracking");
        this.f65571a = abstractC25045t;
        this.f65572b = localMediaResource;
        this.f65573c = num;
        this.f65574d = networkMediaResource;
        this.f65575e = str;
        this.f65576f = tracking;
        this.f65577g = c25254e;
    }

    /* renamed from: b */
    public static /* synthetic */ C25255f m44905b(C25255f c25255f, AbstractC25045t abstractC25045t, File file, Integer num, String str, String str2, C25257h c25257h, C25254e c25254e, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC25045t = c25255f.f65571a;
        }
        if ((i & 2) != 0) {
            file = c25255f.f65572b;
        }
        File file2 = file;
        if ((i & 4) != 0) {
            num = c25255f.f65573c;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str = c25255f.f65574d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = c25255f.f65575e;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            c25257h = c25255f.f65576f;
        }
        C25257h c25257h2 = c25257h;
        if ((i & 64) != 0) {
            c25254e = c25255f.f65577g;
        }
        return c25255f.m44906a(abstractC25045t, file2, num2, str3, str4, c25257h2, c25254e);
    }

    @NotNull
    /* renamed from: a */
    public final C25255f m44906a(@Nullable AbstractC25045t abstractC25045t, @NotNull File localMediaResource, @Nullable Integer num, @NotNull String networkMediaResource, @Nullable String str, @NotNull C25257h tracking, @Nullable C25254e c25254e) {
        Intrinsics.checkNotNullParameter(localMediaResource, "localMediaResource");
        Intrinsics.checkNotNullParameter(networkMediaResource, "networkMediaResource");
        Intrinsics.checkNotNullParameter(tracking, "tracking");
        return new C25255f(abstractC25045t, localMediaResource, num, networkMediaResource, str, tracking, c25254e);
    }

    @Nullable
    /* renamed from: c */
    public final String m44904c() {
        return this.f65575e;
    }

    @Nullable
    /* renamed from: d */
    public final C25254e m44903d() {
        return this.f65577g;
    }

    @NotNull
    /* renamed from: e */
    public final File m44902e() {
        return this.f65572b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25255f)) {
            return false;
        }
        C25255f c25255f = (C25255f) obj;
        if (Intrinsics.m17075f(this.f65571a, c25255f.f65571a) && Intrinsics.m17075f(this.f65572b, c25255f.f65572b) && Intrinsics.m17075f(this.f65573c, c25255f.f65573c) && Intrinsics.m17075f(this.f65574d, c25255f.f65574d) && Intrinsics.m17075f(this.f65575e, c25255f.f65575e) && Intrinsics.m17075f(this.f65576f, c25255f.f65576f) && Intrinsics.m17075f(this.f65577g, c25255f.f65577g)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final Integer m44901f() {
        return this.f65573c;
    }

    @NotNull
    /* renamed from: g */
    public final String m44900g() {
        return this.f65574d;
    }

    @Nullable
    /* renamed from: h */
    public final AbstractC25045t m44899h() {
        return this.f65571a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        AbstractC25045t abstractC25045t = this.f65571a;
        int i = 0;
        if (abstractC25045t == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC25045t.hashCode();
        }
        int hashCode4 = ((hashCode * 31) + this.f65572b.hashCode()) * 31;
        Integer num = this.f65573c;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int hashCode5 = (((hashCode4 + hashCode2) * 31) + this.f65574d.hashCode()) * 31;
        String str = this.f65575e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode3) * 31) + this.f65576f.hashCode()) * 31;
        C25254e c25254e = this.f65577g;
        if (c25254e != null) {
            i = c25254e.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    /* renamed from: i */
    public final C25257h m44898i() {
        return this.f65576f;
    }

    @NotNull
    public String toString() {
        return "Linear(skipOffset=" + this.f65571a + ", localMediaResource=" + this.f65572b + ", localMediaResourceBitrate=" + this.f65573c + ", networkMediaResource=" + this.f65574d + ", clickThroughUrl=" + this.f65575e + ", tracking=" + this.f65576f + ", icon=" + this.f65577g + ')';
    }
}
