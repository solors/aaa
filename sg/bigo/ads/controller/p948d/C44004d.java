package sg.bigo.ads.controller.p948d;

import androidx.annotation.Nullable;
import sg.bigo.ads.common.InterfaceC43710k;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.controller.p944a.C43938b;

/* renamed from: sg.bigo.ads.controller.d.d */
/* loaded from: classes10.dex */
public final class C44004d implements InterfaceC43710k {
    @Nullable

    /* renamed from: a */
    protected final C43938b f115416a;

    public C44004d(@Nullable C43938b c43938b) {
        this.f115416a = c43938b;
    }

    @Override // sg.bigo.ads.common.InterfaceC43710k
    /* renamed from: a */
    public final String mo4196a(String str) {
        C43938b c43938b;
        if (!C43836q.m4837a((CharSequence) str) && (c43938b = this.f115416a) != null) {
            return c43938b.m4529b(str);
        }
        return "";
    }
}
