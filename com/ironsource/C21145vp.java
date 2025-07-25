package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ironsource.vp */
/* loaded from: classes6.dex */
public class C21145vp {

    /* renamed from: a */
    public static C21146a f54235a = new C21146a(2001, m54395a("initsdk"));

    /* renamed from: b */
    public static C21146a f54236b = new C21146a(2026, m54395a("sdkrecoverstart"));

    /* renamed from: c */
    public static C21146a f54237c = new C21146a(2002, m54395a("createcontrollerweb"));

    /* renamed from: d */
    public static C21146a f54238d = new C21146a(2003, m54395a("createcontrollernative"));

    /* renamed from: e */
    public static C21146a f54239e = new C21146a(2004, m54395a("controllerstageready"));

    /* renamed from: f */
    public static C21146a f54240f = new C21146a(2005, m54395a("loadad"));

    /* renamed from: g */
    public static C21146a f54241g = new C21146a(2006, m54395a("loadadfailed"));

    /* renamed from: h */
    public static C21146a f54242h = new C21146a(2007, m54395a("initproduct"));

    /* renamed from: i */
    public static C21146a f54243i = new C21146a(2008, m54395a("initproductfailed"));

    /* renamed from: j */
    public static C21146a f54244j = new C21146a(2009, m54395a("loadproduct"));

    /* renamed from: k */
    public static C21146a f54245k = new C21146a(IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, m54395a("parseadmfailed"));

    /* renamed from: l */
    public static C21146a f54246l = new C21146a(2011, m54395a("loadadsuccess"));

    /* renamed from: m */
    public static C21146a f54247m = new C21146a(2027, m54395a("destroyproduct"));

    /* renamed from: n */
    public static C21146a f54248n = new C21146a(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, m54395a("registerad"));

    /* renamed from: o */
    public static C21146a f54249o = new C21146a(2013, m54395a("controllerfailed"));

    /* renamed from: p */
    public static C21146a f54250p = new C21146a(2015, m54395a("appendnativefeaturesdatafailed"));

    /* renamed from: q */
    public static C21146a f54251q = new C21146a(2016, m54395a("adunitcouldnotloadtowebview"));

    /* renamed from: r */
    public static C21146a f54252r = new C21146a(2017, m54395a("webviewcleanupfailed"));

    /* renamed from: s */
    public static C21146a f54253s = new C21146a(2018, m54395a("removewebviewfailed"));

    /* renamed from: t */
    public static C21146a f54254t = new C21146a(2020, m54395a("banneralreadydestroyed"));

    /* renamed from: u */
    public static C21146a f54255u = new C21146a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, m54395a("fialedregactlifecycle"));

    /* renamed from: v */
    public static C21146a f54256v = new C21146a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, m54395a("loadcontrollerhtml"));

    /* renamed from: w */
    public static C21146a f54257w = new C21146a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, m54395a("controllerhtmlsuccess"));

    /* renamed from: x */
    public static C21146a f54258x = new C21146a(2024, m54395a("controllerhtmlfailed"));

    /* renamed from: y */
    public static C21146a f54259y = new C21146a(2025, m54395a("webviewcrashrpg"));

    /* renamed from: z */
    public static C21146a f54260z = new C21146a(2031, m54395a("getorientationcalled"));

    /* renamed from: A */
    public static C21146a f54233A = new C21146a(2032, m54395a("webviewunavailable"));

    /* renamed from: B */
    public static final C21146a f54234B = new C21146a(2033, m54395a("controller_init_delayed"));

    /* renamed from: com.ironsource.vp$a */
    /* loaded from: classes6.dex */
    public static class C21146a {

        /* renamed from: a */
        String f54261a;

        /* renamed from: b */
        int f54262b;

        C21146a(int i, String str) {
            this.f54262b = i;
            this.f54261a = str;
        }
    }

    /* renamed from: a */
    static String m54395a(String str) {
        return C20517nb.f52177c + str;
    }
}
