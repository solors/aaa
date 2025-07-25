package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import com.maticoo.sdk.utils.constant.KeyConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.N1 */
/* loaded from: classes9.dex */
public final class C34076N1 {

    /* renamed from: a */
    public final C34747na f93250a = new C34747na();

    /* renamed from: b */
    public final LinkedHashMap f93251b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashMap f93252c = new LinkedHashMap();

    /* renamed from: a */
    public final void m22423a() {
    }

    /* renamed from: b */
    public final void m22416b() {
    }

    /* renamed from: c */
    public final void m22412c(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f93250a.m21305a(action, Integer.valueOf(m22422a(intent)));
            }
            for (Map.Entry entry : this.f93251b.entrySet()) {
                InterfaceC34052M1 interfaceC34052M1 = (InterfaceC34052M1) entry.getKey();
                if (((InterfaceC34028L1) entry.getValue()).mo21186a(intent)) {
                    interfaceC34052M1.mo21399a(intent);
                }
            }
        }
    }

    /* renamed from: d */
    public final void m22409d(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C34747na c34747na = this.f93250a;
                Integer valueOf = Integer.valueOf(m22422a(intent));
                Collection collection = (Collection) c34747na.f94995a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && c34747na.f94996b) {
                        c34747na.f94995a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f93252c.entrySet()) {
                InterfaceC34052M1 interfaceC34052M1 = (InterfaceC34052M1) entry.getKey();
                if (((InterfaceC34028L1) entry.getValue()).mo21186a(intent)) {
                    interfaceC34052M1.mo21399a(intent);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m22421a(@NotNull Intent intent, int i) {
    }

    /* renamed from: b */
    public final void m22415b(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f93250a.m21305a(action, Integer.valueOf(m22422a(intent)));
            }
            for (Map.Entry entry : this.f93251b.entrySet()) {
                InterfaceC34052M1 interfaceC34052M1 = (InterfaceC34052M1) entry.getKey();
                if (((InterfaceC34028L1) entry.getValue()).mo21186a(intent)) {
                    interfaceC34052M1.mo21399a(intent);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m22420a(@NotNull Intent intent, int i, int i2) {
    }

    /* renamed from: a */
    public final void m22419a(@NotNull Configuration configuration) {
    }

    /* renamed from: a */
    public final void m22418a(@NotNull InterfaceC34052M1 interfaceC34052M1) {
        this.f93252c.put(interfaceC34052M1, new InterfaceC34028L1() { // from class: io.appmetrica.analytics.impl.mo
            @Override // io.appmetrica.analytics.impl.InterfaceC34028L1
            /* renamed from: a */
            public final boolean mo21186a(Intent intent) {
                return C34076N1.m22417a(C34076N1.this, intent);
            }
        });
    }

    /* renamed from: a */
    public static final boolean m22417a(C34076N1 c34076n1, Intent intent) {
        Collection collection;
        c34076n1.getClass();
        return Intrinsics.m17075f("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && ((collection = (Collection) c34076n1.f93250a.f94995a.get("io.appmetrica.analytics.IAppMetricaService")) == null || collection.size() == 0);
    }

    /* renamed from: c */
    public final void m22411c(@NotNull InterfaceC34052M1 interfaceC34052M1) {
        this.f93251b.put(interfaceC34052M1, new InterfaceC34028L1() { // from class: io.appmetrica.analytics.impl.oo
            @Override // io.appmetrica.analytics.impl.InterfaceC34028L1
            /* renamed from: a */
            public final boolean mo21186a(Intent intent) {
                return C34076N1.m22410c(C34076N1.this, intent);
            }
        });
    }

    /* renamed from: c */
    public static final boolean m22410c(C34076N1 c34076n1, Intent intent) {
        c34076n1.getClass();
        return Intrinsics.m17075f("io.appmetrica.analytics.IAppMetricaService", intent.getAction());
    }

    /* renamed from: b */
    public final void m22414b(@NotNull InterfaceC34052M1 interfaceC34052M1) {
        this.f93251b.put(interfaceC34052M1, new InterfaceC34028L1() { // from class: io.appmetrica.analytics.impl.no
            @Override // io.appmetrica.analytics.impl.InterfaceC34028L1
            /* renamed from: a */
            public final boolean mo21186a(Intent intent) {
                return C34076N1.m22413b(C34076N1.this, intent);
            }
        });
    }

    /* renamed from: b */
    public static final boolean m22413b(C34076N1 c34076n1, Intent intent) {
        Collection collection;
        c34076n1.getClass();
        return Intrinsics.m17075f("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && (collection = (Collection) c34076n1.f93250a.f94995a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    /* renamed from: a */
    public static int m22422a(Intent intent) {
        Uri data = intent.getData();
        if (data != null && Intrinsics.m17075f(data.getPath(), "/client")) {
            try {
                String queryParameter = data.getQueryParameter(KeyConstants.RequestBody.KEY_PID);
                Intrinsics.m17074g(queryParameter);
                return Integer.parseInt(queryParameter);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }
}
