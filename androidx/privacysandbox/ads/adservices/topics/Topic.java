package androidx.privacysandbox.ads.adservices.topics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Topic.kt */
@Metadata
/* loaded from: classes2.dex */
public final class Topic {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public Topic(long j, long j2, int i) {
        this.taxonomyVersion = j;
        this.modelVersion = j2;
        this.topicId = i;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        if (this.taxonomyVersion == topic.taxonomyVersion && this.modelVersion == topic.modelVersion && this.topicId == topic.topicId) {
            return true;
        }
        return false;
    }

    public final long getModelVersion() {
        return this.modelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (((Long.hashCode(this.taxonomyVersion) * 31) + Long.hashCode(this.modelVersion)) * 31) + Integer.hashCode(this.topicId);
    }

    @NotNull
    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.taxonomyVersion + ", ModelVersion=" + this.modelVersion + ", TopicCode=" + this.topicId + " }");
    }
}
