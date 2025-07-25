package com.yandex.mobile.ads.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class f81 extends Lambda implements Function1<m62<u71>, String> {

    /* renamed from: b */
    public static final f81 f79010b = new f81();

    f81() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(m62<u71> m62Var) {
        m62<u71> it = m62Var;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.m32085d().getUrl();
    }
}
