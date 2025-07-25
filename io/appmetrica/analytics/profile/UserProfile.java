package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC34490dn;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes9.dex */
public class UserProfile {

    /* renamed from: a */
    private final List f95944a;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private final LinkedList f95945a;

        /* synthetic */ Builder(int i) {
            this();
        }

        public Builder apply(@NonNull UserProfileUpdate<? extends InterfaceC34490dn> userProfileUpdate) {
            this.f95945a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.f95945a, 0);
        }

        private Builder() {
            this.f95945a = new LinkedList();
        }
    }

    /* synthetic */ UserProfile(LinkedList linkedList, int i) {
        this(linkedList);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    @NonNull
    public List<UserProfileUpdate<? extends InterfaceC34490dn>> getUserProfileUpdates() {
        return this.f95944a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f95944a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
