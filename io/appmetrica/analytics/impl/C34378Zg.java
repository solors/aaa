package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.Zg */
/* loaded from: classes9.dex */
public class C34378Zg extends C34365Z3 {

    /* renamed from: c */
    protected C33789B8 f93887c;

    /* renamed from: d */
    protected C34065Me f93888d;

    /* renamed from: e */
    public boolean f93889e;

    /* renamed from: f */
    public String f93890f;

    public C34378Zg(@NonNull C34208Se c34208Se, @NonNull CounterConfiguration counterConfiguration) {
        this(c34208Se, counterConfiguration, null);
    }

    /* renamed from: a */
    public final void m22038a(C34968vk c34968vk) {
        this.f93887c = new C33789B8(c34968vk);
    }

    /* renamed from: c */
    public final Bundle m22037c() {
        Bundle bundle = new Bundle();
        this.f93861b.toBundle(bundle);
        C34208Se c34208Se = this.f93860a;
        synchronized (c34208Se) {
            bundle.putParcelable("PROCESS_CFG_OBJ", c34208Se);
        }
        return bundle;
    }

    @Nullable
    /* renamed from: d */
    public final String m22036d() {
        C33789B8 c33789b8 = this.f93887c;
        if (c33789b8.f92610a.isEmpty()) {
            return null;
        }
        return new JSONObject(c33789b8.f92610a).toString();
    }

    @Nullable
    /* renamed from: e */
    public final synchronized String m22035e() {
        return this.f93890f;
    }

    /* renamed from: f */
    public boolean mo22034f() {
        return this.f93889e;
    }

    public C34378Zg(@NonNull C34208Se c34208Se, @NonNull CounterConfiguration counterConfiguration, @Nullable String str) {
        super(c34208Se, counterConfiguration);
        this.f93889e = true;
        this.f93890f = str;
    }
}
