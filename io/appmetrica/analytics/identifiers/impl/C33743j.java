package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.identifiers.impl.j */
/* loaded from: classes9.dex */
public final class C33743j implements InterfaceC33735b {

    /* renamed from: a */
    public final C33739f f92532a;

    @VisibleForTesting
    public C33743j(@NotNull C33739f c33739f) {
        this.f92532a = c33739f;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.InterfaceC33735b
    @NotNull
    /* renamed from: a */
    public final C33736c mo22788a(@NotNull Context context) {
        C33736c c33736c;
        C33739f c33739f;
        try {
            try {
                try {
                    C33746m c33746m = (C33746m) ((InterfaceC33748o) this.f92532a.m22796a(context));
                    c33736c = new C33736c(IdentifierStatus.OK, new C33734a("huawei", c33746m.m22793a(), Boolean.valueOf(c33746m.m22792b())), null, 4);
                    c33739f = this.f92532a;
                } catch (C33740g e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "unknown exception during binding huawei services";
                    }
                    c33736c = new C33736c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message);
                    c33739f = this.f92532a;
                    c33739f.m22795b(context);
                    return c33736c;
                } catch (Throwable th) {
                    c33736c = new C33736c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, "exception while fetching hoaid: " + th.getMessage());
                    c33739f = this.f92532a;
                    c33739f.m22795b(context);
                    return c33736c;
                }
                c33739f.m22795b(context);
            } catch (Throwable unused) {
            }
            return c33736c;
        } catch (Throwable th2) {
            try {
                this.f92532a.m22795b(context);
            } catch (Throwable unused2) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C33743j() {
        /*
            r4 = this;
            io.appmetrica.analytics.identifiers.impl.f r0 = new io.appmetrica.analytics.identifiers.impl.f
            android.content.Intent r1 = io.appmetrica.analytics.identifiers.impl.AbstractC33744k.m22794a()
            io.appmetrica.analytics.identifiers.impl.i r2 = io.appmetrica.analytics.identifiers.impl.C33742i.f92531a
            java.lang.String r3 = "huawei"
            r0.<init>(r1, r2, r3)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.identifiers.impl.C33743j.<init>():void");
    }
}
