package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C33792Bb;
import io.appmetrica.analytics.impl.C34271V5;
import io.appmetrica.analytics.impl.C34694lb;
import io.appmetrica.analytics.impl.C34928u6;
import io.appmetrica.analytics.impl.InterfaceC34490dn;

/* loaded from: classes9.dex */
public final class CounterAttribute {

    /* renamed from: a */
    private final C34928u6 f95937a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CounterAttribute(String str, C34694lb c34694lb, C33792Bb c33792Bb) {
        this.f95937a = new C34928u6(str, c34694lb, c33792Bb);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC34490dn> withDelta(double d) {
        return new UserProfileUpdate<>(new C34271V5(this.f95937a.f95453c, d));
    }
}
