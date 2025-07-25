package com.yandex.mobile.ads.impl;

import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import p821oe.InterfaceC39163h;
import re.C39483c0;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC39163h
/* loaded from: classes8.dex */
public final class rg1 {
    @NotNull
    public static final C31283b Companion;
    @NotNull

    /* renamed from: b */
    private static final InterfaceC38501j<KSerializer<Object>> f84750b;

    /* renamed from: c */
    public static final rg1 f84751c;

    /* renamed from: d */
    public static final rg1 f84752d;

    /* renamed from: e */
    private static final /* synthetic */ rg1[] f84753e;

    /* renamed from: com.yandex.mobile.ads.impl.rg1$a */
    /* loaded from: classes8.dex */
    static final class C31282a extends Lambda implements Functions<KSerializer<Object>> {

        /* renamed from: b */
        public static final C31282a f84754b = new C31282a();

        C31282a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final KSerializer<Object> invoke() {
            return C39483c0.m12494a("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResultStatus", rg1.values(), new String[]{"success", "error"}, new Annotation[][]{null, null}, null);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.rg1$b */
    /* loaded from: classes8.dex */
    public static final class C31283b {
        private C31283b() {
        }

        @NotNull
        public final KSerializer<rg1> serializer() {
            return (KSerializer) rg1.f84750b.getValue();
        }

        public /* synthetic */ C31283b(int i) {
            this();
        }
    }

    static {
        InterfaceC38501j<KSerializer<Object>> m14553b;
        rg1 rg1Var = new rg1(0, "SUCCESS");
        f84751c = rg1Var;
        rg1 rg1Var2 = new rg1(1, "ERROR");
        f84752d = rg1Var2;
        rg1[] rg1VarArr = {rg1Var, rg1Var2};
        f84753e = rg1VarArr;
        C44401b.m3113a(rg1VarArr);
        Companion = new C31283b(0);
        m14553b = LazyJVM.m14553b(EnumC38505n.f101866c, C31282a.f84754b);
        f84750b = m14553b;
    }

    private rg1(int i, String str) {
    }

    public static rg1 valueOf(String str) {
        return (rg1) Enum.valueOf(rg1.class, str);
    }

    public static rg1[] values() {
        return (rg1[]) f84753e.clone();
    }
}
