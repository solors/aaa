package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections._Collections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.F3 */
/* loaded from: classes9.dex */
public final class C33884F3 implements InterfaceC34409an {
    @Override // io.appmetrica.analytics.impl.InterfaceC34409an, kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a */
    public final List<C33982J3> mo105910invoke(@NotNull List<C33982J3> list, @NotNull C33982J3 c33982j3) {
        List<C33982J3> m17568K0;
        List<C33982J3> m17568K02;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C33982J3 c33982j32 : list) {
                EnumC34154Q7 enumC34154Q7 = c33982j32.f93050b;
                EnumC34154Q7 enumC34154Q72 = c33982j3.f93050b;
                if (enumC34154Q7 == enumC34154Q72) {
                    if (enumC34154Q72 == EnumC34154Q7.f93390c) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (((C33982J3) obj).f93050b != EnumC34154Q7.f93390c) {
                                arrayList.add(obj);
                            }
                        }
                        m17568K0 = _Collections.m17568K0(arrayList, c33982j3);
                        return m17568K0;
                    }
                    return null;
                }
            }
        }
        m17568K02 = _Collections.m17568K0(list, c33982j3);
        return m17568K02;
    }
}
