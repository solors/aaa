package sg.bigo.ads.common;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.common.InterfaceC43615f;
import sg.bigo.ads.common.utils.C43828k;

/* renamed from: sg.bigo.ads.common.n */
/* loaded from: classes10.dex */
public final class C43722n {
    /* renamed from: a */
    public static int m5126a(@NonNull Parcel parcel, int i) {
        return parcel.dataAvail() > 0 ? parcel.readInt() : i;
    }

    @NonNull
    /* renamed from: b */
    public static <K extends InterfaceC43615f, V extends InterfaceC43615f> Map<K, List<V>> m5114b(@NonNull Parcel parcel, @Nullable InterfaceC43615f.InterfaceC43616a<K> interfaceC43616a, @Nullable InterfaceC43615f.InterfaceC43616a<V> interfaceC43616a2) {
        HashMap hashMap = new HashMap();
        if (parcel.dataAvail() <= 0) {
            return hashMap;
        }
        for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
            InterfaceC43615f m5115b = m5115b(parcel, interfaceC43616a);
            List m5121a = m5121a(parcel, interfaceC43616a2);
            if (m5115b != null && !C43828k.m4877a((Collection) m5121a)) {
                hashMap.put(m5115b, m5121a);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static long m5125a(@NonNull Parcel parcel, long j) {
        return parcel.dataAvail() > 0 ? parcel.readLong() : j;
    }

    @Nullable
    /* renamed from: b */
    public static <T extends InterfaceC43615f> T m5115b(@NonNull Parcel parcel, @Nullable InterfaceC43615f.InterfaceC43616a<T> interfaceC43616a) {
        if (parcel.dataAvail() <= 0) {
            return null;
        }
        int readInt = parcel.readInt();
        if (readInt != 0 && readInt <= parcel.dataAvail()) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            r1 = interfaceC43616a != null ? interfaceC43616a.mo4414a() : null;
            if (r1 != null) {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, readInt);
                obtain.setDataPosition(0);
                r1.mo4437b(obtain);
            }
        }
        return r1;
    }

    /* renamed from: a */
    public static String m5124a(@NonNull Parcel parcel, String str) {
        return parcel.dataAvail() > 0 ? parcel.readString() : str;
    }

    /* renamed from: b */
    public static <K extends InterfaceC43615f, V extends InterfaceC43615f> void m5116b(@NonNull Parcel parcel, @Nullable Map<K, List<V>> map) {
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size == 0) {
            return;
        }
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            m5118a(parcel, entry.getKey());
            m5123a(parcel, entry.getValue());
        }
    }

    @NonNull
    /* renamed from: a */
    public static <T extends InterfaceC43615f> List<T> m5121a(@NonNull Parcel parcel, @Nullable InterfaceC43615f.InterfaceC43616a<T> interfaceC43616a) {
        ArrayList arrayList = new ArrayList();
        if (parcel.dataAvail() <= 0) {
            return arrayList;
        }
        for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
            InterfaceC43615f m5115b = m5115b(parcel, interfaceC43616a);
            if (m5115b != null) {
                arrayList.add(m5115b);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static <T extends InterfaceC43615f> boolean m5113b(@NonNull Parcel parcel, @Nullable T t) {
        int readInt;
        if (parcel.dataAvail() > 0 && (readInt = parcel.readInt()) != 0 && readInt <= parcel.dataAvail()) {
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            Parcel obtain = Parcel.obtain();
            obtain.unmarshall(bArr, 0, readInt);
            obtain.setDataPosition(0);
            if (t != null) {
                t.mo4437b(obtain);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <T extends InterfaceC43615f> Map<String, T> m5120a(@NonNull Parcel parcel, @Nullable InterfaceC43615f.InterfaceC43616a<T> interfaceC43616a, Map<String, T> map) {
        String readString;
        if (parcel.dataAvail() > 0) {
            map = new HashMap<>();
            if (parcel.dataAvail() > 0) {
                for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
                    T mo4414a = interfaceC43616a != null ? interfaceC43616a.mo4414a() : null;
                    if (m5113b(parcel, mo4414a) && (readString = parcel.readString()) != null && mo4414a != null) {
                        map.put(readString, mo4414a);
                    }
                }
            }
        }
        return map;
    }

    /* renamed from: b */
    public static boolean m5112b(@NonNull Parcel parcel, boolean z) {
        return parcel.dataAvail() > 0 ? parcel.readInt() != 0 : z;
    }

    @NonNull
    /* renamed from: a */
    public static <K extends InterfaceC43615f, V extends InterfaceC43615f> Map<K, V> m5119a(@NonNull Parcel parcel, @Nullable InterfaceC43615f.InterfaceC43616a<K> interfaceC43616a, @Nullable InterfaceC43615f.InterfaceC43616a<V> interfaceC43616a2) {
        HashMap hashMap = new HashMap();
        if (parcel.dataAvail() <= 0) {
            return hashMap;
        }
        for (int readInt = parcel.readInt(); readInt > 0; readInt--) {
            InterfaceC43615f m5115b = m5115b(parcel, interfaceC43616a);
            InterfaceC43615f m5115b2 = m5115b(parcel, interfaceC43616a2);
            if (m5115b != null && m5115b2 != null) {
                hashMap.put(m5115b, m5115b2);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static <T extends InterfaceC43615f> void m5123a(@NonNull Parcel parcel, @Nullable Collection<T> collection) {
        int size = collection == null ? 0 : collection.size();
        parcel.writeInt(size);
        if (size == 0) {
            return;
        }
        for (T t : collection) {
            m5118a(parcel, t);
        }
    }

    /* renamed from: a */
    public static <K extends InterfaceC43615f, V extends InterfaceC43615f> void m5122a(@NonNull Parcel parcel, @Nullable Map<K, V> map) {
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size == 0) {
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            m5118a(parcel, entry.getKey());
            m5118a(parcel, entry.getValue());
        }
    }

    /* renamed from: a */
    public static <T extends InterfaceC43615f> void m5118a(@NonNull Parcel parcel, @Nullable T t) {
        if (t == null) {
            parcel.writeInt(0);
            return;
        }
        Parcel obtain = Parcel.obtain();
        t.mo4441a(obtain);
        byte[] marshall = obtain.marshall();
        parcel.writeInt(marshall.length);
        parcel.writeByteArray(marshall);
    }

    /* renamed from: a */
    public static void m5117a(@NonNull Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
