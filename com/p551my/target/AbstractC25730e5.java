package com.p551my.target;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* renamed from: com.my.target.e5 */
/* loaded from: classes7.dex */
public abstract class AbstractC25730e5 {
    protected int height;
    @NonNull
    protected final String url;
    @Nullable
    private Object valueT;
    protected int width;

    public AbstractC25730e5(String str) {
        this.url = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC25730e5 abstractC25730e5 = (AbstractC25730e5) obj;
        if (this.width == abstractC25730e5.width && this.height == abstractC25730e5.height && this.url.equals(abstractC25730e5.url) && Objects.equals(this.valueT, abstractC25730e5.valueT)) {
            return true;
        }
        return false;
    }

    @Nullable
    public Object getData() {
        return this.valueT;
    }

    public int getHeight() {
        return this.height;
    }

    @NonNull
    public String getUrl() {
        return this.url;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Objects.hash(this.url);
    }

    public void setData(@Nullable Object obj) {
        this.valueT = obj;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
