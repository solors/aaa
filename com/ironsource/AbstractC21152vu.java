package com.ironsource;

import com.ironsource.AbstractC20186k7;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: com.ironsource.vu */
/* loaded from: classes6.dex */
public abstract class AbstractC21152vu<Smash extends AbstractC20186k7<?>> {
    @NotNull

    /* renamed from: g */
    public static final C21153a f54272g = new C21153a(null);

    /* renamed from: a */
    private final int f54273a;

    /* renamed from: b */
    private final boolean f54274b;
    @NotNull

    /* renamed from: c */
    private final List<Smash> f54275c;
    @NotNull

    /* renamed from: d */
    private final List<Smash> f54276d;
    @NotNull

    /* renamed from: e */
    private final List<Smash> f54277e;
    @NotNull

    /* renamed from: f */
    private final List<Smash> f54278f;

    @Metadata
    /* renamed from: com.ironsource.vu$a */
    /* loaded from: classes6.dex */
    public static final class C21153a {

        @Metadata
        /* renamed from: com.ironsource.vu$a$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C21154a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f54279a;

            static {
                int[] iArr = new int[EnumC20777ru.values().length];
                try {
                    iArr[EnumC20777ru.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC20777ru.BIDDER_SENSITIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f54279a = iArr;
            }
        }

        private C21153a() {
        }

        public /* synthetic */ C21153a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final <Smash extends AbstractC20186k7<?>> AbstractC21152vu<Smash> m54381a(@NotNull EnumC20777ru loadingStrategy, int i, boolean z, @NotNull List<? extends Smash> waterfall) {
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            Intrinsics.checkNotNullParameter(waterfall, "waterfall");
            int i2 = C21154a.f54279a[loadingStrategy.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return new C20626p7(i, z, waterfall, false, 8, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new C21171w9(i, z, waterfall);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC21152vu(int i, boolean z, @NotNull List<? extends Smash> waterfall) {
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.f54273a = i;
        this.f54274b = z;
        this.f54275c = waterfall;
        this.f54276d = new ArrayList();
        this.f54277e = new ArrayList();
        this.f54278f = new ArrayList();
    }

    /* renamed from: a */
    private final int m54388a(Smash smash) {
        return smash.m57697i().m58642k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final int m54387b() {
        Integer num;
        List<Smash> list = this.f54275c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractC20186k7) obj).m57681y()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(m54388a((AbstractC20186k7) it.next()));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(m54388a((AbstractC20186k7) it.next()));
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    /* renamed from: c */
    public final List<Smash> m54385c() {
        return this.f54276d;
    }

    /* renamed from: c */
    public abstract void mo54360c(@NotNull Smash smash);

    /* renamed from: d */
    public final int m54384d() {
        return this.f54276d.size() + this.f54277e.size() + this.f54278f.size();
    }

    /* renamed from: e */
    public boolean mo54382e() {
        if (m54384d() >= this.f54273a) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m54386b(Smash smash) {
        return m54387b() < m54388a(smash);
    }

    @NotNull
    /* renamed from: a */
    public final List<Smash> m54389a() {
        return this.f54278f;
    }

    /* renamed from: d */
    public final void m54383d(@NotNull Smash smash) {
        IronLog ironLog;
        String str;
        IronLog ironLog2;
        StringBuilder sb2;
        String str2;
        List<Smash> list;
        Intrinsics.checkNotNullParameter(smash, "smash");
        if (!smash.m57682x()) {
            if (smash.m57681y()) {
                IronLog.INTERNAL.verbose(smash.m57699g().name() + " - Smash " + smash.m57695k() + " is already loaded");
                list = this.f54277e;
            } else {
                if (smash.m57680z()) {
                    ironLog2 = IronLog.INTERNAL;
                    sb2 = new StringBuilder();
                    sb2.append(smash.m57699g().name());
                    sb2.append(" - Smash ");
                    sb2.append(smash.m57695k());
                    str2 = " still loading";
                } else if (smash.m57733A().get()) {
                    ironLog2 = IronLog.INTERNAL;
                    sb2 = new StringBuilder();
                    sb2.append(smash.m57699g().name());
                    sb2.append(" - Smash ");
                    sb2.append(smash.m57695k());
                    str2 = " marked as loading candidate";
                } else if (!this.f54274b || !m54386b(smash)) {
                    mo54360c(smash);
                    return;
                } else {
                    ironLog = IronLog.INTERNAL;
                    str = smash.m57699g().name() + " - Smash " + smash.m57695k() + " is not better than already loaded smashes";
                }
                sb2.append(str2);
                ironLog2.verbose(sb2.toString());
                list = this.f54278f;
            }
            list.add(smash);
            return;
        }
        ironLog = IronLog.INTERNAL;
        str = smash.m57699g().name() + " - smash " + smash.m57695k() + " is failed to load";
        ironLog.verbose(str);
    }
}
