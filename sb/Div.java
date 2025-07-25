package sb;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p656eb.C32965h;
import p656eb.JSONSerializable;
import p656eb.JsonTemplate;
import p656eb.ParsingEnvironment;
import p656eb.ParsingException;
import p743ja.Hashable;
import p804nd.NoWhenBranchMatchedException;
import va.C44527j;

@Metadata
/* renamed from: sb.u */
/* loaded from: classes8.dex */
public abstract class Div implements JSONSerializable, Hashable {
    @NotNull

    /* renamed from: c */
    public static final C41955b f109920c = new C41955b(null);
    @NotNull

    /* renamed from: d */
    private static final Function2<ParsingEnvironment, JSONObject, Div> f109921d = C41954a.f109924g;
    @Nullable

    /* renamed from: a */
    private Integer f109922a;
    @Nullable

    /* renamed from: b */
    private Integer f109923b;

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$a */
    /* loaded from: classes8.dex */
    static final class C41954a extends Lambda implements Function2<ParsingEnvironment, JSONObject, Div> {

        /* renamed from: g */
        public static final C41954a f109924g = new C41954a();

        C41954a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final Div mo105910invoke(@NotNull ParsingEnvironment env, @NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return Div.f109920c.m8303a(env, it);
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$b */
    /* loaded from: classes8.dex */
    public static final class C41955b {
        private C41955b() {
        }

        public /* synthetic */ C41955b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final Div m8303a(@NotNull ParsingEnvironment env, @NotNull JSONObject json) throws ParsingException {
            DivTemplate divTemplate;
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            String str = (String) C44527j.m2601b(json, "type", null, env.mo2529b(), env, 2, null);
            switch (str.hashCode()) {
                case -1349088399:
                    if (str.equals("custom")) {
                        return new C41957d(DivCustom.f104153J.m11941a(env, json));
                    }
                    break;
                case -906021636:
                    if (str.equals("select")) {
                        return new C41965l(DivSelect.f110845R.m7601a(env, json));
                    }
                    break;
                case -899647263:
                    if (str.equals("slider")) {
                        return new C41967n(DivSlider.f105538T.m11066a(env, json));
                    }
                    break;
                case -711999985:
                    if (str.equals("indicator")) {
                        return new C41962i(DivIndicator.f109767R.m8364a(env, json));
                    }
                    break;
                case -410956671:
                    if (str.equals("container")) {
                        return new C41956c(DivContainer.f109234V.m8684a(env, json));
                    }
                    break;
                case -196315310:
                    if (str.equals("gallery")) {
                        return new C41958e(DivGallery.f110691R.m7713a(env, json));
                    }
                    break;
                case 102340:
                    if (str.equals("gif")) {
                        return new C41959f(DivGifImage.f109353S.m8618a(env, json));
                    }
                    break;
                case 3181382:
                    if (str.equals("grid")) {
                        return new C41960g(DivGrid.f105842P.m10824a(env, json));
                    }
                    break;
                case 3552126:
                    if (str.equals("tabs")) {
                        return new C41969p(DivTabs.f105250R.m11268a(env, json));
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        return new C41970q(DivText.f108835i0.m8944a(env, json));
                    }
                    break;
                case 100313435:
                    if (str.equals("image")) {
                        return new C41961h(DivImage.f110975X.m7500a(env, json));
                    }
                    break;
                case 100358090:
                    if (str.equals("input")) {
                        return new C41963j(DivInput.f109992b0.m8196a(env, json));
                    }
                    break;
                case 106426307:
                    if (str.equals("pager")) {
                        return new C41964k(DivPager.f105067P.m11404a(env, json));
                    }
                    break;
                case 109757585:
                    if (str.equals("state")) {
                        return new C41968o(DivState.f104879L.m11528a(env, json));
                    }
                    break;
                case 112202875:
                    if (str.equals("video")) {
                        return new C41971r(DivVideo.f108018U.m9430a(env, json));
                    }
                    break;
                case 1732829925:
                    if (str.equals("separator")) {
                        return new C41966m(DivSeparator.f109611L.m8487a(env, json));
                    }
                    break;
            }
            JsonTemplate<?> m24218a = env.mo2530a().m24218a(str, json);
            if (m24218a instanceof DivTemplate) {
                divTemplate = (DivTemplate) m24218a;
            } else {
                divTemplate = null;
            }
            if (divTemplate != null) {
                return divTemplate.mo7039a(env, json);
            }
            throw C32965h.m25369u(json, "type", str);
        }

        @NotNull
        /* renamed from: b */
        public final Function2<ParsingEnvironment, JSONObject, Div> m8302b() {
            return Div.f109921d;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$c */
    /* loaded from: classes8.dex */
    public static class C41956c extends Div {
        @NotNull

        /* renamed from: e */
        private final DivContainer f109925e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41956c(@NotNull DivContainer value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109925e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivContainer m8301c() {
            return this.f109925e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$d */
    /* loaded from: classes8.dex */
    public static class C41957d extends Div {
        @NotNull

        /* renamed from: e */
        private final DivCustom f109926e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41957d(@NotNull DivCustom value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109926e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivCustom m8300c() {
            return this.f109926e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$e */
    /* loaded from: classes8.dex */
    public static class C41958e extends Div {
        @NotNull

        /* renamed from: e */
        private final DivGallery f109927e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41958e(@NotNull DivGallery value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109927e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivGallery m8299c() {
            return this.f109927e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$f */
    /* loaded from: classes8.dex */
    public static class C41959f extends Div {
        @NotNull

        /* renamed from: e */
        private final DivGifImage f109928e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41959f(@NotNull DivGifImage value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109928e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivGifImage m8298c() {
            return this.f109928e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$g */
    /* loaded from: classes8.dex */
    public static class C41960g extends Div {
        @NotNull

        /* renamed from: e */
        private final DivGrid f109929e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41960g(@NotNull DivGrid value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109929e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivGrid m8297c() {
            return this.f109929e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$h */
    /* loaded from: classes8.dex */
    public static class C41961h extends Div {
        @NotNull

        /* renamed from: e */
        private final DivImage f109930e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41961h(@NotNull DivImage value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109930e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivImage m8296c() {
            return this.f109930e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$i */
    /* loaded from: classes8.dex */
    public static class C41962i extends Div {
        @NotNull

        /* renamed from: e */
        private final DivIndicator f109931e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41962i(@NotNull DivIndicator value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109931e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivIndicator m8295c() {
            return this.f109931e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$j */
    /* loaded from: classes8.dex */
    public static class C41963j extends Div {
        @NotNull

        /* renamed from: e */
        private final DivInput f109932e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41963j(@NotNull DivInput value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109932e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivInput m8294c() {
            return this.f109932e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$k */
    /* loaded from: classes8.dex */
    public static class C41964k extends Div {
        @NotNull

        /* renamed from: e */
        private final DivPager f109933e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41964k(@NotNull DivPager value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109933e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivPager m8293c() {
            return this.f109933e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$l */
    /* loaded from: classes8.dex */
    public static class C41965l extends Div {
        @NotNull

        /* renamed from: e */
        private final DivSelect f109934e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41965l(@NotNull DivSelect value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109934e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivSelect m8292c() {
            return this.f109934e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$m */
    /* loaded from: classes8.dex */
    public static class C41966m extends Div {
        @NotNull

        /* renamed from: e */
        private final DivSeparator f109935e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41966m(@NotNull DivSeparator value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109935e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivSeparator m8291c() {
            return this.f109935e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$n */
    /* loaded from: classes8.dex */
    public static class C41967n extends Div {
        @NotNull

        /* renamed from: e */
        private final DivSlider f109936e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41967n(@NotNull DivSlider value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109936e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivSlider m8290c() {
            return this.f109936e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$o */
    /* loaded from: classes8.dex */
    public static class C41968o extends Div {
        @NotNull

        /* renamed from: e */
        private final DivState f109937e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41968o(@NotNull DivState value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109937e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivState m8289c() {
            return this.f109937e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$p */
    /* loaded from: classes8.dex */
    public static class C41969p extends Div {
        @NotNull

        /* renamed from: e */
        private final DivTabs f109938e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41969p(@NotNull DivTabs value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109938e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivTabs m8288c() {
            return this.f109938e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$q */
    /* loaded from: classes8.dex */
    public static class C41970q extends Div {
        @NotNull

        /* renamed from: e */
        private final DivText f109939e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41970q(@NotNull DivText value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109939e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivText m8287c() {
            return this.f109939e;
        }
    }

    /* compiled from: Div.kt */
    @Metadata
    /* renamed from: sb.u$r */
    /* loaded from: classes8.dex */
    public static class C41971r extends Div {
        @NotNull

        /* renamed from: e */
        private final DivVideo f109940e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41971r(@NotNull DivVideo value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f109940e = value;
        }

        @NotNull
        /* renamed from: c */
        public DivVideo m8286c() {
            return this.f109940e;
        }
    }

    public /* synthetic */ Div(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* renamed from: b */
    public DivBase m8305b() {
        if (this instanceof C41961h) {
            return ((C41961h) this).m8296c();
        }
        if (this instanceof C41959f) {
            return ((C41959f) this).m8298c();
        }
        if (this instanceof C41970q) {
            return ((C41970q) this).m8287c();
        }
        if (this instanceof C41966m) {
            return ((C41966m) this).m8291c();
        }
        if (this instanceof C41956c) {
            return ((C41956c) this).m8301c();
        }
        if (this instanceof C41960g) {
            return ((C41960g) this).m8297c();
        }
        if (this instanceof C41958e) {
            return ((C41958e) this).m8299c();
        }
        if (this instanceof C41964k) {
            return ((C41964k) this).m8293c();
        }
        if (this instanceof C41969p) {
            return ((C41969p) this).m8288c();
        }
        if (this instanceof C41968o) {
            return ((C41968o) this).m8289c();
        }
        if (this instanceof C41957d) {
            return ((C41957d) this).m8300c();
        }
        if (this instanceof C41962i) {
            return ((C41962i) this).m8295c();
        }
        if (this instanceof C41967n) {
            return ((C41967n) this).m8290c();
        }
        if (this instanceof C41963j) {
            return ((C41963j) this).m8294c();
        }
        if (this instanceof C41965l) {
            return ((C41965l) this).m8292c();
        }
        if (this instanceof C41971r) {
            return ((C41971r) this).m8286c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p743ja.Hashable
    public int hash() {
        int hash;
        Integer num = this.f109923b;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.m17042b(getClass()).hashCode();
        if (this instanceof C41961h) {
            hash = ((C41961h) this).m8296c().hash();
        } else if (this instanceof C41959f) {
            hash = ((C41959f) this).m8298c().hash();
        } else if (this instanceof C41970q) {
            hash = ((C41970q) this).m8287c().hash();
        } else if (this instanceof C41966m) {
            hash = ((C41966m) this).m8291c().hash();
        } else if (this instanceof C41956c) {
            hash = ((C41956c) this).m8301c().hash();
        } else if (this instanceof C41960g) {
            hash = ((C41960g) this).m8297c().hash();
        } else if (this instanceof C41958e) {
            hash = ((C41958e) this).m8299c().hash();
        } else if (this instanceof C41964k) {
            hash = ((C41964k) this).m8293c().hash();
        } else if (this instanceof C41969p) {
            hash = ((C41969p) this).m8288c().hash();
        } else if (this instanceof C41968o) {
            hash = ((C41968o) this).m8289c().hash();
        } else if (this instanceof C41957d) {
            hash = ((C41957d) this).m8300c().hash();
        } else if (this instanceof C41962i) {
            hash = ((C41962i) this).m8295c().hash();
        } else if (this instanceof C41967n) {
            hash = ((C41967n) this).m8290c().hash();
        } else if (this instanceof C41963j) {
            hash = ((C41963j) this).m8294c().hash();
        } else if (this instanceof C41965l) {
            hash = ((C41965l) this).m8292c().hash();
        } else if (this instanceof C41971r) {
            hash = ((C41971r) this).m8286c().hash();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int i = hashCode + hash;
        this.f109923b = Integer.valueOf(i);
        return i;
    }

    @Override // p743ja.Hashable
    /* renamed from: l */
    public int mo7723l() {
        int mo7723l;
        Integer num = this.f109922a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.m17042b(getClass()).hashCode();
        if (this instanceof C41961h) {
            mo7723l = ((C41961h) this).m8296c().mo7723l();
        } else if (this instanceof C41959f) {
            mo7723l = ((C41959f) this).m8298c().mo7723l();
        } else if (this instanceof C41970q) {
            mo7723l = ((C41970q) this).m8287c().mo7723l();
        } else if (this instanceof C41966m) {
            mo7723l = ((C41966m) this).m8291c().mo7723l();
        } else if (this instanceof C41956c) {
            mo7723l = ((C41956c) this).m8301c().mo7723l();
        } else if (this instanceof C41960g) {
            mo7723l = ((C41960g) this).m8297c().mo7723l();
        } else if (this instanceof C41958e) {
            mo7723l = ((C41958e) this).m8299c().mo7723l();
        } else if (this instanceof C41964k) {
            mo7723l = ((C41964k) this).m8293c().mo7723l();
        } else if (this instanceof C41969p) {
            mo7723l = ((C41969p) this).m8288c().mo7723l();
        } else if (this instanceof C41968o) {
            mo7723l = ((C41968o) this).m8289c().mo7723l();
        } else if (this instanceof C41957d) {
            mo7723l = ((C41957d) this).m8300c().mo7723l();
        } else if (this instanceof C41962i) {
            mo7723l = ((C41962i) this).m8295c().mo7723l();
        } else if (this instanceof C41967n) {
            mo7723l = ((C41967n) this).m8290c().mo7723l();
        } else if (this instanceof C41963j) {
            mo7723l = ((C41963j) this).m8294c().mo7723l();
        } else if (this instanceof C41965l) {
            mo7723l = ((C41965l) this).m8292c().mo7723l();
        } else if (this instanceof C41971r) {
            mo7723l = ((C41971r) this).m8286c().mo7723l();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int i = hashCode + mo7723l;
        this.f109922a = Integer.valueOf(i);
        return i;
    }

    @Override // p656eb.JSONSerializable
    @NotNull
    /* renamed from: q */
    public JSONObject mo7023q() {
        if (this instanceof C41961h) {
            return ((C41961h) this).m8296c().mo7023q();
        }
        if (this instanceof C41959f) {
            return ((C41959f) this).m8298c().mo7023q();
        }
        if (this instanceof C41970q) {
            return ((C41970q) this).m8287c().mo7023q();
        }
        if (this instanceof C41966m) {
            return ((C41966m) this).m8291c().mo7023q();
        }
        if (this instanceof C41956c) {
            return ((C41956c) this).m8301c().mo7023q();
        }
        if (this instanceof C41960g) {
            return ((C41960g) this).m8297c().mo7023q();
        }
        if (this instanceof C41958e) {
            return ((C41958e) this).m8299c().mo7023q();
        }
        if (this instanceof C41964k) {
            return ((C41964k) this).m8293c().mo7023q();
        }
        if (this instanceof C41969p) {
            return ((C41969p) this).m8288c().mo7023q();
        }
        if (this instanceof C41968o) {
            return ((C41968o) this).m8289c().mo7023q();
        }
        if (this instanceof C41957d) {
            return ((C41957d) this).m8300c().mo7023q();
        }
        if (this instanceof C41962i) {
            return ((C41962i) this).m8295c().mo7023q();
        }
        if (this instanceof C41967n) {
            return ((C41967n) this).m8290c().mo7023q();
        }
        if (this instanceof C41963j) {
            return ((C41963j) this).m8294c().mo7023q();
        }
        if (this instanceof C41965l) {
            return ((C41965l) this).m8292c().mo7023q();
        }
        if (this instanceof C41971r) {
            return ((C41971r) this).m8286c().mo7023q();
        }
        throw new NoWhenBranchMatchedException();
    }

    private Div() {
    }
}
