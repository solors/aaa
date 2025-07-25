package com.chartboost.sdk.impl;

import android.content.Context;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.w6 */
/* loaded from: classes3.dex */
public final class C10315w6 {

    /* renamed from: a */
    public final C10048m7 f23447a;

    /* renamed from: b */
    public final List f23448b;

    /* renamed from: com.chartboost.sdk.impl.w6$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10316a extends FunctionReferenceImpl implements Functions {
        public C10316a(Object obj) {
            super(0, obj, C10315w6.class, "isDeviceCompatible", "isDeviceCompatible()Z", 0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(((C10315w6) this.receiver).m80178b());
        }
    }

    /* renamed from: com.chartboost.sdk.impl.w6$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10317b extends FunctionReferenceImpl implements Functions {
        public C10317b(Object obj) {
            super(0, obj, C10315w6.class, "isInternetAvailable", "isInternetAvailable()Z", 0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(((C10315w6) this.receiver).m80176c());
        }
    }

    public C10315w6(Context context) {
        List m17163p;
        Intrinsics.checkNotNullParameter(context, "context");
        C10048m7 c10048m7 = new C10048m7(context);
        c10048m7.m81097b();
        this.f23447a = c10048m7;
        m17163p = C37563v.m17163p(new C10316a(this), new C10317b(this));
        this.f23448b = m17163p;
    }

    /* renamed from: b */
    public final boolean m80178b() {
        return true;
    }

    /* renamed from: c */
    public final boolean m80176c() {
        if (this.f23447a.m81100a()) {
            return true;
        }
        C9763c7.m81919b("Internet connection is not available.", null, 2, null);
        return false;
    }

    /* renamed from: d */
    public final boolean m80175d() {
        for (Functions functions : this.f23448b) {
            if (!((Boolean) functions.invoke()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void m80180a() {
        this.f23447a.m81096c();
    }
}
