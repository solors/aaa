package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Qm */
/* loaded from: classes9.dex */
public final class C34169Qm implements ProtobufConverter {

    /* renamed from: a */
    public final C33878Em f93417a;

    /* renamed from: b */
    public final C34241U f93418b;

    /* renamed from: c */
    public final C34689l6 f93419c;

    /* renamed from: d */
    public final C33901Fk f93420d;

    /* renamed from: e */
    public final C34400ae f93421e;

    /* renamed from: f */
    public final C34427be f93422f;

    public C34169Qm() {
        this(new C33878Em(), new C34241U(new C34996wm()), new C34689l6(), new C33901Fk(), new C34400ae(), new C34427be());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34392a6 fromModel(@NonNull C34145Pm c34145Pm) {
        C34392a6 c34392a6 = new C34392a6();
        C33903Fm c33903Fm = c34145Pm.f93368a;
        if (c33903Fm != null) {
            c34392a6.f93919a = this.f93417a.fromModel(c33903Fm);
        }
        C34217T c34217t = c34145Pm.f93369b;
        if (c34217t != null) {
            c34392a6.f93920b = this.f93418b.fromModel(c34217t);
        }
        List<C33951Hk> list = c34145Pm.f93370c;
        if (list != null) {
            c34392a6.f93923e = this.f93420d.fromModel(list);
        }
        String str = c34145Pm.f93374g;
        if (str != null) {
            c34392a6.f93921c = str;
        }
        c34392a6.f93922d = this.f93419c.m22545a(c34145Pm.f93375h);
        if (!TextUtils.isEmpty(c34145Pm.f93371d)) {
            c34392a6.f93926h = this.f93421e.fromModel(c34145Pm.f93371d);
        }
        if (!TextUtils.isEmpty(c34145Pm.f93372e)) {
            c34392a6.f93927i = c34145Pm.f93372e.getBytes();
        }
        if (!AbstractC34679kn.m21469a(c34145Pm.f93373f)) {
            c34392a6.f93928j = this.f93422f.fromModel(c34145Pm.f93373f);
        }
        return c34392a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34392a6 c34392a6 = (C34392a6) obj;
        throw new UnsupportedOperationException();
    }

    public C34169Qm(C33878Em c33878Em, C34241U c34241u, C34689l6 c34689l6, C33901Fk c33901Fk, C34400ae c34400ae, C34427be c34427be) {
        this.f93418b = c34241u;
        this.f93417a = c33878Em;
        this.f93419c = c34689l6;
        this.f93420d = c33901Fk;
        this.f93421e = c34400ae;
        this.f93422f = c34427be;
    }

    @NonNull
    /* renamed from: a */
    public final C34145Pm m22326a(@NonNull C34392a6 c34392a6) {
        throw new UnsupportedOperationException();
    }
}
