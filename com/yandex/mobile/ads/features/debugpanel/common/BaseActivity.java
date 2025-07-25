package com.yandex.mobile.ads.features.debugpanel.common;

import android.app.Activity;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.C30499ht;
import com.yandex.mobile.ads.impl.ob2;
import com.yandex.mobile.ads.impl.pb2;
import kotlin.Metadata;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public abstract class BaseActivity<T extends ob2> extends Activity {
    @NotNull

    /* renamed from: a */
    private final CoroutineScope f76573a = C30499ht.m33469a();
    @Nullable

    /* renamed from: b */
    private final Object f76574b;
    @Nullable

    /* renamed from: c */
    private T f76575c;

    /* renamed from: com.yandex.mobile.ads.features.debugpanel.common.BaseActivity$a */
    /* loaded from: classes8.dex */
    public static final class C29891a {
        @Nullable

        /* renamed from: a */
        private final Object f76576a;
        @Nullable

        /* renamed from: b */
        private final ob2 f76577b;

        public C29891a() {
            this(0);
        }

        @Nullable
        /* renamed from: a */
        public final Object m36048a() {
            return this.f76576a;
        }

        @Nullable
        /* renamed from: b */
        public final ob2 m36047b() {
            return this.f76577b;
        }

        public C29891a(@Nullable Object obj, @Nullable ob2 ob2Var) {
            this.f76576a = obj;
            this.f76577b = ob2Var;
        }

        public /* synthetic */ C29891a(int i) {
            this(null, null);
        }
    }

    public BaseActivity() {
        C29891a c29891a;
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        if (lastNonConfigurationInstance instanceof C29891a) {
            c29891a = (C29891a) lastNonConfigurationInstance;
        } else {
            c29891a = null;
        }
        this.f76574b = c29891a != null ? c29891a.m36048a() : null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: a */
    public final CoroutineScope m36050a() {
        return this.f76573a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: b */
    public final T m36049b() {
        T t = this.f76575c;
        if (t == null) {
            T mo30552a = mo36043c().mo30552a();
            this.f76575c = mo30552a;
            return mo30552a;
        }
        return t;
    }

    @NotNull
    /* renamed from: c */
    public abstract pb2<T> mo36043c();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        C29891a c29891a;
        Object lastNonConfigurationInstance = getLastNonConfigurationInstance();
        T t = null;
        if (lastNonConfigurationInstance instanceof C29891a) {
            c29891a = (C29891a) lastNonConfigurationInstance;
        } else {
            c29891a = null;
        }
        if (c29891a != null) {
            ob2 m36047b = c29891a.m36047b();
            if (m36047b instanceof ob2) {
                t = m36047b;
            }
            this.f76575c = t;
        }
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        T t;
        super.onDestroy();
        C37785p0.m16126f(this.f76573a, null, 1, null);
        if (!isChangingConfigurations() && (t = this.f76575c) != null) {
            t.m31116a();
        }
    }

    @Override // android.app.Activity
    @NotNull
    public final Object onRetainNonConfigurationInstance() {
        return new C29891a(null, m36049b());
    }
}
