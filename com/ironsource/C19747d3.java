package com.ironsource;

import com.ironsource.C19869f3;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.d3 */
/* loaded from: classes6.dex */
public final class C19747d3 implements InterfaceC19799e3 {
    @NotNull

    /* renamed from: a */
    private final String f49701a;
    @NotNull

    /* renamed from: b */
    private final String f49702b;
    @NotNull

    /* renamed from: c */
    private final IronSource.AD_UNIT f49703c;

    /* renamed from: d */
    private final boolean f49704d;

    /* renamed from: e */
    private final boolean f49705e;

    /* renamed from: f */
    private final boolean f49706f;

    @Metadata
    /* renamed from: com.ironsource.d3$a */
    /* loaded from: classes6.dex */
    public static final class C19748a {
        @NotNull

        /* renamed from: a */
        public static final C19748a f49707a = new C19748a();

        /* renamed from: b */
        public static final int f49708b = 1;

        /* renamed from: c */
        public static final int f49709c = 1;

        /* renamed from: d */
        public static final int f49710d = 1;

        private C19748a() {
        }
    }

    public C19747d3(@NotNull String version, @NotNull String instanceId, @NotNull IronSource.AD_UNIT adFormat, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f49701a = version;
        this.f49702b = instanceId;
        this.f49703c = adFormat;
        this.f49704d = z;
        this.f49705e = z2;
        this.f49706f = z3;
    }

    @Override // com.ironsource.InterfaceC19799e3
    @NotNull
    /* renamed from: a */
    public ArrayList<InterfaceC19952g3> mo58831a() {
        ArrayList<InterfaceC19952g3> arrayList = new ArrayList<>();
        arrayList.add(new C19869f3.C19891v(this.f49701a));
        arrayList.add(new C19869f3.C19893x(this.f49702b));
        arrayList.add(new C19869f3.C19870a(this.f49703c));
        if (this.f49704d) {
            arrayList.add(new C19869f3.C19885p(1));
        }
        if (this.f49705e) {
            arrayList.add(new C19869f3.C19874e(1));
        }
        if (this.f49706f) {
            arrayList.add(new C19869f3.C19884o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C19747d3(String str, String str2, IronSource.AD_UNIT ad_unit, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, ad_unit, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }
}
