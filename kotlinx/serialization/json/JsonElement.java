package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import p821oe.InterfaceC39163h;

/* compiled from: JsonElement.kt */
@Metadata
@InterfaceC39163h(with = C37858j.class)
/* loaded from: classes8.dex */
public abstract class JsonElement {
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
        public final KSerializer<JsonElement> serializer() {
            return C37858j.f99744a;
        }
    }

    public /* synthetic */ JsonElement(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private JsonElement() {
    }
}
