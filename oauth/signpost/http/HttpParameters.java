package oauth.signpost.http;

import com.ironsource.C21114v8;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import oauth.signpost.OAuth;

/* loaded from: classes10.dex */
public class HttpParameters implements Map<String, SortedSet<String>>, Serializable {
    private TreeMap<String, SortedSet<String>> wrappedMap = new TreeMap<>();

    @Override // java.util.Map
    public void clear() {
        this.wrappedMap.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.wrappedMap.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        for (SortedSet<String> sortedSet : this.wrappedMap.values()) {
            if (sortedSet.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, SortedSet<String>>> entrySet() {
        return this.wrappedMap.entrySet();
    }

    public String getAsHeaderElement(String str) {
        String first = getFirst(str);
        if (first == null) {
            return null;
        }
        return str + "=\"" + first + "\"";
    }

    public String getAsQueryString(Object obj) {
        return getAsQueryString(obj, true);
    }

    public String getFirst(Object obj) {
        return getFirst(obj, false);
    }

    public HttpParameters getOAuthParameters() {
        HttpParameters httpParameters = new HttpParameters();
        for (Map.Entry<String, SortedSet<String>> entry : entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("oauth_") || key.startsWith("x_oauth_")) {
                httpParameters.put(key, entry.getValue());
            }
        }
        return httpParameters;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.wrappedMap.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.wrappedMap.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends SortedSet<String>> map) {
        this.wrappedMap.putAll(map);
    }

    public void putMap(Map<String, List<String>> map) {
        for (String str : map.keySet()) {
            SortedSet<String> sortedSet = get((Object) str);
            if (sortedSet == null) {
                sortedSet = new TreeSet<>();
                put(str, sortedSet);
            }
            sortedSet.addAll(map.get(str));
        }
    }

    public String putNull(String str, String str2) {
        return put(str, str2);
    }

    @Override // java.util.Map
    public int size() {
        int i = 0;
        for (String str : this.wrappedMap.keySet()) {
            i += this.wrappedMap.get(str).size();
        }
        return i;
    }

    @Override // java.util.Map
    public Collection<SortedSet<String>> values() {
        return this.wrappedMap.values();
    }

    @Override // java.util.Map
    public SortedSet<String> get(Object obj) {
        return this.wrappedMap.get(obj);
    }

    public String getAsQueryString(Object obj, boolean z) {
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            obj = OAuth.percentEncode((String) obj);
        }
        SortedSet<String> sortedSet = this.wrappedMap.get(obj);
        if (sortedSet == null) {
            return obj + "=";
        }
        Iterator<String> it = sortedSet.iterator();
        while (it.hasNext()) {
            sb2.append(obj + "=" + it.next());
            if (it.hasNext()) {
                sb2.append(C21114v8.C21123i.f54135c);
            }
        }
        return sb2.toString();
    }

    public String getFirst(Object obj, boolean z) {
        SortedSet<String> sortedSet = this.wrappedMap.get(obj);
        if (sortedSet == null || sortedSet.isEmpty()) {
            return null;
        }
        String first = sortedSet.first();
        return z ? OAuth.percentDecode(first) : first;
    }

    @Override // java.util.Map
    public SortedSet<String> put(String str, SortedSet<String> sortedSet) {
        return this.wrappedMap.put(str, sortedSet);
    }

    public void putAll(Map<? extends String, ? extends SortedSet<String>> map, boolean z) {
        if (z) {
            for (String str : map.keySet()) {
                put(str, map.get(str), true);
            }
            return;
        }
        this.wrappedMap.putAll(map);
    }

    @Override // java.util.Map
    public SortedSet<String> remove(Object obj) {
        return this.wrappedMap.remove(obj);
    }

    public SortedSet<String> put(String str, SortedSet<String> sortedSet, boolean z) {
        if (z) {
            remove((Object) str);
            for (String str2 : sortedSet) {
                put(str, str2, true);
            }
            return get((Object) str);
        }
        return this.wrappedMap.put(str, sortedSet);
    }

    public void putAll(String[] strArr, boolean z) {
        for (int i = 0; i < strArr.length - 1; i += 2) {
            put(strArr[i], strArr[i + 1], z);
        }
    }

    public String put(String str, String str2) {
        return put(str, str2, false);
    }

    public String put(String str, String str2, boolean z) {
        if (z) {
            str = OAuth.percentEncode(str);
        }
        SortedSet<String> sortedSet = this.wrappedMap.get(str);
        if (sortedSet == null) {
            sortedSet = new TreeSet<>();
            this.wrappedMap.put(str, sortedSet);
        }
        if (str2 != null) {
            if (z) {
                str2 = OAuth.percentEncode(str2);
            }
            sortedSet.add(str2);
        }
        return str2;
    }
}
