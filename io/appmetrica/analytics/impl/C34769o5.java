package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.Tuples;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.o5 */
/* loaded from: classes9.dex */
public final class C34769o5 implements InterfaceC33779An {

    /* renamed from: a */
    public final List f95079a;

    public C34769o5(@NotNull List<? extends Tuples<String, ? extends InterfaceC33779An>> list) {
        this.f95079a = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33779An
    @Nullable
    /* renamed from: a */
    public final String mo21029a() {
        for (Tuples tuples : this.f95079a) {
            String mo21029a = ((InterfaceC33779An) tuples.m17629d()).mo21029a();
            if (mo21029a != null && mo21029a.length() > 0) {
                return mo21029a;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33779An
    /* renamed from: a */
    public final void mo21024a(@NotNull String str) {
        for (Tuples tuples : this.f95079a) {
            ((InterfaceC33779An) tuples.m17629d()).mo21024a(str);
        }
    }
}
