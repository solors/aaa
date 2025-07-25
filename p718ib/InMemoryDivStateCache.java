package p718ib;

import androidx.annotation.AnyThread;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.MutableCollections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

@AnyThread
@Metadata
/* renamed from: ib.b */
/* loaded from: classes8.dex */
public final class InMemoryDivStateCache implements DivStateCache {

    /* renamed from: a */
    private final Map<Tuples<String, String>, String> f92011a = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: b */
    private final Map<String, String> f92012b = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: InMemoryDivStateCache.kt */
    @Metadata
    /* renamed from: ib.b$a */
    /* loaded from: classes8.dex */
    static final class C33620a extends Lambda implements Function1<Tuples<? extends String, ? extends String>, Boolean> {

        /* renamed from: g */
        final /* synthetic */ String f92013g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33620a(String str) {
            super(1);
            this.f92013g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final Boolean invoke(Tuples<String, String> tuples) {
            return Boolean.valueOf(Intrinsics.m17075f(tuples.m17630c(), this.f92013g));
        }
    }

    @Override // p718ib.DivStateCache
    @Nullable
    /* renamed from: a */
    public String mo23041a(@NotNull String cardId, @NotNull String path) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(path, "path");
        return this.f92011a.get(C38513v.m14532a(cardId, path));
    }

    @Override // p718ib.DivStateCache
    /* renamed from: b */
    public void mo23040b(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f92012b.remove(cardId);
        MutableCollections.m17618J(this.f92011a.keySet(), new C33620a(cardId));
    }

    @Override // p718ib.DivStateCache
    /* renamed from: c */
    public void mo23039c(@NotNull String cardId, @NotNull String path, @NotNull String state) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(state, "state");
        Map<Tuples<String, String>, String> states = this.f92011a;
        Intrinsics.checkNotNullExpressionValue(states, "states");
        states.put(C38513v.m14532a(cardId, path), state);
    }

    @Override // p718ib.DivStateCache
    public void clear() {
        this.f92011a.clear();
        this.f92012b.clear();
    }

    @Override // p718ib.DivStateCache
    @Nullable
    /* renamed from: d */
    public String mo23038d(@NotNull String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return this.f92012b.get(cardId);
    }

    @Override // p718ib.DivStateCache
    /* renamed from: e */
    public void mo23037e(@NotNull String cardId, @NotNull String state) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(state, "state");
        Map<String, String> rootStates = this.f92012b;
        Intrinsics.checkNotNullExpressionValue(rootStates, "rootStates");
        rootStates.put(cardId, state);
    }
}
