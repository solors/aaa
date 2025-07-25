package com.inmobi.media;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: com.inmobi.media.m4 */
/* loaded from: classes6.dex */
public final class C19367m4 extends ObservableProperty {

    /* renamed from: a */
    public final /* synthetic */ C19381n4 f48493a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19367m4(EnumC19232c9 enumC19232c9, C19381n4 c19381n4) {
        super(enumC19232c9);
        this.f48493a = c19381n4;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        EnumC19232c9 enumC19232c9 = (EnumC19232c9) obj2;
        if (AbstractC19246d9.m60378a((EnumC19232c9) obj) != AbstractC19246d9.m60378a(enumC19232c9)) {
            Iterator it = this.f48493a.f48537b.iterator();
            while (it.hasNext()) {
                ((InterfaceC19274f9) it.next()).mo60074a(enumC19232c9);
            }
        }
    }
}
