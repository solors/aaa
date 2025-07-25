package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C5434n;

/* renamed from: com.applovin.impl.a4 */
/* loaded from: classes2.dex */
public abstract class AbstractC3987a4 {

    /* renamed from: a */
    private static final C3988a f4480a = new C3988a("Age Restricted User", C5639uj.f11297m);

    /* renamed from: b */
    private static final C3988a f4481b = new C3988a("Has User Consent", C5639uj.f11296l);

    /* renamed from: c */
    private static final C3988a f4482c = new C3988a("\"Do Not Sell\"", C5639uj.f11298n);

    /* renamed from: com.applovin.impl.a4$a */
    /* loaded from: classes2.dex */
    public static class C3988a {

        /* renamed from: a */
        private final String f4483a;

        /* renamed from: b */
        private final C5639uj f4484b;

        C3988a(String str, C5639uj c5639uj) {
            this.f4483a = str;
            this.f4484b = c5639uj;
        }

        /* renamed from: b */
        public Boolean m101055b(Context context) {
            if (context == null) {
                C5434n.m94898h("AppLovinSdk", "Failed to get value for key: " + this.f4484b);
                return null;
            }
            return (Boolean) C5704vj.m93866a(this.f4484b, (Object) null, context);
        }

        /* renamed from: a */
        public String m101058a() {
            return this.f4483a;
        }

        /* renamed from: a */
        public String m101057a(Context context) {
            Boolean m101055b = m101055b(context);
            return m101055b != null ? m101055b.toString() : "No value set";
        }
    }

    /* renamed from: a */
    private static boolean m101063a(C5639uj c5639uj, Boolean bool, Context context) {
        if (context == null) {
            C5434n.m94898h("AppLovinSdk", "Failed to update compliance value for key: " + c5639uj);
            return false;
        }
        Boolean bool2 = (Boolean) C5704vj.m93866a(c5639uj, (Object) null, context);
        C5704vj.m93856b(c5639uj, bool, context);
        return bool2 == null || bool2 != bool;
    }

    /* renamed from: b */
    public static C3988a m101061b() {
        return f4481b;
    }

    /* renamed from: c */
    public static C3988a m101059c() {
        return f4480a;
    }

    /* renamed from: b */
    public static boolean m101060b(boolean z, Context context) {
        return m101063a(C5639uj.f11296l, Boolean.valueOf(z), context);
    }

    /* renamed from: a */
    public static C3988a m101066a() {
        return f4482c;
    }

    /* renamed from: a */
    public static boolean m101062a(boolean z, Context context) {
        return m101063a(C5639uj.f11298n, Boolean.valueOf(z), context);
    }

    /* renamed from: a */
    public static String m101065a(Context context) {
        return m101064a(f4481b, context) + m101064a(f4482c, context);
    }

    /* renamed from: a */
    private static String m101064a(C3988a c3988a, Context context) {
        return "\n" + c3988a.f4483a + " - " + c3988a.m101057a(context);
    }
}
