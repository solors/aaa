package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.C31006o0;
import com.yandex.mobile.ads.impl.as1;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.l0 */
/* loaded from: classes8.dex */
public final class C30761l0 {
    @NotNull

    /* renamed from: a */
    private final Context f81645a;
    @NotNull

    /* renamed from: b */
    private final C31006o0 f81646b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC30350g0 f81647c;
    @NotNull

    /* renamed from: d */
    private final ky1 f81648d;
    @NotNull

    /* renamed from: e */
    private final C30762a f81649e;

    public C30761l0(@NotNull Context context, @NotNull C30359g3 adConfiguration, @NotNull InterfaceC30896n0 interactionEventListener, @NotNull Context applicationContext, @NotNull C31006o0 activityInteractionTracker, @NotNull InterfaceC30350g0 activityBackgroundListener, @NotNull ky1 strongReferenceKeepingManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(interactionEventListener, "interactionEventListener");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(activityInteractionTracker, "activityInteractionTracker");
        Intrinsics.checkNotNullParameter(activityBackgroundListener, "activityBackgroundListener");
        Intrinsics.checkNotNullParameter(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        this.f81645a = applicationContext;
        this.f81646b = activityInteractionTracker;
        this.f81647c = activityBackgroundListener;
        this.f81648d = strongReferenceKeepingManager;
        this.f81649e = new C30762a(this);
    }

    /* renamed from: a */
    public final void m32391a() {
        this.f81647c.mo33400b(this.f81645a, (InterfaceC31250r0) this.f81649e);
        this.f81647c.mo33401b(this.f81645a, this.f81649e);
    }

    /* renamed from: b */
    public final void m32389b() {
        this.f81646b.m31204a(C31006o0.EnumC31007a.f83249e);
    }

    /* renamed from: c */
    public final void m32388c() {
        this.f81646b.m31202b(C31006o0.EnumC31007a.f83249e);
    }

    /* renamed from: d */
    public final void m32387d() {
        this.f81646b.m31204a(C31006o0.EnumC31007a.f83247c);
        this.f81647c.mo33406a(this.f81645a, (InterfaceC31250r0) this.f81649e);
        this.f81647c.mo33407a(this.f81645a, this.f81649e);
        this.f81648d.m32395a(zn0.f89007d, this);
    }

    /* renamed from: e */
    public final void m32386e() {
        this.f81648d.m32393b(zn0.f89007d, this);
        this.f81647c.mo33400b(this.f81645a, (InterfaceC31250r0) this.f81649e);
        this.f81647c.mo33401b(this.f81645a, this.f81649e);
        this.f81646b.m31202b(C31006o0.EnumC31007a.f83247c);
    }

    /* renamed from: f */
    public final void m32385f() {
        this.f81646b.m31204a(C31006o0.EnumC31007a.f83248d);
    }

    /* renamed from: g */
    public final void m32384g() {
        this.f81646b.m31202b(C31006o0.EnumC31007a.f83248d);
    }

    /* renamed from: a */
    public final void m32390a(@NotNull m41 reportParameterManager) {
        Intrinsics.checkNotNullParameter(reportParameterManager, "reportParameterManager");
        this.f81646b.m31205a(reportParameterManager);
    }

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.l0$a */
    /* loaded from: classes8.dex */
    public static final class C30762a implements InterfaceC31250r0, cn1 {
        @NotNull

        /* renamed from: a */
        private final C30761l0 f81650a;
        @Nullable

        /* renamed from: b */
        private WeakReference<Activity> f81651b;
        @Nullable

        /* renamed from: c */
        private String f81652c;

        public C30762a(@NotNull C30761l0 activityInteractionController) {
            Intrinsics.checkNotNullParameter(activityInteractionController, "activityInteractionController");
            this.f81650a = activityInteractionController;
        }

        @Override // com.yandex.mobile.ads.impl.cn1
        /* renamed from: a */
        public final void mo32383a(@NotNull Activity activity, @Nullable Bundle bundle) {
            String string;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Objects.toString(activity);
            um0.m28728a(new Object[0]);
            if (bundle == null || (string = bundle.getString("monetization_ads_activity_id")) == null || !Intrinsics.m17075f(string, this.f81652c)) {
                return;
            }
            this.f81650a.m32387d();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC31250r0
        /* renamed from: b */
        public final void mo29882b(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Objects.toString(activity);
            boolean z = false;
            um0.m28728a(new Object[0]);
            int i = as1.f76895l;
            yp1 m35796a = as1.C29962a.m35776a().m35796a(activity);
            boolean z2 = m35796a != null && m35796a.m26747l0();
            Intent intent = activity.getIntent();
            if (intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false)) {
                z = true;
            }
            WeakReference<Activity> weakReference = this.f81651b;
            if ((weakReference == null || !Intrinsics.m17075f(activity, weakReference.get()) || z2) && (!z2 || z)) {
                return;
            }
            this.f81650a.m32387d();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC31250r0
        /* renamed from: a */
        public final void mo29884a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Objects.toString(activity);
            um0.m28728a(new Object[0]);
            if (this.f81651b == null) {
                this.f81651b = new WeakReference<>(activity);
            }
        }

        @Override // com.yandex.mobile.ads.impl.cn1
        /* renamed from: b */
        public final void mo32382b(@NotNull Activity activity, @Nullable Bundle bundle) {
            WeakReference<Activity> weakReference;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Objects.toString(activity);
            um0.m28728a(new Object[0]);
            if (bundle == null || (weakReference = this.f81651b) == null || !Intrinsics.m17075f(activity, weakReference.get())) {
                return;
            }
            String uuid = UUID.randomUUID().toString();
            this.f81652c = uuid;
            bundle.putString("monetization_ads_activity_id", uuid);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C30761l0(android.content.Context r13, com.yandex.mobile.ads.impl.C30359g3 r14, com.yandex.mobile.ads.impl.C30149d8 r15, com.yandex.mobile.ads.impl.InterfaceC30896n0 r16, com.monetization.ads.base.tracker.interaction.model.FalseClick r17) {
        /*
            r12 = this;
            android.content.Context r4 = r13.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            com.yandex.mobile.ads.impl.o0 r11 = new com.yandex.mobile.ads.impl.o0
            r5 = r11
            r6 = r13
            r7 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r5.<init>(r6, r7, r8, r9, r10)
            com.yandex.mobile.ads.impl.i0 r6 = com.yandex.mobile.ads.impl.C30430h0.m33744a()
            int r0 = com.yandex.mobile.ads.impl.ky1.f81637d
            com.yandex.mobile.ads.impl.ky1 r7 = com.yandex.mobile.ads.impl.ky1.C30758a.m32392a()
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30761l0.<init>(android.content.Context, com.yandex.mobile.ads.impl.g3, com.yandex.mobile.ads.impl.d8, com.yandex.mobile.ads.impl.n0, com.monetization.ads.base.tracker.interaction.model.FalseClick):void");
    }
}
