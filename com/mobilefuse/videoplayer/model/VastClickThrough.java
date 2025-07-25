package com.mobilefuse.videoplayer.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastClickThrough {
    @Nullable

    /* renamed from: id */
    private final String f61730id;
    @NotNull
    private final String url;

    public VastClickThrough(@Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f61730id = str;
        this.url = url;
    }

    public static /* synthetic */ VastClickThrough copy$default(VastClickThrough vastClickThrough, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vastClickThrough.f61730id;
        }
        if ((i & 2) != 0) {
            str2 = vastClickThrough.url;
        }
        return vastClickThrough.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.f61730id;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final VastClickThrough copy(@Nullable String str, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new VastClickThrough(str, url);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof VastClickThrough) {
                VastClickThrough vastClickThrough = (VastClickThrough) obj;
                if (!Intrinsics.m17075f(this.f61730id, vastClickThrough.f61730id) || !Intrinsics.m17075f(this.url, vastClickThrough.url)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final String getId() {
        return this.f61730id;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int i;
        String str = this.f61730id;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.url;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @NotNull
    public String toString() {
        return "VastClickThrough(id=" + this.f61730id + ", url=" + this.url + ")";
    }
}
