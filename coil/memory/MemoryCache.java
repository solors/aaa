package coil.memory;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1003v.C44477j;
import p806o.C38823e;
import p806o.C38826f;
import p806o.InterfaceC38829g;
import p806o.InterfaceC38830h;
import p806o.RealMemoryCache;
import p806o.StrongMemoryCache;
import p806o.WeakMemoryCache;

/* compiled from: MemoryCache.kt */
@Metadata
/* loaded from: classes2.dex */
public interface MemoryCache {

    /* compiled from: MemoryCache.kt */
    @Metadata
    /* renamed from: coil.memory.MemoryCache$a */
    /* loaded from: classes2.dex */
    public static final class C3477a {
        @NotNull

        /* renamed from: a */
        private final Context f2068a;

        /* renamed from: b */
        private double f2069b;

        /* renamed from: c */
        private int f2070c;

        /* renamed from: d */
        private boolean f2071d = true;

        /* renamed from: e */
        private boolean f2072e = true;

        public C3477a(@NotNull Context context) {
            this.f2068a = context;
            this.f2069b = C44477j.m2830e(context);
        }

        @NotNull
        /* renamed from: a */
        public final MemoryCache m103423a() {
            InterfaceC38830h weakMemoryCache;
            InterfaceC38829g strongMemoryCache;
            int i;
            if (this.f2072e) {
                weakMemoryCache = new C38826f();
            } else {
                weakMemoryCache = new WeakMemoryCache();
            }
            if (this.f2071d) {
                double d = this.f2069b;
                if (d > 0.0d) {
                    i = C44477j.m2832c(this.f2068a, d);
                } else {
                    i = this.f2070c;
                }
                if (i > 0) {
                    strongMemoryCache = new C38823e(i, weakMemoryCache);
                } else {
                    strongMemoryCache = new StrongMemoryCache(weakMemoryCache);
                }
            } else {
                strongMemoryCache = new StrongMemoryCache(weakMemoryCache);
            }
            return new RealMemoryCache(strongMemoryCache, weakMemoryCache);
        }
    }

    /* compiled from: MemoryCache.kt */
    @Metadata
    /* renamed from: coil.memory.MemoryCache$b */
    /* loaded from: classes2.dex */
    public static final class C3478b {
        @NotNull

        /* renamed from: a */
        private final Bitmap f2073a;
        @NotNull

        /* renamed from: b */
        private final Map<String, Object> f2074b;

        public C3478b(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
            this.f2073a = bitmap;
            this.f2074b = map;
        }

        @NotNull
        /* renamed from: a */
        public final Bitmap m103422a() {
            return this.f2073a;
        }

        @NotNull
        /* renamed from: b */
        public final Map<String, Object> m103421b() {
            return this.f2074b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3478b) {
                C3478b c3478b = (C3478b) obj;
                if (Intrinsics.m17075f(this.f2073a, c3478b.f2073a) && Intrinsics.m17075f(this.f2074b, c3478b.f2074b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f2073a.hashCode() * 31) + this.f2074b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Value(bitmap=" + this.f2073a + ", extras=" + this.f2074b + ')';
        }
    }

    /* renamed from: a */
    void mo14024a(int i);

    @Nullable
    /* renamed from: b */
    C3478b mo14023b(@NotNull Key key);

    /* renamed from: c */
    void mo14022c(@NotNull Key key, @NotNull C3478b c3478b);

    /* compiled from: MemoryCache.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Key implements Parcelable {
        @NotNull

        /* renamed from: b */
        private final String f2066b;
        @NotNull

        /* renamed from: c */
        private final Map<String, String> f2067c;
        @NotNull

        /* renamed from: d */
        private static final C3476b f2065d = new C3476b(null);
        @Deprecated
        @NotNull
        public static final Parcelable.Creator<Key> CREATOR = new C3475a();

        /* compiled from: MemoryCache.kt */
        @Metadata
        /* renamed from: coil.memory.MemoryCache$Key$a */
        /* loaded from: classes2.dex */
        public static final class C3475a implements Parcelable.Creator<Key> {
            C3475a() {
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: a */
            public Key createFromParcel(@NotNull Parcel parcel) {
                String readString = parcel.readString();
                Intrinsics.m17074g(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i = 0; i < readInt; i++) {
                    String readString2 = parcel.readString();
                    Intrinsics.m17074g(readString2);
                    String readString3 = parcel.readString();
                    Intrinsics.m17074g(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new Key(readString, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            @NotNull
            /* renamed from: b */
            public Key[] newArray(int i) {
                return new Key[i];
            }
        }

        /* compiled from: MemoryCache.kt */
        @Metadata
        /* renamed from: coil.memory.MemoryCache$Key$b */
        /* loaded from: classes2.dex */
        private static final class C3476b {
            private C3476b() {
            }

            public /* synthetic */ C3476b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Key(@NotNull String str, @NotNull Map<String, String> map) {
            this.f2066b = str;
            this.f2067c = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: c */
        public static /* synthetic */ Key m103427c(Key key, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = key.f2066b;
            }
            if ((i & 2) != 0) {
                map = key.f2067c;
            }
            return key.m103428a(str, map);
        }

        @NotNull
        /* renamed from: a */
        public final Key m103428a(@NotNull String str, @NotNull Map<String, String> map) {
            return new Key(str, map);
        }

        @NotNull
        /* renamed from: d */
        public final Map<String, String> m103426d() {
            return this.f2067c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (Intrinsics.m17075f(this.f2066b, key.f2066b) && Intrinsics.m17075f(this.f2067c, key.f2067c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f2066b.hashCode() * 31) + this.f2067c.hashCode();
        }

        @NotNull
        public String toString() {
            return "Key(key=" + this.f2066b + ", extras=" + this.f2067c + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.f2066b);
            parcel.writeInt(this.f2067c.size());
            for (Map.Entry<String, String> entry : this.f2067c.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        public /* synthetic */ Key(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? C37559r0.m17284j() : map);
        }
    }
}
