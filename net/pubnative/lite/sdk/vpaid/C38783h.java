package net.pubnative.lite.sdk.vpaid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: net.pubnative.lite.sdk.vpaid.h */
/* loaded from: classes10.dex */
public final /* synthetic */ class C38783h {
    /* renamed from: a */
    public static /* synthetic */ List m14082a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
