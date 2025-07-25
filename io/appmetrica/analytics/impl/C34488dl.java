package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.dl */
/* loaded from: classes9.dex */
public final class C34488dl extends BaseRequestConfig.BaseRequestArguments {
    @Nullable

    /* renamed from: a */
    public final String f94214a;
    @Nullable

    /* renamed from: b */
    public final String f94215b;
    @Nullable

    /* renamed from: c */
    public final Map<String, String> f94216c;

    /* renamed from: d */
    public final boolean f94217d;
    @Nullable

    /* renamed from: e */
    public final List<String> f94218e;

    public C34488dl(@NonNull C34365Z3 c34365z3) {
        this(c34365z3.m22055a().m22278d(), c34365z3.m22055a().m22276e(), c34365z3.m22055a().m22284a(), c34365z3.m22055a().m22272i(), c34365z3.m22055a().m22282b());
    }

    /* renamed from: a */
    public final boolean m21816a(@NonNull C34488dl c34488dl) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b */
    public final C34488dl mergeFrom(@NonNull C34488dl c34488dl) {
        boolean z;
        List<String> list;
        String str = (String) WrapUtils.getOrDefaultNullable(this.f94214a, c34488dl.f94214a);
        String str2 = (String) WrapUtils.getOrDefaultNullable(this.f94215b, c34488dl.f94215b);
        Map map = (Map) WrapUtils.getOrDefaultNullable(this.f94216c, c34488dl.f94216c);
        if (!this.f94217d && !c34488dl.f94217d) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = z;
        if (c34488dl.f94217d) {
            list = c34488dl.f94218e;
        } else {
            list = this.f94218e;
        }
        return new C34488dl(str, str2, map, z2, list);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        C34488dl c34488dl = (C34488dl) obj;
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f94214a + "', installReferrerSource='" + this.f94215b + "', clientClids=" + this.f94216c + ", hasNewCustomHosts=" + this.f94217d + ", newCustomHosts=" + this.f94218e + '}';
    }

    public C34488dl(@Nullable String str, @Nullable String str2, @Nullable Map<String, String> map, boolean z, @Nullable List<String> list) {
        this.f94214a = str;
        this.f94215b = str2;
        this.f94216c = map;
        this.f94217d = z;
        this.f94218e = list;
    }

    public C34488dl() {
        this(null, null, null, false, null);
    }
}
