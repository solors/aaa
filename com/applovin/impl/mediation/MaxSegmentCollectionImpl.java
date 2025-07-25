package com.applovin.impl.mediation;

import com.applovin.mediation.MaxSegment;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class MaxSegmentCollectionImpl implements MaxSegmentCollection {

    /* renamed from: a */
    private final List f7980a;

    /* renamed from: b */
    private final Map f7981b;

    /* loaded from: classes2.dex */
    public static class BuilderImpl implements MaxSegmentCollection.Builder {

        /* renamed from: a */
        private final List f7982a = new ArrayList();

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection.Builder addSegment(MaxSegment maxSegment) {
            this.f7982a.add(maxSegment);
            return this;
        }

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public MaxSegmentCollection build() {
            return new MaxSegmentCollectionImpl(this);
        }
    }

    public Map<String, List<Integer>> getJsonData() {
        return this.f7981b;
    }

    @Override // com.applovin.mediation.MaxSegmentCollection
    public List<MaxSegment> getSegments() {
        return this.f7980a;
    }

    public String toString() {
        return "MaxSegmentColletionImpl{segments=" + this.f7980a + "}";
    }

    private MaxSegmentCollectionImpl(BuilderImpl builderImpl) {
        List<MaxSegment> list = builderImpl.f7982a;
        this.f7980a = list;
        this.f7981b = new HashMap();
        for (MaxSegment maxSegment : list) {
            this.f7981b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }
}
