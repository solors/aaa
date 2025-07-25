package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import p821oe.InterfaceC39163h;

/* compiled from: JsonElement.kt */
@Metadata
@InterfaceC39163h(with = C37872s.class)
/* loaded from: classes8.dex */
public final class JsonNull extends JsonPrimitive {
    @NotNull
    public static final JsonNull INSTANCE = new JsonNull();
    @NotNull

    /* renamed from: b */
    private static final String f99703b = "null";

    /* renamed from: c */
    private static final /* synthetic */ InterfaceC38501j<KSerializer<Object>> f99704c;

    /* compiled from: JsonElement.kt */
    @Metadata
    /* renamed from: kotlinx.serialization.json.JsonNull$a */
    /* loaded from: classes8.dex */
    static final class C37851a extends Lambda implements Functions<KSerializer<Object>> {

        /* renamed from: g */
        public static final C37851a f99705g = new C37851a();

        C37851a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: b */
        public final KSerializer<Object> invoke() {
            return C37872s.f99758a;
        }
    }

    static {
        InterfaceC38501j<KSerializer<Object>> m14553b;
        m14553b = LazyJVM.m14553b(EnumC38505n.f101866c, C37851a.f99705g);
        f99704c = m14553b;
    }

    private JsonNull() {
        super(null);
    }

    /* renamed from: d */
    private final /* synthetic */ KSerializer m15959d() {
        return f99704c.getValue();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    /* renamed from: c */
    public String mo15881c() {
        return f99703b;
    }

    @NotNull
    public final KSerializer<JsonNull> serializer() {
        return m15959d();
    }
}
