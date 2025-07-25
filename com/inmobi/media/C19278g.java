package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.g */
/* loaded from: classes6.dex */
public final class C19278g extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ C19292h f48236a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19278g(C19292h c19292h) {
        super(0);
        this.f48236a = c19292h;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        return new AdMetaInfo(this.f48236a.m60292o(), this.f48236a.m60321E());
    }
}
