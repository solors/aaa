package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.O8 */
/* loaded from: classes9.dex */
public final class C34107O8 {

    /* renamed from: a */
    public final C34059M8 f93295a;

    /* renamed from: b */
    public final C34083N8 f93296b;

    /* renamed from: c */
    public final IBinaryDataHelper f93297c;

    public C34107O8(Context context, C34391a5 c34391a5) {
        this(new C34083N8(), new C34059M8(), C34393a7.m22013a(context).m22012a(c34391a5));
    }

    public C34107O8(C34083N8 c34083n8, C34059M8 c34059m8, IBinaryDataHelper iBinaryDataHelper) {
        this.f93296b = c34083n8;
        this.f93295a = c34059m8;
        this.f93297c = iBinaryDataHelper;
    }
}
