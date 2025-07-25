package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.impl.C35122c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public class FullUrlFormer<T> {

    /* renamed from: a */
    private List f95876a = new ArrayList();

    /* renamed from: b */
    private int f95877b = -1;

    /* renamed from: c */
    private String f95878c;

    /* renamed from: d */
    private final IParamsAppender f95879d;

    /* renamed from: e */
    private final ConfigProvider f95880e;

    public FullUrlFormer(@NonNull IParamsAppender<T> iParamsAppender, @NonNull ConfigProvider<T> configProvider) {
        this.f95879d = iParamsAppender;
        this.f95880e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder buildUpon = Uri.parse((String) this.f95876a.get(this.f95877b)).buildUpon();
        this.f95879d.appendParams(buildUpon, this.f95880e.getConfig());
        this.f95878c = buildUpon.build().toString();
    }

    @Nullable
    public List<String> getAllHosts() {
        return this.f95876a;
    }

    @Nullable
    public String getUrl() {
        return new C35122c(this.f95878c).f95851a;
    }

    public boolean hasMoreHosts() {
        if (this.f95877b + 1 < this.f95876a.size()) {
            return true;
        }
        return false;
    }

    public void incrementAttemptNumber() {
        this.f95877b++;
    }

    public void setHosts(@Nullable List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f95876a = list;
    }
}
