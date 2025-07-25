package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.C0379a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsBackgroundWorker;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public class UserMetadata {
    public static final String INTERNAL_KEYDATA_FILENAME = "internal-keys";
    public static final String KEYDATA_FILENAME = "keys";
    @VisibleForTesting
    public static final int MAX_ATTRIBUTES = 64;
    @VisibleForTesting
    public static final int MAX_ATTRIBUTE_SIZE = 1024;
    @VisibleForTesting
    public static final int MAX_INTERNAL_KEY_SIZE = 8192;
    @VisibleForTesting
    public static final int MAX_ROLLOUT_ASSIGNMENTS = 128;
    public static final String ROLLOUTS_STATE_FILENAME = "rollouts-state";
    public static final String USERDATA_FILENAME = "user-data";

    /* renamed from: a */
    private final MetaDataStore f42478a;

    /* renamed from: b */
    private final CrashlyticsBackgroundWorker f42479b;

    /* renamed from: c */
    private String f42480c;

    /* renamed from: d */
    private final SerializeableKeysMap f42481d = new SerializeableKeysMap(false);

    /* renamed from: e */
    private final SerializeableKeysMap f42482e = new SerializeableKeysMap(true);

    /* renamed from: f */
    private final RolloutAssignmentList f42483f = new RolloutAssignmentList(128);

    /* renamed from: g */
    private final AtomicMarkableReference<String> f42484g = new AtomicMarkableReference<>(null, false);

    /* loaded from: classes4.dex */
    public class SerializeableKeysMap {

        /* renamed from: a */
        final AtomicMarkableReference<KeysMap> f42485a;

        /* renamed from: b */
        private final AtomicReference<Callable<Void>> f42486b = new AtomicReference<>(null);

        /* renamed from: c */
        private final boolean f42487c;

        public SerializeableKeysMap(boolean z) {
            int i;
            UserMetadata.this = r2;
            this.f42487c = z;
            if (z) {
                i = 8192;
            } else {
                i = 1024;
            }
            this.f42485a = new AtomicMarkableReference<>(new KeysMap(64, i), false);
        }

        /* renamed from: b */
        public /* synthetic */ Void m67001b() throws Exception {
            this.f42486b.set(null);
            m66999d();
            return null;
        }

        /* renamed from: c */
        private void m67000c() {
            Callable callable = new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.c
                {
                    UserMetadata.SerializeableKeysMap.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m67001b;
                    m67001b = UserMetadata.SerializeableKeysMap.this.m67001b();
                    return m67001b;
                }
            };
            if (C0379a.m105461a(this.f42486b, null, callable)) {
                UserMetadata.this.f42479b.submit(callable);
            }
        }

        /* renamed from: d */
        private void m66999d() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f42485a.isMarked()) {
                    map = this.f42485a.getReference().getKeys();
                    AtomicMarkableReference<KeysMap> atomicMarkableReference = this.f42485a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                UserMetadata.this.f42478a.writeKeyData(UserMetadata.this.f42480c, map, this.f42487c);
            }
        }

        public Map<String, String> getKeys() {
            return this.f42485a.getReference().getKeys();
        }

        public boolean setKey(String str, String str2) {
            synchronized (this) {
                if (!this.f42485a.getReference().setKey(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<KeysMap> atomicMarkableReference = this.f42485a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                m67000c();
                return true;
            }
        }

        public void setKeys(Map<String, String> map) {
            synchronized (this) {
                this.f42485a.getReference().setKeys(map);
                AtomicMarkableReference<KeysMap> atomicMarkableReference = this.f42485a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
            }
            m67000c();
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        this.f42480c = str;
        this.f42478a = new MetaDataStore(fileStore);
        this.f42479b = crashlyticsBackgroundWorker;
    }

    /* renamed from: f */
    public /* synthetic */ Object m67005f() throws Exception {
        m67003h();
        return null;
    }

    /* renamed from: g */
    public /* synthetic */ Object m67004g(List list) throws Exception {
        this.f42478a.writeRolloutState(this.f42480c, list);
        return null;
    }

    /* renamed from: h */
    private void m67003h() {
        boolean z;
        String str;
        synchronized (this.f42484g) {
            z = false;
            if (this.f42484g.isMarked()) {
                str = getUserId();
                this.f42484g.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            this.f42478a.writeUserData(this.f42480c, str);
        }
    }

    public static UserMetadata loadFromExistingSession(String str, FileStore fileStore, CrashlyticsBackgroundWorker crashlyticsBackgroundWorker) {
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsBackgroundWorker);
        userMetadata.f42481d.f42485a.getReference().setKeys(metaDataStore.m67039e(str, false));
        userMetadata.f42482e.f42485a.getReference().setKeys(metaDataStore.m67039e(str, true));
        userMetadata.f42484g.set(metaDataStore.readUserId(str), false);
        userMetadata.f42483f.updateRolloutAssignmentList(metaDataStore.readRolloutsState(str));
        return userMetadata;
    }

    @Nullable
    public static String readUserId(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).readUserId(str);
    }

    public Map<String, String> getCustomKeys() {
        return this.f42481d.getKeys();
    }

    public Map<String, String> getInternalKeys() {
        return this.f42482e.getKeys();
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutsState() {
        return this.f42483f.getReportRolloutsState();
    }

    @Nullable
    public String getUserId() {
        return this.f42484g.getReference();
    }

    public boolean setCustomKey(String str, String str2) {
        return this.f42481d.setKey(str, str2);
    }

    public void setCustomKeys(Map<String, String> map) {
        this.f42481d.setKeys(map);
    }

    public boolean setInternalKey(String str, String str2) {
        return this.f42482e.setKey(str, str2);
    }

    public void setNewSession(String str) {
        synchronized (this.f42480c) {
            this.f42480c = str;
            Map<String, String> keys = this.f42481d.getKeys();
            List<RolloutAssignment> rolloutAssignmentList = this.f42483f.getRolloutAssignmentList();
            if (getUserId() != null) {
                this.f42478a.writeUserData(str, getUserId());
            }
            if (!keys.isEmpty()) {
                this.f42478a.writeKeyData(str, keys);
            }
            if (!rolloutAssignmentList.isEmpty()) {
                this.f42478a.writeRolloutState(str, rolloutAssignmentList);
            }
        }
    }

    public void setUserId(String str) {
        String sanitizeString = KeysMap.sanitizeString(str, 1024);
        synchronized (this.f42484g) {
            if (CommonUtils.nullSafeEquals(sanitizeString, this.f42484g.getReference())) {
                return;
            }
            this.f42484g.set(sanitizeString, true);
            this.f42479b.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.a
                {
                    UserMetadata.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object m67005f;
                    m67005f = UserMetadata.this.m67005f();
                    return m67005f;
                }
            });
        }
    }

    @CanIgnoreReturnValue
    public boolean updateRolloutsState(List<RolloutAssignment> list) {
        synchronized (this.f42483f) {
            if (!this.f42483f.updateRolloutAssignmentList(list)) {
                return false;
            }
            final List<RolloutAssignment> rolloutAssignmentList = this.f42483f.getRolloutAssignmentList();
            this.f42479b.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.metadata.b
                {
                    UserMetadata.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object m67004g;
                    m67004g = UserMetadata.this.m67004g(rolloutAssignmentList);
                    return m67004g;
                }
            });
            return true;
        }
    }
}
