package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.List;
import kotlin.collections._Collections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.te */
/* loaded from: classes9.dex */
public final class C34910te implements InterfaceC34409an {

    /* renamed from: a */
    public final boolean f95406a;

    public C34910te(@NotNull C34962ve c34962ve) {
        boolean z;
        List<C34936ue> list = c34962ve.f95518b;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C34936ue c34936ue : list) {
                if (c34936ue.f95465c == EnumC34154Q7.f93390c) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.f95406a = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34409an, kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a */
    public final List<C34936ue> mo105910invoke(@NotNull List<? extends C34936ue> list, @NotNull C33969Ie c33969Ie) {
        List<C34936ue> m17568K0;
        List<C34936ue> m17568K02;
        C34936ue c34936ue = new C34936ue(c33969Ie.f93024a, c33969Ie.f93025b, c33969Ie.f93028e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C34936ue c34936ue2 : list) {
                if (c34936ue2.f95465c == c33969Ie.f93028e) {
                    if (c34936ue.f95465c == EnumC34154Q7.f93390c && this.f95406a) {
                        m17568K0 = _Collections.m17568K0(list, c34936ue);
                        return m17568K0;
                    }
                    return null;
                }
            }
        }
        m17568K02 = _Collections.m17568K0(list, c34936ue);
        return m17568K02;
    }
}
