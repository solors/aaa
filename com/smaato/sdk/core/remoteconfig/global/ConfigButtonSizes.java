package com.smaato.sdk.core.remoteconfig.global;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ConfigButtonSizes {
    private final int midInDp;
    private final int smallInDp;

    /* renamed from: com.smaato.sdk.core.remoteconfig.global.ConfigButtonSizes$b */
    /* loaded from: classes7.dex */
    static final class C27252b {
        @Nullable

        /* renamed from: a */
        private Integer f71851a;
        @Nullable

        /* renamed from: b */
        private Integer f71852b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27252b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        /* renamed from: a */
        public ConfigButtonSizes m39396a() {
            Integer num = this.f71851a;
            if (num == null || num.intValue() < 0) {
                this.f71851a = 20;
            }
            Integer num2 = this.f71852b;
            if (num2 == null || num2.intValue() < 0) {
                this.f71852b = 30;
            }
            return new ConfigButtonSizes(this.f71851a.intValue(), this.f71852b.intValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27252b(@NonNull JSONObject jSONObject) {
            if (jSONObject.optInt("small", -1) != -1) {
                this.f71851a = Integer.valueOf(jSONObject.optInt("small"));
            }
            if (jSONObject.optInt("mid", -1) != -1) {
                this.f71852b = Integer.valueOf(jSONObject.optInt("mid"));
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigButtonSizes configButtonSizes = (ConfigButtonSizes) obj;
        if (this.smallInDp == configButtonSizes.getSmallInDp() && this.midInDp == configButtonSizes.getMidInDp()) {
            return true;
        }
        return false;
    }

    public int getMidInDp() {
        return this.midInDp;
    }

    public int getSmallInDp() {
        return this.smallInDp;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.smallInDp), Integer.valueOf(this.midInDp));
    }

    private ConfigButtonSizes(int i, int i2) {
        this.smallInDp = i;
        this.midInDp = i2;
    }
}
