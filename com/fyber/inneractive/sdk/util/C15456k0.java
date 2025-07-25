package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.util.k0 */
/* loaded from: classes4.dex */
public final class C15456k0 implements Comparable {

    /* renamed from: a */
    public final EnumC15454j0 f30603a;

    /* renamed from: b */
    public final Uri f30604b;

    /* renamed from: c */
    public final List f30605c;

    public C15456k0(EnumC15454j0 enumC15454j0, Uri uri, List list) {
        this.f30603a = enumC15454j0;
        this.f30604b = uri;
        this.f30605c = list;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f30603a.mPriority.compareTo(((C15456k0) obj).f30603a.mPriority);
    }
}
