package net.pubnative.lite.sdk.models;

import java.util.Objects;

/* loaded from: classes10.dex */
public class Topic {

    /* renamed from: id */
    private final int f101938id;
    private final long taxonomyVersion;
    private final String taxonomyVersionName;

    public Topic(int i, long j, String str) {
        this.f101938id = i;
        this.taxonomyVersion = j;
        this.taxonomyVersionName = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Topic topic = (Topic) obj;
        if (this.f101938id == topic.f101938id && this.taxonomyVersion == topic.taxonomyVersion) {
            return true;
        }
        return false;
    }

    public int getId() {
        return this.f101938id;
    }

    public Long getTaxonomyVersion() {
        return Long.valueOf(this.taxonomyVersion);
    }

    public String getTaxonomyVersionName() {
        return this.taxonomyVersionName;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f101938id), Long.valueOf(this.taxonomyVersion));
    }
}
