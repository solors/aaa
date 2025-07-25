package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import kotlin.Tuples;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import kotlin.sequences._SequencesJvm;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class d81 {
    @NotNull

    /* renamed from: a */
    private final gu0 f77999a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.d81$a */
    /* loaded from: classes8.dex */
    public static final class C30151a extends Lambda implements Function1<y52, m62<u71>> {

        /* renamed from: b */
        public static final C30151a f78000b = new C30151a();

        C30151a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final m62<u71> invoke(y52 y52Var) {
            y52 it = y52Var;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m27026b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.d81$b */
    /* loaded from: classes8.dex */
    public static final class C30152b extends Lambda implements Function1<m62<u71>, Tuples<? extends String, ? extends String>> {

        /* renamed from: b */
        public static final C30152b f78001b = new C30152b();

        C30152b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Tuples<? extends String, ? extends String> invoke(m62<u71> m62Var) {
            m62<u71> it = m62Var;
            Intrinsics.checkNotNullParameter(it, "it");
            return C38513v.m14532a(it.m32085d().getUrl(), it.m32084e());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.d81$c */
    /* loaded from: classes8.dex */
    static final class C30153c extends Lambda implements Function1<y52, bh0> {

        /* renamed from: b */
        public static final C30153c f78002b = new C30153c();

        C30153c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final bh0 invoke(y52 y52Var) {
            y52 it = y52Var;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m27027a();
        }
    }

    public /* synthetic */ d81() {
        this(new gu0());
    }

    @NotNull
    /* renamed from: b */
    public final SortedSet m34994b(@NotNull n31 nativeAdResponse) {
        Sequence m17548e0;
        Sequence m16810t;
        Sequence m16831A;
        Sequence m16804z;
        Sequence m16804z2;
        SortedSet m16832k;
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        m17548e0 = _Collections.m17548e0(nativeAdResponse.m31672e());
        m16810t = _Sequences.m16810t(m17548e0, new g81(this));
        m16831A = _Sequences.m16831A(m16810t, h81.f79986b);
        m16804z = _Sequences.m16804z(m16831A, e81.f78481b);
        m16804z2 = _Sequences.m16804z(m16804z, f81.f79010b);
        m16832k = _SequencesJvm.m16832k(m16804z2);
        return m16832k;
    }

    @NotNull
    /* renamed from: c */
    public final Set<bh0> m34993c(@NotNull n31 nativeAdResponse) {
        Sequence m17548e0;
        Sequence m16810t;
        Sequence m16831A;
        Sequence m16831A2;
        Set<bh0> m16820L;
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        m17548e0 = _Collections.m17548e0(nativeAdResponse.m31672e());
        m16810t = _Sequences.m16810t(m17548e0, new g81(this));
        m16831A = _Sequences.m16831A(m16810t, h81.f79986b);
        m16831A2 = _Sequences.m16831A(m16831A, C30153c.f78002b);
        m16820L = _Sequences.m16820L(m16831A2);
        return m16820L;
    }

    @NotNull
    /* renamed from: a */
    public final List<Tuples<String, String>> m34995a(@NotNull n31 nativeAdResponse) {
        Sequence m17548e0;
        Sequence m16810t;
        Sequence m16831A;
        Sequence m16804z;
        Sequence m16804z2;
        List<Tuples<String, String>> m16822J;
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        m17548e0 = _Collections.m17548e0(nativeAdResponse.m31672e());
        m16810t = _Sequences.m16810t(m17548e0, new g81(this));
        m16831A = _Sequences.m16831A(m16810t, h81.f79986b);
        m16804z = _Sequences.m16804z(m16831A, C30151a.f78000b);
        m16804z2 = _Sequences.m16804z(m16804z, C30152b.f78001b);
        m16822J = _Sequences.m16822J(m16804z2);
        return m16822J;
    }

    public d81(@NotNull gu0 mediaValuesProvider) {
        Intrinsics.checkNotNullParameter(mediaValuesProvider, "mediaValuesProvider");
        this.f77999a = mediaValuesProvider;
    }
}
