package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.ch */
/* loaded from: classes6.dex */
public class C19709ch {
    @NotNull

    /* renamed from: a */
    public static final C19710a f49454a = new C19710a(null);

    @Metadata
    /* renamed from: com.ironsource.ch$a */
    /* loaded from: classes6.dex */
    public static final class C19710a {
        private C19710a() {
        }

        public /* synthetic */ C19710a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final JSONObject m59157a(Context context) {
            try {
                return new JSONObject(IronSourceUtils.getLastResponse(context));
            } catch (JSONException unused) {
                return new JSONObject();
            }
        }

        /* renamed from: b */
        public final boolean m59156b(@NotNull Context context) {
            boolean z;
            boolean z2;
            Intrinsics.checkNotNullParameter(context, "context");
            C21215x7 m59154d = m59154d(context);
            if (m59154d.m54162d().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (m59154d.m54161e().length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
            if (r1 != false) goto L9;
         */
        @org.jetbrains.annotations.Nullable
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.ironsource.C19727cr m59155c(@org.jetbrains.annotations.NotNull android.content.Context r5) {
            /*
                r4 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                com.ironsource.x7 r0 = r4.m59154d(r5)
                java.lang.String r1 = r0.m54162d()
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L17
                r1 = r2
                goto L18
            L17:
                r1 = r3
            L18:
                if (r1 == 0) goto L2a
                java.lang.String r1 = r0.m54161e()
                int r1 = r1.length()
                if (r1 <= 0) goto L26
                r1 = r2
                goto L27
            L26:
                r1 = r3
            L27:
                if (r1 == 0) goto L2a
                goto L2b
            L2a:
                r2 = r3
            L2b:
                r1 = 0
                if (r2 == 0) goto L2f
                goto L30
            L2f:
                r0 = r1
            L30:
                if (r0 == 0) goto L48
                com.ironsource.cr r1 = new com.ironsource.cr
                java.lang.String r2 = r0.m54162d()
                java.lang.String r3 = r0.m54160f()
                java.lang.String r0 = r0.m54161e()
                r1.<init>(r5, r2, r3, r0)
                com.ironsource.cr$a r5 = com.ironsource.C19727cr.EnumC19728a.CACHE
                r1.m59061a(r5)
            L48:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C19709ch.C19710a.m59155c(android.content.Context):com.ironsource.cr");
        }

        @NotNull
        /* renamed from: d */
        public final C21215x7 m59154d(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            JSONObject m59157a = m59157a(context);
            String cachedAppKey = m59157a.optString("appKey");
            String cachedUserId = m59157a.optString("userId");
            String cachedSettings = m59157a.optString("response");
            Intrinsics.checkNotNullExpressionValue(cachedAppKey, "cachedAppKey");
            Intrinsics.checkNotNullExpressionValue(cachedUserId, "cachedUserId");
            Intrinsics.checkNotNullExpressionValue(cachedSettings, "cachedSettings");
            return new C21215x7(cachedAppKey, cachedUserId, cachedSettings);
        }
    }

    /* renamed from: a */
    public static final boolean m59160a(@NotNull Context context) {
        return f49454a.m59156b(context);
    }

    @Nullable
    /* renamed from: b */
    public static final C19727cr m59159b(@NotNull Context context) {
        return f49454a.m59155c(context);
    }

    @NotNull
    /* renamed from: c */
    public static final C21215x7 m59158c(@NotNull Context context) {
        return f49454a.m59154d(context);
    }
}
