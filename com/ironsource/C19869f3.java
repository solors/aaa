package com.ironsource;

import com.ironsource.mediationsdk.C20410l;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.f3 */
/* loaded from: classes6.dex */
public final class C19869f3 {
    @NotNull

    /* renamed from: a */
    public static final C19869f3 f49984a = new C19869f3();

    @Metadata
    /* renamed from: com.ironsource.f3$a */
    /* loaded from: classes6.dex */
    public static final class C19870a implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final IronSource.AD_UNIT f49985a;

        public C19870a(@NotNull IronSource.AD_UNIT value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f49985a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ C19870a m58724a(C19870a c19870a, IronSource.AD_UNIT ad_unit, int i, Object obj) {
            if ((i & 1) != 0) {
                ad_unit = c19870a.f49985a;
            }
            return c19870a.m58723a(ad_unit);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19870a) && this.f49985a == ((C19870a) obj).f49985a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f49985a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdFormatEntity(value=" + this.f49985a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19870a m58723a(@NotNull IronSource.AD_UNIT value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new C19870a(value);
        }

        /* renamed from: a */
        private final IronSource.AD_UNIT m58725a() {
            return this.f49985a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("adUnit", Integer.valueOf(C20220ks.m57608b(this.f49985a)));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$b */
    /* loaded from: classes6.dex */
    public static final class C19871b implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final String f49986a;

        public C19871b(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f49986a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ C19871b m58721a(C19871b c19871b, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19871b.f49986a;
            }
            return c19871b.m58720a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19871b) && Intrinsics.m17075f(this.f49986a, ((C19871b) obj).f49986a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f49986a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdIdentifier(value=" + this.f49986a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19871b m58720a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new C19871b(value);
        }

        /* renamed from: a */
        private final String m58722a() {
            return this.f49986a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.f49986a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$c */
    /* loaded from: classes6.dex */
    public static final class C19872c implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final AdSize f49987a;

        public C19872c(@NotNull AdSize size) {
            Intrinsics.checkNotNullParameter(size, "size");
            this.f49987a = size;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            int i;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String sizeDescription = this.f49987a.getSizeDescription();
            int hashCode = sizeDescription.hashCode();
            if (hashCode != -96588539) {
                if (hashCode != 72205083) {
                    if (hashCode != 446888797) {
                        if (hashCode == 1951953708 && sizeDescription.equals(C20410l.f51629a)) {
                            i = 1;
                        }
                        i = 0;
                    } else {
                        if (sizeDescription.equals(C20410l.f51632d)) {
                            i = 4;
                        }
                        i = 0;
                    }
                } else {
                    if (sizeDescription.equals(C20410l.f51630b)) {
                        i = 2;
                    }
                    i = 0;
                }
            } else {
                if (sizeDescription.equals(C20410l.f51635g)) {
                    i = 3;
                }
                i = 0;
            }
            bundle.put(C20410l.f51636h, Integer.valueOf(i));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$d */
    /* loaded from: classes6.dex */
    public static final class C19873d implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final String f49988a;

        public C19873d(@NotNull String auctionId) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            this.f49988a = auctionId;
        }

        /* renamed from: a */
        public static /* synthetic */ C19873d m58718a(C19873d c19873d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19873d.f49988a;
            }
            return c19873d.m58717a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19873d) && Intrinsics.m17075f(this.f49988a, ((C19873d) obj).f49988a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f49988a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AuctionId(auctionId=" + this.f49988a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19873d m58717a(@NotNull String auctionId) {
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            return new C19873d(auctionId);
        }

        /* renamed from: a */
        private final String m58719a() {
            return this.f49988a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("auctionId", this.f49988a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$e */
    /* loaded from: classes6.dex */
    public static final class C19874e implements InterfaceC19952g3 {

        /* renamed from: a */
        private final int f49989a;

        public C19874e(int i) {
            this.f49989a = i;
        }

        /* renamed from: a */
        private final int m58716a() {
            return this.f49989a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19874e) && this.f49989a == ((C19874e) obj).f49989a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f49989a);
        }

        @NotNull
        public String toString() {
            return "DemandOnly(value=" + this.f49989a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19874e m58715a(int i) {
            return new C19874e(i);
        }

        /* renamed from: a */
        public static /* synthetic */ C19874e m58714a(C19874e c19874e, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c19874e.f49989a;
            }
            return c19874e.m58715a(i);
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.f49989a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$f */
    /* loaded from: classes6.dex */
    public static final class C19875f implements InterfaceC19952g3 {

        /* renamed from: a */
        private final long f49990a;

        public C19875f(long j) {
            this.f49990a = j;
        }

        /* renamed from: a */
        private final long m58713a() {
            return this.f49990a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19875f) && this.f49990a == ((C19875f) obj).f49990a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Long.hashCode(this.f49990a);
        }

        @NotNull
        public String toString() {
            return "Duration(duration=" + this.f49990a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19875f m58712a(long j) {
            return new C19875f(j);
        }

        /* renamed from: a */
        public static /* synthetic */ C19875f m58711a(C19875f c19875f, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = c19875f.f49990a;
            }
            return c19875f.m58712a(j);
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("duration", Long.valueOf(this.f49990a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$g */
    /* loaded from: classes6.dex */
    public static final class C19876g implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final String f49991a;

        public C19876g(@NotNull String dynamicSourceId) {
            Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            this.f49991a = dynamicSourceId;
        }

        /* renamed from: a */
        public static /* synthetic */ C19876g m58709a(C19876g c19876g, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19876g.f49991a;
            }
            return c19876g.m58708a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19876g) && Intrinsics.m17075f(this.f49991a, ((C19876g) obj).f49991a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f49991a.hashCode();
        }

        @NotNull
        public String toString() {
            return "DynamicDemandSourceId(dynamicSourceId=" + this.f49991a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19876g m58708a(@NotNull String dynamicSourceId) {
            Intrinsics.checkNotNullParameter(dynamicSourceId, "dynamicSourceId");
            return new C19876g(dynamicSourceId);
        }

        /* renamed from: a */
        private final String m58710a() {
            return this.f49991a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f49991a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$h */
    /* loaded from: classes6.dex */
    public static final class C19877h implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final String f49992a;

        public C19877h(@NotNull String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            this.f49992a = sourceId;
        }

        /* renamed from: a */
        public static /* synthetic */ C19877h m58706a(C19877h c19877h, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19877h.f49992a;
            }
            return c19877h.m58705a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19877h) && Intrinsics.m17075f(this.f49992a, ((C19877h) obj).f49992a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f49992a.hashCode();
        }

        @NotNull
        public String toString() {
            return "DynamicSourceId(sourceId=" + this.f49992a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19877h m58705a(@NotNull String sourceId) {
            Intrinsics.checkNotNullParameter(sourceId, "sourceId");
            return new C19877h(sourceId);
        }

        /* renamed from: a */
        private final String m58707a() {
            return this.f49992a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("dynamicDemandSource", this.f49992a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$i */
    /* loaded from: classes6.dex */
    public static final class C19878i implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        public static final C19878i f49993a = new C19878i();

        private C19878i() {
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$j */
    /* loaded from: classes6.dex */
    public static final class C19879j implements InterfaceC19952g3 {

        /* renamed from: a */
        private final int f49994a;

        public C19879j(int i) {
            this.f49994a = i;
        }

        /* renamed from: a */
        private final int m58704a() {
            return this.f49994a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19879j) && this.f49994a == ((C19879j) obj).f49994a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f49994a);
        }

        @NotNull
        public String toString() {
            return "ErrorCode(code=" + this.f49994a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19879j m58703a(int i) {
            return new C19879j(i);
        }

        /* renamed from: a */
        public static /* synthetic */ C19879j m58702a(C19879j c19879j, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c19879j.f49994a;
            }
            return c19879j.m58703a(i);
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("errorCode", Integer.valueOf(this.f49994a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$k */
    /* loaded from: classes6.dex */
    public static final class C19880k implements InterfaceC19952g3 {
        @Nullable

        /* renamed from: a */
        private final String f49995a;

        public C19880k(@Nullable String str) {
            this.f49995a = str;
        }

        /* renamed from: a */
        public static /* synthetic */ C19880k m58700a(C19880k c19880k, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19880k.f49995a;
            }
            return c19880k.m58699a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19880k) && Intrinsics.m17075f(this.f49995a, ((C19880k) obj).f49995a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f49995a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "ErrorReason(reason=" + this.f49995a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19880k m58699a(@Nullable String str) {
            return new C19880k(str);
        }

        /* renamed from: a */
        private final String m58701a() {
            return this.f49995a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            String str = this.f49995a;
            if (str == null || str.length() == 0) {
                return;
            }
            bundle.put("reason", this.f49995a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$l */
    /* loaded from: classes6.dex */
    public static final class C19881l implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final String f49996a;

        public C19881l(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f49996a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ C19881l m58697a(C19881l c19881l, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19881l.f49996a;
            }
            return c19881l.m58696a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19881l) && Intrinsics.m17075f(this.f49996a, ((C19881l) obj).f49996a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f49996a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ext1(value=" + this.f49996a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19881l m58696a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new C19881l(value);
        }

        /* renamed from: a */
        private final String m58698a() {
            return this.f49996a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_EXT1, this.f49996a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$m */
    /* loaded from: classes6.dex */
    public static final class C19882m implements InterfaceC19952g3 {
        @Nullable

        /* renamed from: a */
        private final JSONObject f49997a;

        public C19882m(@Nullable JSONObject jSONObject) {
            this.f49997a = jSONObject;
        }

        /* renamed from: a */
        public static /* synthetic */ C19882m m58694a(C19882m c19882m, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = c19882m.f49997a;
            }
            return c19882m.m58693a(jSONObject);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19882m) && Intrinsics.m17075f(this.f49997a, ((C19882m) obj).f49997a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            JSONObject jSONObject = this.f49997a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        @NotNull
        public String toString() {
            return "GenericParams(genericParams=" + this.f49997a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19882m m58693a(@Nullable JSONObject jSONObject) {
            return new C19882m(jSONObject);
        }

        /* renamed from: a */
        private final JSONObject m58695a() {
            return this.f49997a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            JSONObject jSONObject = this.f49997a;
            if (jSONObject == null) {
                return;
            }
            bundle.put("genericParams", jSONObject);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$n */
    /* loaded from: classes6.dex */
    public static final class C19883n implements InterfaceC19952g3 {

        /* renamed from: a */
        private final int f49998a;

        public C19883n(int i) {
            this.f49998a = i;
        }

        /* renamed from: a */
        private final int m58692a() {
            return this.f49998a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19883n) && this.f49998a == ((C19883n) obj).f49998a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f49998a);
        }

        @NotNull
        public String toString() {
            return "InstanceType(instanceType=" + this.f49998a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19883n m58691a(int i) {
            return new C19883n(i);
        }

        /* renamed from: a */
        public static /* synthetic */ C19883n m58690a(C19883n c19883n, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c19883n.f49998a;
            }
            return c19883n.m58691a(i);
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("instanceType", Integer.valueOf(this.f49998a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$o */
    /* loaded from: classes6.dex */
    public static final class C19884o implements InterfaceC19952g3 {

        /* renamed from: a */
        private final int f49999a;

        public C19884o(int i) {
            this.f49999a = i;
        }

        /* renamed from: a */
        private final int m58689a() {
            return this.f49999a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19884o) && this.f49999a == ((C19884o) obj).f49999a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f49999a);
        }

        @NotNull
        public String toString() {
            return "MultipleAdObjects(value=" + this.f49999a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19884o m58688a(int i) {
            return new C19884o(i);
        }

        /* renamed from: a */
        public static /* synthetic */ C19884o m58687a(C19884o c19884o, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c19884o.f49999a;
            }
            return c19884o.m58688a(i);
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isMultipleAdObjects", Integer.valueOf(this.f49999a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$p */
    /* loaded from: classes6.dex */
    public static final class C19885p implements InterfaceC19952g3 {

        /* renamed from: a */
        private final int f50000a;

        public C19885p(int i) {
            this.f50000a = i;
        }

        /* renamed from: a */
        private final int m58686a() {
            return this.f50000a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19885p) && this.f50000a == ((C19885p) obj).f50000a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f50000a);
        }

        @NotNull
        public String toString() {
            return "OneFlow(value=" + this.f50000a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19885p m58685a(int i) {
            return new C19885p(i);
        }

        /* renamed from: a */
        public static /* synthetic */ C19885p m58684a(C19885p c19885p, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c19885p.f50000a;
            }
            return c19885p.m58685a(i);
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("isOneFlow", Integer.valueOf(this.f50000a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$q */
    /* loaded from: classes6.dex */
    public static final class C19886q implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final String f50001a;

        public C19886q(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f50001a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ C19886q m58682a(C19886q c19886q, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19886q.f50001a;
            }
            return c19886q.m58681a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19886q) && Intrinsics.m17075f(this.f50001a, ((C19886q) obj).f50001a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f50001a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Placement(value=" + this.f50001a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19886q m58681a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new C19886q(value);
        }

        /* renamed from: a */
        private final String m58683a() {
            return this.f50001a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("placement", this.f50001a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$r */
    /* loaded from: classes6.dex */
    public static final class C19887r implements InterfaceC19952g3 {

        /* renamed from: a */
        private final int f50002a;

        public C19887r(int i) {
            this.f50002a = i;
        }

        /* renamed from: a */
        private final int m58680a() {
            return this.f50002a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19887r) && this.f50002a == ((C19887r) obj).f50002a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f50002a);
        }

        @NotNull
        public String toString() {
            return "Programmatic(programmatic=" + this.f50002a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19887r m58679a(int i) {
            return new C19887r(i);
        }

        /* renamed from: a */
        public static /* synthetic */ C19887r m58678a(C19887r c19887r, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c19887r.f50002a;
            }
            return c19887r.m58679a(i);
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.f50002a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$s */
    /* loaded from: classes6.dex */
    public static final class C19888s implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final String f50003a;

        public C19888s(@NotNull String sourceName) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            this.f50003a = sourceName;
        }

        /* renamed from: a */
        public static /* synthetic */ C19888s m58676a(C19888s c19888s, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19888s.f50003a;
            }
            return c19888s.m58675a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19888s) && Intrinsics.m17075f(this.f50003a, ((C19888s) obj).f50003a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f50003a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Provider(sourceName=" + this.f50003a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19888s m58675a(@NotNull String sourceName) {
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            return new C19888s(sourceName);
        }

        /* renamed from: a */
        private final String m58677a() {
            return this.f50003a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER, this.f50003a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$t */
    /* loaded from: classes6.dex */
    public static final class C19889t implements InterfaceC19952g3 {

        /* renamed from: a */
        private final int f50004a;

        public C19889t(int i) {
            this.f50004a = i;
        }

        /* renamed from: a */
        private final int m58674a() {
            return this.f50004a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19889t) && this.f50004a == ((C19889t) obj).f50004a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f50004a);
        }

        @NotNull
        public String toString() {
            return "RewardAmount(value=" + this.f50004a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19889t m58673a(int i) {
            return new C19889t(i);
        }

        /* renamed from: a */
        public static /* synthetic */ C19889t m58672a(C19889t c19889t, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c19889t.f50004a;
            }
            return c19889t.m58673a(i);
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f50004a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$u */
    /* loaded from: classes6.dex */
    public static final class C19890u implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final String f50005a;

        public C19890u(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f50005a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ C19890u m58670a(C19890u c19890u, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19890u.f50005a;
            }
            return c19890u.m58669a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19890u) && Intrinsics.m17075f(this.f50005a, ((C19890u) obj).f50005a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f50005a.hashCode();
        }

        @NotNull
        public String toString() {
            return "RewardName(value=" + this.f50005a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19890u m58669a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new C19890u(value);
        }

        /* renamed from: a */
        private final String m58671a() {
            return this.f50005a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f50005a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$v */
    /* loaded from: classes6.dex */
    public static final class C19891v implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final String f50006a;

        public C19891v(@NotNull String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            this.f50006a = version;
        }

        /* renamed from: a */
        public static /* synthetic */ C19891v m58667a(C19891v c19891v, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19891v.f50006a;
            }
            return c19891v.m58666a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19891v) && Intrinsics.m17075f(this.f50006a, ((C19891v) obj).f50006a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f50006a.hashCode();
        }

        @NotNull
        public String toString() {
            return "SdkVersion(version=" + this.f50006a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19891v m58666a(@NotNull String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            return new C19891v(version);
        }

        /* renamed from: a */
        private final String m58668a() {
            return this.f50006a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.f50006a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$w */
    /* loaded from: classes6.dex */
    public static final class C19892w implements InterfaceC19952g3 {

        /* renamed from: a */
        private final int f50007a;

        public C19892w(int i) {
            this.f50007a = i;
        }

        /* renamed from: a */
        private final int m58665a() {
            return this.f50007a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19892w) && this.f50007a == ((C19892w) obj).f50007a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Integer.hashCode(this.f50007a);
        }

        @NotNull
        public String toString() {
            return "SessionDepth(sessionDepth=" + this.f50007a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19892w m58664a(int i) {
            return new C19892w(i);
        }

        /* renamed from: a */
        public static /* synthetic */ C19892w m58663a(C19892w c19892w, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c19892w.f50007a;
            }
            return c19892w.m58664a(i);
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("sessionDepth", Integer.valueOf(this.f50007a));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$x */
    /* loaded from: classes6.dex */
    public static final class C19893x implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final String f50008a;

        public C19893x(@NotNull String subProviderId) {
            Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            this.f50008a = subProviderId;
        }

        /* renamed from: a */
        public static /* synthetic */ C19893x m58661a(C19893x c19893x, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19893x.f50008a;
            }
            return c19893x.m58660a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19893x) && Intrinsics.m17075f(this.f50008a, ((C19893x) obj).f50008a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f50008a.hashCode();
        }

        @NotNull
        public String toString() {
            return "SubProviderId(subProviderId=" + this.f50008a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19893x m58660a(@NotNull String subProviderId) {
            Intrinsics.checkNotNullParameter(subProviderId, "subProviderId");
            return new C19893x(subProviderId);
        }

        /* renamed from: a */
        private final String m58662a() {
            return this.f50008a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put("spId", this.f50008a);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.f3$y */
    /* loaded from: classes6.dex */
    public static final class C19894y implements InterfaceC19952g3 {
        @NotNull

        /* renamed from: a */
        private final String f50009a;

        public C19894y(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f50009a = value;
        }

        /* renamed from: a */
        public static /* synthetic */ C19894y m58658a(C19894y c19894y, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c19894y.f50009a;
            }
            return c19894y.m58657a(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C19894y) && Intrinsics.m17075f(this.f50009a, ((C19894y) obj).f50009a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f50009a.hashCode();
        }

        @NotNull
        public String toString() {
            return "TransId(value=" + this.f50009a + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C19894y m58657a(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new C19894y(value);
        }

        /* renamed from: a */
        private final String m58659a() {
            return this.f50009a;
        }

        @Override // com.ironsource.InterfaceC19952g3
        /* renamed from: a */
        public void mo58474a(@NotNull Map<String, Object> bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.put(IronSourceConstants.EVENTS_TRANS_ID, this.f50009a);
        }
    }

    private C19869f3() {
    }
}
