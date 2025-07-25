package com.bykv.p135vk.openvk.preload.geckox.model;

import com.appsflyer.AppsFlyerProperties;
import com.bykv.p135vk.openvk.preload.p155a.p156a.SerializedName;
import com.p552ot.pubsub.p559g.C26542f;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.geckox.model.UpdatePackage */
/* loaded from: classes3.dex */
public class UpdatePackage {
    private String accessKey;
    @SerializedName(m91667a = AppsFlyerProperties.CHANNEL)
    private String channel;
    @SerializedName(m91667a = "channel_index")
    private int channelIndex;
    @SerializedName(m91667a = "content")
    private Content content;
    @SerializedName(m91667a = "group_name")
    private String groupName;
    private long localVersion;
    @SerializedName(m91667a = "package_type")
    private int packageType;
    @SerializedName(m91667a = "package_version")
    private long version;

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.UpdatePackage$Content */
    /* loaded from: classes3.dex */
    public static class Content {
        @SerializedName(m91667a = C26542f.C26543a.f69507e)
        private Package fullPackage;
        @SerializedName(m91667a = "patch")
        private Package patch;
        @SerializedName(m91667a = "strategies")
        private Strategy strategy;
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.UpdatePackage$FileType */
    /* loaded from: classes3.dex */
    public static final class FileType {
        public static final int COMPRESSED_FILE = 0;
        public static final int MY_ARCHIVE_FILE = 2;
        public static final int UNCOMPRESSED_FILE = 1;
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.UpdatePackage$Package */
    /* loaded from: classes3.dex */
    public static class Package {
        @SerializedName(m91667a = "id")

        /* renamed from: id */
        long f14079id;
        @SerializedName(m91667a = "size")
        long length;
        @SerializedName(m91667a = "md5")
        String md5;
        @Deprecated
        String url;
        @SerializedName(m91667a = "url_list")
        List<String> urlList;

        public Package() {
        }

        public long getId() {
            return this.f14079id;
        }

        public long getLength() {
            return this.length;
        }

        public String getMd5() {
            return this.md5;
        }

        public String getUrl() {
            return this.url;
        }

        public List<String> getUrlList() {
            return this.urlList;
        }

        public void setId(int i) {
            this.f14079id = i;
        }

        public void setMd5(String str) {
            this.md5 = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public void setUrlList(List<String> list) {
            this.urlList = list;
        }

        public String toString() {
            return "Package{url='" + this.url + "', md5='" + this.md5 + "'}";
        }

        public Package(int i, List<String> list, String str) {
            this.f14079id = i;
            this.urlList = list;
            this.md5 = str;
        }
    }

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.UpdatePackage$Strategy */
    /* loaded from: classes3.dex */
    public static class Strategy {
        @SerializedName(m91667a = "del_if_download_failed")
        private boolean deleteIfFail;
        @SerializedName(m91667a = "del_old_pkg_before_download")
        private boolean deleteOldPackageBeforeDownload;
        @SerializedName(m91667a = "need_unzip")
        private boolean needUnzip;

        public Strategy(int i) {
            this.deleteIfFail = i == 1;
        }

        public boolean isDeleteIfFail() {
            return this.deleteIfFail;
        }

        public boolean isDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public boolean isNeedUnzip() {
            return this.needUnzip;
        }

        public void setDeleteIfFail(boolean z) {
            this.deleteIfFail = z;
        }

        public void setDeleteOldPackageBeforeDownload(boolean z) {
            this.deleteOldPackageBeforeDownload = z;
        }

        public void setNeedUnzip(boolean z) {
            this.needUnzip = z;
        }
    }

    public UpdatePackage() {
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getChannel() {
        return this.channel;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public Package getFullPackage() {
        return this.content.fullPackage;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public Package getPatch() {
        return this.content.patch;
    }

    public Strategy getStrategy() {
        return this.content.strategy;
    }

    public long getVersion() {
        return this.version;
    }

    public boolean isFullUpdate() {
        if (getFullPackage() != null && getFullPackage().getUrlList().size() > 0) {
            return true;
        }
        return false;
    }

    public boolean isPatchUpdate() {
        if (getPatch() != null && getPatch().getUrlList().size() > 0) {
            return true;
        }
        return false;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setChannelIndex(int i) {
        this.channelIndex = i;
    }

    public void setFullPackage(Package r2) {
        this.content.fullPackage = r2;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setLocalVersion(long j) {
        this.localVersion = j;
    }

    public void setPatch(Package r2) {
        this.content.patch = r2;
    }

    public void setStrategy(Strategy strategy) {
        this.content.strategy = strategy;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public String toString() {
        return "UpdatePackage{version=" + this.version + ", channel='" + this.channel + "', content=" + this.content + ", packageType=" + this.packageType + '}';
    }

    public UpdatePackage(long j, String str, Package r4, Package r5) {
        this.version = j;
        this.channel = str;
        Content content = new Content();
        this.content = content;
        content.fullPackage = r4;
        this.content.patch = r5;
    }
}
