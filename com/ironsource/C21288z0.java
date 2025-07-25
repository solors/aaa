package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.z0 */
/* loaded from: classes6.dex */
public final class C21288z0 implements InterfaceC19564a1 {
    @NotNull

    /* renamed from: b */
    public static final C21289a f54689b = new C21289a(null);
    @NotNull

    /* renamed from: c */
    private static final String f54690c = "ext_";
    @NotNull

    /* renamed from: a */
    private final Map<String, String> f54691a = new HashMap();

    @Metadata
    /* renamed from: com.ironsource.z0$a */
    /* loaded from: classes6.dex */
    public static final class C21289a {
        private C21289a() {
        }

        public /* synthetic */ C21289a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ironsource.InterfaceC19564a1
    /* renamed from: a */
    public void mo53933a(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f54691a.put(key, value);
    }

    @Override // com.ironsource.InterfaceC19564a1
    /* renamed from: b */
    public void mo53931b(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Map<String, String> map = this.f54691a;
        map.put("ext_" + key, value);
    }

    @Override // com.ironsource.InterfaceC19564a1
    @NotNull
    public Map<String, String> get() {
        return this.f54691a;
    }

    @Override // com.ironsource.InterfaceC19564a1
    /* renamed from: a */
    public void mo53932a(@NotNull HashMap<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f54691a.putAll(params);
    }
}
