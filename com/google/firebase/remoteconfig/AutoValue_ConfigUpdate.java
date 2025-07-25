package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import java.util.Set;

/* loaded from: classes4.dex */
final class AutoValue_ConfigUpdate extends ConfigUpdate {

    /* renamed from: a */
    private final Set<String> f43420a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_ConfigUpdate(Set<String> set) {
        if (set != null) {
            this.f43420a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.f43420a.equals(((ConfigUpdate) obj).getUpdatedKeys());
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdate
    @NonNull
    public Set<String> getUpdatedKeys() {
        return this.f43420a;
    }

    public int hashCode() {
        return this.f43420a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f43420a + "}";
    }
}
