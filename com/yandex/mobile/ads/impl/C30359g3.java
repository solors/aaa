package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.model.MediationNetwork;
import com.yandex.mobile.ads.impl.k32;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.g3 */
/* loaded from: classes8.dex */
public final class C30359g3 {
    @NotNull

    /* renamed from: a */
    private final EnumC30803lr f79453a;
    @NotNull

    /* renamed from: b */
    private final pq1 f79454b;
    @NotNull

    /* renamed from: c */
    private final C30962np f79455c;
    @NotNull

    /* renamed from: d */
    private final C31184q9 f79456d;
    @NotNull

    /* renamed from: e */
    private final ru1 f79457e;
    @Nullable

    /* renamed from: f */
    private C30705k7 f79458f;
    @Nullable

    /* renamed from: g */
    private r61 f79459g;
    @Nullable

    /* renamed from: h */
    private o61 f79460h;
    @Nullable

    /* renamed from: i */
    private k32.EnumC30698a f79461i;
    @Nullable

    /* renamed from: j */
    private String f79462j;
    @Nullable

    /* renamed from: k */
    private String f79463k;
    @Nullable

    /* renamed from: l */
    private String f79464l;
    @Nullable

    /* renamed from: m */
    private Integer f79465m;
    @Nullable

    /* renamed from: n */
    private MediationNetwork f79466n;
    @Nullable

    /* renamed from: o */
    private String f79467o;

    /* renamed from: p */
    private boolean f79468p;

    /* renamed from: q */
    private int f79469q;

    /* renamed from: r */
    private int f79470r;

    public /* synthetic */ C30359g3(EnumC30803lr enumC30803lr, pq1 pq1Var) {
        this(enumC30803lr, pq1Var, new C30962np(), new C31184q9(), new ru1());
    }

    @Nullable
    /* renamed from: a */
    public final C30705k7 m33981a() {
        return this.f79458f;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC30803lr m33968b() {
        return this.f79453a;
    }

    @Nullable
    /* renamed from: c */
    public final String m33966c() {
        return this.f79456d.m30444a();
    }

    @Nullable
    /* renamed from: d */
    public final Integer m33964d() {
        return this.f79465m;
    }

    @NotNull
    /* renamed from: e */
    public final C31807xb m33962e() {
        return this.f79455c.m31449a();
    }

    @Nullable
    /* renamed from: f */
    public final String m33960f() {
        return this.f79462j;
    }

    @NotNull
    /* renamed from: g */
    public final C30962np m33959g() {
        return this.f79455c;
    }

    /* renamed from: h */
    public final int m33958h() {
        return this.f79470r;
    }

    @Nullable
    /* renamed from: i */
    public final MediationNetwork m33957i() {
        return this.f79466n;
    }

    @Nullable
    /* renamed from: j */
    public final String m33956j() {
        return this.f79467o;
    }

    @NotNull
    /* renamed from: k */
    public final f30 m33955k() {
        return this.f79455c.m31446b();
    }

    @Nullable
    /* renamed from: l */
    public final String m33954l() {
        return this.f79463k;
    }

    @NotNull
    /* renamed from: m */
    public final List<String> m33953m() {
        return this.f79455c.m31445c();
    }

    @Nullable
    /* renamed from: n */
    public final String m33952n() {
        return this.f79464l;
    }

    /* renamed from: o */
    public final int m33951o() {
        return this.f79469q;
    }

    @Nullable
    /* renamed from: p */
    public final o61 m33950p() {
        return this.f79460h;
    }

    @NotNull
    /* renamed from: q */
    public final pq1 m33949q() {
        return this.f79454b;
    }

    @Nullable
    /* renamed from: r */
    public final qu1 m33948r() {
        return this.f79457e.m29935a();
    }

    @Nullable
    /* renamed from: s */
    public final r61 m33947s() {
        return this.f79459g;
    }

    @Nullable
    /* renamed from: t */
    public final k32.EnumC30698a m33946t() {
        return this.f79461i;
    }

    /* renamed from: u */
    public final boolean m33945u() {
        return this.f79468p;
    }

    /* renamed from: a */
    public final void m33976a(@Nullable C30705k7 c30705k7) {
        this.f79458f = c30705k7;
    }

    /* renamed from: b */
    public final void m33967b(@Nullable String str) {
        this.f79462j = str;
    }

    /* renamed from: c */
    public final void m33965c(@Nullable String str) {
        this.f79467o = str;
    }

    /* renamed from: d */
    public final void m33963d(@Nullable String str) {
        this.f79463k = str;
    }

    /* renamed from: e */
    public final void m33961e(@Nullable String str) {
        this.f79464l = str;
    }

    /* renamed from: a */
    public final void m33970a(@Nullable String str) {
        this.f79456d.m30443a(str);
    }

    /* renamed from: a */
    public final void m33971a(@Nullable Integer num) {
        this.f79465m = num;
    }

    public C30359g3(@NotNull EnumC30803lr adType, @NotNull pq1 sdkEnvironmentModule, @NotNull C30962np commonAdRequestConfiguration, @NotNull C31184q9 adUnitIdConfigurator, @NotNull ru1 sizeInfoConfigurator) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(commonAdRequestConfiguration, "commonAdRequestConfiguration");
        Intrinsics.checkNotNullParameter(adUnitIdConfigurator, "adUnitIdConfigurator");
        Intrinsics.checkNotNullParameter(sizeInfoConfigurator, "sizeInfoConfigurator");
        this.f79453a = adType;
        this.f79454b = sdkEnvironmentModule;
        this.f79455c = commonAdRequestConfiguration;
        this.f79456d = adUnitIdConfigurator;
        this.f79457e = sizeInfoConfigurator;
        this.f79468p = true;
        this.f79470r = if0.f80444b;
    }

    /* renamed from: a */
    public final void m33972a(@NotNull C31807xb configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f79455c.m31447a(configuration);
    }

    /* renamed from: a */
    public final void m33979a(@Nullable MediationNetwork mediationNetwork) {
        this.f79466n = mediationNetwork;
    }

    /* renamed from: a */
    public final void m33978a(@NotNull f30 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f79455c.m31448a(configuration);
    }

    /* renamed from: a */
    public final void m33980a(int i) {
        this.f79469q = i;
    }

    /* renamed from: a */
    public final void m33975a(@Nullable o61 o61Var) {
        this.f79460h = o61Var;
    }

    /* renamed from: a */
    public final void m33969a(boolean z) {
        this.f79468p = z;
    }

    /* renamed from: a */
    public final void m33974a(@Nullable qu1 qu1Var) {
        this.f79457e.m29934a(qu1Var);
    }

    /* renamed from: a */
    public final void m33973a(@Nullable r61 r61Var) {
        this.f79459g = r61Var;
    }

    /* renamed from: a */
    public final void m33977a(@Nullable k32.EnumC30698a enumC30698a) {
        this.f79461i = enumC30698a;
    }
}
