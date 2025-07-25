package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.InterfaceC20394p;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.o4 */
/* loaded from: classes6.dex */
public interface InterfaceC20567o4 {

    @Metadata
    /* renamed from: com.ironsource.o4$a */
    /* loaded from: classes6.dex */
    public static final class C20568a implements InterfaceC20567o4 {
        @Nullable

        /* renamed from: a */
        private final JSONObject f52282a;

        public C20568a() {
            this(null, 1, null);
        }

        @Override // com.ironsource.InterfaceC20567o4
        @NotNull
        /* renamed from: a */
        public InterfaceC20394p mo56064a(@NotNull String instanceId) {
            JSONObject jSONObject;
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            JSONObject jSONObject2 = this.f52282a;
            String str = null;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.optJSONObject(instanceId);
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                str = jSONObject.optString("plumbus");
            }
            if (str != null) {
                return new InterfaceC20394p.C20395a(str);
            }
            return new InterfaceC20394p.C20396b();
        }

        public C20568a(@Nullable JSONObject jSONObject) {
            this.f52282a = jSONObject;
        }

        public /* synthetic */ C20568a(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new JSONObject() : jSONObject);
        }
    }

    @NotNull
    /* renamed from: a */
    InterfaceC20394p mo56064a(@NotNull String str);
}
