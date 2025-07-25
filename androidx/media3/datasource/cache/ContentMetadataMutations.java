package androidx.media3.datasource.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public class ContentMetadataMutations {
    private final Map<String, Object> editedValues = new HashMap();
    private final List<String> removedValues = new ArrayList();

    @CanIgnoreReturnValue
    private ContentMetadataMutations checkAndSet(String str, Object obj) {
        this.editedValues.put((String) Assertions.checkNotNull(str), Assertions.checkNotNull(obj));
        this.removedValues.remove(str);
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
        HashMap hashMap = new HashMap(this.editedValues);
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
        return Collections.unmodifiableList(new ArrayList(this.removedValues));
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations remove(String str) {
        this.removedValues.add(str);
        this.editedValues.remove(str);
        return this;
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations set(String str, String str2) {
        return checkAndSet(str, str2);
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations set(String str, long j) {
        return checkAndSet(str, Long.valueOf(j));
    }

    @CanIgnoreReturnValue
    public ContentMetadataMutations set(String str, byte[] bArr) {
        return checkAndSet(str, Arrays.copyOf(bArr, bArr.length));
    }
}
