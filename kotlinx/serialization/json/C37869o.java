package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import se.StringOps;

/* compiled from: JsonElement.kt */
@Metadata
/* renamed from: kotlinx.serialization.json.o */
/* loaded from: classes8.dex */
public final class C37869o extends JsonPrimitive {

    /* renamed from: b */
    private final boolean f99753b;
    @Nullable

    /* renamed from: c */
    private final SerialDescriptor f99754c;
    @NotNull

    /* renamed from: d */
    private final String f99755d;

    public /* synthetic */ C37869o(Object obj, boolean z, SerialDescriptor serialDescriptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, (i & 4) != 0 ? null : serialDescriptor);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    /* renamed from: c */
    public String mo15881c() {
        return this.f99755d;
    }

    @Nullable
    /* renamed from: d */
    public final SerialDescriptor m15880d() {
        return this.f99754c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C37869o.class != obj.getClass()) {
            return false;
        }
        C37869o c37869o = (C37869o) obj;
        if (m15879f() == c37869o.m15879f() && Intrinsics.m17075f(mo15881c(), c37869o.mo15881c())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m15879f() {
        return this.f99753b;
    }

    public int hashCode() {
        return (Boolean.hashCode(m15879f()) * 31) + mo15881c().hashCode();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    @NotNull
    public String toString() {
        if (m15879f()) {
            StringBuilder sb2 = new StringBuilder();
            StringOps.m6767c(sb2, mo15881c());
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }
        return mo15881c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37869o(@NotNull Object body, boolean z, @Nullable SerialDescriptor serialDescriptor) {
        super(null);
        Intrinsics.checkNotNullParameter(body, "body");
        this.f99753b = z;
        this.f99754c = serialDescriptor;
        this.f99755d = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
