package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p821oe.InterfaceC39165j;
import p821oe.InterfaceC39174n;
import p821oe.KSerializer;
import p987te.AbstractC44407c;
import p987te.SerializersModuleBuilders;
import se.C42708j1;
import se.C42723p0;
import se.JsonToStringWriter;
import se.SchemaCache;
import se.StreamingJsonDecoder;
import se.StringJsonLexer;
import se.WriteMode;

@Metadata
/* renamed from: kotlinx.serialization.json.a */
/* loaded from: classes8.dex */
public abstract class Json implements InterfaceC39174n {
    @NotNull

    /* renamed from: d */
    public static final C37853a f99708d = new C37853a(null);
    @NotNull

    /* renamed from: a */
    private final JsonConfiguration f99709a;
    @NotNull

    /* renamed from: b */
    private final AbstractC44407c f99710b;
    @NotNull

    /* renamed from: c */
    private final SchemaCache f99711c;

    /* compiled from: Json.kt */
    @Metadata
    /* renamed from: kotlinx.serialization.json.a$a */
    /* loaded from: classes8.dex */
    public static final class C37853a extends Json {
        public /* synthetic */ C37853a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C37853a() {
            super(new JsonConfiguration(false, false, false, false, false, false, null, false, false, null, false, false, null, 8191, null), SerializersModuleBuilders.m3100a(), null);
        }
    }

    public /* synthetic */ Json(JsonConfiguration jsonConfiguration, AbstractC44407c abstractC44407c, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonConfiguration, abstractC44407c);
    }

    @Override // p821oe.SerialFormat
    @NotNull
    /* renamed from: a */
    public AbstractC44407c mo13747a() {
        return this.f99710b;
    }

    @Override // p821oe.InterfaceC39174n
    /* renamed from: b */
    public final <T> T mo13723b(@NotNull KSerializer<? extends T> deserializer, @NotNull String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        StringJsonLexer stringJsonLexer = new StringJsonLexer(string);
        T t = (T) new StreamingJsonDecoder(this, WriteMode.OBJ, stringJsonLexer, deserializer.getDescriptor(), null).mo6830n(deserializer);
        stringJsonLexer.m6931w();
        return t;
    }

    @Override // p821oe.InterfaceC39174n
    @NotNull
    /* renamed from: c */
    public final <T> String mo13722c(@NotNull InterfaceC39165j<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        JsonToStringWriter jsonToStringWriter = new JsonToStringWriter();
        try {
            C42723p0.m6707b(this, jsonToStringWriter, serializer, t);
            return jsonToStringWriter.toString();
        } finally {
            jsonToStringWriter.m6681g();
        }
    }

    /* renamed from: d */
    public final <T> T m15949d(@NotNull KSerializer<? extends T> deserializer, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        return (T) C42708j1.m6762a(this, element, deserializer);
    }

    @NotNull
    /* renamed from: e */
    public final JsonConfiguration m15948e() {
        return this.f99709a;
    }

    @NotNull
    /* renamed from: f */
    public final SchemaCache m15947f() {
        return this.f99711c;
    }

    private Json(JsonConfiguration jsonConfiguration, AbstractC44407c abstractC44407c) {
        this.f99709a = jsonConfiguration;
        this.f99710b = abstractC44407c;
        this.f99711c = new SchemaCache();
    }
}
