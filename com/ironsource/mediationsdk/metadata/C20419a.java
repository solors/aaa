package com.ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ironsource.mediationsdk.metadata.a */
/* loaded from: classes6.dex */
public class C20419a {

    /* renamed from: a */
    public static final String f51677a = "do_not_sell";

    /* renamed from: b */
    public static final String f51678b = "is_child_directed";

    /* renamed from: c */
    public static final String f51679c = "is_deviceid_optout";

    /* renamed from: d */
    public static final String f51680d = "google_family_self_certified_sdks";

    /* renamed from: e */
    public static final String f51681e = "iiqf";

    /* renamed from: f */
    public static final String f51682f = "is_test_suite";

    /* renamed from: g */
    public static final String f51683g = "true";

    /* renamed from: h */
    protected static final String f51684h = "false";

    /* renamed from: i */
    public static final String f51685i = "google_water_mark";

    /* renamed from: j */
    public static final String f51686j = "enable";

    /* renamed from: k */
    static final Set<String> f51687k;

    /* renamed from: l */
    static final Set<String> f51688l;

    /* renamed from: m */
    static final Set<String> f51689m;

    /* renamed from: n */
    public static final int f51690n = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList(f51678b, f51679c, f51682f, f51680d, f51681e));
        f51687k = hashSet;
        f51688l = new HashSet(Arrays.asList(f51679c, f51680d, f51682f, f51681e));
        HashSet hashSet2 = new HashSet(hashSet);
        f51689m = hashSet2;
        hashSet2.add(f51677a);
    }
}
