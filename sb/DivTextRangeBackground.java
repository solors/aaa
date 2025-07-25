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
/* renamed from: sb.ap */
/* loaded from: classes8.dex */
public abstract class DivTextRangeBackground implements JSONSerializable, Hashable {
    @NotNull

    /* renamed from: b */
    public static final C39701b f104276b = new C39701b(null);
    @NotNull

    /* renamed from: c */
    private static final Function2<ParsingEnvironment, JSONObject, DivTextRangeBackground> f104277c = C39700a.f104279g;
    @Nullable

    /* renamed from: a */
    private Integer f104278a;

    /* compiled from: DivTextRangeBackground.kt */
    @Metadata
    /* renamed from: sb.ap$a */
    /* loaded from: classes8.dex */
    static final class C39700a extends Lambda implements Function2<ParsingEnvironment, JSONObject, DivTextRangeBackground> {

        /* renamed from: g */
        public static final C39700a f104279g = new C39700a();

        C39700a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final DivTextRangeBackground mo105910invoke(@NotNull ParsingEnvironment env, @NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(it, "it");
            return DivTextRangeBackground.f104276b.m11886a(env, it);
        }
    }

    /* compiled from: DivTextRangeBackground.kt */
    @Metadata
    /* renamed from: sb.ap$b */
    /* loaded from: classes8.dex */
    public static final class C39701b {
        private C39701b() {
        }

        public /* synthetic */ C39701b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final DivTextRangeBackground m11886a(@NotNull ParsingEnvironment env, @NotNull JSONObject json) throws ParsingException {
            DivTextRangeBackgroundTemplate divTextRangeBackgroundTemplate;
            Intrinsics.checkNotNullParameter(env, "env");
            Intrinsics.checkNotNullParameter(json, "json");
            String str = (String) C44527j.m2601b(json, "type", null, env.mo2529b(), env, 2, null);
            if (Intrinsics.m17075f(str, "solid")) {
                return new C39702c(DivSolidBackground.f110166c.m8132a(env, json));
            }
            JsonTemplate<?> m24218a = env.mo2530a().m24218a(str, json);
            if (m24218a instanceof DivTextRangeBackgroundTemplate) {
                divTextRangeBackgroundTemplate = (DivTextRangeBackgroundTemplate) m24218a;
            } else {
                divTextRangeBackgroundTemplate = null;
            }
            if (divTextRangeBackgroundTemplate != null) {
                return divTextRangeBackgroundTemplate.mo7039a(env, json);
            }
            throw C32965h.m25369u(json, "type", str);
        }

        @NotNull
        /* renamed from: b */
        public final Function2<ParsingEnvironment, JSONObject, DivTextRangeBackground> m11885b() {
            return DivTextRangeBackground.f104277c;
        }
    }

    /* compiled from: DivTextRangeBackground.kt */
    @Metadata
    /* renamed from: sb.ap$c */
    /* loaded from: classes8.dex */
    public static class C39702c extends DivTextRangeBackground {
        @NotNull

        /* renamed from: d */
        private final DivSolidBackground f104280d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39702c(@NotNull DivSolidBackground value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f104280d = value;
        }

        @NotNull
        /* renamed from: c */
        public DivSolidBackground m11884c() {
            return this.f104280d;
        }
    }

    public /* synthetic */ DivTextRangeBackground(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* renamed from: b */
    public Object m11888b() {
        if (this instanceof C39702c) {
            return ((C39702c) this).m11884c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p743ja.Hashable
    public int hash() {
        Integer num = this.f104278a;
        if (num != null) {
            return num.intValue();
        }
        int hashCode = Reflection.m17042b(getClass()).hashCode();
        if (this instanceof C39702c) {
            int hash = hashCode + ((C39702c) this).m11884c().hash();
            this.f104278a = Integer.valueOf(hash);
            return hash;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p656eb.JSONSerializable
    @NotNull
    /* renamed from: q */
    public JSONObject mo7023q() {
        if (this instanceof C39702c) {
            return ((C39702c) this).m11884c().mo7023q();
        }
        throw new NoWhenBranchMatchedException();
    }

    private DivTextRangeBackground() {
    }
}
