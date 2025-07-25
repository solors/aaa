package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.C20410l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p850qd.C39385c;

@Metadata
/* renamed from: com.ironsource.y2 */
/* loaded from: classes6.dex */
public final class C21248y2 {
    @NotNull

    /* renamed from: b */
    public static final C21249a f54542b = new C21249a(null);

    /* renamed from: c */
    private static final int f54543c = -1;
    @NotNull

    /* renamed from: a */
    private final C20022h1 f54544a;

    @Metadata
    /* renamed from: com.ironsource.y2$a */
    /* loaded from: classes6.dex */
    public static final class C21249a {
        private C21249a() {
        }

        public /* synthetic */ C21249a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.y2$b */
    /* loaded from: classes6.dex */
    public static final class C21250b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m12778d;
            m12778d = C39385c.m12778d(Integer.valueOf(((LevelPlayAdSize) t2).getWidth()), Integer.valueOf(((LevelPlayAdSize) t).getWidth()));
            return m12778d;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.y2$c */
    /* loaded from: classes6.dex */
    public static final class C21251c<T> implements Comparator {

        /* renamed from: a */
        final /* synthetic */ Comparator f54545a;

        public C21251c(Comparator comparator) {
            this.f54545a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int m12778d;
            int compare = this.f54545a.compare(t, t2);
            if (compare == 0) {
                m12778d = C39385c.m12778d(Integer.valueOf(((LevelPlayAdSize) t2).getHeight()), Integer.valueOf(((LevelPlayAdSize) t).getHeight()));
                return m12778d;
            }
            return compare;
        }
    }

    public C21248y2(@NotNull C20022h1 adSizeTools) {
        Intrinsics.checkNotNullParameter(adSizeTools, "adSizeTools");
        this.f54544a = adSizeTools;
    }

    /* renamed from: a */
    private final int m54049a(Integer num, Context context) {
        if (num != null && num.intValue() < 0) {
            IronLog.API.info(C20022h1.m58319a(this.f54544a, "Width is invalid, screen width will be used", (String) null, 2, (Object) null));
        } else if (num != null) {
            return num.intValue();
        }
        return C20516na.f52153a.m56168b(context);
    }

    @Nullable
    /* renamed from: a */
    public final LevelPlayAdSize m54050a(@NotNull Context context, @Nullable Integer num) {
        int i;
        LevelPlayAdSize levelPlayAdSize;
        Object m17577B0;
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f54544a.m58311d()) {
            IronLog.API.error(C20022h1.m58319a(this.f54544a, "The SDK must be successfully initialized to create an Adaptive Ad Size", (String) null, 2, (Object) null));
            return null;
        }
        int m54049a = m54049a(num, context);
        int m58315b = this.f54544a.m58315b(context);
        int m58320a = this.f54544a.m58320a(m54049a);
        List<LevelPlayAdSize> m54051a = m54051a();
        for (LevelPlayAdSize levelPlayAdSize2 : m54048a(m54051a, m58315b, m54049a)) {
            if (levelPlayAdSize2.getWidth() <= m54049a && (levelPlayAdSize2.getHeight() <= m58320a || m58320a == -1)) {
                m58320a = Math.max(m58320a, levelPlayAdSize2.getHeight());
                break;
            }
        }
        levelPlayAdSize2 = null;
        if (levelPlayAdSize2 == null) {
            m17577B0 = _Collections.m17577B0(m54051a);
            int height = ((LevelPlayAdSize) m17577B0).getHeight();
            i = height;
            levelPlayAdSize = LevelPlayAdSize.Companion.createCustomSize(m54049a, height);
        } else {
            i = m58320a;
            levelPlayAdSize = levelPlayAdSize2;
        }
        IronLog.INTERNAL.info(C20022h1.m58319a(this.f54544a, "Adaptive: " + m54049a + 'x' + i + " Fallback: " + levelPlayAdSize, (String) null, 2, (Object) null));
        return new LevelPlayAdSize(m54049a, i, C20410l.f51634f, true, levelPlayAdSize);
    }

    /* renamed from: a */
    private final List<LevelPlayAdSize> m54051a() {
        List<LevelPlayAdSize> m17560S0;
        m17560S0 = _Collections.m17560S0(this.f54544a.m58316b(), new C21251c(new C21250b()));
        return m17560S0;
    }

    /* renamed from: a */
    private final List<LevelPlayAdSize> m54048a(List<LevelPlayAdSize> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            LevelPlayAdSize levelPlayAdSize = (LevelPlayAdSize) obj;
            if (levelPlayAdSize.getHeight() <= i && levelPlayAdSize.getWidth() <= i2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
