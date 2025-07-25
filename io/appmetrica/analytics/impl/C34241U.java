package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.U */
/* loaded from: classes9.dex */
public final class C34241U implements ProtobufConverter {

    /* renamed from: a */
    public final C34996wm f93546a;

    public C34241U(@NonNull C34996wm c34996wm) {
        this.f93546a = c34996wm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a */
    public final C34295W5 fromModel(@NonNull C34217T c34217t) {
        C34295W5 c34295w5 = new C34295W5();
        C34970vm c34970vm = c34217t.f93513a;
        if (c34970vm != null) {
            c34295w5.f93635a = this.f93546a.fromModel(c34970vm);
        }
        c34295w5.f93636b = new C34527f6[c34217t.f93514b.size()];
        int i = 0;
        for (C34970vm c34970vm2 : c34217t.f93514b) {
            c34295w5.f93636b[i] = this.f93546a.fromModel(c34970vm2);
            i++;
        }
        String str = c34217t.f93515c;
        if (str != null) {
            c34295w5.f93637c = str;
        }
        return c34295w5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        C34295W5 c34295w5 = (C34295W5) obj;
        throw new UnsupportedOperationException();
    }

    @NonNull
    /* renamed from: a */
    public final C34217T m22221a(@NonNull C34295W5 c34295w5) {
        throw new UnsupportedOperationException();
    }
}
