package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes9.dex */
public final class StartupParamsItem {

    /* renamed from: a */
    private final String f92248a;

    /* renamed from: b */
    private final StartupParamsItemStatus f92249b;

    /* renamed from: c */
    private final String f92250c;

    public StartupParamsItem(@Nullable String str, @NonNull StartupParamsItemStatus startupParamsItemStatus, @Nullable String str2) {
        this.f92248a = str;
        this.f92249b = startupParamsItemStatus;
        this.f92250c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StartupParamsItem.class != obj.getClass()) {
            return false;
        }
        StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
        if (Objects.equals(this.f92248a, startupParamsItem.f92248a) && this.f92249b == startupParamsItem.f92249b && Objects.equals(this.f92250c, startupParamsItem.f92250c)) {
            return true;
        }
        return false;
    }

    @Nullable
    public String getErrorDetails() {
        return this.f92250c;
    }

    @Nullable
    public String getId() {
        return this.f92248a;
    }

    @NonNull
    public StartupParamsItemStatus getStatus() {
        return this.f92249b;
    }

    public int hashCode() {
        return Objects.hash(this.f92248a, this.f92249b, this.f92250c);
    }

    @NonNull
    public String toString() {
        return "StartupParamsItem{id='" + this.f92248a + "', status=" + this.f92249b + ", errorDetails='" + this.f92250c + "'}";
    }
}
