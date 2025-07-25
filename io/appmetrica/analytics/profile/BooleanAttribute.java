package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C33935H4;
import io.appmetrica.analytics.impl.C34235Th;
import io.appmetrica.analytics.impl.C34487dk;
import io.appmetrica.analytics.impl.C34794p3;
import io.appmetrica.analytics.impl.C34928u6;
import io.appmetrica.analytics.impl.InterfaceC34490dn;
import io.appmetrica.analytics.impl.InterfaceC34685l2;
import io.appmetrica.analytics.impl.InterfaceC34867rn;

/* loaded from: classes9.dex */
public class BooleanAttribute {

    /* renamed from: a */
    private final C34928u6 f95936a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BooleanAttribute(String str, InterfaceC34867rn interfaceC34867rn, InterfaceC34685l2 interfaceC34685l2) {
        this.f95936a = new C34928u6(str, interfaceC34867rn, interfaceC34685l2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC34490dn> withValue(boolean z) {
        C34928u6 c34928u6 = this.f95936a;
        return new UserProfileUpdate<>(new C34794p3(c34928u6.f95453c, z, c34928u6.f95451a, new C33935H4(c34928u6.f95452b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC34490dn> withValueIfUndefined(boolean z) {
        C34928u6 c34928u6 = this.f95936a;
        return new UserProfileUpdate<>(new C34794p3(c34928u6.f95453c, z, c34928u6.f95451a, new C34487dk(c34928u6.f95452b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC34490dn> withValueReset() {
        C34928u6 c34928u6 = this.f95936a;
        return new UserProfileUpdate<>(new C34235Th(3, c34928u6.f95453c, c34928u6.f95451a, c34928u6.f95452b));
    }
}
