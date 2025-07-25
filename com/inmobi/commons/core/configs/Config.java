package com.inmobi.commons.core.configs;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.inmobi.media.C19108T4;
import com.inmobi.media.C19267f2;
import com.inmobi.media.InterfaceC19241d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Keep
@Metadata
/* loaded from: classes6.dex */
public abstract class Config {
    @NotNull
    public static final C19267f2 Companion = new C19267f2();
    @InterfaceC19241d4
    @Nullable
    private String accountId;
    @NotNull
    private C19108T4 includeIds = new C19108T4(false, 1, null);
    @InterfaceC19241d4
    private long lastUpdateTimeStamp;

    public Config(@Nullable String str) {
        this.accountId = str;
    }

    @Nullable
    public static final Config fromJSON(@NotNull String str, @NotNull JSONObject jSONObject, @Nullable String str2, long j) {
        Companion.getClass();
        return C19267f2.m60362a(str, jSONObject, str2, j);
    }

    @NotNull
    public static final Config newInstance(@NotNull String str, @Nullable String str2) {
        Companion.getClass();
        return C19267f2.m60363a(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        boolean m16614z;
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        if (!Intrinsics.m17075f(config.getType(), getType())) {
            return false;
        }
        String str = this.accountId;
        if (str != null || config.accountId != null) {
            if (str != null) {
                m16614z = StringsJVM.m16614z(str, config.accountId, false, 2, null);
                if (!m16614z) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @VisibleForTesting
    @Nullable
    public final String getAccountId() {
        return this.accountId;
    }

    @Nullable
    public final String getAccountId$media_release() {
        return this.accountId;
    }

    @NotNull
    public final C19108T4 getIncludeIdParams() {
        return this.includeIds;
    }

    public final long getLastUpdateTimeStamp() {
        return this.lastUpdateTimeStamp;
    }

    @NotNull
    public abstract String getType();

    public int hashCode() {
        int hashCode;
        int hashCode2 = getType().hashCode();
        String str = this.accountId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public abstract boolean isValid();

    public final void setAccountId$media_release(@Nullable String str) {
        this.accountId = str;
    }

    public final void setLastUpdateTimeStamp(long j) {
        this.lastUpdateTimeStamp = j;
    }

    @NotNull
    public abstract JSONObject toJson();
}
