package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.dns.Record;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public abstract class Data {
    private byte[] bytes;
    @Nullable
    private Integer hashCodeCache;

    private void setBytes() {
        if (this.bytes != null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            serialize(new DataOutputStream(byteArrayOutputStream));
            this.bytes = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Data)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Data data = (Data) obj;
        data.setBytes();
        setBytes();
        return Arrays.equals(this.bytes, data.bytes);
    }

    @NonNull
    public abstract Record.Type getType();

    public final int hashCode() {
        if (this.hashCodeCache == null) {
            setBytes();
            this.hashCodeCache = Integer.valueOf(Arrays.hashCode(this.bytes));
        }
        return this.hashCodeCache.intValue();
    }

    public final int length() {
        setBytes();
        return this.bytes.length;
    }

    protected abstract void serialize(@NonNull DataOutputStream dataOutputStream) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void toOutputStream(@NonNull DataOutputStream dataOutputStream) throws IOException {
        setBytes();
        dataOutputStream.write(this.bytes);
    }
}
