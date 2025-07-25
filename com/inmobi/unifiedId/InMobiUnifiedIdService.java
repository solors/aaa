package com.inmobi.unifiedId;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.media.AbstractC19011Lb;
import com.inmobi.media.AbstractC19031N4;
import com.inmobi.media.AbstractC19038Nb;
import com.inmobi.media.AbstractC19423q4;
import com.inmobi.media.AbstractC19494v5;
import com.inmobi.media.AbstractC19512w9;
import com.inmobi.media.C18954Ha;
import com.inmobi.media.C18955Hb;
import com.inmobi.media.C19094S3;
import com.inmobi.media.C19262eb;
import com.inmobi.media.C19379n2;
import com.inmobi.media.C19508w5;
import com.inmobi.media.EnumC19332jb;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class InMobiUnifiedIdService {
    @NotNull
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();

    /* renamed from: a */
    public static final AtomicBoolean f48973a = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m59507a(com.inmobi.unifiedId.InMobiUnifiedIdInterface r14) {
        /*
            java.lang.String r0 = "InMobiUnifiedIdService"
            java.lang.String r1 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            org.json.JSONObject r0 = com.inmobi.media.AbstractC19031N4.m60857b()
            r1 = 0
            java.lang.String r2 = "ufids"
            if (r0 != 0) goto L12
            goto L77
        L12:
            boolean r3 = r0.has(r2)     // Catch: org.json.JSONException -> L77
            if (r3 == 0) goto L1d
            org.json.JSONArray r3 = r0.getJSONArray(r2)     // Catch: org.json.JSONException -> L77
            goto L1e
        L1d:
            r3 = r1
        L1e:
            if (r3 == 0) goto L77
            int r3 = r3.length()
            if (r3 != 0) goto L27
            goto L77
        L27:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r3 = 1
            boolean r4 = r0.has(r2)     // Catch: org.json.JSONException -> L59
            if (r4 == 0) goto L57
            org.json.JSONArray r4 = r0.getJSONArray(r2)     // Catch: org.json.JSONException -> L59
            int r5 = r4.length()     // Catch: org.json.JSONException -> L59
            r6 = 0
            r8 = r3
            r7 = r6
        L3c:
            if (r7 >= r5) goto L5d
            org.json.JSONObject r9 = r4.getJSONObject(r7)     // Catch: org.json.JSONException -> L5a
            long r10 = java.lang.System.currentTimeMillis()     // Catch: org.json.JSONException -> L5a
            java.lang.String r12 = "expiry"
            long r12 = r9.getLong(r12)     // Catch: org.json.JSONException -> L5a
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 > 0) goto L52
            r9 = r3
            goto L53
        L52:
            r9 = r6
        L53:
            r8 = r8 & r9
            int r7 = r7 + 1
            goto L3c
        L57:
            r8 = r3
            goto L5d
        L59:
            r8 = r3
        L5a:
            java.util.Objects.toString(r0)
        L5d:
            r3 = r3 ^ r8
            if (r3 == 0) goto L77
            org.json.JSONObject r0 = com.inmobi.media.AbstractC19011Lb.f47443a
            if (r14 == 0) goto L69
            java.util.LinkedHashSet r0 = com.inmobi.media.AbstractC19011Lb.f47444b
            r0.add(r14)
        L69:
            boolean r0 = com.inmobi.media.AbstractC19011Lb.m60924b()
            if (r0 == 0) goto L73
            java.util.Objects.toString(r14)
            goto Lba
        L73:
            com.inmobi.media.AbstractC19011Lb.m60922d()
            goto Lba
        L77:
            if (r14 == 0) goto Lba
            if (r0 != 0) goto L7c
            goto L95
        L7c:
            boolean r3 = r0.has(r2)     // Catch: org.json.JSONException -> L95
            if (r3 == 0) goto L87
            org.json.JSONArray r2 = r0.getJSONArray(r2)     // Catch: org.json.JSONException -> L95
            goto L88
        L87:
            r2 = r1
        L88:
            if (r2 == 0) goto L95
            int r2 = r2.length()
            if (r2 != 0) goto L91
            goto L95
        L91:
            com.inmobi.media.AbstractC19038Nb.m60846a(r14, r0, r1)
            goto Lba
        L95:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.inmobi.unifiedId.InMobiUnifiedIdService.f48973a
            boolean r0 = r0.get()
            if (r0 == 0) goto Lb0
            java.util.LinkedHashSet r0 = com.inmobi.media.AbstractC19011Lb.f47444b
            r0.add(r14)
            boolean r0 = com.inmobi.media.AbstractC19011Lb.m60924b()
            if (r0 == 0) goto Lac
            java.util.Objects.toString(r14)
            goto Lba
        Lac:
            com.inmobi.media.AbstractC19011Lb.m60922d()
            goto Lba
        Lb0:
            java.lang.Error r0 = new java.lang.Error
            java.lang.String r2 = "Push api needs to called prior to fetch"
            r0.<init>(r2)
            com.inmobi.media.AbstractC19038Nb.m60846a(r14, r1, r0)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.m59507a(com.inmobi.unifiedId.InMobiUnifiedIdInterface):void");
    }

    /* renamed from: b */
    public static final void m59505b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        fetchUnifiedIdsInternal$media_release(inMobiUnifiedIdInterface);
    }

    public static final void fetchUnifiedIds(@Nullable final InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (C18954Ha.m61055q()) {
            C18954Ha.m61079a(new Runnable() { // from class: q3.c
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiUnifiedIdService.m59505b(inMobiUnifiedIdInterface);
                }
            });
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    @WorkerThread
    public static final void fetchUnifiedIdsInternal$media_release(@Nullable InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        boolean z;
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        HashMap hashMap = new HashMap();
        C19262eb c19262eb = C19262eb.f48183a;
        C19262eb.m60370b("FetchApiInvoked", hashMap, EnumC19332jb.f48415a);
        LinkedHashMap linkedHashMap = C19379n2.f48527a;
        boolean z2 = true;
        boolean z3 = !((SignalsConfig) AbstractC19423q4.m59930a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig().isEnabled();
        if (z3) {
            reset();
        }
        if (z3) {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            AbstractC19038Nb.m60846a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.UNIFIED_SERVICE_IS_NOT_ENABLED));
            return;
        }
        Boolean m61047c = C18955Hb.f47329a.m61047c();
        if (m61047c != null) {
            z2 = m61047c.booleanValue();
        }
        if (z2) {
            reset();
        }
        if (z2) {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            AbstractC19038Nb.m60846a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_OPTED_OUT));
            return;
        }
        Boolean bool = AbstractC19512w9.f48829b;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            Context m61068d = C18954Ha.m61068d();
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                AbstractC19512w9.f48829b = Boolean.valueOf(m59823a.f48820a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC19512w9.f48829b;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
        }
        if (z) {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            AbstractC19038Nb.m60846a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.USER_HAS_AGE_RESTRICTION));
            return;
        }
        synchronized (AbstractC19011Lb.class) {
            if (AbstractC19011Lb.m60924b()) {
                if (inMobiUnifiedIdInterface != null) {
                    AbstractC19011Lb.f47444b.add(inMobiUnifiedIdInterface);
                }
                if (AbstractC19011Lb.m60924b()) {
                    Objects.toString(inMobiUnifiedIdInterface);
                } else {
                    AbstractC19011Lb.m60922d();
                }
            } else {
                m59507a(inMobiUnifiedIdInterface);
            }
            Unit unit = Unit.f99208a;
        }
    }

    public static final void push(@Nullable final InMobiUserDataModel inMobiUserDataModel) {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        Objects.toString(inMobiUserDataModel);
        if (C18954Ha.m61055q()) {
            C18954Ha.m61079a(new Runnable() { // from class: q3.b
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiUnifiedIdService.m59506a(inMobiUserDataModel);
                }
            });
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public static final void reset() {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (C18954Ha.m61055q()) {
            C18954Ha.m61079a(new Runnable() { // from class: q3.a
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiUnifiedIdService.m59508a();
                }
            });
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    @NotNull
    public final AtomicBoolean isPushCalled() {
        return f48973a;
    }

    @VisibleForTesting(otherwise = 5)
    public static /* synthetic */ void isPushCalled$annotations() {
    }

    /* renamed from: a */
    public static final void m59506a(InMobiUserDataModel inMobiUserDataModel) {
        boolean booleanValue;
        InMobiUserDataModel inMobiUserDataModel2;
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        Objects.toString(inMobiUserDataModel);
        LinkedHashMap linkedHashMap = C19379n2.f48527a;
        boolean z = !((SignalsConfig) AbstractC19423q4.m59930a("signals", "null cannot be cast to non-null type com.inmobi.commons.core.configs.SignalsConfig", null)).getUnifiedIdServiceConfig().isEnabled();
        if (z) {
            reset();
        }
        if (z) {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            return;
        }
        Boolean m61047c = C18955Hb.f47329a.m61047c();
        boolean booleanValue2 = m61047c != null ? m61047c.booleanValue() : true;
        if (booleanValue2) {
            reset();
        }
        if (booleanValue2) {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            return;
        }
        Boolean bool = AbstractC19512w9.f48829b;
        boolean z2 = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context m61068d = C18954Ha.m61068d();
            if (m61068d != null) {
                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d, "user_info_store");
                Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                AbstractC19512w9.f48829b = Boolean.valueOf(m59823a.f48820a.getBoolean("user_age_restricted", false));
            }
            Boolean bool2 = AbstractC19512w9.f48829b;
            booleanValue = bool2 != null ? bool2.booleanValue() : false;
        }
        if (booleanValue) {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            return;
        }
        InMobiUserDataModel inMobiUserDataModel3 = C19094S3.f47683a;
        if (inMobiUserDataModel == null && C19094S3.f47683a == null) {
            z2 = true;
        } else if (inMobiUserDataModel != null && (inMobiUserDataModel2 = C19094S3.f47683a) != null) {
            z2 = Intrinsics.m17075f(inMobiUserDataModel, inMobiUserDataModel2);
        }
        if (z2 && f48973a.get()) {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            return;
        }
        synchronized (C19094S3.class) {
            Objects.toString(C19094S3.f47683a);
            Objects.toString(inMobiUserDataModel);
            C19094S3.f47683a = inMobiUserDataModel;
        }
        f48973a.set(true);
        AbstractC19011Lb.m60923c();
    }

    /* renamed from: a */
    public static final void m59508a() {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        f48973a.set(false);
        synchronized (C19094S3.class) {
            Objects.toString(C19094S3.f47683a);
            C19094S3.f47683a = null;
        }
        AbstractC19011Lb.m60921e();
        AbstractC19031N4.m60856b(null);
        AbstractC19031N4.m60858a(null);
        AbstractC19031N4.f47559d = false;
        AbstractC19031N4.f47558c = false;
    }
}
