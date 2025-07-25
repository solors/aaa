package com.ironsource;

import com.ironsource.mediationsdk.C20348d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.q0 */
/* loaded from: classes6.dex */
public class C20667q0 {
    @NotNull

    /* renamed from: r */
    public static final C20668a f52480r = new C20668a(null);

    /* renamed from: s */
    public static final int f52481s = -1;
    @NotNull

    /* renamed from: a */
    private final IronSource.AD_UNIT f52482a;
    @Nullable

    /* renamed from: b */
    private final String f52483b;
    @Nullable

    /* renamed from: c */
    private final List<NetworkSettings> f52484c;
    @NotNull

    /* renamed from: d */
    private final C20028h5 f52485d;

    /* renamed from: e */
    private int f52486e;

    /* renamed from: f */
    private final int f52487f;

    /* renamed from: g */
    private boolean f52488g;

    /* renamed from: h */
    private final int f52489h;

    /* renamed from: i */
    private final int f52490i;
    @NotNull

    /* renamed from: j */
    private final C19950g2 f52491j;
    @NotNull

    /* renamed from: k */
    private final C19612b2 f52492k;

    /* renamed from: l */
    private final boolean f52493l;

    /* renamed from: m */
    private final long f52494m;

    /* renamed from: n */
    private final boolean f52495n;

    /* renamed from: o */
    private final boolean f52496o;

    /* renamed from: p */
    private final boolean f52497p;

    /* renamed from: q */
    private boolean f52498q;

    @Metadata
    /* renamed from: com.ironsource.q0$a */
    /* loaded from: classes6.dex */
    public static final class C20668a {
        private C20668a() {
        }

        public /* synthetic */ C20668a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20667q0(@NotNull IronSource.AD_UNIT adUnit, @Nullable String str, @Nullable List<? extends NetworkSettings> list, @NotNull C20028h5 auctionSettings, int i, int i2, boolean z, int i3, int i4, @NotNull C19950g2 loadingData, @NotNull C19612b2 interactionData, boolean z2, long j, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(auctionSettings, "auctionSettings");
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        Intrinsics.checkNotNullParameter(interactionData, "interactionData");
        this.f52482a = adUnit;
        this.f52483b = str;
        this.f52484c = list;
        this.f52485d = auctionSettings;
        this.f52486e = i;
        this.f52487f = i2;
        this.f52488g = z;
        this.f52489h = i3;
        this.f52490i = i4;
        this.f52491j = loadingData;
        this.f52492k = interactionData;
        this.f52493l = z2;
        this.f52494m = j;
        this.f52495n = z3;
        this.f52496o = z4;
        this.f52497p = z5;
        this.f52498q = z6;
    }

    /* renamed from: a */
    public final int m55715a() {
        return this.f52490i;
    }

    @NotNull
    /* renamed from: b */
    public final IronSource.AD_UNIT m55711b() {
        return this.f52482a;
    }

    /* renamed from: c */
    public final boolean m55709c() {
        return this.f52488g;
    }

    @NotNull
    /* renamed from: d */
    public final C20028h5 m55708d() {
        return this.f52485d;
    }

    /* renamed from: e */
    public final boolean m55707e() {
        return this.f52493l;
    }

    /* renamed from: f */
    public final long m55706f() {
        return this.f52494m;
    }

    /* renamed from: g */
    public final int m55705g() {
        return this.f52489h;
    }

    @NotNull
    /* renamed from: h */
    public final C19612b2 m55704h() {
        return this.f52492k;
    }

    @NotNull
    /* renamed from: i */
    public final C19950g2 m55703i() {
        return this.f52491j;
    }

    /* renamed from: j */
    public final int m55702j() {
        return this.f52486e;
    }

    @Nullable
    /* renamed from: k */
    public List<NetworkSettings> mo53976k() {
        return this.f52484c;
    }

    /* renamed from: l */
    public final boolean m55701l() {
        return this.f52495n;
    }

    /* renamed from: m */
    public final boolean m55700m() {
        return this.f52497p;
    }

    /* renamed from: n */
    public final boolean m55699n() {
        return this.f52498q;
    }

    /* renamed from: o */
    public final int m55698o() {
        return this.f52487f;
    }

    @Nullable
    /* renamed from: p */
    public String mo53975p() {
        return this.f52483b;
    }

    /* renamed from: q */
    public final boolean m55697q() {
        return this.f52496o;
    }

    /* renamed from: r */
    public final boolean m55696r() {
        if (this.f52485d.m58292g() > 0) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: s */
    public final String m55695s() {
        String format = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", C20348d.f51337w, Integer.valueOf(this.f52486e), C20348d.f51338x, Boolean.valueOf(this.f52488g), C20348d.f51339y, Boolean.valueOf(this.f52498q));
        Intrinsics.checkNotNullExpressionValue(format, "format(\n          Locale…     showPriorityEnabled)");
        return format;
    }

    public /* synthetic */ C20667q0(IronSource.AD_UNIT ad_unit, String str, List list, C20028h5 c20028h5, int i, int i2, boolean z, int i3, int i4, C19950g2 c19950g2, C19612b2 c19612b2, boolean z2, long j, boolean z3, boolean z4, boolean z5, boolean z6, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, str, list, c20028h5, i, i2, z, i3, i4, c19950g2, c19612b2, z2, j, z3, z4, z5, (i5 & 65536) != 0 ? false : z6);
    }

    @Nullable
    /* renamed from: a */
    public final NetworkSettings m55713a(@NotNull String instanceName) {
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        List<NetworkSettings> mo53976k = mo53976k();
        Object obj = null;
        if (mo53976k != null) {
            Iterator<T> it = mo53976k.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                    obj = next;
                    break;
                }
            }
            return (NetworkSettings) obj;
        }
        return null;
    }

    /* renamed from: b */
    public final void m55710b(boolean z) {
        this.f52498q = z;
    }

    /* renamed from: a */
    public final void m55714a(int i) {
        this.f52486e = i;
    }

    /* renamed from: a */
    public final void m55712a(boolean z) {
        this.f52488g = z;
    }
}
