package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.chartboost.sdk.impl.e2 */
/* loaded from: classes3.dex */
public final class C9824e2 {

    /* renamed from: c */
    public static final C9825a f21939c = new C9825a(null);

    /* renamed from: a */
    public final Object f21940a;

    /* renamed from: b */
    public final CBError f21941b;

    /* renamed from: com.chartboost.sdk.impl.e2$a */
    /* loaded from: classes3.dex */
    public static final class C9825a {
        public C9825a() {
        }

        /* renamed from: a */
        public final C9824e2 m81755a(Object obj) {
            return new C9824e2(obj, null, null);
        }

        public /* synthetic */ C9825a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9824e2 m81756a(CBError cBError) {
            return new C9824e2(null, cBError, null);
        }
    }

    public C9824e2(Object obj, CBError cBError) {
        this.f21940a = obj;
        this.f21941b = cBError;
    }

    /* renamed from: a */
    public static final C9824e2 m81757a(CBError cBError) {
        return f21939c.m81756a(cBError);
    }

    public /* synthetic */ C9824e2(Object obj, CBError cBError, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cBError);
    }
}
