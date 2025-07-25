package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C33935H4;
import io.appmetrica.analytics.impl.C34235Th;
import io.appmetrica.analytics.impl.C34408am;
import io.appmetrica.analytics.impl.C34435bm;
import io.appmetrica.analytics.impl.C34487dk;
import io.appmetrica.analytics.impl.C34928u6;
import io.appmetrica.analytics.impl.InterfaceC34025Km;
import io.appmetrica.analytics.impl.InterfaceC34490dn;
import io.appmetrica.analytics.impl.InterfaceC34685l2;
import io.appmetrica.analytics.impl.InterfaceC34867rn;

/* loaded from: classes9.dex */
public class StringAttribute {

    /* renamed from: a */
    private final InterfaceC34025Km f95942a;

    /* renamed from: b */
    private final C34928u6 f95943b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public StringAttribute(String str, C34408am c34408am, InterfaceC34867rn interfaceC34867rn, InterfaceC34685l2 interfaceC34685l2) {
        this.f95943b = new C34928u6(str, interfaceC34867rn, interfaceC34685l2);
        this.f95942a = c34408am;
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC34490dn> withValue(@NonNull String str) {
        C34928u6 c34928u6 = this.f95943b;
        return new UserProfileUpdate<>(new C34435bm(c34928u6.f95453c, str, this.f95942a, c34928u6.f95451a, new C33935H4(c34928u6.f95452b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC34490dn> withValueIfUndefined(@NonNull String str) {
        C34928u6 c34928u6 = this.f95943b;
        return new UserProfileUpdate<>(new C34435bm(c34928u6.f95453c, str, this.f95942a, c34928u6.f95451a, new C34487dk(c34928u6.f95452b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC34490dn> withValueReset() {
        C34928u6 c34928u6 = this.f95943b;
        return new UserProfileUpdate<>(new C34235Th(0, c34928u6.f95453c, c34928u6.f95451a, c34928u6.f95452b));
    }
}
