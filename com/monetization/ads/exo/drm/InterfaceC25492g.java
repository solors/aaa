package com.monetization.ads.exo.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.monetization.ads.exo.drm.InterfaceC25485e;
import com.monetization.ads.exo.drm.InterfaceC25488f;
import com.monetization.ads.exo.drm.InterfaceC25492g;
import com.yandex.mobile.ads.impl.g32;
import com.yandex.mobile.ads.impl.le1;
import com.yandex.mobile.ads.impl.v90;

/* renamed from: com.monetization.ads.exo.drm.g */
/* loaded from: classes7.dex */
public interface InterfaceC25492g {

    /* renamed from: a */
    public static final InterfaceC25492g f66191a = new C25493a();

    /* renamed from: com.monetization.ads.exo.drm.g$a */
    /* loaded from: classes7.dex */
    final class C25493a implements InterfaceC25492g {
        C25493a() {
        }

        @Override // com.monetization.ads.exo.drm.InterfaceC25492g
        /* renamed from: a */
        public final void mo44426a(Looper looper, le1 le1Var) {
        }

        @Override // com.monetization.ads.exo.drm.InterfaceC25492g
        @Nullable
        /* renamed from: a */
        public final InterfaceC25485e mo44425a(@Nullable InterfaceC25488f.C25489a c25489a, v90 v90Var) {
            if (v90Var.f86626p == null) {
                return null;
            }
            return new C25504l(new InterfaceC25485e.C25486a(new g32(), 6001));
        }

        @Override // com.monetization.ads.exo.drm.InterfaceC25492g
        /* renamed from: a */
        public final int mo44424a(v90 v90Var) {
            return v90Var.f86626p != null ? 1 : 0;
        }
    }

    /* renamed from: a */
    int mo44424a(v90 v90Var);

    @Nullable
    /* renamed from: a */
    InterfaceC25485e mo44425a(@Nullable InterfaceC25488f.C25489a c25489a, v90 v90Var);

    /* renamed from: a */
    void mo44426a(Looper looper, le1 le1Var);

    /* renamed from: b */
    default InterfaceC25494b mo44427b(@Nullable InterfaceC25488f.C25489a c25489a, v90 v90Var) {
        return InterfaceC25494b.f66192a;
    }

    /* renamed from: com.monetization.ads.exo.drm.g$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC25494b {

        /* renamed from: a */
        public static final InterfaceC25494b f66192a = new InterfaceC25494b() { // from class: com.monetization.ads.exo.drm.i0
            @Override // com.monetization.ads.exo.drm.InterfaceC25492g.InterfaceC25494b
            public final void release() {
                InterfaceC25492g.InterfaceC25494b.lambda$static$0();
            }
        };

        void release();

        static /* synthetic */ void lambda$static$0() {
        }
    }

    default void prepare() {
    }

    default void release() {
    }
}
