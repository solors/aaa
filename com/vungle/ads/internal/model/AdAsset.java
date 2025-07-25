package com.vungle.ads.internal.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.model.a */
/* loaded from: classes7.dex */
public final class AdAsset {
    @NotNull
    private final String adIdentifier;
    private long fileSize;
    @NotNull
    private final EnumC29244a fileType;
    private final boolean isRequired;
    @NotNull
    private final String localPath;
    @NotNull
    private final String serverPath;
    @NotNull
    private EnumC29245b status;

    /* compiled from: AdAsset.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.model.a$a */
    /* loaded from: classes7.dex */
    public enum EnumC29244a {
        ZIP,
        ASSET
    }

    /* compiled from: AdAsset.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.model.a$b */
    /* loaded from: classes7.dex */
    public enum EnumC29245b {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public AdAsset(@NotNull String adIdentifier, @NotNull String serverPath, @NotNull String localPath, @NotNull EnumC29244a fileType, boolean z) {
        Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        Intrinsics.checkNotNullParameter(serverPath, "serverPath");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        this.adIdentifier = adIdentifier;
        this.serverPath = serverPath;
        this.localPath = localPath;
        this.fileType = fileType;
        this.isRequired = z;
        this.status = EnumC29245b.NEW;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(AdAsset.class, obj.getClass())) {
            return false;
        }
        AdAsset adAsset = (AdAsset) obj;
        if (this.status != adAsset.status || this.fileType != adAsset.fileType || this.fileSize != adAsset.fileSize || this.isRequired != adAsset.isRequired || !Intrinsics.m17075f(this.adIdentifier, adAsset.adIdentifier) || !Intrinsics.m17075f(this.serverPath, adAsset.serverPath)) {
            return false;
        }
        return Intrinsics.m17075f(this.localPath, adAsset.localPath);
    }

    @NotNull
    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    @NotNull
    public final EnumC29244a getFileType() {
        return this.fileType;
    }

    @NotNull
    public final String getLocalPath() {
        return this.localPath;
    }

    @NotNull
    public final String getServerPath() {
        return this.serverPath;
    }

    @NotNull
    public final EnumC29245b getStatus() {
        return this.status;
    }

    public int hashCode() {
        long j = this.fileSize;
        return (((((((((((this.adIdentifier.hashCode() * 31) + this.serverPath.hashCode()) * 31) + this.localPath.hashCode()) * 31) + this.status.hashCode()) * 31) + this.fileType.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Boolean.hashCode(this.isRequired);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setStatus(@NotNull EnumC29245b enumC29245b) {
        Intrinsics.checkNotNullParameter(enumC29245b, "<set-?>");
        this.status = enumC29245b;
    }

    @NotNull
    public String toString() {
        return "AdAsset{, adIdentifier='" + this.adIdentifier + "', serverPath='" + this.serverPath + "', localPath='" + this.localPath + "', status=" + this.status + ", fileType=" + this.fileType + ", fileSize=" + this.fileSize + ", isRequired=" + this.isRequired + '}';
    }
}
