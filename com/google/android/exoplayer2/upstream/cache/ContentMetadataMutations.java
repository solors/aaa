package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ContentMetadataMutations {

    /* renamed from: a */
    private final Map<String, Object> f36003a = new HashMap();

    /* renamed from: b */
    private final List<String> f36004b = new ArrayList();

    @CanIgnoreReturnValue
    /* renamed from: a */
    private ContentMetadataMutations m72703a(String str, Object obj) {
        this.f36003a.put((String) Assertions.checkNotNull(str), Assertions.checkNotNull(obj));
        this.f36004b.remove(str);
        return this;
    }

    public static ContentMetadataMutations setContentLength(ContentMetadataMutations contentMetadataMutations, long j) {
        return contentMetadataMutations.set("exo_len", j);
    }

    public static ContentMetadataMutations setRedirectedUri(ContentMetadataMutations contentMetadataMutations, @Nullable Uri uri) {
        if (uri == null) {
            return contentMetadataMutations.remove("exo_redir");
        }
        return contentMetadataMutations.set("exo_redir", uri.toString());
    }

    public Map<String, Object> getEditedValues() {
        HashMap hashMap = new HashMap(this.f36003a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public List<String> getRemovedValues() {
        return Collections.unmodifiableList(new ArrayList(this.f36004b));
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations remove(String str) {
        this.f36004b.add(str);
        this.f36003a.remove(str);
        return this;
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations set(String str, String str2) {
        return m72703a(str, str2);
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations set(String str, long j) {
        return m72703a(str, Long.valueOf(j));
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations set(String str, byte[] bArr) {
        return m72703a(str, Arrays.copyOf(bArr, bArr.length));
    }
}
