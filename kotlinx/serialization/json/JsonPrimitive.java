package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import p821oe.InterfaceC39163h;

/* compiled from: JsonElement.kt */
@Metadata
@InterfaceC39163h(with = C37876v.class)
/* loaded from: classes8.dex */
public abstract class JsonPrimitive extends JsonElement {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: JsonElement.kt */
    @Metadata
    /* loaded from: classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<JsonPrimitive> serializer() {
            return C37876v.f99766a;
        }
    }

    public /* synthetic */ JsonPrimitive(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* renamed from: c */
    public abstract String mo15881c();

    @NotNull
    public String toString() {
        return mo15881c();
    }

    private JsonPrimitive() {
        super(null);
    }
}
