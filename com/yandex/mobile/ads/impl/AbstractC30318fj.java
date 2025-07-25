package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fl1;
import com.yandex.mobile.ads.impl.k32;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fj */
/* loaded from: classes8.dex */
public abstract class AbstractC30318fj<T> implements dm1<C30359g3, C30149d8<T>> {
    @NotNull

    /* renamed from: a */
    private final C31264r7 f79093a;
    @NotNull

    /* renamed from: b */
    private final C30299f8<T> f79094b;

    /* renamed from: com.yandex.mobile.ads.impl.fj$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30319a<K> {
        @NotNull
        /* renamed from: a */
        gl1 mo31654a(@Nullable om1<C30149d8<K>> om1Var, @NotNull C30359g3 c30359g3);
    }

    public AbstractC30318fj(@NotNull InterfaceC30319a<T> responseReportDataProvider) {
        Intrinsics.checkNotNullParameter(responseReportDataProvider, "responseReportDataProvider");
        this.f79093a = new C31264r7();
        this.f79094b = new C30299f8<>(responseReportDataProvider);
    }

    @Override // com.yandex.mobile.ads.impl.dm1
    /* renamed from: a */
    public final fl1 mo27572a(C30359g3 c30359g3) {
        Map m17285D;
        C30359g3 adConfiguration = c30359g3;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        gl1 mo32107a = mo32107a(adConfiguration);
        fl1.EnumC30324b enumC30324b = fl1.EnumC30324b.f79147k;
        Map<String, Object> m33815b = mo32107a.m33815b();
        C30280f m33891a = gb1.m33891a(mo32107a, enumC30324b, "reportType", m33815b, "reportData");
        String m34119a = enumC30324b.m34119a();
        m17285D = C37559r0.m17285D(m33815b);
        return new fl1(m34119a, m17285D, m33891a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public gl1 mo32107a(@NotNull C30359g3 adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        gl1 gl1Var = new gl1(new HashMap(), 2);
        C30705k7 m33981a = adConfiguration.m33981a();
        if (m33981a != null) {
            gl1Var = hl1.m33525a(gl1Var, this.f79093a.m30128a(m33981a));
        }
        gl1Var.m33814b(adConfiguration.m33966c(), "block_id");
        gl1Var.m33814b(adConfiguration.m33966c(), "ad_unit_id");
        gl1Var.m33814b(adConfiguration.m33968b().m32212a(), "ad_type");
        qu1 m33948r = adConfiguration.m33948r();
        if (m33948r != null) {
            gl1Var.m33814b(m33948r.mo29654a().m30213a(), "size_type");
        }
        gl1Var.m33814b(Boolean.valueOf(adConfiguration.m33946t() == k32.EnumC30698a.f81263c), "is_passback");
        return gl1Var;
    }

    @Override // com.yandex.mobile.ads.impl.dm1
    /* renamed from: a */
    public final fl1 mo27573a(om1 om1Var, int i, C30359g3 c30359g3) {
        Map m17285D;
        C30359g3 adConfiguration = c30359g3;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        gl1 mo32108a = mo32108a(i, adConfiguration, om1Var);
        fl1.EnumC30324b enumC30324b = fl1.EnumC30324b.f79148l;
        Map<String, Object> m33815b = mo32108a.m33815b();
        C30280f m33891a = gb1.m33891a(mo32108a, enumC30324b, "reportType", m33815b, "reportData");
        String m34119a = enumC30324b.m34119a();
        m17285D = C37559r0.m17285D(m33815b);
        return new fl1(m34119a, m17285D, m33891a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: a */
    public gl1 mo32108a(int i, @NotNull C30359g3 adConfiguration, @Nullable om1 om1Var) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        return this.f79094b.m34202a(i, adConfiguration, om1Var);
    }
}
