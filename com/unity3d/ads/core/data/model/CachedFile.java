package com.unity3d.ads.core.data.model;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CachedFile.kt */
@Metadata
/* loaded from: classes7.dex */
public final class CachedFile {
    private final long contentLength;
    @Nullable
    private final String extension;
    @Nullable
    private final File file;
    @NotNull
    private final String name;
    @NotNull
    private final String objectId;
    private final int priority;
    @NotNull
    private final String protocol;
    @NotNull
    private final String url;

    public CachedFile(@NotNull String objectId, @NotNull String url, @NotNull String name, @Nullable File file, @Nullable String str, long j, @NotNull String protocol, int i) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        this.objectId = objectId;
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j;
        this.protocol = protocol;
        this.priority = i;
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, String str3, File file, String str4, long j, String str5, int i, int i2, Object obj) {
        String str6;
        String str7;
        String str8;
        File file2;
        String str9;
        long j2;
        String str10;
        int i3;
        if ((i2 & 1) != 0) {
            str6 = cachedFile.objectId;
        } else {
            str6 = str;
        }
        if ((i2 & 2) != 0) {
            str7 = cachedFile.url;
        } else {
            str7 = str2;
        }
        if ((i2 & 4) != 0) {
            str8 = cachedFile.name;
        } else {
            str8 = str3;
        }
        if ((i2 & 8) != 0) {
            file2 = cachedFile.file;
        } else {
            file2 = file;
        }
        if ((i2 & 16) != 0) {
            str9 = cachedFile.extension;
        } else {
            str9 = str4;
        }
        if ((i2 & 32) != 0) {
            j2 = cachedFile.contentLength;
        } else {
            j2 = j;
        }
        if ((i2 & 64) != 0) {
            str10 = cachedFile.protocol;
        } else {
            str10 = str5;
        }
        if ((i2 & 128) != 0) {
            i3 = cachedFile.priority;
        } else {
            i3 = i;
        }
        return cachedFile.copy(str6, str7, str8, file2, str9, j2, str10, i3);
    }

    @NotNull
    public final String component1() {
        return this.objectId;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @Nullable
    public final File component4() {
        return this.file;
    }

    @Nullable
    public final String component5() {
        return this.extension;
    }

    public final long component6() {
        return this.contentLength;
    }

    @NotNull
    public final String component7() {
        return this.protocol;
    }

    public final int component8() {
        return this.priority;
    }

    @NotNull
    public final CachedFile copy(@NotNull String objectId, @NotNull String url, @NotNull String name, @Nullable File file, @Nullable String str, long j, @NotNull String protocol, int i) {
        Intrinsics.checkNotNullParameter(objectId, "objectId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        return new CachedFile(objectId, url, name, file, str, j, protocol, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        if (Intrinsics.m17075f(this.objectId, cachedFile.objectId) && Intrinsics.m17075f(this.url, cachedFile.url) && Intrinsics.m17075f(this.name, cachedFile.name) && Intrinsics.m17075f(this.file, cachedFile.file) && Intrinsics.m17075f(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && Intrinsics.m17075f(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority) {
            return true;
        }
        return false;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    @Nullable
    public final String getExtension() {
        return this.extension;
    }

    @Nullable
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getObjectId() {
        return this.objectId;
    }

    public final int getPriority() {
        return this.priority;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.objectId.hashCode() * 31) + this.url.hashCode()) * 31) + this.name.hashCode()) * 31;
        File file = this.file;
        int i = 0;
        if (file == null) {
            hashCode = 0;
        } else {
            hashCode = file.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.extension;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((i2 + i) * 31) + Long.hashCode(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + Integer.hashCode(this.priority);
    }

    @NotNull
    public String toString() {
        return "CachedFile(objectId=" + this.objectId + ", url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }

    public /* synthetic */ CachedFile(String str, String str2, String str3, File file, String str4, long j, String str5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : file, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? -1L : j, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? Integer.MAX_VALUE : i);
    }
}
