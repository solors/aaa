package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JsonElementBuilders.kt */
@Metadata
/* renamed from: kotlinx.serialization.json.h */
/* loaded from: classes8.dex */
public final class C37856h {
    /* renamed from: a */
    public static final boolean m15922a(@NotNull JsonElementBuilders jsonElementBuilders, @Nullable String str) {
        Intrinsics.checkNotNullParameter(jsonElementBuilders, "<this>");
        return jsonElementBuilders.m15946a(C37857i.m15914c(str));
    }

    @Nullable
    /* renamed from: b */
    public static final JsonElement m15921b(@NotNull C37873t c37873t, @NotNull String key, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(c37873t, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return c37873t.m15873b(key, C37857i.m15916a(bool));
    }

    @Nullable
    /* renamed from: c */
    public static final JsonElement m15920c(@NotNull C37873t c37873t, @NotNull String key, @Nullable Number number) {
        Intrinsics.checkNotNullParameter(c37873t, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return c37873t.m15873b(key, C37857i.m15915b(number));
    }

    @Nullable
    /* renamed from: d */
    public static final JsonElement m15919d(@NotNull C37873t c37873t, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(c37873t, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return c37873t.m15873b(key, C37857i.m15914c(str));
    }

    @Nullable
    /* renamed from: e */
    public static final JsonElement m15918e(@NotNull C37873t c37873t, @NotNull String key, @NotNull Function1<? super JsonElementBuilders, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(c37873t, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        JsonElementBuilders jsonElementBuilders = new JsonElementBuilders();
        builderAction.invoke(jsonElementBuilders);
        return c37873t.m15873b(key, jsonElementBuilders.m15945b());
    }

    @Nullable
    /* renamed from: f */
    public static final JsonElement m15917f(@NotNull C37873t c37873t, @NotNull String key, @NotNull Function1<? super C37873t, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(c37873t, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        C37873t c37873t2 = new C37873t();
        builderAction.invoke(c37873t2);
        return c37873t.m15873b(key, c37873t2.m15874a());
    }
}
