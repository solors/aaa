package com.inmobi.media;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.inmobi.media.C18955Hb;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.Hb */
/* loaded from: classes6.dex */
public final class C18955Hb {

    /* renamed from: a */
    public static final C18955Hb f47329a = new C18955Hb();

    /* renamed from: b */
    public static C19545z0 f47330b;

    /* renamed from: e */
    public static void m61045e() {
        boolean z;
        boolean booleanValue;
        C19545z0 c19545z0;
        try {
            Context m61068d = C18954Ha.m61068d();
            if (m61068d != null) {
                C19545z0 c19545z02 = new C19545z0();
                try {
                    Reflection.m17042b(AdvertisingIdClient.class).getSimpleName();
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(m61068d);
                        Intrinsics.checkNotNullExpressionValue(advertisingIdInfo, "getAdvertisingIdInfo(...)");
                        c19545z02.m59529a(advertisingIdInfo.getId());
                        c19545z02.m59528a(advertisingIdInfo.isLimitAdTrackingEnabled());
                        f47330b = c19545z02;
                        Boolean bool = AbstractC19512w9.f48829b;
                        if (bool != null) {
                            booleanValue = bool.booleanValue();
                        } else {
                            Context m61068d2 = C18954Ha.m61068d();
                            z = false;
                            if (m61068d2 != null) {
                                ConcurrentHashMap concurrentHashMap = C19508w5.f48819b;
                                C19508w5 m59823a = AbstractC19494v5.m59823a(m61068d2, "user_info_store");
                                Intrinsics.checkNotNullParameter("user_age_restricted", "key");
                                AbstractC19512w9.f48829b = Boolean.valueOf(m59823a.f48820a.getBoolean("user_age_restricted", false));
                            }
                            Boolean bool2 = AbstractC19512w9.f48829b;
                            if (bool2 != null) {
                                booleanValue = bool2.booleanValue();
                            }
                            if (z && (c19545z0 = f47330b) != null) {
                                c19545z0.m59529a((String) null);
                            }
                            return;
                        }
                        z = booleanValue;
                        if (z) {
                            c19545z0.m59529a((String) null);
                        }
                    } catch (Exception unused) {
                        Intrinsics.checkNotNullExpressionValue("Hb", "TAG");
                    }
                } catch (NoClassDefFoundError unused2) {
                }
            }
        } catch (Exception unused3) {
            Intrinsics.checkNotNullExpressionValue("Hb", "TAG");
        }
    }

    /* renamed from: f */
    public static final void m61044f() {
        m61045e();
    }

    @WorkerThread
    /* renamed from: a */
    public final void m61050a() {
        try {
            m61045e();
            m61046d();
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("Hb", "TAG");
        }
    }

    @Nullable
    /* renamed from: b */
    public final C19545z0 m61048b() {
        return f47330b;
    }

    @Nullable
    /* renamed from: c */
    public final Boolean m61047c() {
        C19545z0 c19545z0 = f47330b;
        if (c19545z0 != null) {
            return c19545z0.m59526c();
        }
        return null;
    }

    /* renamed from: d */
    public final void m61046d() {
        String m59530a;
        try {
            C19545z0 c19545z0 = f47330b;
            if (c19545z0 != null && (m59530a = c19545z0.m59530a()) != null) {
                Intrinsics.checkNotNullExpressionValue("Hb", "TAG");
                AbstractC19187Z5.m60514a((byte) 2, "Hb", "Publisher device Id is ".concat(m59530a));
            }
        } catch (Exception unused) {
            Intrinsics.checkNotNullExpressionValue("Hb", "TAG");
        }
    }

    /* renamed from: a */
    public final void m61049a(boolean z) {
        C19545z0 c19545z0 = f47330b;
        if (c19545z0 == null) {
            return;
        }
        if (z) {
            c19545z0.m59529a((String) null);
        } else if (c19545z0.m59530a() == null) {
            C18954Ha.m61079a(new Runnable() { // from class: o3.c0
                @Override // java.lang.Runnable
                public final void run() {
                    C18955Hb.m61044f();
                }
            });
        }
    }
}
