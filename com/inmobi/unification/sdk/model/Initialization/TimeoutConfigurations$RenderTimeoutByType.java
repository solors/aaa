package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.inmobi.media.C18871Bb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata
/* loaded from: classes6.dex */
public final class TimeoutConfigurations$RenderTimeoutByType {
    @NotNull
    public static final C18871Bb Companion = new C18871Bb();
    private int audio;
    private int banner;

    /* renamed from: int  reason: not valid java name */
    private int f119458int;

    /* renamed from: native  reason: not valid java name */
    private int f119459native;

    public /* synthetic */ TimeoutConfigurations$RenderTimeoutByType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int getAudio$media_release() {
        return this.audio;
    }

    public final int getBanner$media_release() {
        return this.banner;
    }

    public final int getInt$media_release() {
        return this.f119458int;
    }

    public final int getNative$media_release() {
        return this.f119459native;
    }

    public final int getTimeoutByType$media_release(@NotNull String adType, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(adType, "adType");
        int hashCode = adType.hashCode();
        if (hashCode != -1396342996) {
            if (hashCode != -1052618729) {
                if (hashCode != 104431) {
                    if (hashCode == 93166550 && adType.equals("audio") && (i5 = this.audio) > 0) {
                        return i5;
                    }
                } else if (adType.equals("int") && (i4 = this.f119458int) > 0) {
                    return i4;
                }
            } else if (adType.equals("native") && (i3 = this.f119459native) > 0) {
                return i3;
            }
        } else if (adType.equals("banner") && (i2 = this.banner) > 0) {
            return i2;
        }
        return i;
    }

    public final void setAudio$media_release(int i) {
        this.audio = i;
    }

    public final void setBanner$media_release(int i) {
        this.banner = i;
    }

    public final void setInt$media_release(int i) {
        this.f119458int = i;
    }

    public final void setNative$media_release(int i) {
        this.f119459native = i;
    }

    @VisibleForTesting(otherwise = 5)
    public final void setTimeoutByType(@NotNull String adType, int i) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        int hashCode = adType.hashCode();
        if (hashCode != -1396342996) {
            if (hashCode != -1052618729) {
                if (hashCode != 104431) {
                    if (hashCode == 93166550 && adType.equals("audio")) {
                        this.audio = i;
                    }
                } else if (adType.equals("int")) {
                    this.f119458int = i;
                }
            } else if (adType.equals("native")) {
                this.f119459native = i;
            }
        } else if (adType.equals("banner")) {
            this.banner = i;
        }
    }

    private TimeoutConfigurations$RenderTimeoutByType() {
    }
}
