package com.vungle.ads;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: VungleError.kt */
@Metadata
/* renamed from: com.vungle.ads.w0 */
/* loaded from: classes7.dex */
public final class C29574w0 extends AbstractC29537l2 {
    public /* synthetic */ C29574w0(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str);
    }

    @Override // com.vungle.ads.AbstractC29537l2
    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(C29574w0.class, cls)) {
            return false;
        }
        int code = getCode();
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.vungle.ads.InternalError");
        if (code == ((C29574w0) obj).getCode()) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.ads.AbstractC29537l2
    public int hashCode() {
        return C29574w0.class.hashCode();
    }

    public C29574w0(int i, @Nullable String str) {
        super(Integer.valueOf(i), null, str, null, null, null, 58, null);
    }
}
