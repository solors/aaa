package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.Clock;

/* loaded from: classes4.dex */
final class AutoValue_CreationContext extends CreationContext {

    /* renamed from: a */
    private final Context f31080a;

    /* renamed from: b */
    private final Clock f31081b;

    /* renamed from: c */
    private final Clock f31082c;

    /* renamed from: d */
    private final String f31083d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        if (context != null) {
            this.f31080a = context;
            if (clock != null) {
                this.f31081b = clock;
                if (clock2 != null) {
                    this.f31082c = clock2;
                    if (str != null) {
                        this.f31083d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        if (this.f31080a.equals(creationContext.getApplicationContext()) && this.f31081b.equals(creationContext.getWallClock()) && this.f31082c.equals(creationContext.getMonotonicClock()) && this.f31083d.equals(creationContext.getBackendName())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Context getApplicationContext() {
        return this.f31080a;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    @NonNull
    public String getBackendName() {
        return this.f31083d;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getMonotonicClock() {
        return this.f31082c;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public Clock getWallClock() {
        return this.f31081b;
    }

    public int hashCode() {
        return ((((((this.f31080a.hashCode() ^ 1000003) * 1000003) ^ this.f31081b.hashCode()) * 1000003) ^ this.f31082c.hashCode()) * 1000003) ^ this.f31083d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f31080a + ", wallClock=" + this.f31081b + ", monotonicClock=" + this.f31082c + ", backendName=" + this.f31083d + "}";
    }
}
