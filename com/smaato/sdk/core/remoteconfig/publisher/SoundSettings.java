package com.smaato.sdk.core.remoteconfig.publisher;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class SoundSettings {
    private final boolean isSoundOn;

    /* renamed from: com.smaato.sdk.core.remoteconfig.publisher.SoundSettings$b */
    /* loaded from: classes7.dex */
    static final class C27273b {
        @Nullable

        /* renamed from: a */
        private Boolean f71889a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27273b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        /* renamed from: a */
        public SoundSettings m39372a() {
            if (this.f71889a == null) {
                this.f71889a = Boolean.TRUE;
            }
            return new SoundSettings(this.f71889a.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27273b(@NonNull JSONObject jSONObject) {
            if (jSONObject.has("soundOn")) {
                this.f71889a = Boolean.valueOf(jSONObject.optBoolean("soundOn"));
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SoundSettings) && isSoundOn() == ((SoundSettings) obj).isSoundOn()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(isSoundOn()));
    }

    public boolean isSoundOn() {
        return this.isSoundOn;
    }

    private SoundSettings(boolean z) {
        this.isSoundOn = z;
    }
}
