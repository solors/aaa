package com.ironsource.sdk.controller;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.sdk.controller.f */
/* loaded from: classes6.dex */
public interface InterfaceC20844f {

    @Metadata
    /* renamed from: com.ironsource.sdk.controller.f$a */
    /* loaded from: classes6.dex */
    public static final class C20845a {
        @NotNull

        /* renamed from: c */
        public static final C20846a f53065c = new C20846a(null);
        @NotNull

        /* renamed from: a */
        private final String f53066a;
        @Nullable

        /* renamed from: b */
        private final JSONObject f53067b;

        @Metadata
        /* renamed from: com.ironsource.sdk.controller.f$a$a */
        /* loaded from: classes6.dex */
        public static final class C20846a {
            private C20846a() {
            }

            public /* synthetic */ C20846a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            /* renamed from: a */
            public final C20845a m55252a(@NotNull String jsonStr) throws JSONException {
                Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
                JSONObject jSONObject = new JSONObject(jsonStr);
                String id2 = jSONObject.getString(C20847b.f53069b);
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                Intrinsics.checkNotNullExpressionValue(id2, "id");
                return new C20845a(id2, optJSONObject);
            }
        }

        public C20845a(@NotNull String msgId, @Nullable JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.f53066a = msgId;
            this.f53067b = jSONObject;
        }

        /* renamed from: a */
        public static /* synthetic */ C20845a m55258a(C20845a c20845a, String str, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c20845a.f53066a;
            }
            if ((i & 2) != 0) {
                jSONObject = c20845a.f53067b;
            }
            return c20845a.m55256a(str, jSONObject);
        }

        @Nullable
        /* renamed from: b */
        public final JSONObject m55255b() {
            return this.f53067b;
        }

        @NotNull
        /* renamed from: c */
        public final String m55254c() {
            return this.f53066a;
        }

        @Nullable
        /* renamed from: d */
        public final JSONObject m55253d() {
            return this.f53067b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20845a)) {
                return false;
            }
            C20845a c20845a = (C20845a) obj;
            if (Intrinsics.m17075f(this.f53066a, c20845a.f53066a) && Intrinsics.m17075f(this.f53067b, c20845a.f53067b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f53066a.hashCode() * 31;
            JSONObject jSONObject = this.f53067b;
            if (jSONObject == null) {
                hashCode = 0;
            } else {
                hashCode = jSONObject.hashCode();
            }
            return hashCode2 + hashCode;
        }

        @NotNull
        public String toString() {
            return "CallbackToNative(msgId=" + this.f53066a + ", params=" + this.f53067b + ')';
        }

        @NotNull
        /* renamed from: a */
        public static final C20845a m55257a(@NotNull String str) throws JSONException {
            return f53065c.m55252a(str);
        }

        @NotNull
        /* renamed from: a */
        public final C20845a m55256a(@NotNull String msgId, @Nullable JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            return new C20845a(msgId, jSONObject);
        }

        @NotNull
        /* renamed from: a */
        public final String m55259a() {
            return this.f53066a;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.sdk.controller.f$b */
    /* loaded from: classes6.dex */
    public static final class C20847b {
        @NotNull

        /* renamed from: a */
        public static final C20847b f53068a = new C20847b();
        @NotNull

        /* renamed from: b */
        public static final String f53069b = "msgId";
        @NotNull

        /* renamed from: c */
        public static final String f53070c = "adId";
        @NotNull

        /* renamed from: d */
        public static final String f53071d = "params";
        @NotNull

        /* renamed from: e */
        public static final String f53072e = "success";
        @NotNull

        /* renamed from: f */
        public static final String f53073f = "reason";
        @NotNull

        /* renamed from: g */
        public static final String f53074g = "command";

        private C20847b() {
        }
    }

    @Metadata
    /* renamed from: com.ironsource.sdk.controller.f$c */
    /* loaded from: classes6.dex */
    public static final class C20848c {
        @NotNull

        /* renamed from: a */
        private final String f53075a;
        @NotNull

        /* renamed from: b */
        private final String f53076b;
        @NotNull

        /* renamed from: c */
        private final JSONObject f53077c;
        @NotNull

        /* renamed from: d */
        private String f53078d;

        public C20848c(@NotNull String adId, @NotNull String command, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f53075a = adId;
            this.f53076b = command;
            this.f53077c = params;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            this.f53078d = uuid;
        }

        /* renamed from: a */
        public static /* synthetic */ C20848c m55250a(C20848c c20848c, String str, String str2, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c20848c.f53075a;
            }
            if ((i & 2) != 0) {
                str2 = c20848c.f53076b;
            }
            if ((i & 4) != 0) {
                jSONObject = c20848c.f53077c;
            }
            return c20848c.m55248a(str, str2, jSONObject);
        }

        @NotNull
        /* renamed from: b */
        public final String m55247b() {
            return this.f53076b;
        }

        @NotNull
        /* renamed from: c */
        public final JSONObject m55246c() {
            return this.f53077c;
        }

        @NotNull
        /* renamed from: d */
        public final String m55245d() {
            return this.f53075a;
        }

        @NotNull
        /* renamed from: e */
        public final String m55244e() {
            return this.f53076b;
        }

        public boolean equals(@Nullable Object obj) {
            C20848c c20848c;
            if (obj instanceof C20848c) {
                c20848c = (C20848c) obj;
            } else {
                c20848c = null;
            }
            if (c20848c == null) {
                return false;
            }
            if (this == c20848c) {
                return true;
            }
            if (!Intrinsics.m17075f(this.f53078d, c20848c.f53078d) || !Intrinsics.m17075f(this.f53075a, c20848c.f53075a) || !Intrinsics.m17075f(this.f53076b, c20848c.f53076b) || !Intrinsics.m17075f(this.f53077c.toString(), c20848c.f53077c.toString())) {
                return false;
            }
            return true;
        }

        @NotNull
        /* renamed from: f */
        public final String m55243f() {
            return this.f53078d;
        }

        @NotNull
        /* renamed from: g */
        public final JSONObject m55242g() {
            return this.f53077c;
        }

        @NotNull
        /* renamed from: h */
        public final String m55241h() {
            String jSONObject = new JSONObject().put(C20847b.f53069b, this.f53078d).put("adId", this.f53075a).put("params", this.f53077c).toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n          .…ms)\n          .toString()");
            return jSONObject;
        }

        public int hashCode() {
            return super.hashCode();
        }

        @NotNull
        public String toString() {
            return "MessageToController(adId=" + this.f53075a + ", command=" + this.f53076b + ", params=" + this.f53077c + ')';
        }

        @NotNull
        /* renamed from: a */
        public final C20848c m55248a(@NotNull String adId, @NotNull String command, @NotNull JSONObject params) {
            Intrinsics.checkNotNullParameter(adId, "adId");
            Intrinsics.checkNotNullParameter(command, "command");
            Intrinsics.checkNotNullParameter(params, "params");
            return new C20848c(adId, command, params);
        }

        @NotNull
        /* renamed from: a */
        public final String m55251a() {
            return this.f53075a;
        }

        /* renamed from: a */
        public final void m55249a(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f53078d = str;
        }
    }
}
